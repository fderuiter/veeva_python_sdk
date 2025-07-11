package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class DefaultApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("http://}/api/v25.1")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val apiGetPerSecond = config.getDouble("performance.operationsPerSecond.apiGet") * rateMultiplier * instanceMultiplier
    val apiMdlComponentsComponentTypeAndRecordNameFilesGetPerSecond = config.getDouble("performance.operationsPerSecond.apiMdlComponentsComponentTypeAndRecordNameFilesGet") * rateMultiplier * instanceMultiplier
    val apiMdlComponentsComponentTypeAndRecordNameGetPerSecond = config.getDouble("performance.operationsPerSecond.apiMdlComponentsComponentTypeAndRecordNameGet") * rateMultiplier * instanceMultiplier
    val apiMdlExecuteAsyncJobIdResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.apiMdlExecuteAsyncJobIdResultsGet") * rateMultiplier * instanceMultiplier
    val apiMdlExecuteAsyncPostPerSecond = config.getDouble("performance.operationsPerSecond.apiMdlExecuteAsyncPost") * rateMultiplier * instanceMultiplier
    val apiMdlExecutePostPerSecond = config.getDouble("performance.operationsPerSecond.apiMdlExecutePost") * rateMultiplier * instanceMultiplier
    val apiMdlFilesPostPerSecond = config.getDouble("performance.operationsPerSecond.apiMdlFilesPost") * rateMultiplier * instanceMultiplier
    val audittrailAuditTrailTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.audittrailAuditTrailTypeGet") * rateMultiplier * instanceMultiplier
    val authDiscoveryPostPerSecond = config.getDouble("performance.operationsPerSecond.authDiscoveryPost") * rateMultiplier * instanceMultiplier
    val authOauthSessionOathOidcProfileIdPostPerSecond = config.getDouble("performance.operationsPerSecond.authOauthSessionOathOidcProfileIdPost") * rateMultiplier * instanceMultiplier
    val authPostPerSecond = config.getDouble("performance.operationsPerSecond.authPost") * rateMultiplier * instanceMultiplier
    val codeClassNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.codeClassNameDelete") * rateMultiplier * instanceMultiplier
    val codeClassNameDisablePutPerSecond = config.getDouble("performance.operationsPerSecond.codeClassNameDisablePut") * rateMultiplier * instanceMultiplier
    val codeClassNameEnablePutPerSecond = config.getDouble("performance.operationsPerSecond.codeClassNameEnablePut") * rateMultiplier * instanceMultiplier
    val codeClassNameGetPerSecond = config.getDouble("performance.operationsPerSecond.codeClassNameGet") * rateMultiplier * instanceMultiplier
    val codeProfilerGetPerSecond = config.getDouble("performance.operationsPerSecond.codeProfilerGet") * rateMultiplier * instanceMultiplier
    val codeProfilerPostPerSecond = config.getDouble("performance.operationsPerSecond.codeProfilerPost") * rateMultiplier * instanceMultiplier
    val codeProfilerSessionNameActionsEndPostPerSecond = config.getDouble("performance.operationsPerSecond.codeProfilerSessionNameActionsEndPost") * rateMultiplier * instanceMultiplier
    val codeProfilerSessionNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.codeProfilerSessionNameDelete") * rateMultiplier * instanceMultiplier
    val codeProfilerSessionNameGetPerSecond = config.getDouble("performance.operationsPerSecond.codeProfilerSessionNameGet") * rateMultiplier * instanceMultiplier
    val codeProfilerSessionNameResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.codeProfilerSessionNameResultsGet") * rateMultiplier * instanceMultiplier
    val codePutPerSecond = config.getDouble("performance.operationsPerSecond.codePut") * rateMultiplier * instanceMultiplier
    val compositesTreesEdlHierarchyOrTemplateActionsListnodesPostPerSecond = config.getDouble("performance.operationsPerSecond.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost") * rateMultiplier * instanceMultiplier
    val compositesTreesEdlHierarchyOrTemplateGetPerSecond = config.getDouble("performance.operationsPerSecond.compositesTreesEdlHierarchyOrTemplateGet") * rateMultiplier * instanceMultiplier
    val compositesTreesEdlHierarchyVParentNodeIdChildrenGetPerSecond = config.getDouble("performance.operationsPerSecond.compositesTreesEdlHierarchyVParentNodeIdChildrenGet") * rateMultiplier * instanceMultiplier
    val compositesTreesEdlHierarchyVParentNodeIdChildrenPutPerSecond = config.getDouble("performance.operationsPerSecond.compositesTreesEdlHierarchyVParentNodeIdChildrenPut") * rateMultiplier * instanceMultiplier
    val configurationComponentTypeAndRecordNameGetPerSecond = config.getDouble("performance.operationsPerSecond.configurationComponentTypeAndRecordNameGet") * rateMultiplier * instanceMultiplier
    val configurationComponentTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.configurationComponentTypeGet") * rateMultiplier * instanceMultiplier
    val configurationObjectNameAndObjectTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.configurationObjectNameAndObjectTypeGet") * rateMultiplier * instanceMultiplier
    val configurationObjecttypeGetPerSecond = config.getDouble("performance.operationsPerSecond.configurationObjecttypeGet") * rateMultiplier * instanceMultiplier
    val configurationRoleAssignmentRuleDeletePerSecond = config.getDouble("performance.operationsPerSecond.configurationRoleAssignmentRuleDelete") * rateMultiplier * instanceMultiplier
    val configurationRoleAssignmentRuleGetPerSecond = config.getDouble("performance.operationsPerSecond.configurationRoleAssignmentRuleGet") * rateMultiplier * instanceMultiplier
    val configurationRoleAssignmentRulePostPerSecond = config.getDouble("performance.operationsPerSecond.configurationRoleAssignmentRulePost") * rateMultiplier * instanceMultiplier
    val configurationRoleAssignmentRulePutPerSecond = config.getDouble("performance.operationsPerSecond.configurationRoleAssignmentRulePut") * rateMultiplier * instanceMultiplier
    val delegationLoginPostPerSecond = config.getDouble("performance.operationsPerSecond.delegationLoginPost") * rateMultiplier * instanceMultiplier
    val delegationVaultsGetPerSecond = config.getDouble("performance.operationsPerSecond.delegationVaultsGet") * rateMultiplier * instanceMultiplier
    val keepAlivePostPerSecond = config.getDouble("performance.operationsPerSecond.keepAlivePost") * rateMultiplier * instanceMultiplier
    val limitsGetPerSecond = config.getDouble("performance.operationsPerSecond.limitsGet") * rateMultiplier * instanceMultiplier
    val logsApiUsageGetPerSecond = config.getDouble("performance.operationsPerSecond.logsApiUsageGet") * rateMultiplier * instanceMultiplier
    val logsCodeDebugGetPerSecond = config.getDouble("performance.operationsPerSecond.logsCodeDebugGet") * rateMultiplier * instanceMultiplier
    val logsCodeDebugIdActionsResetDeletePerSecond = config.getDouble("performance.operationsPerSecond.logsCodeDebugIdActionsResetDelete") * rateMultiplier * instanceMultiplier
    val logsCodeDebugIdActionsResetPostPerSecond = config.getDouble("performance.operationsPerSecond.logsCodeDebugIdActionsResetPost") * rateMultiplier * instanceMultiplier
    val logsCodeDebugIdFilesGetPerSecond = config.getDouble("performance.operationsPerSecond.logsCodeDebugIdFilesGet") * rateMultiplier * instanceMultiplier
    val logsCodeDebugIdGetPerSecond = config.getDouble("performance.operationsPerSecond.logsCodeDebugIdGet") * rateMultiplier * instanceMultiplier
    val logsCodeDebugPostPerSecond = config.getDouble("performance.operationsPerSecond.logsCodeDebugPost") * rateMultiplier * instanceMultiplier
    val logsCodeRuntimeGetPerSecond = config.getDouble("performance.operationsPerSecond.logsCodeRuntimeGet") * rateMultiplier * instanceMultiplier
    val messagesMessageTypeActionsImportPostPerSecond = config.getDouble("performance.operationsPerSecond.messagesMessageTypeActionsImportPost") * rateMultiplier * instanceMultiplier
    val messagesMessageTypeLanguageLangActionsExportPostPerSecond = config.getDouble("performance.operationsPerSecond.messagesMessageTypeLanguageLangActionsExportPost") * rateMultiplier * instanceMultiplier
    val metadataAudittrailAuditTrailTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataAudittrailAuditTrailTypeGet") * rateMultiplier * instanceMultiplier
    val metadataAudittrailGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataAudittrailGet") * rateMultiplier * instanceMultiplier
    val metadataComponentsComponentTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataComponentsComponentTypeGet") * rateMultiplier * instanceMultiplier
    val metadataComponentsGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataComponentsGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsBindersTemplatesBindernodesGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsBindersTemplatesBindernodesGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsBindersTemplatesGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsBindersTemplatesGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsEventsGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsEventsGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsLockGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsLockGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsPropertiesFindCommonPostPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsPropertiesFindCommonPost") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsPropertiesGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsPropertiesGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsTemplatesGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsTemplatesGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsTypesGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsTypesGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsTypesTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsTypesTypeGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsTypesTypeRelationshipsGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsTypesTypeRelationshipsGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsGroupsGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsGroupsGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsSecuritypoliciesGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsSecuritypoliciesGet") * rateMultiplier * instanceMultiplier
    val metadataObjectsUsersGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataObjectsUsersGet") * rateMultiplier * instanceMultiplier
    val metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet") * rateMultiplier * instanceMultiplier
    val metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet") * rateMultiplier * instanceMultiplier
    val metadataVobjectsGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataVobjectsGet") * rateMultiplier * instanceMultiplier
    val metadataVobjectsObjectNameActionsCanceldeploymentPostPerSecond = config.getDouble("performance.operationsPerSecond.metadataVobjectsObjectNameActionsCanceldeploymentPost") * rateMultiplier * instanceMultiplier
    val metadataVobjectsObjectNameFieldsObjectFieldNameGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataVobjectsObjectNameFieldsObjectFieldNameGet") * rateMultiplier * instanceMultiplier
    val metadataVobjectsObjectNameGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataVobjectsObjectNameGet") * rateMultiplier * instanceMultiplier
    val metadataVobjectsObjectNamePageLayoutsGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataVobjectsObjectNamePageLayoutsGet") * rateMultiplier * instanceMultiplier
    val metadataVobjectsObjectNamePageLayoutsLayoutNameGetPerSecond = config.getDouble("performance.operationsPerSecond.metadataVobjectsObjectNamePageLayoutsLayoutNameGet") * rateMultiplier * instanceMultiplier
    val notificationsHistoriesGetPerSecond = config.getDouble("performance.operationsPerSecond.notificationsHistoriesGet") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsActionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsActionGet") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsActionPostPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsActionPost") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsCanceltasksPostPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsCanceltasksPost") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsCancelworkflowsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsCancelworkflowsPost") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsGet") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsReassigntasksPostPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsReassigntasksPost") * rateMultiplier * instanceMultiplier
    val objectWorkflowActionsReplaceworkflowownerPostPerSecond = config.getDouble("performance.operationsPerSecond.objectWorkflowActionsReplaceworkflowownerPost") * rateMultiplier * instanceMultiplier
    val objectsBindersActionsExportJobIdResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersActionsExportJobIdResultsGet") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdActionsExportPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdActionsExportPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdActionsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdActionsPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdBindingRulePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdBindingRulePut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdDocumentsNodeIdBindingRulePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdDocumentsNodeIdBindingRulePut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdDocumentsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdDocumentsPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdDocumentsSectionIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdDocumentsSectionIdDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdDocumentsSectionIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdDocumentsSectionIdPut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdGet") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdPut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdSectionsNodeIdBindingRulePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdSectionsNodeIdBindingRulePut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdSectionsNodeIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdSectionsNodeIdPut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdSectionsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdSectionsPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdSectionsSectionIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdSectionsSectionIdDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdSectionsSectionIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdSectionsSectionIdGet") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsGet") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet") * rateMultiplier * instanceMultiplier
    val objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet") * rateMultiplier * instanceMultiplier
    val objectsBindersIdRolesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersIdRolesGet") * rateMultiplier * instanceMultiplier
    val objectsBindersIdRolesPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersIdRolesPost") * rateMultiplier * instanceMultiplier
    val objectsBindersIdRolesRoleNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersIdRolesRoleNameGet") * rateMultiplier * instanceMultiplier
    val objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet") * rateMultiplier * instanceMultiplier
    val objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet") * rateMultiplier * instanceMultiplier
    val objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut") * rateMultiplier * instanceMultiplier
    val objectsBindersLifecycleActionsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersLifecycleActionsPost") * rateMultiplier * instanceMultiplier
    val objectsBindersLifecycleActionsUserActionNamePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersLifecycleActionsUserActionNamePut") * rateMultiplier * instanceMultiplier
    val objectsBindersPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersPost") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesGet") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesPost") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesPut") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesTemplateNameBindernodesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesTemplateNameBindernodesGet") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesTemplateNameBindernodesPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesTemplateNameBindernodesPost") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesTemplateNameBindernodesPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesTemplateNameBindernodesPut") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesTemplateNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesTemplateNameDelete") * rateMultiplier * instanceMultiplier
    val objectsBindersTemplatesTemplateNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsBindersTemplatesTemplateNameGet") * rateMultiplier * instanceMultiplier
    val objectsDeletionsDocumentsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDeletionsDocumentsGet") * rateMultiplier * instanceMultiplier
    val objectsDeletionsVobjectsObjectNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDeletionsVobjectsObjectNameGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsActionsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsActionsWorkflowNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsActionsWorkflowNameGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsActionsWorkflowNamePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsActionsWorkflowNamePost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAnnotationsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAnnotationsBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAnnotationsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAnnotationsBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAnnotationsBatchPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAnnotationsBatchPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAnnotationsRepliesBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAnnotationsRepliesBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAttachmentsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAttachmentsBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAttachmentsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAttachmentsBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsAttachmentsBatchPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsAttachmentsBatchPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchActionsFileextractJobIdResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchActionsFileextractJobIdResultsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchActionsFileextractPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchActionsFileextractPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchActionsReclassifyPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchActionsReclassifyPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchActionsRerenderPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchActionsRerenderPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchLockDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchLockDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsBatchPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsBatchPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAnchorsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAnchorsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAnnotationsFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAnnotationsFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAnnotationsFilePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAnnotationsFilePost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAttachmentsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAttachmentsPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdAudittrailGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdAudittrailGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdEventsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdEventsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdLockDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdLockDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdLockGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdLockGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdLockPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdLockPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdRenditionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdRenditionsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdRenditionsRenditionTypeDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdRenditionsRenditionTypeDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdRenditionsRenditionTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdRenditionsRenditionTypeGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdRenditionsRenditionTypePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdRenditionsRenditionTypePost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdRenditionsRenditionTypePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdRenditionsRenditionTypePut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsIdRolesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsIdRolesGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsIdRolesPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsIdRolesPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsIdRolesRoleNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsIdRolesRoleNameGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsLifecycleActionsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsLifecycleActionsPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsLifecycleActionsUserActionNamePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsLifecycleActionsUserActionNamePut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsRelationshipsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsRelationshipsBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsRelationshipsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsRelationshipsBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsRenditionsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsRenditionsBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsRenditionsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsRenditionsBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsRolesBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsRolesBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsRolesBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsRolesBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesPut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesTemplateNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesTemplateNameDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesTemplateNameFileGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesTemplateNameFileGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesTemplateNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesTemplateNameGet") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTemplatesTemplateNamePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTemplatesTemplateNamePut") * rateMultiplier * instanceMultiplier
    val objectsDocumentsTokensPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsTokensPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsVersionsBatchActionsFileextractPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsVersionsBatchActionsFileextractPost") * rateMultiplier * instanceMultiplier
    val objectsDocumentsVersionsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsVersionsBatchDelete") * rateMultiplier * instanceMultiplier
    val objectsDocumentsVersionsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsDocumentsVersionsBatchPost") * rateMultiplier * instanceMultiplier
    val objectsDomainGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDomainGet") * rateMultiplier * instanceMultiplier
    val objectsDomainsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsDomainsGet") * rateMultiplier * instanceMultiplier
    val objectsEdlMatchedDocumentsBatchActionsAddPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsEdlMatchedDocumentsBatchActionsAddPost") * rateMultiplier * instanceMultiplier
    val objectsEdlMatchedDocumentsBatchActionsRemovePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsEdlMatchedDocumentsBatchActionsRemovePost") * rateMultiplier * instanceMultiplier
    val objectsGroupsAutoGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsGroupsAutoGet") * rateMultiplier * instanceMultiplier
    val objectsGroupsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsGroupsGet") * rateMultiplier * instanceMultiplier
    val objectsGroupsGroupIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsGroupsGroupIdDelete") * rateMultiplier * instanceMultiplier
    val objectsGroupsGroupIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsGroupsGroupIdGet") * rateMultiplier * instanceMultiplier
    val objectsGroupsGroupIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsGroupsGroupIdPut") * rateMultiplier * instanceMultiplier
    val objectsGroupsPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsGroupsPost") * rateMultiplier * instanceMultiplier
    val objectsLicensesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsLicensesGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsActionsGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsActionsWorkflowNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsActionsWorkflowNameGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsActionsWorkflowNamePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsActionsWorkflowNamePost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsAcceptPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsAcceptPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsCancelPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsCancelPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsCompletePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsCompletePost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsReassignPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsReassignPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsTaskActionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsTasksTaskIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsTasksTaskIdGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsWorkflowIdActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsWorkflowIdActionsGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost") * rateMultiplier * instanceMultiplier
    val objectsObjectworkflowsWorkflowIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsObjectworkflowsWorkflowIdGet") * rateMultiplier * instanceMultiplier
    val objectsPicklistsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsPicklistsGet") * rateMultiplier * instanceMultiplier
    val objectsPicklistsPicklistNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsPicklistsPicklistNameGet") * rateMultiplier * instanceMultiplier
    val objectsPicklistsPicklistNamePicklistValueNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsPicklistsPicklistNamePicklistValueNameDelete") * rateMultiplier * instanceMultiplier
    val objectsPicklistsPicklistNamePicklistValueNamePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsPicklistsPicklistNamePicklistValueNamePut") * rateMultiplier * instanceMultiplier
    val objectsPicklistsPicklistNamePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsPicklistsPicklistNamePost") * rateMultiplier * instanceMultiplier
    val objectsPicklistsPicklistNamePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsPicklistsPicklistNamePut") * rateMultiplier * instanceMultiplier
    val objectsSandboxActionsBuildproductionPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxActionsBuildproductionPost") * rateMultiplier * instanceMultiplier
    val objectsSandboxActionsPromoteproductionPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxActionsPromoteproductionPost") * rateMultiplier * instanceMultiplier
    val objectsSandboxActionsRecheckusagePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxActionsRecheckusagePost") * rateMultiplier * instanceMultiplier
    val objectsSandboxBatchChangesizePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxBatchChangesizePost") * rateMultiplier * instanceMultiplier
    val objectsSandboxEntitlementsSetPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxEntitlementsSetPost") * rateMultiplier * instanceMultiplier
    val objectsSandboxGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxGet") * rateMultiplier * instanceMultiplier
    val objectsSandboxNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxNameDelete") * rateMultiplier * instanceMultiplier
    val objectsSandboxPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxPost") * rateMultiplier * instanceMultiplier
    val objectsSandboxSnapshotApiNameActionsUpdatePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxSnapshotApiNameActionsUpdatePost") * rateMultiplier * instanceMultiplier
    val objectsSandboxSnapshotApiNameActionsUpgradePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxSnapshotApiNameActionsUpgradePost") * rateMultiplier * instanceMultiplier
    val objectsSandboxSnapshotApiNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxSnapshotApiNameDelete") * rateMultiplier * instanceMultiplier
    val objectsSandboxSnapshotGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxSnapshotGet") * rateMultiplier * instanceMultiplier
    val objectsSandboxSnapshotPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxSnapshotPost") * rateMultiplier * instanceMultiplier
    val objectsSandboxVaultIdActionsRefreshPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxVaultIdActionsRefreshPost") * rateMultiplier * instanceMultiplier
    val objectsSandboxVaultIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsSandboxVaultIdGet") * rateMultiplier * instanceMultiplier
    val objectsSecuritypoliciesGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsSecuritypoliciesGet") * rateMultiplier * instanceMultiplier
    val objectsSecuritypoliciesSecurityPolicyNameGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsSecuritypoliciesSecurityPolicyNameGet") * rateMultiplier * instanceMultiplier
    val objectsUsersGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersGet") * rateMultiplier * instanceMultiplier
    val objectsUsersIdGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersIdGet") * rateMultiplier * instanceMultiplier
    val objectsUsersIdPermissionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersIdPermissionsGet") * rateMultiplier * instanceMultiplier
    val objectsUsersIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersIdPut") * rateMultiplier * instanceMultiplier
    val objectsUsersMeGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersMeGet") * rateMultiplier * instanceMultiplier
    val objectsUsersMePasswordPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersMePasswordPost") * rateMultiplier * instanceMultiplier
    val objectsUsersMePermissionsGetPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersMePermissionsGet") * rateMultiplier * instanceMultiplier
    val objectsUsersMePutPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersMePut") * rateMultiplier * instanceMultiplier
    val objectsUsersPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersPost") * rateMultiplier * instanceMultiplier
    val objectsUsersPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersPut") * rateMultiplier * instanceMultiplier
    val objectsUsersUserIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersUserIdDelete") * rateMultiplier * instanceMultiplier
    val objectsUsersUserIdVaultMembershipVaultIdPutPerSecond = config.getDouble("performance.operationsPerSecond.objectsUsersUserIdVaultMembershipVaultIdPut") * rateMultiplier * instanceMultiplier
    val objectsVaultActionsComparePostPerSecond = config.getDouble("performance.operationsPerSecond.objectsVaultActionsComparePost") * rateMultiplier * instanceMultiplier
    val objectsVaultActionsConfigreportPostPerSecond = config.getDouble("performance.operationsPerSecond.objectsVaultActionsConfigreportPost") * rateMultiplier * instanceMultiplier
    val queryComponentsPostPerSecond = config.getDouble("performance.operationsPerSecond.queryComponentsPost") * rateMultiplier * instanceMultiplier
    val queryNextPagePostPerSecond = config.getDouble("performance.operationsPerSecond.queryNextPagePost") * rateMultiplier * instanceMultiplier
    val queryPostPerSecond = config.getDouble("performance.operationsPerSecond.queryPost") * rateMultiplier * instanceMultiplier
    val queryPreviousPagePostPerSecond = config.getDouble("performance.operationsPerSecond.queryPreviousPagePost") * rateMultiplier * instanceMultiplier
    val scimV2MeGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2MeGet") * rateMultiplier * instanceMultiplier
    val scimV2MePutPerSecond = config.getDouble("performance.operationsPerSecond.scimV2MePut") * rateMultiplier * instanceMultiplier
    val scimV2ResourceTypesGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2ResourceTypesGet") * rateMultiplier * instanceMultiplier
    val scimV2ResourceTypesTypeGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2ResourceTypesTypeGet") * rateMultiplier * instanceMultiplier
    val scimV2SchemasGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2SchemasGet") * rateMultiplier * instanceMultiplier
    val scimV2SchemasIdGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2SchemasIdGet") * rateMultiplier * instanceMultiplier
    val scimV2ServiceProviderConfigGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2ServiceProviderConfigGet") * rateMultiplier * instanceMultiplier
    val scimV2TypeGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2TypeGet") * rateMultiplier * instanceMultiplier
    val scimV2TypeIdGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2TypeIdGet") * rateMultiplier * instanceMultiplier
    val scimV2UsersGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2UsersGet") * rateMultiplier * instanceMultiplier
    val scimV2UsersIdGetPerSecond = config.getDouble("performance.operationsPerSecond.scimV2UsersIdGet") * rateMultiplier * instanceMultiplier
    val scimV2UsersIdPutPerSecond = config.getDouble("performance.operationsPerSecond.scimV2UsersIdPut") * rateMultiplier * instanceMultiplier
    val scimV2UsersPostPerSecond = config.getDouble("performance.operationsPerSecond.scimV2UsersPost") * rateMultiplier * instanceMultiplier
    val servicesCertificateCertIdGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesCertificateCertIdGet") * rateMultiplier * instanceMultiplier
    val servicesConfigurationModeActionsDisablePostPerSecond = config.getDouble("performance.operationsPerSecond.servicesConfigurationModeActionsDisablePost") * rateMultiplier * instanceMultiplier
    val servicesConfigurationModeActionsEnablePostPerSecond = config.getDouble("performance.operationsPerSecond.servicesConfigurationModeActionsEnablePost") * rateMultiplier * instanceMultiplier
    val servicesDirectdataFilesGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesDirectdataFilesGet") * rateMultiplier * instanceMultiplier
    val servicesDirectdataFilesNameGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesDirectdataFilesNameGet") * rateMultiplier * instanceMultiplier
    val servicesFileStagingItemsContentItemGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingItemsContentItemGet") * rateMultiplier * instanceMultiplier
    val servicesFileStagingItemsItemDeletePerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingItemsItemDelete") * rateMultiplier * instanceMultiplier
    val servicesFileStagingItemsItemGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingItemsItemGet") * rateMultiplier * instanceMultiplier
    val servicesFileStagingItemsItemPutPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingItemsItemPut") * rateMultiplier * instanceMultiplier
    val servicesFileStagingItemsPostPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingItemsPost") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadGet") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadPostPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadPost") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadUploadSessionIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadUploadSessionIdDelete") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadUploadSessionIdGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadUploadSessionIdGet") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadUploadSessionIdPartsGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadUploadSessionIdPartsGet") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadUploadSessionIdPostPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadUploadSessionIdPost") * rateMultiplier * instanceMultiplier
    val servicesFileStagingUploadUploadSessionIdPutPerSecond = config.getDouble("performance.operationsPerSecond.servicesFileStagingUploadUploadSessionIdPut") * rateMultiplier * instanceMultiplier
    val servicesJobsHistoriesGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsHistoriesGet") * rateMultiplier * instanceMultiplier
    val servicesJobsJobIdErrorsGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsJobIdErrorsGet") * rateMultiplier * instanceMultiplier
    val servicesJobsJobIdGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsJobIdGet") * rateMultiplier * instanceMultiplier
    val servicesJobsJobIdSummaryGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsJobIdSummaryGet") * rateMultiplier * instanceMultiplier
    val servicesJobsJobIdTasksGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsJobIdTasksGet") * rateMultiplier * instanceMultiplier
    val servicesJobsMonitorsGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsMonitorsGet") * rateMultiplier * instanceMultiplier
    val servicesJobsStartNowJobIdPostPerSecond = config.getDouble("performance.operationsPerSecond.servicesJobsStartNowJobIdPost") * rateMultiplier * instanceMultiplier
    val servicesLoaderExtractPostPerSecond = config.getDouble("performance.operationsPerSecond.servicesLoaderExtractPost") * rateMultiplier * instanceMultiplier
    val servicesLoaderJobIdTasksTaskIdFailurelogGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesLoaderJobIdTasksTaskIdFailurelogGet") * rateMultiplier * instanceMultiplier
    val servicesLoaderJobIdTasksTaskIdResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesLoaderJobIdTasksTaskIdResultsGet") * rateMultiplier * instanceMultiplier
    val servicesLoaderJobIdTasksTaskIdResultsRenditionsGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet") * rateMultiplier * instanceMultiplier
    val servicesLoaderJobIdTasksTaskIdSuccesslogGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesLoaderJobIdTasksTaskIdSuccesslogGet") * rateMultiplier * instanceMultiplier
    val servicesLoaderLoadPostPerSecond = config.getDouble("performance.operationsPerSecond.servicesLoaderLoadPost") * rateMultiplier * instanceMultiplier
    val servicesPackageActionsValidatePostPerSecond = config.getDouble("performance.operationsPerSecond.servicesPackageActionsValidatePost") * rateMultiplier * instanceMultiplier
    val servicesPackagePostPerSecond = config.getDouble("performance.operationsPerSecond.servicesPackagePost") * rateMultiplier * instanceMultiplier
    val servicesPackagePutPerSecond = config.getDouble("performance.operationsPerSecond.servicesPackagePut") * rateMultiplier * instanceMultiplier
    val servicesQueuesGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesQueuesGet") * rateMultiplier * instanceMultiplier
    val servicesQueuesQueueNameActionsDisableDeliveryPutPerSecond = config.getDouble("performance.operationsPerSecond.servicesQueuesQueueNameActionsDisableDeliveryPut") * rateMultiplier * instanceMultiplier
    val servicesQueuesQueueNameActionsEnableDeliveryPutPerSecond = config.getDouble("performance.operationsPerSecond.servicesQueuesQueueNameActionsEnableDeliveryPut") * rateMultiplier * instanceMultiplier
    val servicesQueuesQueueNameActionsResetPutPerSecond = config.getDouble("performance.operationsPerSecond.servicesQueuesQueueNameActionsResetPut") * rateMultiplier * instanceMultiplier
    val servicesQueuesQueueNameGetPerSecond = config.getDouble("performance.operationsPerSecond.servicesQueuesQueueNameGet") * rateMultiplier * instanceMultiplier
    val servicesVobjectVaultPackageVPackageIdActionsValidatePostPerSecond = config.getDouble("performance.operationsPerSecond.servicesVobjectVaultPackageVPackageIdActionsValidatePost") * rateMultiplier * instanceMultiplier
    val sessionDeletePerSecond = config.getDouble("performance.operationsPerSecond.sessionDelete") * rateMultiplier * instanceMultiplier
    val uicodeDistributionsDistributionNameCodeGetPerSecond = config.getDouble("performance.operationsPerSecond.uicodeDistributionsDistributionNameCodeGet") * rateMultiplier * instanceMultiplier
    val uicodeDistributionsDistributionNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.uicodeDistributionsDistributionNameDelete") * rateMultiplier * instanceMultiplier
    val uicodeDistributionsDistributionNameGetPerSecond = config.getDouble("performance.operationsPerSecond.uicodeDistributionsDistributionNameGet") * rateMultiplier * instanceMultiplier
    val uicodeDistributionsGetPerSecond = config.getDouble("performance.operationsPerSecond.uicodeDistributionsGet") * rateMultiplier * instanceMultiplier
    val uicodeDistributionsPostPerSecond = config.getDouble("performance.operationsPerSecond.uicodeDistributionsPost") * rateMultiplier * instanceMultiplier
    val vobjectVaultPackageVPackageIdActionsDeployPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectVaultPackageVPackageIdActionsDeployPost") * rateMultiplier * instanceMultiplier
    val vobjectVaultPackageVPackageIdActionsDeployResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectVaultPackageVPackageIdActionsDeployResultsGet") * rateMultiplier * instanceMultiplier
    val vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet") * rateMultiplier * instanceMultiplier
    val vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet") * rateMultiplier * instanceMultiplier
    val vobjectsEdlItemVActionsCreateplaceholderPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsEdlItemVActionsCreateplaceholderPost") * rateMultiplier * instanceMultiplier
    val vobjectsMergesJobIdLogGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsMergesJobIdLogGet") * rateMultiplier * instanceMultiplier
    val vobjectsMergesJobIdResultsGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsMergesJobIdResultsGet") * rateMultiplier * instanceMultiplier
    val vobjectsMergesJobIdStatusGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsMergesJobIdStatusGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameActionsActionNamePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameActionsActionNamePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameActionsChangetypePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameActionsChangetypePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameActionsMergePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameActionsMergePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameActionsRecalculaterollupsGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameActionsRecalculaterollupsGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameActionsRecalculaterollupsPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameActionsRecalculaterollupsPost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameActionsUpdatecorporatecurrencyPutPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameActionsUpdatecorporatecurrencyPut") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameAttachmentsBatchDeletePerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameAttachmentsBatchDelete") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameAttachmentsBatchPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameAttachmentsBatchPost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameAttachmentsBatchPutPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameAttachmentsBatchPut") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameDeletePerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameDelete") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameIdRolesRoleNameGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameIdRolesRoleNameGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdActionsActionNameGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdActionsActionNameGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdActionsActionNamePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdActionsActionNamePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdActionsCascadedeletePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdActionsDeepcopyPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdActionsGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdActionsGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeletePerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsFileGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsFileGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAttachmentsPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAttachmentsPost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdAudittrailGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdAudittrailGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameObjectRecordIdGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameObjectRecordIdGet") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNamePostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNamePost") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNamePutPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNamePut") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameRolesDeletePerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameRolesDelete") * rateMultiplier * instanceMultiplier
    val vobjectsObjectNameRolesPostPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsObjectNameRolesPost") * rateMultiplier * instanceMultiplier
    val vobjectsOutboundPackageVPackageIdDependenciesGetPerSecond = config.getDouble("performance.operationsPerSecond.vobjectsOutboundPackageVPackageIdDependenciesGet") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiMdlComponentsComponentTypeAndRecordNameFilesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "apiMdlComponentsComponentTypeAndRecordNameFilesGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiMdlComponentsComponentTypeAndRecordNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "apiMdlComponentsComponentTypeAndRecordNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiMdlExecuteAsyncJobIdResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "apiMdlExecuteAsyncJobIdResultsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiMdlExecuteAsyncPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiMdlExecutePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "apiMdlFilesPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "audittrailAuditTrailTypeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "audittrailAuditTrailTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "audittrailAuditTrailTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "authDiscoveryPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "authOauthSessionOathOidcProfileIdPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "authOauthSessionOathOidcProfileIdPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "authPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeClassNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeClassNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeClassNameDisablePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeClassNameDisablePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeClassNameEnablePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeClassNameEnablePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeClassNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeClassNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeProfilerGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeProfilerPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameActionsEndPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameActionsEndPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "codeProfilerSessionNameResultsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "codePut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyOrTemplateActionsListnodesPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyOrTemplateActionsListnodesPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyOrTemplateGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyOrTemplateGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyVParentNodeIdChildrenGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyVParentNodeIdChildrenGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyVParentNodeIdChildrenPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "compositesTreesEdlHierarchyVParentNodeIdChildrenPut-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "configurationComponentTypeAndRecordNameGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationComponentTypeAndRecordNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "configurationComponentTypeAndRecordNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationComponentTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "configurationComponentTypeGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "configurationObjectNameAndObjectTypeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationObjectNameAndObjectTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "configurationObjectNameAndObjectTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationObjecttypeGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationRoleAssignmentRuleDelete-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "configurationRoleAssignmentRuleGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationRoleAssignmentRuleGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationRoleAssignmentRulePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "configurationRoleAssignmentRulePut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "delegationLoginPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "delegationVaultsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "keepAlivePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "limitsGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "logsApiUsageGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsApiUsageGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdActionsResetDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdActionsResetDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdActionsResetPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdActionsResetPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdFilesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdFilesGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeDebugPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "logsCodeRuntimeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "logsCodeRuntimeGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "messagesMessageTypeActionsImportPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "messagesMessageTypeActionsImportPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "messagesMessageTypeLanguageLangActionsExportPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "messagesMessageTypeLanguageLangActionsExportPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataAudittrailAuditTrailTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataAudittrailAuditTrailTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataAudittrailGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataComponentsComponentTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataComponentsComponentTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataComponentsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsBindersTemplatesBindernodesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsBindersTemplatesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsEventsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsLockGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsPropertiesFindCommonPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsPropertiesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTemplatesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeRelationshipsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeRelationshipsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsGroupsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsSecuritypoliciesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataObjectsUsersGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameActionsCanceldeploymentPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameActionsCanceldeploymentPost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameFieldsObjectFieldNameGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameFieldsObjectFieldNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameFieldsObjectFieldNameGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNamePageLayoutsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNamePageLayoutsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNamePageLayoutsLayoutNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "metadataVobjectsObjectNamePageLayoutsLayoutNameGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "notificationsHistoriesGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "notificationsHistoriesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsActionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsActionGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsActionPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsActionPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsCanceltasksPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsCancelworkflowsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsReassigntasksPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectWorkflowActionsReplaceworkflowownerPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersActionsExportJobIdResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersActionsExportJobIdResultsGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdActionsExportPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdActionsExportPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdActionsExportPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdActionsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdActionsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdBindingRulePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdBindingRulePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsNodeIdBindingRulePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsNodeIdBindingRulePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsSectionIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsSectionIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsSectionIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdDocumentsSectionIdPut-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsNodeIdBindingRulePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsNodeIdBindingRulePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsNodeIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsNodeIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsSectionIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsSectionIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsSectionIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdSectionsSectionIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdRolesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdRolesGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdRolesPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdRolesPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdRolesRoleNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdRolesRoleNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersLifecycleActionsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersLifecycleActionsUserActionNamePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersLifecycleActionsUserActionNamePut-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsBindersPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesPut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameBindernodesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameBindernodesGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameBindernodesPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameBindernodesPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameBindernodesPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameBindernodesPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsBindersTemplatesTemplateNameGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDeletionsDocumentsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDeletionsDocumentsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDeletionsVobjectsObjectNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDeletionsVobjectsObjectNameGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsWorkflowNameGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsWorkflowNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsWorkflowNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsWorkflowNamePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsActionsWorkflowNamePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAnnotationsBatchDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAnnotationsBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAnnotationsBatchPut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAnnotationsRepliesBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAttachmentsBatchDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAttachmentsBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsAttachmentsBatchPut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchActionsFileextractJobIdResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchActionsFileextractJobIdResultsGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchActionsFileextractPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchActionsFileextractPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchActionsReclassifyPut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchActionsRerenderPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchDelete-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchLockDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsBatchPut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAnchorsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAnchorsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAnnotationsFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAnnotationsFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAnnotationsFilePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAnnotationsFilePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAttachmentsPost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAudittrailGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAudittrailGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdAudittrailGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdEventsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdEventsGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdFileGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdLockDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdLockDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdLockGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdLockGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdLockPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdLockPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypeDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypeDelete-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRenditionsRenditionTypePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdRolesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdRolesGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdRolesPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdRolesPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdRolesRoleNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdRolesRoleNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsLifecycleActionsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsLifecycleActionsUserActionNamePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsLifecycleActionsUserActionNamePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRelationshipsBatchDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRelationshipsBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRenditionsBatchDelete-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRenditionsBatchPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRenditionsBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRolesBatchDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsRolesBatchPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesPut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNameFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNameFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNamePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTemplatesTemplateNamePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsTokensPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsVersionsBatchActionsFileextractPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsVersionsBatchActionsFileextractPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsVersionsBatchDelete-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsVersionsBatchDelete-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsVersionsBatchPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDocumentsVersionsBatchPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsDomainGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDomainGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsDomainsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsEdlMatchedDocumentsBatchActionsAddPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsEdlMatchedDocumentsBatchActionsRemovePost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsGroupsAutoGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsGroupsAutoGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdDelete-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsGroupsGroupIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsGroupsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsLicensesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsActionsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsActionsWorkflowNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsActionsWorkflowNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsActionsWorkflowNamePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsActionsWorkflowNamePost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsAcceptPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsAcceptPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsCancelPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsCancelPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsCompletePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsCompletePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsReassignPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsReassignPost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsTaskActionGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsTaskActionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsTaskActionGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsTasksTaskIdGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsObjectworkflowsWorkflowIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePicklistValueNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePicklistValueNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePicklistValueNamePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePicklistValueNamePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsPicklistsPicklistNamePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxActionsBuildproductionPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxActionsPromoteproductionPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxActionsRecheckusagePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxBatchChangesizePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxEntitlementsSetPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSandboxNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotApiNameActionsUpdatePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotApiNameActionsUpdatePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotApiNameActionsUpgradePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotApiNameActionsUpgradePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotApiNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotApiNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxSnapshotPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxVaultIdActionsRefreshPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSandboxVaultIdActionsRefreshPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSandboxVaultIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSandboxVaultIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSecuritypoliciesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsSecuritypoliciesSecurityPolicyNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsSecuritypoliciesSecurityPolicyNameGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsUsersGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdPermissionsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdPermissionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdPermissionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsUsersIdPut-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsUsersMeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersMeGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersMePasswordPost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsUsersMePermissionsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersMePermissionsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersMePut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersPut-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "objectsUsersUserIdDelete-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersUserIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsUsersUserIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsUsersUserIdVaultMembershipVaultIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "objectsUsersUserIdVaultMembershipVaultIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsVaultActionsComparePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "objectsVaultActionsConfigreportPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "queryComponentsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "queryNextPagePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "queryNextPagePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "queryPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "queryPreviousPagePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "queryPreviousPagePost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "scimV2MeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2MeGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "scimV2MePut-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2MePut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2ResourceTypesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2ResourceTypesTypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "scimV2ResourceTypesTypeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2SchemasGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2SchemasIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "scimV2SchemasIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2ServiceProviderConfigGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "scimV2TypeGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2TypeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "scimV2TypeGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "scimV2TypeIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2TypeIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "scimV2TypeIdGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "scimV2UsersGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2UsersGet-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "scimV2UsersIdGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2UsersIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "scimV2UsersIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2UsersIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "scimV2UsersIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "scimV2UsersPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesCertificateCertIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesCertificateCertIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesConfigurationModeActionsDisablePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesConfigurationModeActionsEnablePost-headerParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "servicesDirectdataFilesGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesDirectdataFilesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesDirectdataFilesNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesDirectdataFilesNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsContentItemGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsContentItemGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemDelete-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemDelete-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsItemPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingItemsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPartsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPartsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPartsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesFileStagingUploadUploadSessionIdPut-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "servicesJobsHistoriesGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsHistoriesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdErrorsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdErrorsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdSummaryGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdSummaryGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdTasksGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesJobsJobIdTasksGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "servicesJobsMonitorsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsMonitorsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesJobsStartNowJobIdPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesJobsStartNowJobIdPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesLoaderExtractPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdFailurelogGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdFailurelogGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdResultsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdResultsRenditionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdResultsRenditionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdSuccesslogGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesLoaderJobIdTasksTaskIdSuccesslogGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesLoaderLoadPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesPackageActionsValidatePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesPackagePost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesPackagePut-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesQueuesGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameActionsDisableDeliveryPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameActionsDisableDeliveryPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameActionsEnableDeliveryPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameActionsEnableDeliveryPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameActionsResetPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameActionsResetPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesQueuesQueueNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "servicesVobjectVaultPackageVPackageIdActionsValidatePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "servicesVobjectVaultPackageVPackageIdActionsValidatePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "sessionDelete-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsDistributionNameCodeGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsDistributionNameCodeGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsDistributionNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsDistributionNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsDistributionNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsDistributionNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsGet-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "uicodeDistributionsPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectVaultPackageVPackageIdActionsDeployPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectVaultPackageVPackageIdActionsDeployPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectVaultPackageVPackageIdActionsDeployResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectVaultPackageVPackageIdActionsDeployResultsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsEdlItemVActionsCreateplaceholderPost-headerParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsMergesJobIdLogGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsMergesJobIdLogGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsMergesJobIdResultsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsMergesJobIdResultsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsMergesJobIdStatusGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsMergesJobIdStatusGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsActionNamePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsActionNamePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsChangetypePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsChangetypePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsMergePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsMergePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsRecalculaterollupsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsRecalculaterollupsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsRecalculaterollupsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsRecalculaterollupsPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsUpdatecorporatecurrencyPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameActionsUpdatecorporatecurrencyPut-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchDelete-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameAttachmentsBatchPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameIdRolesRoleNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameIdRolesRoleNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsActionNameGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsActionNameGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsActionNamePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsActionNamePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsCascadedeletePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsCascadedeletePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsDeepcopyPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsDeepcopyPost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdActionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsFileGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsFileGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAttachmentsPost-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAudittrailGet-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAudittrailGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdAudittrailGet-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameObjectRecordIdGet-pathParams.csv").random
    val nullQUERYFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNamePost-queryParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNamePost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNamePost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNamePut-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNamePut-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameRolesDelete-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameRolesDelete-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameRolesPost-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsObjectNameRolesPost-pathParams.csv").random
    val nullHEADERFeeder = csv(userDataDirectory + File.separator + "vobjectsOutboundPackageVPackageIdDependenciesGet-headerParams.csv").random
    val nullPATHFeeder = csv(userDataDirectory + File.separator + "vobjectsOutboundPackageVPackageIdDependenciesGet-pathParams.csv").random

    // Setup all scenarios

    
    val scnapiGet = scenario("apiGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("apiGet")
        .httpRequest("GET","/api/")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnapiGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiGet.inject(
        rampUsersPerSec(1) to(apiGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiGetPerSecond) during(durationSeconds),
        rampUsersPerSec(apiGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnapiMdlComponentsComponentTypeAndRecordNameFilesGet = scenario("apiMdlComponentsComponentTypeAndRecordNameFilesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("apiMdlComponentsComponentTypeAndRecordNameFilesGet")
        .httpRequest("GET","/api/mdl/components/${component_type_and_record_name}/files")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnapiMdlComponentsComponentTypeAndRecordNameFilesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiMdlComponentsComponentTypeAndRecordNameFilesGet.inject(
        rampUsersPerSec(1) to(apiMdlComponentsComponentTypeAndRecordNameFilesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiMdlComponentsComponentTypeAndRecordNameFilesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(apiMdlComponentsComponentTypeAndRecordNameFilesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnapiMdlComponentsComponentTypeAndRecordNameGet = scenario("apiMdlComponentsComponentTypeAndRecordNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("apiMdlComponentsComponentTypeAndRecordNameGet")
        .httpRequest("GET","/api/mdl/components/${component_type_and_record_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnapiMdlComponentsComponentTypeAndRecordNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiMdlComponentsComponentTypeAndRecordNameGet.inject(
        rampUsersPerSec(1) to(apiMdlComponentsComponentTypeAndRecordNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiMdlComponentsComponentTypeAndRecordNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(apiMdlComponentsComponentTypeAndRecordNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnapiMdlExecuteAsyncJobIdResultsGet = scenario("apiMdlExecuteAsyncJobIdResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("apiMdlExecuteAsyncJobIdResultsGet")
        .httpRequest("GET","/api/mdl/execute_async/${job_id}/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnapiMdlExecuteAsyncJobIdResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiMdlExecuteAsyncJobIdResultsGet.inject(
        rampUsersPerSec(1) to(apiMdlExecuteAsyncJobIdResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiMdlExecuteAsyncJobIdResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(apiMdlExecuteAsyncJobIdResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnapiMdlExecuteAsyncPost = scenario("apiMdlExecuteAsyncPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("apiMdlExecuteAsyncPost")
        .httpRequest("POST","/api/mdl/execute_async")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnapiMdlExecuteAsyncPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiMdlExecuteAsyncPost.inject(
        rampUsersPerSec(1) to(apiMdlExecuteAsyncPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiMdlExecuteAsyncPostPerSecond) during(durationSeconds),
        rampUsersPerSec(apiMdlExecuteAsyncPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnapiMdlExecutePost = scenario("apiMdlExecutePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("apiMdlExecutePost")
        .httpRequest("POST","/api/mdl/execute")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnapiMdlExecutePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiMdlExecutePost.inject(
        rampUsersPerSec(1) to(apiMdlExecutePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiMdlExecutePostPerSecond) during(durationSeconds),
        rampUsersPerSec(apiMdlExecutePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnapiMdlFilesPost = scenario("apiMdlFilesPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("apiMdlFilesPost")
        .httpRequest("POST","/api/mdl/files")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnapiMdlFilesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnapiMdlFilesPost.inject(
        rampUsersPerSec(1) to(apiMdlFilesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(apiMdlFilesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(apiMdlFilesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaudittrailAuditTrailTypeGet = scenario("audittrailAuditTrailTypeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("audittrailAuditTrailTypeGet")
        .httpRequest("GET","/audittrail/${audit_trail_type}")
        .queryParam("objects","${objects}")
        .queryParam("offset","${offset}")
        .queryParam("end_date","${end_date}")
        .queryParam("limit","${limit}")
        .queryParam("format_result","${format_result}")
        .queryParam("all_dates","${all_dates}")
        .queryParam("events","${events}")
        .queryParam("start_date","${start_date}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnaudittrailAuditTrailTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaudittrailAuditTrailTypeGet.inject(
        rampUsersPerSec(1) to(audittrailAuditTrailTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(audittrailAuditTrailTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(audittrailAuditTrailTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnauthDiscoveryPost = scenario("authDiscoveryPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("authDiscoveryPost")
        .httpRequest("POST","/auth/discovery")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnauthDiscoveryPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnauthDiscoveryPost.inject(
        rampUsersPerSec(1) to(authDiscoveryPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(authDiscoveryPostPerSecond) during(durationSeconds),
        rampUsersPerSec(authDiscoveryPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnauthOauthSessionOathOidcProfileIdPost = scenario("authOauthSessionOathOidcProfileIdPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("authOauthSessionOathOidcProfileIdPost")
        .httpRequest("POST","/auth/oauth/session/${oath_oidc_profile_id}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Authorization","${Authorization}")
)

    // Run scnauthOauthSessionOathOidcProfileIdPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnauthOauthSessionOathOidcProfileIdPost.inject(
        rampUsersPerSec(1) to(authOauthSessionOathOidcProfileIdPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(authOauthSessionOathOidcProfileIdPostPerSecond) during(durationSeconds),
        rampUsersPerSec(authOauthSessionOathOidcProfileIdPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnauthPost = scenario("authPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("authPost")
        .httpRequest("POST","/auth")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnauthPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnauthPost.inject(
        rampUsersPerSec(1) to(authPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(authPostPerSecond) during(durationSeconds),
        rampUsersPerSec(authPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeClassNameDelete = scenario("codeClassNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeClassNameDelete")
        .httpRequest("DELETE","/code/${class_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeClassNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeClassNameDelete.inject(
        rampUsersPerSec(1) to(codeClassNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeClassNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(codeClassNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeClassNameDisablePut = scenario("codeClassNameDisablePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeClassNameDisablePut")
        .httpRequest("PUT","/code/${class_name}/disable")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncodeClassNameDisablePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeClassNameDisablePut.inject(
        rampUsersPerSec(1) to(codeClassNameDisablePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeClassNameDisablePutPerSecond) during(durationSeconds),
        rampUsersPerSec(codeClassNameDisablePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeClassNameEnablePut = scenario("codeClassNameEnablePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeClassNameEnablePut")
        .httpRequest("PUT","/code/${class_name}/enable")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncodeClassNameEnablePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeClassNameEnablePut.inject(
        rampUsersPerSec(1) to(codeClassNameEnablePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeClassNameEnablePutPerSecond) during(durationSeconds),
        rampUsersPerSec(codeClassNameEnablePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeClassNameGet = scenario("codeClassNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeClassNameGet")
        .httpRequest("GET","/code/${class_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeClassNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeClassNameGet.inject(
        rampUsersPerSec(1) to(codeClassNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeClassNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(codeClassNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeProfilerGet = scenario("codeProfilerGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("codeProfilerGet")
        .httpRequest("GET","/code/profiler")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeProfilerGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeProfilerGet.inject(
        rampUsersPerSec(1) to(codeProfilerGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeProfilerGetPerSecond) during(durationSeconds),
        rampUsersPerSec(codeProfilerGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeProfilerPost = scenario("codeProfilerPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("codeProfilerPost")
        .httpRequest("POST","/code/profiler")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncodeProfilerPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeProfilerPost.inject(
        rampUsersPerSec(1) to(codeProfilerPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeProfilerPostPerSecond) during(durationSeconds),
        rampUsersPerSec(codeProfilerPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeProfilerSessionNameActionsEndPost = scenario("codeProfilerSessionNameActionsEndPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeProfilerSessionNameActionsEndPost")
        .httpRequest("POST","/code/profiler/${session_name}/actions/end")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeProfilerSessionNameActionsEndPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeProfilerSessionNameActionsEndPost.inject(
        rampUsersPerSec(1) to(codeProfilerSessionNameActionsEndPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeProfilerSessionNameActionsEndPostPerSecond) during(durationSeconds),
        rampUsersPerSec(codeProfilerSessionNameActionsEndPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeProfilerSessionNameDelete = scenario("codeProfilerSessionNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeProfilerSessionNameDelete")
        .httpRequest("DELETE","/code/profiler/${session_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeProfilerSessionNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeProfilerSessionNameDelete.inject(
        rampUsersPerSec(1) to(codeProfilerSessionNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeProfilerSessionNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(codeProfilerSessionNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeProfilerSessionNameGet = scenario("codeProfilerSessionNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeProfilerSessionNameGet")
        .httpRequest("GET","/code/profiler/${session_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeProfilerSessionNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeProfilerSessionNameGet.inject(
        rampUsersPerSec(1) to(codeProfilerSessionNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeProfilerSessionNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(codeProfilerSessionNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodeProfilerSessionNameResultsGet = scenario("codeProfilerSessionNameResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("codeProfilerSessionNameResultsGet")
        .httpRequest("GET","/code/profiler/${session_name}/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scncodeProfilerSessionNameResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodeProfilerSessionNameResultsGet.inject(
        rampUsersPerSec(1) to(codeProfilerSessionNameResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codeProfilerSessionNameResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(codeProfilerSessionNameResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncodePut = scenario("codePutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("codePut")
        .httpRequest("PUT","/code")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncodePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncodePut.inject(
        rampUsersPerSec(1) to(codePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(codePutPerSecond) during(durationSeconds),
        rampUsersPerSec(codePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncompositesTreesEdlHierarchyOrTemplateActionsListnodesPost = scenario("compositesTreesEdlHierarchyOrTemplateActionsListnodesPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("compositesTreesEdlHierarchyOrTemplateActionsListnodesPost")
        .httpRequest("POST","/composites/trees/${edl_hierarchy_or_template}/actions/listnodes")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncompositesTreesEdlHierarchyOrTemplateActionsListnodesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncompositesTreesEdlHierarchyOrTemplateActionsListnodesPost.inject(
        rampUsersPerSec(1) to(compositesTreesEdlHierarchyOrTemplateActionsListnodesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(compositesTreesEdlHierarchyOrTemplateActionsListnodesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(compositesTreesEdlHierarchyOrTemplateActionsListnodesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncompositesTreesEdlHierarchyOrTemplateGet = scenario("compositesTreesEdlHierarchyOrTemplateGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("compositesTreesEdlHierarchyOrTemplateGet")
        .httpRequest("GET","/composites/trees/${edl_hierarchy_or_template}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncompositesTreesEdlHierarchyOrTemplateGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncompositesTreesEdlHierarchyOrTemplateGet.inject(
        rampUsersPerSec(1) to(compositesTreesEdlHierarchyOrTemplateGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(compositesTreesEdlHierarchyOrTemplateGetPerSecond) during(durationSeconds),
        rampUsersPerSec(compositesTreesEdlHierarchyOrTemplateGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncompositesTreesEdlHierarchyVParentNodeIdChildrenGet = scenario("compositesTreesEdlHierarchyVParentNodeIdChildrenGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("compositesTreesEdlHierarchyVParentNodeIdChildrenGet")
        .httpRequest("GET","/composites/trees/edl_hierarchy__v/${parent_node_id}/children")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncompositesTreesEdlHierarchyVParentNodeIdChildrenGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncompositesTreesEdlHierarchyVParentNodeIdChildrenGet.inject(
        rampUsersPerSec(1) to(compositesTreesEdlHierarchyVParentNodeIdChildrenGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(compositesTreesEdlHierarchyVParentNodeIdChildrenGetPerSecond) during(durationSeconds),
        rampUsersPerSec(compositesTreesEdlHierarchyVParentNodeIdChildrenGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncompositesTreesEdlHierarchyVParentNodeIdChildrenPut = scenario("compositesTreesEdlHierarchyVParentNodeIdChildrenPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("compositesTreesEdlHierarchyVParentNodeIdChildrenPut")
        .httpRequest("PUT","/composites/trees/edl_hierarchy__v/${parent_node_id}/children")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scncompositesTreesEdlHierarchyVParentNodeIdChildrenPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncompositesTreesEdlHierarchyVParentNodeIdChildrenPut.inject(
        rampUsersPerSec(1) to(compositesTreesEdlHierarchyVParentNodeIdChildrenPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(compositesTreesEdlHierarchyVParentNodeIdChildrenPutPerSecond) during(durationSeconds),
        rampUsersPerSec(compositesTreesEdlHierarchyVParentNodeIdChildrenPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationComponentTypeAndRecordNameGet = scenario("configurationComponentTypeAndRecordNameGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("configurationComponentTypeAndRecordNameGet")
        .httpRequest("GET","/configuration/${component_type_and_record_name}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnconfigurationComponentTypeAndRecordNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationComponentTypeAndRecordNameGet.inject(
        rampUsersPerSec(1) to(configurationComponentTypeAndRecordNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationComponentTypeAndRecordNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationComponentTypeAndRecordNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationComponentTypeGet = scenario("configurationComponentTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("configurationComponentTypeGet")
        .httpRequest("GET","/configuration/${component_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnconfigurationComponentTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationComponentTypeGet.inject(
        rampUsersPerSec(1) to(configurationComponentTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationComponentTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationComponentTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationObjectNameAndObjectTypeGet = scenario("configurationObjectNameAndObjectTypeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("configurationObjectNameAndObjectTypeGet")
        .httpRequest("GET","/configuration/${object_name_and_object_type}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnconfigurationObjectNameAndObjectTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationObjectNameAndObjectTypeGet.inject(
        rampUsersPerSec(1) to(configurationObjectNameAndObjectTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationObjectNameAndObjectTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationObjectNameAndObjectTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationObjecttypeGet = scenario("configurationObjecttypeGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("configurationObjecttypeGet")
        .httpRequest("GET","/configuration/Objecttype")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnconfigurationObjecttypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationObjecttypeGet.inject(
        rampUsersPerSec(1) to(configurationObjecttypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationObjecttypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationObjecttypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationRoleAssignmentRuleDelete = scenario("configurationRoleAssignmentRuleDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("configurationRoleAssignmentRuleDelete")
        .httpRequest("DELETE","/configuration/role_assignment_rule")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnconfigurationRoleAssignmentRuleDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationRoleAssignmentRuleDelete.inject(
        rampUsersPerSec(1) to(configurationRoleAssignmentRuleDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationRoleAssignmentRuleDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(configurationRoleAssignmentRuleDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationRoleAssignmentRuleGet = scenario("configurationRoleAssignmentRuleGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("configurationRoleAssignmentRuleGet")
        .httpRequest("GET","/configuration/role_assignment_rule")
        .queryParam("study_country__v","${study_country__v}")
        .queryParam("country__v","${country__v}")
        .queryParam("lifecycle__v","${lifecycle__v}")
        .queryParam("role__v","${role__v}")
        .queryParam("study__v","${study__v}")
        .queryParam("product__v","${product__v}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnconfigurationRoleAssignmentRuleGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationRoleAssignmentRuleGet.inject(
        rampUsersPerSec(1) to(configurationRoleAssignmentRuleGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationRoleAssignmentRuleGetPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationRoleAssignmentRuleGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationRoleAssignmentRulePost = scenario("configurationRoleAssignmentRulePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("configurationRoleAssignmentRulePost")
        .httpRequest("POST","/configuration/role_assignment_rule")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnconfigurationRoleAssignmentRulePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationRoleAssignmentRulePost.inject(
        rampUsersPerSec(1) to(configurationRoleAssignmentRulePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationRoleAssignmentRulePostPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationRoleAssignmentRulePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigurationRoleAssignmentRulePut = scenario("configurationRoleAssignmentRulePutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("configurationRoleAssignmentRulePut")
        .httpRequest("PUT","/configuration/role_assignment_rule")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnconfigurationRoleAssignmentRulePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigurationRoleAssignmentRulePut.inject(
        rampUsersPerSec(1) to(configurationRoleAssignmentRulePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configurationRoleAssignmentRulePutPerSecond) during(durationSeconds),
        rampUsersPerSec(configurationRoleAssignmentRulePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndelegationLoginPost = scenario("delegationLoginPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("delegationLoginPost")
        .httpRequest("POST","/delegation/login")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Authorization","${Authorization}")
)

    // Run scndelegationLoginPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndelegationLoginPost.inject(
        rampUsersPerSec(1) to(delegationLoginPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(delegationLoginPostPerSecond) during(durationSeconds),
        rampUsersPerSec(delegationLoginPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndelegationVaultsGet = scenario("delegationVaultsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("delegationVaultsGet")
        .httpRequest("GET","/delegation/vaults")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scndelegationVaultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndelegationVaultsGet.inject(
        rampUsersPerSec(1) to(delegationVaultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(delegationVaultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(delegationVaultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnkeepAlivePost = scenario("keepAlivePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("keepAlivePost")
        .httpRequest("POST","/keep-alive")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnkeepAlivePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnkeepAlivePost.inject(
        rampUsersPerSec(1) to(keepAlivePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(keepAlivePostPerSecond) during(durationSeconds),
        rampUsersPerSec(keepAlivePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlimitsGet = scenario("limitsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("limitsGet")
        .httpRequest("GET","/limits")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlimitsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlimitsGet.inject(
        rampUsersPerSec(1) to(limitsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(limitsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(limitsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsApiUsageGet = scenario("logsApiUsageGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("logsApiUsageGet")
        .httpRequest("GET","/logs/api_usage")
        .queryParam("date","${date}")
        .queryParam("log_format","${log_format}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsApiUsageGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsApiUsageGet.inject(
        rampUsersPerSec(1) to(logsApiUsageGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsApiUsageGetPerSecond) during(durationSeconds),
        rampUsersPerSec(logsApiUsageGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeDebugGet = scenario("logsCodeDebugGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("logsCodeDebugGet")
        .httpRequest("GET","/logs/code/debug")
        .queryParam("user_id","${user_id}")
        .queryParam("include_inactive","${include_inactive}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsCodeDebugGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeDebugGet.inject(
        rampUsersPerSec(1) to(logsCodeDebugGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeDebugGetPerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeDebugGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeDebugIdActionsResetDelete = scenario("logsCodeDebugIdActionsResetDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("logsCodeDebugIdActionsResetDelete")
        .httpRequest("DELETE","/logs/code/debug/${id}/actions/reset")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsCodeDebugIdActionsResetDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeDebugIdActionsResetDelete.inject(
        rampUsersPerSec(1) to(logsCodeDebugIdActionsResetDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeDebugIdActionsResetDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeDebugIdActionsResetDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeDebugIdActionsResetPost = scenario("logsCodeDebugIdActionsResetPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("logsCodeDebugIdActionsResetPost")
        .httpRequest("POST","/logs/code/debug/${id}/actions/reset")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsCodeDebugIdActionsResetPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeDebugIdActionsResetPost.inject(
        rampUsersPerSec(1) to(logsCodeDebugIdActionsResetPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeDebugIdActionsResetPostPerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeDebugIdActionsResetPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeDebugIdFilesGet = scenario("logsCodeDebugIdFilesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("logsCodeDebugIdFilesGet")
        .httpRequest("GET","/logs/code/debug/${id}/files")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsCodeDebugIdFilesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeDebugIdFilesGet.inject(
        rampUsersPerSec(1) to(logsCodeDebugIdFilesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeDebugIdFilesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeDebugIdFilesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeDebugIdGet = scenario("logsCodeDebugIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("logsCodeDebugIdGet")
        .httpRequest("GET","/logs/code/debug/${id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsCodeDebugIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeDebugIdGet.inject(
        rampUsersPerSec(1) to(logsCodeDebugIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeDebugIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeDebugIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeDebugPost = scenario("logsCodeDebugPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("logsCodeDebugPost")
        .httpRequest("POST","/logs/code/debug")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnlogsCodeDebugPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeDebugPost.inject(
        rampUsersPerSec(1) to(logsCodeDebugPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeDebugPostPerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeDebugPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlogsCodeRuntimeGet = scenario("logsCodeRuntimeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("logsCodeRuntimeGet")
        .httpRequest("GET","/logs/code/runtime")
        .queryParam("date","${date}")
        .queryParam("log_format","${log_format}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnlogsCodeRuntimeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlogsCodeRuntimeGet.inject(
        rampUsersPerSec(1) to(logsCodeRuntimeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(logsCodeRuntimeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(logsCodeRuntimeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmessagesMessageTypeActionsImportPost = scenario("messagesMessageTypeActionsImportPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("messagesMessageTypeActionsImportPost")
        .httpRequest("POST","/messages/${message_type}/actions/import")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmessagesMessageTypeActionsImportPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmessagesMessageTypeActionsImportPost.inject(
        rampUsersPerSec(1) to(messagesMessageTypeActionsImportPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(messagesMessageTypeActionsImportPostPerSecond) during(durationSeconds),
        rampUsersPerSec(messagesMessageTypeActionsImportPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmessagesMessageTypeLanguageLangActionsExportPost = scenario("messagesMessageTypeLanguageLangActionsExportPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("messagesMessageTypeLanguageLangActionsExportPost")
        .httpRequest("POST","/messages/${message_type}/language/${lang}/actions/export")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmessagesMessageTypeLanguageLangActionsExportPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmessagesMessageTypeLanguageLangActionsExportPost.inject(
        rampUsersPerSec(1) to(messagesMessageTypeLanguageLangActionsExportPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(messagesMessageTypeLanguageLangActionsExportPostPerSecond) during(durationSeconds),
        rampUsersPerSec(messagesMessageTypeLanguageLangActionsExportPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataAudittrailAuditTrailTypeGet = scenario("metadataAudittrailAuditTrailTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataAudittrailAuditTrailTypeGet")
        .httpRequest("GET","/metadata/audittrail/${audit_trail_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataAudittrailAuditTrailTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataAudittrailAuditTrailTypeGet.inject(
        rampUsersPerSec(1) to(metadataAudittrailAuditTrailTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataAudittrailAuditTrailTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataAudittrailAuditTrailTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataAudittrailGet = scenario("metadataAudittrailGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataAudittrailGet")
        .httpRequest("GET","/metadata/audittrail")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataAudittrailGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataAudittrailGet.inject(
        rampUsersPerSec(1) to(metadataAudittrailGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataAudittrailGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataAudittrailGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataComponentsComponentTypeGet = scenario("metadataComponentsComponentTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataComponentsComponentTypeGet")
        .httpRequest("GET","/metadata/components/${component_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataComponentsComponentTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataComponentsComponentTypeGet.inject(
        rampUsersPerSec(1) to(metadataComponentsComponentTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataComponentsComponentTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataComponentsComponentTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataComponentsGet = scenario("metadataComponentsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataComponentsGet")
        .httpRequest("GET","/metadata/components")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataComponentsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataComponentsGet.inject(
        rampUsersPerSec(1) to(metadataComponentsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataComponentsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataComponentsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsBindersTemplatesBindernodesGet = scenario("metadataObjectsBindersTemplatesBindernodesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsBindersTemplatesBindernodesGet")
        .httpRequest("GET","/metadata/objects/binders/templates/bindernodes")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsBindersTemplatesBindernodesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsBindersTemplatesBindernodesGet.inject(
        rampUsersPerSec(1) to(metadataObjectsBindersTemplatesBindernodesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsBindersTemplatesBindernodesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsBindersTemplatesBindernodesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsBindersTemplatesGet = scenario("metadataObjectsBindersTemplatesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsBindersTemplatesGet")
        .httpRequest("GET","/metadata/objects/binders/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsBindersTemplatesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsBindersTemplatesGet.inject(
        rampUsersPerSec(1) to(metadataObjectsBindersTemplatesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsBindersTemplatesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsBindersTemplatesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet = scenario("metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet")
        .httpRequest("GET","/metadata/objects/documents/annotations/placemarks/types/${placemark_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet = scenario("metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet")
        .httpRequest("GET","/metadata/objects/documents/annotations/references/types/${reference_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet = scenario("metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet")
        .httpRequest("GET","/metadata/objects/documents/annotations/types/${annotation_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet = scenario("metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet")
        .httpRequest("GET","/metadata/objects/documents/events/${event_type}/types/${event_subtype}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsEventsGet = scenario("metadataObjectsDocumentsEventsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsDocumentsEventsGet")
        .httpRequest("GET","/metadata/objects/documents/events")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsEventsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsEventsGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsEventsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsEventsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsEventsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsLockGet = scenario("metadataObjectsDocumentsLockGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsDocumentsLockGet")
        .httpRequest("GET","/metadata/objects/documents/lock")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsLockGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsLockGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsLockGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsLockGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsLockGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsPropertiesFindCommonPost = scenario("metadataObjectsDocumentsPropertiesFindCommonPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsDocumentsPropertiesFindCommonPost")
        .httpRequest("POST","/metadata/objects/documents/properties/find_common")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnmetadataObjectsDocumentsPropertiesFindCommonPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsPropertiesFindCommonPost.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsPropertiesFindCommonPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsPropertiesFindCommonPostPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsPropertiesFindCommonPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsPropertiesGet = scenario("metadataObjectsDocumentsPropertiesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsDocumentsPropertiesGet")
        .httpRequest("GET","/metadata/objects/documents/properties")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsPropertiesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsPropertiesGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsPropertiesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsPropertiesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsPropertiesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsTemplatesGet = scenario("metadataObjectsDocumentsTemplatesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsDocumentsTemplatesGet")
        .httpRequest("GET","/metadata/objects/documents/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsTemplatesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsTemplatesGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsTemplatesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsTemplatesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsTemplatesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsTypesGet = scenario("metadataObjectsDocumentsTypesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsDocumentsTypesGet")
        .httpRequest("GET","/metadata/objects/documents/types")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsTypesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsTypesGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsTypesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsTypesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsTypesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsTypesTypeGet = scenario("metadataObjectsDocumentsTypesTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsTypesTypeGet")
        .httpRequest("GET","/metadata/objects/documents/types/${type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsTypesTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsTypesTypeGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsTypesTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsTypesTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsTypesTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsTypesTypeRelationshipsGet = scenario("metadataObjectsDocumentsTypesTypeRelationshipsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsTypesTypeRelationshipsGet")
        .httpRequest("GET","/metadata/objects/documents/types/${type}/relationships")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsTypesTypeRelationshipsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsTypesTypeRelationshipsGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsTypesTypeRelationshipsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsTypesTypeRelationshipsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsTypesTypeRelationshipsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet = scenario("metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet")
        .httpRequest("GET","/metadata/objects/documents/types/${type}/subtypes/${subtype}/classifications/${classification}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet = scenario("metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet")
        .httpRequest("GET","/metadata/objects/documents/types/${type}/subtypes/${subtype}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet.inject(
        rampUsersPerSec(1) to(metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsGroupsGet = scenario("metadataObjectsGroupsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsGroupsGet")
        .httpRequest("GET","/metadata/objects/groups")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsGroupsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsGroupsGet.inject(
        rampUsersPerSec(1) to(metadataObjectsGroupsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsGroupsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsGroupsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsSecuritypoliciesGet = scenario("metadataObjectsSecuritypoliciesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsSecuritypoliciesGet")
        .httpRequest("GET","/metadata/objects/securitypolicies")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsSecuritypoliciesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsSecuritypoliciesGet.inject(
        rampUsersPerSec(1) to(metadataObjectsSecuritypoliciesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsSecuritypoliciesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsSecuritypoliciesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataObjectsUsersGet = scenario("metadataObjectsUsersGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataObjectsUsersGet")
        .httpRequest("GET","/metadata/objects/users")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataObjectsUsersGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataObjectsUsersGet.inject(
        rampUsersPerSec(1) to(metadataObjectsUsersGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataObjectsUsersGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataObjectsUsersGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet = scenario("metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet")
        .httpRequest("GET","/metadata/query/archived_documents/relationships/document_signature__sysr")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet.inject(
        rampUsersPerSec(1) to(metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet = scenario("metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet")
        .httpRequest("GET","/metadata/query/documents/relationships/document_signature__sysr")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet.inject(
        rampUsersPerSec(1) to(metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataVobjectsGet = scenario("metadataVobjectsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("metadataVobjectsGet")
        .httpRequest("GET","/metadata/vobjects")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataVobjectsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataVobjectsGet.inject(
        rampUsersPerSec(1) to(metadataVobjectsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataVobjectsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataVobjectsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataVobjectsObjectNameActionsCanceldeploymentPost = scenario("metadataVobjectsObjectNameActionsCanceldeploymentPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataVobjectsObjectNameActionsCanceldeploymentPost")
        .httpRequest("POST","/metadata/vobjects/${object_name}/actions/canceldeployment")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataVobjectsObjectNameActionsCanceldeploymentPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataVobjectsObjectNameActionsCanceldeploymentPost.inject(
        rampUsersPerSec(1) to(metadataVobjectsObjectNameActionsCanceldeploymentPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataVobjectsObjectNameActionsCanceldeploymentPostPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataVobjectsObjectNameActionsCanceldeploymentPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataVobjectsObjectNameFieldsObjectFieldNameGet = scenario("metadataVobjectsObjectNameFieldsObjectFieldNameGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataVobjectsObjectNameFieldsObjectFieldNameGet")
        .httpRequest("GET","/metadata/vobjects/${object_name}/fields/${object_field_name}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataVobjectsObjectNameFieldsObjectFieldNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataVobjectsObjectNameFieldsObjectFieldNameGet.inject(
        rampUsersPerSec(1) to(metadataVobjectsObjectNameFieldsObjectFieldNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataVobjectsObjectNameFieldsObjectFieldNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataVobjectsObjectNameFieldsObjectFieldNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataVobjectsObjectNameGet = scenario("metadataVobjectsObjectNameGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataVobjectsObjectNameGet")
        .httpRequest("GET","/metadata/vobjects/${object_name}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataVobjectsObjectNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataVobjectsObjectNameGet.inject(
        rampUsersPerSec(1) to(metadataVobjectsObjectNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataVobjectsObjectNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataVobjectsObjectNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataVobjectsObjectNamePageLayoutsGet = scenario("metadataVobjectsObjectNamePageLayoutsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataVobjectsObjectNamePageLayoutsGet")
        .httpRequest("GET","/metadata/vobjects/${object_name}/page_layouts")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataVobjectsObjectNamePageLayoutsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataVobjectsObjectNamePageLayoutsGet.inject(
        rampUsersPerSec(1) to(metadataVobjectsObjectNamePageLayoutsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataVobjectsObjectNamePageLayoutsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataVobjectsObjectNamePageLayoutsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmetadataVobjectsObjectNamePageLayoutsLayoutNameGet = scenario("metadataVobjectsObjectNamePageLayoutsLayoutNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("metadataVobjectsObjectNamePageLayoutsLayoutNameGet")
        .httpRequest("GET","/metadata/vobjects/${object_name}/page_layouts/${layout_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnmetadataVobjectsObjectNamePageLayoutsLayoutNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmetadataVobjectsObjectNamePageLayoutsLayoutNameGet.inject(
        rampUsersPerSec(1) to(metadataVobjectsObjectNamePageLayoutsLayoutNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(metadataVobjectsObjectNamePageLayoutsLayoutNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(metadataVobjectsObjectNamePageLayoutsLayoutNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnnotificationsHistoriesGet = scenario("notificationsHistoriesGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("notificationsHistoriesGet")
        .httpRequest("GET","/notifications/histories")
        .queryParam("all_dates","${all_dates}")
        .queryParam("start_date","${start_date}")
        .queryParam("limit","${limit}")
        .queryParam("format_result","${format_result}")
        .queryParam("end_date","${end_date}")
        .queryParam("offset","${offset}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnnotificationsHistoriesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnnotificationsHistoriesGet.inject(
        rampUsersPerSec(1) to(notificationsHistoriesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(notificationsHistoriesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(notificationsHistoriesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsActionGet = scenario("objectWorkflowActionsActionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectWorkflowActionsActionGet")
        .httpRequest("GET","/object/workflow/actions/${action}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectWorkflowActionsActionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsActionGet.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsActionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsActionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsActionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsActionPost = scenario("objectWorkflowActionsActionPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectWorkflowActionsActionPost")
        .httpRequest("POST","/object/workflow/actions/${action}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectWorkflowActionsActionPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsActionPost.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsActionPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsActionPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsActionPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsCanceltasksPost = scenario("objectWorkflowActionsCanceltasksPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectWorkflowActionsCanceltasksPost")
        .httpRequest("POST","/object/workflow/actions/canceltasks")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectWorkflowActionsCanceltasksPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsCanceltasksPost.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsCanceltasksPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsCanceltasksPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsCanceltasksPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsCancelworkflowsPost = scenario("objectWorkflowActionsCancelworkflowsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectWorkflowActionsCancelworkflowsPost")
        .httpRequest("POST","/object/workflow/actions/cancelworkflows")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectWorkflowActionsCancelworkflowsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsCancelworkflowsPost.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsCancelworkflowsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsCancelworkflowsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsCancelworkflowsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsGet = scenario("objectWorkflowActionsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectWorkflowActionsGet")
        .httpRequest("GET","/object/workflow/actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectWorkflowActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsGet.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsReassigntasksPost = scenario("objectWorkflowActionsReassigntasksPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectWorkflowActionsReassigntasksPost")
        .httpRequest("POST","/object/workflow/actions/reassigntasks")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectWorkflowActionsReassigntasksPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsReassigntasksPost.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsReassigntasksPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsReassigntasksPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsReassigntasksPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectWorkflowActionsReplaceworkflowownerPost = scenario("objectWorkflowActionsReplaceworkflowownerPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectWorkflowActionsReplaceworkflowownerPost")
        .httpRequest("POST","/object/workflow/actions/replaceworkflowowner")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectWorkflowActionsReplaceworkflowownerPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectWorkflowActionsReplaceworkflowownerPost.inject(
        rampUsersPerSec(1) to(objectWorkflowActionsReplaceworkflowownerPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectWorkflowActionsReplaceworkflowownerPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectWorkflowActionsReplaceworkflowownerPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersActionsExportJobIdResultsGet = scenario("objectsBindersActionsExportJobIdResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersActionsExportJobIdResultsGet")
        .httpRequest("GET","/objects/binders/actions/export/${job_id}/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersActionsExportJobIdResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersActionsExportJobIdResultsGet.inject(
        rampUsersPerSec(1) to(objectsBindersActionsExportJobIdResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersActionsExportJobIdResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersActionsExportJobIdResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdActionsExportPost = scenario("objectsBindersBinderIdActionsExportPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdActionsExportPost")
        .httpRequest("POST","/objects/binders/${binder_id}/actions/export")
        .queryParam("source","${source}")
        .queryParam("export","${export}")
        .queryParam("renditiontype","${renditiontype}")
        .queryParam("docversion","${docversion}")
        .queryParam("attachments","${attachments}")
        .queryParam("docfield","${docfield}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdActionsExportPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdActionsExportPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdActionsExportPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdActionsExportPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdActionsExportPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdActionsPost = scenario("objectsBindersBinderIdActionsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdActionsPost")
        .httpRequest("POST","/objects/binders/${binder_id}/actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdActionsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdActionsPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdActionsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdActionsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdActionsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdBindingRulePut = scenario("objectsBindersBinderIdBindingRulePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdBindingRulePut")
        .httpRequest("PUT","/objects/binders/${binder_id}/binding_rule")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdBindingRulePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdBindingRulePut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdBindingRulePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdBindingRulePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdBindingRulePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdDelete = scenario("objectsBindersBinderIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdDelete")
        .httpRequest("DELETE","/objects/binders/${binder_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdDelete.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdDocumentsNodeIdBindingRulePut = scenario("objectsBindersBinderIdDocumentsNodeIdBindingRulePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdDocumentsNodeIdBindingRulePut")
        .httpRequest("PUT","/objects/binders/${binder_id}/documents/${node_id}/binding_rule")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdDocumentsNodeIdBindingRulePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdDocumentsNodeIdBindingRulePut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdDocumentsNodeIdBindingRulePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdDocumentsNodeIdBindingRulePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdDocumentsNodeIdBindingRulePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdDocumentsPost = scenario("objectsBindersBinderIdDocumentsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdDocumentsPost")
        .httpRequest("POST","/objects/binders/${binder_id}/documents")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdDocumentsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdDocumentsPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdDocumentsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdDocumentsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdDocumentsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdDocumentsSectionIdDelete = scenario("objectsBindersBinderIdDocumentsSectionIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdDocumentsSectionIdDelete")
        .httpRequest("DELETE","/objects/binders/${binder_id}/documents/${section_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdDocumentsSectionIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdDocumentsSectionIdDelete.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdDocumentsSectionIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdDocumentsSectionIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdDocumentsSectionIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdDocumentsSectionIdPut = scenario("objectsBindersBinderIdDocumentsSectionIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdDocumentsSectionIdPut")
        .httpRequest("PUT","/objects/binders/${binder_id}/documents/${section_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdDocumentsSectionIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdDocumentsSectionIdPut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdDocumentsSectionIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdDocumentsSectionIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdDocumentsSectionIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdGet = scenario("objectsBindersBinderIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdGet")
        .httpRequest("GET","/objects/binders/${binder_id}")
        .queryParam("depth","${depth}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdGet.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdPost = scenario("objectsBindersBinderIdPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdPost")
        .httpRequest("POST","/objects/binders/${binder_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdPut = scenario("objectsBindersBinderIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdPut")
        .httpRequest("PUT","/objects/binders/${binder_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdPut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete = scenario("objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete")
        .httpRequest("DELETE","/objects/binders/${binder_id}/roles/${role_name_and_user_or_group}/${id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdSectionsNodeIdBindingRulePut = scenario("objectsBindersBinderIdSectionsNodeIdBindingRulePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdSectionsNodeIdBindingRulePut")
        .httpRequest("PUT","/objects/binders/${binder_id}/sections/${node_id}/binding_rule")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdSectionsNodeIdBindingRulePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdSectionsNodeIdBindingRulePut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdSectionsNodeIdBindingRulePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdSectionsNodeIdBindingRulePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdSectionsNodeIdBindingRulePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdSectionsNodeIdPut = scenario("objectsBindersBinderIdSectionsNodeIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdSectionsNodeIdPut")
        .httpRequest("PUT","/objects/binders/${binder_id}/sections/${node_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdSectionsNodeIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdSectionsNodeIdPut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdSectionsNodeIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdSectionsNodeIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdSectionsNodeIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdSectionsPost = scenario("objectsBindersBinderIdSectionsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdSectionsPost")
        .httpRequest("POST","/objects/binders/${binder_id}/sections")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdSectionsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdSectionsPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdSectionsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdSectionsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdSectionsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdSectionsSectionIdDelete = scenario("objectsBindersBinderIdSectionsSectionIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdSectionsSectionIdDelete")
        .httpRequest("DELETE","/objects/binders/${binder_id}/sections/${section_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdSectionsSectionIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdSectionsSectionIdDelete.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdSectionsSectionIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdSectionsSectionIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdSectionsSectionIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdSectionsSectionIdGet = scenario("objectsBindersBinderIdSectionsSectionIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdSectionsSectionIdGet")
        .httpRequest("GET","/objects/binders/${binder_id}/sections/${section_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdSectionsSectionIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdSectionsSectionIdGet.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdSectionsSectionIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdSectionsSectionIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdSectionsSectionIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsGet = scenario("objectsBindersBinderIdVersionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsGet")
        .httpRequest("GET","/objects/binders/${binder_id}/versions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsGet.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost")
        .httpRequest("POST","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/actions/export")
        .queryParam("source","${source}")
        .queryParam("export","${export}")
        .queryParam("renditiontype","${renditiontype}")
        .queryParam("docversion","${docversion}")
        .queryParam("attachments","${attachments}")
        .queryParam("docfield","${docfield}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete")
        .httpRequest("DELETE","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionGet")
        .httpRequest("GET","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionPut")
        .httpRequest("PUT","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost")
        .httpRequest("POST","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/relationships")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete")
        .httpRequest("DELETE","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet")
        .httpRequest("GET","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet = scenario("objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet")
        .httpRequest("GET","/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/sections/${section_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet.inject(
        rampUsersPerSec(1) to(objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersIdRolesGet = scenario("objectsBindersIdRolesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersIdRolesGet")
        .httpRequest("GET","/objects/binders/${id}/roles")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersIdRolesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersIdRolesGet.inject(
        rampUsersPerSec(1) to(objectsBindersIdRolesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersIdRolesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersIdRolesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersIdRolesPost = scenario("objectsBindersIdRolesPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersIdRolesPost")
        .httpRequest("POST","/objects/binders/${id}/roles")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersIdRolesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersIdRolesPost.inject(
        rampUsersPerSec(1) to(objectsBindersIdRolesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersIdRolesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersIdRolesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersIdRolesRoleNameGet = scenario("objectsBindersIdRolesRoleNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersIdRolesRoleNameGet")
        .httpRequest("GET","/objects/binders/${id}/roles/${role_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersIdRolesRoleNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersIdRolesRoleNameGet.inject(
        rampUsersPerSec(1) to(objectsBindersIdRolesRoleNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersIdRolesRoleNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersIdRolesRoleNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet = scenario("objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet")
        .httpRequest("GET","/objects/binders/${id}/versions/${major_version}/${minor_version}/lifecycle_actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet.inject(
        rampUsersPerSec(1) to(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet = scenario("objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet")
        .httpRequest("GET","/objects/binders/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}/entry_requirements")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet.inject(
        rampUsersPerSec(1) to(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut = scenario("objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut")
        .httpRequest("PUT","/objects/binders/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut.inject(
        rampUsersPerSec(1) to(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersLifecycleActionsPost = scenario("objectsBindersLifecycleActionsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsBindersLifecycleActionsPost")
        .httpRequest("POST","/objects/binders/lifecycle_actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersLifecycleActionsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersLifecycleActionsPost.inject(
        rampUsersPerSec(1) to(objectsBindersLifecycleActionsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersLifecycleActionsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersLifecycleActionsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersLifecycleActionsUserActionNamePut = scenario("objectsBindersLifecycleActionsUserActionNamePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersLifecycleActionsUserActionNamePut")
        .httpRequest("PUT","/objects/binders/lifecycle_actions/${user_action_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersLifecycleActionsUserActionNamePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersLifecycleActionsUserActionNamePut.inject(
        rampUsersPerSec(1) to(objectsBindersLifecycleActionsUserActionNamePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersLifecycleActionsUserActionNamePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersLifecycleActionsUserActionNamePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersPost = scenario("objectsBindersPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsBindersPost")
        .httpRequest("POST","/objects/binders")
        .queryParam("async","${async}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersPost.inject(
        rampUsersPerSec(1) to(objectsBindersPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesGet = scenario("objectsBindersTemplatesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsBindersTemplatesGet")
        .httpRequest("GET","/objects/binders/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersTemplatesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesGet.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesPost = scenario("objectsBindersTemplatesPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsBindersTemplatesPost")
        .httpRequest("POST","/objects/binders/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersTemplatesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesPost.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesPut = scenario("objectsBindersTemplatesPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsBindersTemplatesPut")
        .httpRequest("PUT","/objects/binders/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersTemplatesPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesPut.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesTemplateNameBindernodesGet = scenario("objectsBindersTemplatesTemplateNameBindernodesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersTemplatesTemplateNameBindernodesGet")
        .httpRequest("GET","/objects/binders/templates/${template_name}/bindernodes")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersTemplatesTemplateNameBindernodesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesTemplateNameBindernodesGet.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesTemplateNameBindernodesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesTemplateNameBindernodesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesTemplateNameBindernodesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesTemplateNameBindernodesPost = scenario("objectsBindersTemplatesTemplateNameBindernodesPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersTemplatesTemplateNameBindernodesPost")
        .httpRequest("POST","/objects/binders/templates/${template_name}/bindernodes")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersTemplatesTemplateNameBindernodesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesTemplateNameBindernodesPost.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesTemplateNameBindernodesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesTemplateNameBindernodesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesTemplateNameBindernodesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesTemplateNameBindernodesPut = scenario("objectsBindersTemplatesTemplateNameBindernodesPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersTemplatesTemplateNameBindernodesPut")
        .httpRequest("PUT","/objects/binders/templates/${template_name}/bindernodes")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsBindersTemplatesTemplateNameBindernodesPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesTemplateNameBindernodesPut.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesTemplateNameBindernodesPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesTemplateNameBindernodesPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesTemplateNameBindernodesPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesTemplateNameDelete = scenario("objectsBindersTemplatesTemplateNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersTemplatesTemplateNameDelete")
        .httpRequest("DELETE","/objects/binders/templates/${template_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersTemplatesTemplateNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesTemplateNameDelete.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesTemplateNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesTemplateNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesTemplateNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsBindersTemplatesTemplateNameGet = scenario("objectsBindersTemplatesTemplateNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsBindersTemplatesTemplateNameGet")
        .httpRequest("GET","/objects/binders/templates/${template_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsBindersTemplatesTemplateNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsBindersTemplatesTemplateNameGet.inject(
        rampUsersPerSec(1) to(objectsBindersTemplatesTemplateNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsBindersTemplatesTemplateNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsBindersTemplatesTemplateNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDeletionsDocumentsGet = scenario("objectsDeletionsDocumentsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDeletionsDocumentsGet")
        .httpRequest("GET","/objects/deletions/documents")
        .queryParam("end_date","${end_date}")
        .queryParam("start_date","${start_date}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDeletionsDocumentsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDeletionsDocumentsGet.inject(
        rampUsersPerSec(1) to(objectsDeletionsDocumentsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDeletionsDocumentsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDeletionsDocumentsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDeletionsVobjectsObjectNameGet = scenario("objectsDeletionsVobjectsObjectNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDeletionsVobjectsObjectNameGet")
        .httpRequest("GET","/objects/deletions/vobjects/${object_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDeletionsVobjectsObjectNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDeletionsVobjectsObjectNameGet.inject(
        rampUsersPerSec(1) to(objectsDeletionsVobjectsObjectNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDeletionsVobjectsObjectNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDeletionsVobjectsObjectNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsActionsGet = scenario("objectsDocumentsActionsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsActionsGet")
        .httpRequest("GET","/objects/documents/actions")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsActionsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet = scenario("objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet")
        .httpRequest("GET","/objects/documents/actions/${lifecycle_and_state_and_action}/${job_id}/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsActionsWorkflowNameGet = scenario("objectsDocumentsActionsWorkflowNameGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsActionsWorkflowNameGet")
        .httpRequest("GET","/objects/documents/actions/${workflow_name}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsActionsWorkflowNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsActionsWorkflowNameGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsActionsWorkflowNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsActionsWorkflowNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsActionsWorkflowNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsActionsWorkflowNamePost = scenario("objectsDocumentsActionsWorkflowNamePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsActionsWorkflowNamePost")
        .httpRequest("POST","/objects/documents/actions/${workflow_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsActionsWorkflowNamePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsActionsWorkflowNamePost.inject(
        rampUsersPerSec(1) to(objectsDocumentsActionsWorkflowNamePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsActionsWorkflowNamePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsActionsWorkflowNamePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAnnotationsBatchDelete = scenario("objectsDocumentsAnnotationsBatchDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAnnotationsBatchDelete")
        .httpRequest("DELETE","/objects/documents/annotations/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsAnnotationsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAnnotationsBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsAnnotationsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAnnotationsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAnnotationsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAnnotationsBatchPost = scenario("objectsDocumentsAnnotationsBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAnnotationsBatchPost")
        .httpRequest("POST","/objects/documents/annotations/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("Content-Type","${Content-Type}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsAnnotationsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAnnotationsBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsAnnotationsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAnnotationsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAnnotationsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAnnotationsBatchPut = scenario("objectsDocumentsAnnotationsBatchPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAnnotationsBatchPut")
        .httpRequest("PUT","/objects/documents/annotations/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsAnnotationsBatchPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAnnotationsBatchPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsAnnotationsBatchPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAnnotationsBatchPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAnnotationsBatchPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAnnotationsRepliesBatchPost = scenario("objectsDocumentsAnnotationsRepliesBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAnnotationsRepliesBatchPost")
        .httpRequest("POST","/objects/documents/annotations/replies/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsAnnotationsRepliesBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAnnotationsRepliesBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsAnnotationsRepliesBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAnnotationsRepliesBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAnnotationsRepliesBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAttachmentsBatchDelete = scenario("objectsDocumentsAttachmentsBatchDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAttachmentsBatchDelete")
        .httpRequest("DELETE","/objects/documents/attachments/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsAttachmentsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAttachmentsBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsAttachmentsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAttachmentsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAttachmentsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAttachmentsBatchPost = scenario("objectsDocumentsAttachmentsBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAttachmentsBatchPost")
        .httpRequest("POST","/objects/documents/attachments/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsAttachmentsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAttachmentsBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsAttachmentsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAttachmentsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAttachmentsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsAttachmentsBatchPut = scenario("objectsDocumentsAttachmentsBatchPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsAttachmentsBatchPut")
        .httpRequest("PUT","/objects/documents/attachments/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsAttachmentsBatchPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsAttachmentsBatchPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsAttachmentsBatchPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsAttachmentsBatchPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsAttachmentsBatchPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchActionsFileextractJobIdResultsGet = scenario("objectsDocumentsBatchActionsFileextractJobIdResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsBatchActionsFileextractJobIdResultsGet")
        .httpRequest("GET","/objects/documents/batch/actions/fileextract/${job_id}/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsBatchActionsFileextractJobIdResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchActionsFileextractJobIdResultsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchActionsFileextractJobIdResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchActionsFileextractJobIdResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchActionsFileextractJobIdResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchActionsFileextractPost = scenario("objectsDocumentsBatchActionsFileextractPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchActionsFileextractPost")
        .httpRequest("POST","/objects/documents/batch/actions/fileextract")
        .queryParam("source","${source}")
        .queryParam("renditions","${renditions}")
        .queryParam("allversions","${allversions}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchActionsFileextractPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchActionsFileextractPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchActionsFileextractPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchActionsFileextractPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchActionsFileextractPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchActionsReclassifyPut = scenario("objectsDocumentsBatchActionsReclassifyPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchActionsReclassifyPut")
        .httpRequest("PUT","/objects/documents/batch/actions/reclassify")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchActionsReclassifyPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchActionsReclassifyPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchActionsReclassifyPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchActionsReclassifyPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchActionsReclassifyPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchActionsRerenderPost = scenario("objectsDocumentsBatchActionsRerenderPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchActionsRerenderPost")
        .httpRequest("POST","/objects/documents/batch/actions/rerender")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchActionsRerenderPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchActionsRerenderPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchActionsRerenderPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchActionsRerenderPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchActionsRerenderPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchDelete = scenario("objectsDocumentsBatchDeleteSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchDelete")
        .httpRequest("DELETE","/objects/documents/batch")
        .queryParam("idParam","${idParam}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchLockDelete = scenario("objectsDocumentsBatchLockDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchLockDelete")
        .httpRequest("DELETE","/objects/documents/batch/lock")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchLockDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchLockDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchLockDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchLockDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchLockDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchPost = scenario("objectsDocumentsBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchPost")
        .httpRequest("POST","/objects/documents/batch")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsBatchPut = scenario("objectsDocumentsBatchPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsBatchPut")
        .httpRequest("PUT","/objects/documents/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsBatchPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsBatchPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsBatchPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsBatchPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsBatchPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAnchorsGet = scenario("objectsDocumentsDocIdAnchorsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAnchorsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/anchors")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAnchorsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAnchorsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAnchorsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAnchorsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAnchorsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAnnotationsFileGet = scenario("objectsDocumentsDocIdAnnotationsFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAnnotationsFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/annotations/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAnnotationsFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAnnotationsFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAnnotationsFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAnnotationsFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAnnotationsFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAnnotationsFilePost = scenario("objectsDocumentsDocIdAnnotationsFilePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAnnotationsFilePost")
        .httpRequest("POST","/objects/documents/${doc_id}/annotations/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdAnnotationsFilePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAnnotationsFilePost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAnnotationsFilePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAnnotationsFilePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAnnotationsFilePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdDelete = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/attachments/${attachment_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments/${attachment_id}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdGet = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments/${attachment_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdPut = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdPut")
        .httpRequest("PUT","/objects/documents/${doc_id}/attachments/${attachment_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost")
        .httpRequest("POST","/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}")
        .queryParam("restore","${restore}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet = scenario("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments/${attachment_id}/versions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsFileGet = scenario("objectsDocumentsDocIdAttachmentsFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsGet = scenario("objectsDocumentsDocIdAttachmentsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/attachments")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAttachmentsPost = scenario("objectsDocumentsDocIdAttachmentsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAttachmentsPost")
        .httpRequest("POST","/objects/documents/${doc_id}/attachments")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdAttachmentsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAttachmentsPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAttachmentsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAttachmentsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAttachmentsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdAudittrailGet = scenario("objectsDocumentsDocIdAudittrailGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdAudittrailGet")
        .httpRequest("GET","/objects/documents/${doc_id}/audittrail")
        .queryParam("start_date","${start_date}")
        .queryParam("offset","${offset}")
        .queryParam("end_date","${end_date}")
        .queryParam("limit","${limit}")
        .queryParam("format_result","${format_result}")
        .queryParam("events","${events}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdAudittrailGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdAudittrailGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdAudittrailGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdAudittrailGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdAudittrailGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdDelete = scenario("objectsDocumentsDocIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdEventsGet = scenario("objectsDocumentsDocIdEventsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdEventsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/events")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdEventsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdEventsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdEventsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdEventsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdEventsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdFileGet = scenario("objectsDocumentsDocIdFileGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/file")
        .queryParam("lockDocument","${lockDocument}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdGet = scenario("objectsDocumentsDocIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdGet")
        .httpRequest("GET","/objects/documents/${doc_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdLockDelete = scenario("objectsDocumentsDocIdLockDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdLockDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/lock")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdLockDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdLockDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdLockDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdLockDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdLockDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdLockGet = scenario("objectsDocumentsDocIdLockGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdLockGet")
        .httpRequest("GET","/objects/documents/${doc_id}/lock")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdLockGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdLockGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdLockGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdLockGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdLockGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdLockPost = scenario("objectsDocumentsDocIdLockPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdLockPost")
        .httpRequest("POST","/objects/documents/${doc_id}/lock")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdLockPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdLockPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdLockPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdLockPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdLockPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet = scenario("objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/${major_version}/${minor_version}/attachments/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdPost = scenario("objectsDocumentsDocIdPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdPost")
        .httpRequest("POST","/objects/documents/${doc_id}")
        .queryParam("suppressRendition","${suppressRendition}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdPut = scenario("objectsDocumentsDocIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdPut")
        .httpRequest("PUT","/objects/documents/${doc_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
)

    // Run scnobjectsDocumentsDocIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdRenditionsGet = scenario("objectsDocumentsDocIdRenditionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdRenditionsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/renditions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdRenditionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdRenditionsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdRenditionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdRenditionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdRenditionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdRenditionsRenditionTypeDelete = scenario("objectsDocumentsDocIdRenditionsRenditionTypeDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdRenditionsRenditionTypeDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdRenditionsRenditionTypeDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdRenditionsRenditionTypeDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdRenditionsRenditionTypeDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypeDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypeDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdRenditionsRenditionTypeGet = scenario("objectsDocumentsDocIdRenditionsRenditionTypeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdRenditionsRenditionTypeGet")
        .httpRequest("GET","/objects/documents/${doc_id}/renditions/${rendition_type}")
        .queryParam("steadyState","${steadyState}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdRenditionsRenditionTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdRenditionsRenditionTypeGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdRenditionsRenditionTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdRenditionsRenditionTypePost = scenario("objectsDocumentsDocIdRenditionsRenditionTypePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdRenditionsRenditionTypePost")
        .httpRequest("POST","/objects/documents/${doc_id}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("Content Type","${Content Type}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdRenditionsRenditionTypePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdRenditionsRenditionTypePost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdRenditionsRenditionTypePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdRenditionsRenditionTypePut = scenario("objectsDocumentsDocIdRenditionsRenditionTypePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdRenditionsRenditionTypePut")
        .httpRequest("PUT","/objects/documents/${doc_id}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdRenditionsRenditionTypePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdRenditionsRenditionTypePut.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdRenditionsRenditionTypePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdRenditionsRenditionTypePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete = scenario("objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/roles/${role_name_and_user_or_group}/${id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet = scenario("objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/version/${major_version}/${minor_version}/attachments")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsGet = scenario("objectsDocumentsDocIdVersionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/${annotation_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/${annotation_id}/replies")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost")
        .httpRequest("POST","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations")
        .queryParam("limit","${limit}")
        .queryParam("pagination_id","${pagination_id}")
        .queryParam("annotation_types","${annotation_types}")
        .queryParam("offset","${offset}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/attachments/${attachment_id}/versions/${attachment_version}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/attachments/${attachment_id}/versions/${attachment_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/doc-export-annotations-to-csv")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost")
        .httpRequest("POST","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/events")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/export-video-annotations")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut")
        .httpRequest("PUT","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost")
        .httpRequest("POST","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete")
        .httpRequest("DELETE","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost")
        .httpRequest("POST","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut")
        .httpRequest("PUT","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet = scenario("objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet")
        .httpRequest("GET","/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/thumbnail")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsGet = scenario("objectsDocumentsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsGet")
        .httpRequest("GET","/objects/documents")
        .queryParam("scope","${scope}")
        .queryParam("limit","${limit}")
        .queryParam("start","${start}")
        .queryParam("versionscope","${versionscope}")
        .queryParam("named_filter","${named_filter}")
        .queryParam("search","${search}")
        .queryParam("sort","${sort}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsIdRolesGet = scenario("objectsDocumentsIdRolesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsIdRolesGet")
        .httpRequest("GET","/objects/documents/${id}/roles")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsIdRolesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsIdRolesGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsIdRolesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsIdRolesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsIdRolesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsIdRolesPost = scenario("objectsDocumentsIdRolesPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsIdRolesPost")
        .httpRequest("POST","/objects/documents/${id}/roles")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsIdRolesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsIdRolesPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsIdRolesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsIdRolesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsIdRolesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsIdRolesRoleNameGet = scenario("objectsDocumentsIdRolesRoleNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsIdRolesRoleNameGet")
        .httpRequest("GET","/objects/documents/${id}/roles/${role_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsIdRolesRoleNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsIdRolesRoleNameGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsIdRolesRoleNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsIdRolesRoleNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsIdRolesRoleNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet = scenario("objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet")
        .httpRequest("GET","/objects/documents/${id}/versions/${major_version}/${minor_version}/lifecycle_actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet = scenario("objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet")
        .httpRequest("GET","/objects/documents/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}/entry_requirements")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut = scenario("objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut")
        .httpRequest("PUT","/objects/documents/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsLifecycleActionsPost = scenario("objectsDocumentsLifecycleActionsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsLifecycleActionsPost")
        .httpRequest("POST","/objects/documents/lifecycle_actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsLifecycleActionsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsLifecycleActionsPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsLifecycleActionsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsLifecycleActionsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsLifecycleActionsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsLifecycleActionsUserActionNamePut = scenario("objectsDocumentsLifecycleActionsUserActionNamePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsLifecycleActionsUserActionNamePut")
        .httpRequest("PUT","/objects/documents/lifecycle_actions/${user_action_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsLifecycleActionsUserActionNamePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsLifecycleActionsUserActionNamePut.inject(
        rampUsersPerSec(1) to(objectsDocumentsLifecycleActionsUserActionNamePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsLifecycleActionsUserActionNamePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsLifecycleActionsUserActionNamePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsPost = scenario("objectsDocumentsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsPost")
        .httpRequest("POST","/objects/documents")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
)

    // Run scnobjectsDocumentsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsRelationshipsBatchDelete = scenario("objectsDocumentsRelationshipsBatchDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsRelationshipsBatchDelete")
        .httpRequest("DELETE","/objects/documents/relationships/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsRelationshipsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsRelationshipsBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsRelationshipsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsRelationshipsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsRelationshipsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsRelationshipsBatchPost = scenario("objectsDocumentsRelationshipsBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsRelationshipsBatchPost")
        .httpRequest("POST","/objects/documents/relationships/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsRelationshipsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsRelationshipsBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsRelationshipsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsRelationshipsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsRelationshipsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsRenditionsBatchDelete = scenario("objectsDocumentsRenditionsBatchDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsRenditionsBatchDelete")
        .httpRequest("DELETE","/objects/documents/renditions/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsRenditionsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsRenditionsBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsRenditionsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsRenditionsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsRenditionsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsRenditionsBatchPost = scenario("objectsDocumentsRenditionsBatchPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsRenditionsBatchPost")
        .httpRequest("POST","/objects/documents/renditions/batch")
        .queryParam("largeSizeAsset","${largeSizeAsset}")
        .queryParam("idParam","${idParam}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsRenditionsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsRenditionsBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsRenditionsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsRenditionsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsRenditionsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsRolesBatchDelete = scenario("objectsDocumentsRolesBatchDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsRolesBatchDelete")
        .httpRequest("DELETE","/objects/documents/roles/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsRolesBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsRolesBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsRolesBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsRolesBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsRolesBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsRolesBatchPost = scenario("objectsDocumentsRolesBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsRolesBatchPost")
        .httpRequest("POST","/objects/documents/roles/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsRolesBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsRolesBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsRolesBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsRolesBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsRolesBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesGet = scenario("objectsDocumentsTemplatesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsTemplatesGet")
        .httpRequest("GET","/objects/documents/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsTemplatesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesPost = scenario("objectsDocumentsTemplatesPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsTemplatesPost")
        .httpRequest("POST","/objects/documents/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsTemplatesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesPut = scenario("objectsDocumentsTemplatesPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsTemplatesPut")
        .httpRequest("PUT","/objects/documents/templates")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsTemplatesPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesPut.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesTemplateNameDelete = scenario("objectsDocumentsTemplatesTemplateNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsTemplatesTemplateNameDelete")
        .httpRequest("DELETE","/objects/documents/templates/${template_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsTemplatesTemplateNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesTemplateNameDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesTemplateNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesTemplateNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesTemplateNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesTemplateNameFileGet = scenario("objectsDocumentsTemplatesTemplateNameFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsTemplatesTemplateNameFileGet")
        .httpRequest("GET","/objects/documents/templates/${template_name}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsTemplatesTemplateNameFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesTemplateNameFileGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesTemplateNameFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesTemplateNameFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesTemplateNameFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesTemplateNameGet = scenario("objectsDocumentsTemplatesTemplateNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsTemplatesTemplateNameGet")
        .httpRequest("GET","/objects/documents/templates/${template_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsTemplatesTemplateNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesTemplateNameGet.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesTemplateNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesTemplateNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesTemplateNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTemplatesTemplateNamePut = scenario("objectsDocumentsTemplatesTemplateNamePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsDocumentsTemplatesTemplateNamePut")
        .httpRequest("PUT","/objects/documents/templates/${template_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsDocumentsTemplatesTemplateNamePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTemplatesTemplateNamePut.inject(
        rampUsersPerSec(1) to(objectsDocumentsTemplatesTemplateNamePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTemplatesTemplateNamePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTemplatesTemplateNamePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsTokensPost = scenario("objectsDocumentsTokensPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsTokensPost")
        .httpRequest("POST","/objects/documents/tokens")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsTokensPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsTokensPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsTokensPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsTokensPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsTokensPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsVersionsBatchActionsFileextractPost = scenario("objectsDocumentsVersionsBatchActionsFileextractPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsVersionsBatchActionsFileextractPost")
        .httpRequest("POST","/objects/documents/versions/batch/actions/fileextract")
        .queryParam("source","${source}")
        .queryParam("renditions","${renditions}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsVersionsBatchActionsFileextractPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsVersionsBatchActionsFileextractPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsVersionsBatchActionsFileextractPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsVersionsBatchActionsFileextractPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsVersionsBatchActionsFileextractPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsVersionsBatchDelete = scenario("objectsDocumentsVersionsBatchDeleteSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsVersionsBatchDelete")
        .httpRequest("DELETE","/objects/documents/versions/batch")
        .queryParam("idParam","${idParam}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsVersionsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsVersionsBatchDelete.inject(
        rampUsersPerSec(1) to(objectsDocumentsVersionsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsVersionsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsVersionsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDocumentsVersionsBatchPost = scenario("objectsDocumentsVersionsBatchPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDocumentsVersionsBatchPost")
        .httpRequest("POST","/objects/documents/versions/batch")
        .queryParam("idParam","${idParam}")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDocumentsVersionsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDocumentsVersionsBatchPost.inject(
        rampUsersPerSec(1) to(objectsDocumentsVersionsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDocumentsVersionsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDocumentsVersionsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDomainGet = scenario("objectsDomainGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsDomainGet")
        .httpRequest("GET","/objects/domain")
        .queryParam("include_application","${include_application}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDomainGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDomainGet.inject(
        rampUsersPerSec(1) to(objectsDomainGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDomainGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDomainGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsDomainsGet = scenario("objectsDomainsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsDomainsGet")
        .httpRequest("GET","/objects/domains")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsDomainsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsDomainsGet.inject(
        rampUsersPerSec(1) to(objectsDomainsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsDomainsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsDomainsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsEdlMatchedDocumentsBatchActionsAddPost = scenario("objectsEdlMatchedDocumentsBatchActionsAddPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsEdlMatchedDocumentsBatchActionsAddPost")
        .httpRequest("POST","/objects/edl_matched_documents/batch/actions/add")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsEdlMatchedDocumentsBatchActionsAddPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsEdlMatchedDocumentsBatchActionsAddPost.inject(
        rampUsersPerSec(1) to(objectsEdlMatchedDocumentsBatchActionsAddPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsEdlMatchedDocumentsBatchActionsAddPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsEdlMatchedDocumentsBatchActionsAddPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsEdlMatchedDocumentsBatchActionsRemovePost = scenario("objectsEdlMatchedDocumentsBatchActionsRemovePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsEdlMatchedDocumentsBatchActionsRemovePost")
        .httpRequest("POST","/objects/edl_matched_documents/batch/actions/remove")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsEdlMatchedDocumentsBatchActionsRemovePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsEdlMatchedDocumentsBatchActionsRemovePost.inject(
        rampUsersPerSec(1) to(objectsEdlMatchedDocumentsBatchActionsRemovePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsEdlMatchedDocumentsBatchActionsRemovePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsEdlMatchedDocumentsBatchActionsRemovePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsGroupsAutoGet = scenario("objectsGroupsAutoGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsGroupsAutoGet")
        .httpRequest("GET","/objects/groups/auto")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsGroupsAutoGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsGroupsAutoGet.inject(
        rampUsersPerSec(1) to(objectsGroupsAutoGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsGroupsAutoGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsGroupsAutoGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsGroupsGet = scenario("objectsGroupsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsGroupsGet")
        .httpRequest("GET","/objects/groups")
        .queryParam("includeImplied","${includeImplied}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsGroupsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsGroupsGet.inject(
        rampUsersPerSec(1) to(objectsGroupsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsGroupsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsGroupsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsGroupsGroupIdDelete = scenario("objectsGroupsGroupIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsGroupsGroupIdDelete")
        .httpRequest("DELETE","/objects/groups/${group_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsGroupsGroupIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsGroupsGroupIdDelete.inject(
        rampUsersPerSec(1) to(objectsGroupsGroupIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsGroupsGroupIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsGroupsGroupIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsGroupsGroupIdGet = scenario("objectsGroupsGroupIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsGroupsGroupIdGet")
        .httpRequest("GET","/objects/groups/${group_id}")
        .queryParam("includeImplied","${includeImplied}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsGroupsGroupIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsGroupsGroupIdGet.inject(
        rampUsersPerSec(1) to(objectsGroupsGroupIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsGroupsGroupIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsGroupsGroupIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsGroupsGroupIdPut = scenario("objectsGroupsGroupIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsGroupsGroupIdPut")
        .httpRequest("PUT","/objects/groups/${group_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsGroupsGroupIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsGroupsGroupIdPut.inject(
        rampUsersPerSec(1) to(objectsGroupsGroupIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsGroupsGroupIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsGroupsGroupIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsGroupsPost = scenario("objectsGroupsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsGroupsPost")
        .httpRequest("POST","/objects/groups")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsGroupsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsGroupsPost.inject(
        rampUsersPerSec(1) to(objectsGroupsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsGroupsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsGroupsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsLicensesGet = scenario("objectsLicensesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsLicensesGet")
        .httpRequest("GET","/objects/licenses")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsLicensesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsLicensesGet.inject(
        rampUsersPerSec(1) to(objectsLicensesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsLicensesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsLicensesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsActionsGet = scenario("objectsObjectworkflowsActionsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsObjectworkflowsActionsGet")
        .httpRequest("GET","/objects/objectworkflows/actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsActionsGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsActionsWorkflowNameGet = scenario("objectsObjectworkflowsActionsWorkflowNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsActionsWorkflowNameGet")
        .httpRequest("GET","/objects/objectworkflows/actions/${workflow_name}")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsActionsWorkflowNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsActionsWorkflowNameGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsActionsWorkflowNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsActionsWorkflowNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsActionsWorkflowNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsActionsWorkflowNamePost = scenario("objectsObjectworkflowsActionsWorkflowNamePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsActionsWorkflowNamePost")
        .httpRequest("POST","/objects/objectworkflows/actions/${workflow_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsActionsWorkflowNamePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsActionsWorkflowNamePost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsActionsWorkflowNamePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsActionsWorkflowNamePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsActionsWorkflowNamePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsGet = scenario("objectsObjectworkflowsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsObjectworkflowsGet")
        .httpRequest("GET","/objects/objectworkflows")
        .queryParam("offset","${offset}")
        .queryParam("participant","${participant}")
        .queryParam("page_size","${page_size}")
        .queryParam("object__v","${object__v}")
        .queryParam("record_id__v","${record_id__v}")
        .queryParam("status__v","${status__v}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksGet = scenario("objectsObjectworkflowsTasksGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsObjectworkflowsTasksGet")
        .httpRequest("GET","/objects/objectworkflows/tasks")
        .queryParam("object__v","${object__v}")
        .queryParam("offset","${offset}")
        .queryParam("status__v","${status__v}")
        .queryParam("page_size","${page_size}")
        .queryParam("assignee__v","${assignee__v}")
        .queryParam("record_id__v","${record_id__v}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsTasksGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsAcceptPost = scenario("objectsObjectworkflowsTasksTaskIdActionsAcceptPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsAcceptPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/accept")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsAcceptPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsAcceptPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsAcceptPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsAcceptPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsAcceptPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsCancelPost = scenario("objectsObjectworkflowsTasksTaskIdActionsCancelPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsCancelPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/cancel")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsCancelPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsCancelPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsCancelPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsCancelPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsCancelPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsCompletePost = scenario("objectsObjectworkflowsTasksTaskIdActionsCompletePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsCompletePost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/complete")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsCompletePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsCompletePost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsCompletePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsCompletePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsCompletePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsGet = scenario("objectsObjectworkflowsTasksTaskIdActionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsGet")
        .httpRequest("GET","/objects/objectworkflows/tasks/${task_id}/actions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost = scenario("objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/mdwaccept")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost = scenario("objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/mdwcomplete")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost = scenario("objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/mdwmanagecontent")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost = scenario("objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/mdwreassign")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsReassignPost = scenario("objectsObjectworkflowsTasksTaskIdActionsReassignPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsReassignPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/reassign")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsReassignPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsReassignPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsReassignPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsReassignPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsReassignPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet = scenario("objectsObjectworkflowsTasksTaskIdActionsTaskActionGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsTaskActionGet")
        .httpRequest("GET","/objects/objectworkflows/tasks/${task_id}/actions/${task_action}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsTaskActionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsTaskActionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsTaskActionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost = scenario("objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/undoaccept")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost = scenario("objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost")
        .httpRequest("POST","/objects/objectworkflows/tasks/${task_id}/actions/updateduedate")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsTasksTaskIdGet = scenario("objectsObjectworkflowsTasksTaskIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsTasksTaskIdGet")
        .httpRequest("GET","/objects/objectworkflows/tasks/${task_id}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsTasksTaskIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsTasksTaskIdGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsTasksTaskIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsTasksTaskIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsTasksTaskIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsWorkflowIdActionsGet = scenario("objectsObjectworkflowsWorkflowIdActionsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsWorkflowIdActionsGet")
        .httpRequest("GET","/objects/objectworkflows/${workflow_id}/actions")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsWorkflowIdActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsWorkflowIdActionsGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsWorkflowIdActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsWorkflowIdActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsWorkflowIdActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet = scenario("objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet")
        .httpRequest("GET","/objects/objectworkflows/${workflow_id}/actions/${workflow_action}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost = scenario("objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost")
        .httpRequest("POST","/objects/objectworkflows/${workflow_id}/actions/${workflow_action}")
        .queryParam("documents__sys","${documents__sys}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsObjectworkflowsWorkflowIdGet = scenario("objectsObjectworkflowsWorkflowIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsObjectworkflowsWorkflowIdGet")
        .httpRequest("GET","/objects/objectworkflows/${workflow_id}")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsObjectworkflowsWorkflowIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsObjectworkflowsWorkflowIdGet.inject(
        rampUsersPerSec(1) to(objectsObjectworkflowsWorkflowIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsObjectworkflowsWorkflowIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsObjectworkflowsWorkflowIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsPicklistsGet = scenario("objectsPicklistsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsPicklistsGet")
        .httpRequest("GET","/objects/picklists")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsPicklistsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsPicklistsGet.inject(
        rampUsersPerSec(1) to(objectsPicklistsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsPicklistsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsPicklistsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsPicklistsPicklistNameGet = scenario("objectsPicklistsPicklistNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsPicklistsPicklistNameGet")
        .httpRequest("GET","/objects/picklists/${picklist_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsPicklistsPicklistNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsPicklistsPicklistNameGet.inject(
        rampUsersPerSec(1) to(objectsPicklistsPicklistNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsPicklistsPicklistNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsPicklistsPicklistNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsPicklistsPicklistNamePicklistValueNameDelete = scenario("objectsPicklistsPicklistNamePicklistValueNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsPicklistsPicklistNamePicklistValueNameDelete")
        .httpRequest("DELETE","/objects/picklists/${picklist_name}/${picklist_value_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsPicklistsPicklistNamePicklistValueNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsPicklistsPicklistNamePicklistValueNameDelete.inject(
        rampUsersPerSec(1) to(objectsPicklistsPicklistNamePicklistValueNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsPicklistsPicklistNamePicklistValueNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsPicklistsPicklistNamePicklistValueNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsPicklistsPicklistNamePicklistValueNamePut = scenario("objectsPicklistsPicklistNamePicklistValueNamePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsPicklistsPicklistNamePicklistValueNamePut")
        .httpRequest("PUT","/objects/picklists/${picklist_name}/${picklist_value_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsPicklistsPicklistNamePicklistValueNamePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsPicklistsPicklistNamePicklistValueNamePut.inject(
        rampUsersPerSec(1) to(objectsPicklistsPicklistNamePicklistValueNamePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsPicklistsPicklistNamePicklistValueNamePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsPicklistsPicklistNamePicklistValueNamePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsPicklistsPicklistNamePost = scenario("objectsPicklistsPicklistNamePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsPicklistsPicklistNamePost")
        .httpRequest("POST","/objects/picklists/${picklist_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsPicklistsPicklistNamePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsPicklistsPicklistNamePost.inject(
        rampUsersPerSec(1) to(objectsPicklistsPicklistNamePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsPicklistsPicklistNamePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsPicklistsPicklistNamePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsPicklistsPicklistNamePut = scenario("objectsPicklistsPicklistNamePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsPicklistsPicklistNamePut")
        .httpRequest("PUT","/objects/picklists/${picklist_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsPicklistsPicklistNamePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsPicklistsPicklistNamePut.inject(
        rampUsersPerSec(1) to(objectsPicklistsPicklistNamePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsPicklistsPicklistNamePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsPicklistsPicklistNamePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxActionsBuildproductionPost = scenario("objectsSandboxActionsBuildproductionPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxActionsBuildproductionPost")
        .httpRequest("POST","/objects/sandbox/actions/buildproduction")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxActionsBuildproductionPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxActionsBuildproductionPost.inject(
        rampUsersPerSec(1) to(objectsSandboxActionsBuildproductionPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxActionsBuildproductionPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxActionsBuildproductionPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxActionsPromoteproductionPost = scenario("objectsSandboxActionsPromoteproductionPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxActionsPromoteproductionPost")
        .httpRequest("POST","/objects/sandbox/actions/promoteproduction")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxActionsPromoteproductionPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxActionsPromoteproductionPost.inject(
        rampUsersPerSec(1) to(objectsSandboxActionsPromoteproductionPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxActionsPromoteproductionPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxActionsPromoteproductionPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxActionsRecheckusagePost = scenario("objectsSandboxActionsRecheckusagePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxActionsRecheckusagePost")
        .httpRequest("POST","/objects/sandbox/actions/recheckusage")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxActionsRecheckusagePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxActionsRecheckusagePost.inject(
        rampUsersPerSec(1) to(objectsSandboxActionsRecheckusagePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxActionsRecheckusagePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxActionsRecheckusagePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxBatchChangesizePost = scenario("objectsSandboxBatchChangesizePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxBatchChangesizePost")
        .httpRequest("POST","/objects/sandbox/batch/changesize")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxBatchChangesizePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxBatchChangesizePost.inject(
        rampUsersPerSec(1) to(objectsSandboxBatchChangesizePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxBatchChangesizePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxBatchChangesizePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxEntitlementsSetPost = scenario("objectsSandboxEntitlementsSetPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxEntitlementsSetPost")
        .httpRequest("POST","/objects/sandbox/entitlements/set")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxEntitlementsSetPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxEntitlementsSetPost.inject(
        rampUsersPerSec(1) to(objectsSandboxEntitlementsSetPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxEntitlementsSetPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxEntitlementsSetPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxGet = scenario("objectsSandboxGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxGet")
        .httpRequest("GET","/objects/sandbox")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxGet.inject(
        rampUsersPerSec(1) to(objectsSandboxGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxNameDelete = scenario("objectsSandboxNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSandboxNameDelete")
        .httpRequest("DELETE","/objects/sandbox/${name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxNameDelete.inject(
        rampUsersPerSec(1) to(objectsSandboxNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxPost = scenario("objectsSandboxPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxPost")
        .httpRequest("POST","/objects/sandbox")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxPost.inject(
        rampUsersPerSec(1) to(objectsSandboxPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxSnapshotApiNameActionsUpdatePost = scenario("objectsSandboxSnapshotApiNameActionsUpdatePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSandboxSnapshotApiNameActionsUpdatePost")
        .httpRequest("POST","/objects/sandbox/snapshot/${api_name}/actions/update")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxSnapshotApiNameActionsUpdatePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxSnapshotApiNameActionsUpdatePost.inject(
        rampUsersPerSec(1) to(objectsSandboxSnapshotApiNameActionsUpdatePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxSnapshotApiNameActionsUpdatePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxSnapshotApiNameActionsUpdatePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxSnapshotApiNameActionsUpgradePost = scenario("objectsSandboxSnapshotApiNameActionsUpgradePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSandboxSnapshotApiNameActionsUpgradePost")
        .httpRequest("POST","/objects/sandbox/snapshot/${api_name}/actions/upgrade")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxSnapshotApiNameActionsUpgradePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxSnapshotApiNameActionsUpgradePost.inject(
        rampUsersPerSec(1) to(objectsSandboxSnapshotApiNameActionsUpgradePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxSnapshotApiNameActionsUpgradePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxSnapshotApiNameActionsUpgradePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxSnapshotApiNameDelete = scenario("objectsSandboxSnapshotApiNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSandboxSnapshotApiNameDelete")
        .httpRequest("DELETE","/objects/sandbox/snapshot/${api_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxSnapshotApiNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxSnapshotApiNameDelete.inject(
        rampUsersPerSec(1) to(objectsSandboxSnapshotApiNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxSnapshotApiNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxSnapshotApiNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxSnapshotGet = scenario("objectsSandboxSnapshotGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxSnapshotGet")
        .httpRequest("GET","/objects/sandbox/snapshot")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxSnapshotGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxSnapshotGet.inject(
        rampUsersPerSec(1) to(objectsSandboxSnapshotGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxSnapshotGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxSnapshotGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxSnapshotPost = scenario("objectsSandboxSnapshotPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSandboxSnapshotPost")
        .httpRequest("POST","/objects/sandbox/snapshot")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxSnapshotPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxSnapshotPost.inject(
        rampUsersPerSec(1) to(objectsSandboxSnapshotPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxSnapshotPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxSnapshotPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxVaultIdActionsRefreshPost = scenario("objectsSandboxVaultIdActionsRefreshPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSandboxVaultIdActionsRefreshPost")
        .httpRequest("POST","/objects/sandbox/${vault_id}/actions/refresh")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsSandboxVaultIdActionsRefreshPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxVaultIdActionsRefreshPost.inject(
        rampUsersPerSec(1) to(objectsSandboxVaultIdActionsRefreshPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxVaultIdActionsRefreshPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxVaultIdActionsRefreshPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSandboxVaultIdGet = scenario("objectsSandboxVaultIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSandboxVaultIdGet")
        .httpRequest("GET","/objects/sandbox/${vault_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSandboxVaultIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSandboxVaultIdGet.inject(
        rampUsersPerSec(1) to(objectsSandboxVaultIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSandboxVaultIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSandboxVaultIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSecuritypoliciesGet = scenario("objectsSecuritypoliciesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsSecuritypoliciesGet")
        .httpRequest("GET","/objects/securitypolicies")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSecuritypoliciesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSecuritypoliciesGet.inject(
        rampUsersPerSec(1) to(objectsSecuritypoliciesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSecuritypoliciesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSecuritypoliciesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsSecuritypoliciesSecurityPolicyNameGet = scenario("objectsSecuritypoliciesSecurityPolicyNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsSecuritypoliciesSecurityPolicyNameGet")
        .httpRequest("GET","/objects/securitypolicies/${security_policy_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsSecuritypoliciesSecurityPolicyNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsSecuritypoliciesSecurityPolicyNameGet.inject(
        rampUsersPerSec(1) to(objectsSecuritypoliciesSecurityPolicyNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsSecuritypoliciesSecurityPolicyNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsSecuritypoliciesSecurityPolicyNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersGet = scenario("objectsUsersGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersGet")
        .httpRequest("GET","/objects/users/")
        .queryParam("exclude_vault_membership","${exclude_vault_membership}")
        .queryParam("vaults","${vaults}")
        .queryParam("exclude_app_licensing","${exclude_app_licensing}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsUsersGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersGet.inject(
        rampUsersPerSec(1) to(objectsUsersGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersIdGet = scenario("objectsUsersIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsUsersIdGet")
        .httpRequest("GET","/objects/users/${id}")
        .queryParam("exclude_vault_membership","${exclude_vault_membership}")
        .queryParam("exclude_app_licensing","${exclude_app_licensing}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsUsersIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersIdGet.inject(
        rampUsersPerSec(1) to(objectsUsersIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersIdPermissionsGet = scenario("objectsUsersIdPermissionsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsUsersIdPermissionsGet")
        .httpRequest("GET","/objects/users/${id}/permissions")
        .queryParam("filter","${filter}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsUsersIdPermissionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersIdPermissionsGet.inject(
        rampUsersPerSec(1) to(objectsUsersIdPermissionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersIdPermissionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersIdPermissionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersIdPut = scenario("objectsUsersIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsUsersIdPut")
        .httpRequest("PUT","/objects/users/${id}")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsUsersIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersIdPut.inject(
        rampUsersPerSec(1) to(objectsUsersIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersMeGet = scenario("objectsUsersMeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersMeGet")
        .httpRequest("GET","/objects/users/me")
        .queryParam("exclude_vault_membership","${exclude_vault_membership}")
        .queryParam("exclude_app_licensing","${exclude_app_licensing}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsUsersMeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersMeGet.inject(
        rampUsersPerSec(1) to(objectsUsersMeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersMeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersMeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersMePasswordPost = scenario("objectsUsersMePasswordPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersMePasswordPost")
        .httpRequest("POST","/objects/users/me/password")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsUsersMePasswordPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersMePasswordPost.inject(
        rampUsersPerSec(1) to(objectsUsersMePasswordPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersMePasswordPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersMePasswordPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersMePermissionsGet = scenario("objectsUsersMePermissionsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersMePermissionsGet")
        .httpRequest("GET","/objects/users/me/permissions")
        .queryParam("filter","${filter}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsUsersMePermissionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersMePermissionsGet.inject(
        rampUsersPerSec(1) to(objectsUsersMePermissionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersMePermissionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersMePermissionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersMePut = scenario("objectsUsersMePutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersMePut")
        .httpRequest("PUT","/objects/users/me")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsUsersMePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersMePut.inject(
        rampUsersPerSec(1) to(objectsUsersMePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersMePutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersMePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersPost = scenario("objectsUsersPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersPost")
        .httpRequest("POST","/objects/users")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsUsersPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersPost.inject(
        rampUsersPerSec(1) to(objectsUsersPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersPut = scenario("objectsUsersPutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsUsersPut")
        .httpRequest("PUT","/objects/users")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsUsersPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersPut.inject(
        rampUsersPerSec(1) to(objectsUsersPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersUserIdDelete = scenario("objectsUsersUserIdDeleteSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsUsersUserIdDelete")
        .httpRequest("DELETE","/objects/users/${user_id}")
        .queryParam("domain","${domain}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnobjectsUsersUserIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersUserIdDelete.inject(
        rampUsersPerSec(1) to(objectsUsersUserIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersUserIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersUserIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsUsersUserIdVaultMembershipVaultIdPut = scenario("objectsUsersUserIdVaultMembershipVaultIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("objectsUsersUserIdVaultMembershipVaultIdPut")
        .httpRequest("PUT","/objects/users/${user_id}/vault_membership/${vault_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsUsersUserIdVaultMembershipVaultIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsUsersUserIdVaultMembershipVaultIdPut.inject(
        rampUsersPerSec(1) to(objectsUsersUserIdVaultMembershipVaultIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsUsersUserIdVaultMembershipVaultIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsUsersUserIdVaultMembershipVaultIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsVaultActionsComparePost = scenario("objectsVaultActionsComparePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsVaultActionsComparePost")
        .httpRequest("POST","/objects/vault/actions/compare")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsVaultActionsComparePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsVaultActionsComparePost.inject(
        rampUsersPerSec(1) to(objectsVaultActionsComparePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsVaultActionsComparePostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsVaultActionsComparePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnobjectsVaultActionsConfigreportPost = scenario("objectsVaultActionsConfigreportPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("objectsVaultActionsConfigreportPost")
        .httpRequest("POST","/objects/vault/actions/configreport")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnobjectsVaultActionsConfigreportPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnobjectsVaultActionsConfigreportPost.inject(
        rampUsersPerSec(1) to(objectsVaultActionsConfigreportPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(objectsVaultActionsConfigreportPostPerSecond) during(durationSeconds),
        rampUsersPerSec(objectsVaultActionsConfigreportPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnqueryComponentsPost = scenario("queryComponentsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("queryComponentsPost")
        .httpRequest("POST","/query/components")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnqueryComponentsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnqueryComponentsPost.inject(
        rampUsersPerSec(1) to(queryComponentsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(queryComponentsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(queryComponentsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnqueryNextPagePost = scenario("queryNextPagePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("queryNextPagePost")
        .httpRequest("POST","/query/${next_page}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-DescribeQuery","${X-VaultAPI-DescribeQuery}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnqueryNextPagePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnqueryNextPagePost.inject(
        rampUsersPerSec(1) to(queryNextPagePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(queryNextPagePostPerSecond) during(durationSeconds),
        rampUsersPerSec(queryNextPagePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnqueryPost = scenario("queryPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("queryPost")
        .httpRequest("POST","/query")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-DescribeQuery","${X-VaultAPI-DescribeQuery}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnqueryPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnqueryPost.inject(
        rampUsersPerSec(1) to(queryPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(queryPostPerSecond) during(durationSeconds),
        rampUsersPerSec(queryPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnqueryPreviousPagePost = scenario("queryPreviousPagePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("queryPreviousPagePost")
        .httpRequest("POST","/query/${previous_page}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-DescribeQuery","${X-VaultAPI-DescribeQuery}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnqueryPreviousPagePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnqueryPreviousPagePost.inject(
        rampUsersPerSec(1) to(queryPreviousPagePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(queryPreviousPagePostPerSecond) during(durationSeconds),
        rampUsersPerSec(queryPreviousPagePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2MeGet = scenario("scimV2MeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("scimV2MeGet")
        .httpRequest("GET","/scim/v2/Me")
        .queryParam("excludedAttributes","${excludedAttributes}")
        .queryParam("attributes","${attributes}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2MeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2MeGet.inject(
        rampUsersPerSec(1) to(scimV2MeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2MeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2MeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2MePut = scenario("scimV2MePutSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("scimV2MePut")
        .httpRequest("PUT","/scim/v2/Me")
        .queryParam("excludedAttributes","${excludedAttributes}")
        .queryParam("attributes","${attributes}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnscimV2MePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2MePut.inject(
        rampUsersPerSec(1) to(scimV2MePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2MePutPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2MePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2ResourceTypesGet = scenario("scimV2ResourceTypesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("scimV2ResourceTypesGet")
        .httpRequest("GET","/scim/v2/ResourceTypes")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2ResourceTypesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2ResourceTypesGet.inject(
        rampUsersPerSec(1) to(scimV2ResourceTypesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2ResourceTypesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2ResourceTypesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2ResourceTypesTypeGet = scenario("scimV2ResourceTypesTypeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("scimV2ResourceTypesTypeGet")
        .httpRequest("GET","/scim/v2/ResourceTypes/${type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2ResourceTypesTypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2ResourceTypesTypeGet.inject(
        rampUsersPerSec(1) to(scimV2ResourceTypesTypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2ResourceTypesTypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2ResourceTypesTypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2SchemasGet = scenario("scimV2SchemasGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("scimV2SchemasGet")
        .httpRequest("GET","/scim/v2/Schemas")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2SchemasGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2SchemasGet.inject(
        rampUsersPerSec(1) to(scimV2SchemasGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2SchemasGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2SchemasGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2SchemasIdGet = scenario("scimV2SchemasIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("scimV2SchemasIdGet")
        .httpRequest("GET","/scim/v2/Schemas/${id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2SchemasIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2SchemasIdGet.inject(
        rampUsersPerSec(1) to(scimV2SchemasIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2SchemasIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2SchemasIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2ServiceProviderConfigGet = scenario("scimV2ServiceProviderConfigGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("scimV2ServiceProviderConfigGet")
        .httpRequest("GET","/scim/v2/ServiceProviderConfig")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2ServiceProviderConfigGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2ServiceProviderConfigGet.inject(
        rampUsersPerSec(1) to(scimV2ServiceProviderConfigGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2ServiceProviderConfigGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2ServiceProviderConfigGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2TypeGet = scenario("scimV2TypeGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("scimV2TypeGet")
        .httpRequest("GET","/scim/v2/${type}")
        .queryParam("excludedAttributes","${excludedAttributes}")
        .queryParam("attributes","${attributes}")
        .queryParam("sortBy","${sortBy}")
        .queryParam("filter","${filter}")
        .queryParam("startIndex","${startIndex}")
        .queryParam("sortOrder","${sortOrder}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2TypeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2TypeGet.inject(
        rampUsersPerSec(1) to(scimV2TypeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2TypeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2TypeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2TypeIdGet = scenario("scimV2TypeIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("scimV2TypeIdGet")
        .httpRequest("GET","/scim/v2/${type}/${id}")
        .queryParam("excludedAttributes","${excludedAttributes}")
        .queryParam("attributes","${attributes}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2TypeIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2TypeIdGet.inject(
        rampUsersPerSec(1) to(scimV2TypeIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2TypeIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2TypeIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2UsersGet = scenario("scimV2UsersGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("scimV2UsersGet")
        .httpRequest("GET","/scim/v2/Users")
        .queryParam("excludedAttributes","${excludedAttributes}")
        .queryParam("attributes","${attributes}")
        .queryParam("sortBy","${sortBy}")
        .queryParam("filter","${filter}")
        .queryParam("startIndex","${startIndex}")
        .queryParam("count","${count}")
        .queryParam("sortOrder","${sortOrder}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2UsersGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2UsersGet.inject(
        rampUsersPerSec(1) to(scimV2UsersGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2UsersGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2UsersGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2UsersIdGet = scenario("scimV2UsersIdGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("scimV2UsersIdGet")
        .httpRequest("GET","/scim/v2/Users/${id}")
        .queryParam("excludedAttributes","${excludedAttributes}")
        .queryParam("attributes","${attributes}")
        .queryParam("filter","${filter}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnscimV2UsersIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2UsersIdGet.inject(
        rampUsersPerSec(1) to(scimV2UsersIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2UsersIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2UsersIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2UsersIdPut = scenario("scimV2UsersIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("scimV2UsersIdPut")
        .httpRequest("PUT","/scim/v2/Users/${id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnscimV2UsersIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2UsersIdPut.inject(
        rampUsersPerSec(1) to(scimV2UsersIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2UsersIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2UsersIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnscimV2UsersPost = scenario("scimV2UsersPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("scimV2UsersPost")
        .httpRequest("POST","/scim/v2/Users")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnscimV2UsersPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnscimV2UsersPost.inject(
        rampUsersPerSec(1) to(scimV2UsersPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(scimV2UsersPostPerSecond) during(durationSeconds),
        rampUsersPerSec(scimV2UsersPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesCertificateCertIdGet = scenario("servicesCertificateCertIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesCertificateCertIdGet")
        .httpRequest("GET","/services/certificate/${cert_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesCertificateCertIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesCertificateCertIdGet.inject(
        rampUsersPerSec(1) to(servicesCertificateCertIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesCertificateCertIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesCertificateCertIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesConfigurationModeActionsDisablePost = scenario("servicesConfigurationModeActionsDisablePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesConfigurationModeActionsDisablePost")
        .httpRequest("POST","/services/configuration_mode/actions/disable")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesConfigurationModeActionsDisablePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesConfigurationModeActionsDisablePost.inject(
        rampUsersPerSec(1) to(servicesConfigurationModeActionsDisablePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesConfigurationModeActionsDisablePostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesConfigurationModeActionsDisablePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesConfigurationModeActionsEnablePost = scenario("servicesConfigurationModeActionsEnablePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesConfigurationModeActionsEnablePost")
        .httpRequest("POST","/services/configuration_mode/actions/enable")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesConfigurationModeActionsEnablePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesConfigurationModeActionsEnablePost.inject(
        rampUsersPerSec(1) to(servicesConfigurationModeActionsEnablePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesConfigurationModeActionsEnablePostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesConfigurationModeActionsEnablePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesDirectdataFilesGet = scenario("servicesDirectdataFilesGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("servicesDirectdataFilesGet")
        .httpRequest("GET","/services/directdata/files")
        .queryParam("start_time","${start_time}")
        .queryParam("stop_time","${stop_time}")
        .queryParam("extract_type","${extract_type}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesDirectdataFilesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesDirectdataFilesGet.inject(
        rampUsersPerSec(1) to(servicesDirectdataFilesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesDirectdataFilesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesDirectdataFilesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesDirectdataFilesNameGet = scenario("servicesDirectdataFilesNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesDirectdataFilesNameGet")
        .httpRequest("GET","/services/directdata/files/${name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesDirectdataFilesNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesDirectdataFilesNameGet.inject(
        rampUsersPerSec(1) to(servicesDirectdataFilesNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesDirectdataFilesNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesDirectdataFilesNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingItemsContentItemGet = scenario("servicesFileStagingItemsContentItemGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingItemsContentItemGet")
        .httpRequest("GET","/services/file_staging/items/content/${item}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Range","${Range}")
)

    // Run scnservicesFileStagingItemsContentItemGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingItemsContentItemGet.inject(
        rampUsersPerSec(1) to(servicesFileStagingItemsContentItemGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingItemsContentItemGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingItemsContentItemGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingItemsItemDelete = scenario("servicesFileStagingItemsItemDeleteSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingItemsItemDelete")
        .httpRequest("DELETE","/services/file_staging/items/${item}")
        .queryParam("recursive","${recursive}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingItemsItemDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingItemsItemDelete.inject(
        rampUsersPerSec(1) to(servicesFileStagingItemsItemDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingItemsItemDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingItemsItemDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingItemsItemGet = scenario("servicesFileStagingItemsItemGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingItemsItemGet")
        .httpRequest("GET","/services/file_staging/items/${item}")
        .queryParam("format_result","${format_result}")
        .queryParam("limit","${limit}")
        .queryParam("recursive","${recursive}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingItemsItemGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingItemsItemGet.inject(
        rampUsersPerSec(1) to(servicesFileStagingItemsItemGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingItemsItemGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingItemsItemGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingItemsItemPut = scenario("servicesFileStagingItemsItemPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingItemsItemPut")
        .httpRequest("PUT","/services/file_staging/items/${item}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingItemsItemPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingItemsItemPut.inject(
        rampUsersPerSec(1) to(servicesFileStagingItemsItemPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingItemsItemPutPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingItemsItemPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingItemsPost = scenario("servicesFileStagingItemsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesFileStagingItemsPost")
        .httpRequest("POST","/services/file_staging/items")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-MD5","${Content-MD5}")
)

    // Run scnservicesFileStagingItemsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingItemsPost.inject(
        rampUsersPerSec(1) to(servicesFileStagingItemsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingItemsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingItemsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadGet = scenario("servicesFileStagingUploadGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesFileStagingUploadGet")
        .httpRequest("GET","/services/file_staging/upload/")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingUploadGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadGet.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadPost = scenario("servicesFileStagingUploadPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesFileStagingUploadPost")
        .httpRequest("POST","/services/file_staging/upload")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingUploadPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadPost.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadPostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadUploadSessionIdDelete = scenario("servicesFileStagingUploadUploadSessionIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingUploadUploadSessionIdDelete")
        .httpRequest("DELETE","/services/file_staging/upload/${upload_session_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingUploadUploadSessionIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadUploadSessionIdDelete.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadUploadSessionIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadUploadSessionIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadUploadSessionIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadUploadSessionIdGet = scenario("servicesFileStagingUploadUploadSessionIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingUploadUploadSessionIdGet")
        .httpRequest("GET","/services/file_staging/upload/${upload_session_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingUploadUploadSessionIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadUploadSessionIdGet.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadUploadSessionIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadUploadSessionIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadUploadSessionIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadUploadSessionIdPartsGet = scenario("servicesFileStagingUploadUploadSessionIdPartsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingUploadUploadSessionIdPartsGet")
        .httpRequest("GET","/services/file_staging/upload/${upload_session_id}/parts")
        .queryParam("limit","${limit}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingUploadUploadSessionIdPartsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadUploadSessionIdPartsGet.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadUploadSessionIdPartsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadUploadSessionIdPartsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadUploadSessionIdPartsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadUploadSessionIdPost = scenario("servicesFileStagingUploadUploadSessionIdPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingUploadUploadSessionIdPost")
        .httpRequest("POST","/services/file_staging/upload/${upload_session_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesFileStagingUploadUploadSessionIdPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadUploadSessionIdPost.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadUploadSessionIdPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadUploadSessionIdPostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadUploadSessionIdPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesFileStagingUploadUploadSessionIdPut = scenario("servicesFileStagingUploadUploadSessionIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesFileStagingUploadUploadSessionIdPut")
        .httpRequest("PUT","/services/file_staging/upload/${upload_session_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("Content-Type","${Content-Type}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-MD5","${Content-MD5}")
        .header("X-VaultAPI-FilePartNumber","${X-VaultAPI-FilePartNumber}")
)

    // Run scnservicesFileStagingUploadUploadSessionIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesFileStagingUploadUploadSessionIdPut.inject(
        rampUsersPerSec(1) to(servicesFileStagingUploadUploadSessionIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesFileStagingUploadUploadSessionIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesFileStagingUploadUploadSessionIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsHistoriesGet = scenario("servicesJobsHistoriesGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("servicesJobsHistoriesGet")
        .httpRequest("GET","/services/jobs/histories")
        .queryParam("offset","${offset}")
        .queryParam("end_date","${end_date}")
        .queryParam("start_date","${start_date}")
        .queryParam("status","${status}")
        .queryParam("limit","${limit}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesJobsHistoriesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsHistoriesGet.inject(
        rampUsersPerSec(1) to(servicesJobsHistoriesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsHistoriesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsHistoriesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsJobIdErrorsGet = scenario("servicesJobsJobIdErrorsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesJobsJobIdErrorsGet")
        .httpRequest("GET","/services/jobs/${job_id}/errors")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnservicesJobsJobIdErrorsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsJobIdErrorsGet.inject(
        rampUsersPerSec(1) to(servicesJobsJobIdErrorsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsJobIdErrorsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsJobIdErrorsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsJobIdGet = scenario("servicesJobsJobIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesJobsJobIdGet")
        .httpRequest("GET","/services/jobs/${job_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesJobsJobIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsJobIdGet.inject(
        rampUsersPerSec(1) to(servicesJobsJobIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsJobIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsJobIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsJobIdSummaryGet = scenario("servicesJobsJobIdSummaryGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesJobsJobIdSummaryGet")
        .httpRequest("GET","/services/jobs/${job_id}/summary")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesJobsJobIdSummaryGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsJobIdSummaryGet.inject(
        rampUsersPerSec(1) to(servicesJobsJobIdSummaryGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsJobIdSummaryGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsJobIdSummaryGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsJobIdTasksGet = scenario("servicesJobsJobIdTasksGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesJobsJobIdTasksGet")
        .httpRequest("GET","/services/jobs/${job_id}/tasks")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesJobsJobIdTasksGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsJobIdTasksGet.inject(
        rampUsersPerSec(1) to(servicesJobsJobIdTasksGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsJobIdTasksGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsJobIdTasksGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsMonitorsGet = scenario("servicesJobsMonitorsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .exec(http("servicesJobsMonitorsGet")
        .httpRequest("GET","/services/jobs/monitors")
        .queryParam("start_date","${start_date}")
        .queryParam("limit","${limit}")
        .queryParam("end_date","${end_date}")
        .queryParam("status","${status}")
        .queryParam("offset","${offset}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesJobsMonitorsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsMonitorsGet.inject(
        rampUsersPerSec(1) to(servicesJobsMonitorsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsMonitorsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsMonitorsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesJobsStartNowJobIdPost = scenario("servicesJobsStartNowJobIdPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesJobsStartNowJobIdPost")
        .httpRequest("POST","/services/jobs/start_now/${job_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesJobsStartNowJobIdPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesJobsStartNowJobIdPost.inject(
        rampUsersPerSec(1) to(servicesJobsStartNowJobIdPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesJobsStartNowJobIdPostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesJobsStartNowJobIdPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesLoaderExtractPost = scenario("servicesLoaderExtractPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesLoaderExtractPost")
        .httpRequest("POST","/services/loader/extract")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesLoaderExtractPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesLoaderExtractPost.inject(
        rampUsersPerSec(1) to(servicesLoaderExtractPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesLoaderExtractPostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesLoaderExtractPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesLoaderJobIdTasksTaskIdFailurelogGet = scenario("servicesLoaderJobIdTasksTaskIdFailurelogGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesLoaderJobIdTasksTaskIdFailurelogGet")
        .httpRequest("GET","/services/loader/${job_id}/tasks/${task_id}/failurelog")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnservicesLoaderJobIdTasksTaskIdFailurelogGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesLoaderJobIdTasksTaskIdFailurelogGet.inject(
        rampUsersPerSec(1) to(servicesLoaderJobIdTasksTaskIdFailurelogGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesLoaderJobIdTasksTaskIdFailurelogGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesLoaderJobIdTasksTaskIdFailurelogGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesLoaderJobIdTasksTaskIdResultsGet = scenario("servicesLoaderJobIdTasksTaskIdResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesLoaderJobIdTasksTaskIdResultsGet")
        .httpRequest("GET","/services/loader/${job_id}/tasks/${task_id}/results")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnservicesLoaderJobIdTasksTaskIdResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesLoaderJobIdTasksTaskIdResultsGet.inject(
        rampUsersPerSec(1) to(servicesLoaderJobIdTasksTaskIdResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesLoaderJobIdTasksTaskIdResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesLoaderJobIdTasksTaskIdResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesLoaderJobIdTasksTaskIdResultsRenditionsGet = scenario("servicesLoaderJobIdTasksTaskIdResultsRenditionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesLoaderJobIdTasksTaskIdResultsRenditionsGet")
        .httpRequest("GET","/services/loader/${job_id}/tasks/${task_id}/results/renditions")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnservicesLoaderJobIdTasksTaskIdResultsRenditionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesLoaderJobIdTasksTaskIdResultsRenditionsGet.inject(
        rampUsersPerSec(1) to(servicesLoaderJobIdTasksTaskIdResultsRenditionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesLoaderJobIdTasksTaskIdResultsRenditionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesLoaderJobIdTasksTaskIdResultsRenditionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesLoaderJobIdTasksTaskIdSuccesslogGet = scenario("servicesLoaderJobIdTasksTaskIdSuccesslogGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesLoaderJobIdTasksTaskIdSuccesslogGet")
        .httpRequest("GET","/services/loader/${job_id}/tasks/${task_id}/successlog")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnservicesLoaderJobIdTasksTaskIdSuccesslogGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesLoaderJobIdTasksTaskIdSuccesslogGet.inject(
        rampUsersPerSec(1) to(servicesLoaderJobIdTasksTaskIdSuccesslogGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesLoaderJobIdTasksTaskIdSuccesslogGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesLoaderJobIdTasksTaskIdSuccesslogGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesLoaderLoadPost = scenario("servicesLoaderLoadPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesLoaderLoadPost")
        .httpRequest("POST","/services/loader/load")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesLoaderLoadPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesLoaderLoadPost.inject(
        rampUsersPerSec(1) to(servicesLoaderLoadPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesLoaderLoadPostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesLoaderLoadPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesPackageActionsValidatePost = scenario("servicesPackageActionsValidatePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesPackageActionsValidatePost")
        .httpRequest("POST","/services/package/actions/validate")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesPackageActionsValidatePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesPackageActionsValidatePost.inject(
        rampUsersPerSec(1) to(servicesPackageActionsValidatePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesPackageActionsValidatePostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesPackageActionsValidatePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesPackagePost = scenario("servicesPackagePostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesPackagePost")
        .httpRequest("POST","/services/package")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesPackagePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesPackagePost.inject(
        rampUsersPerSec(1) to(servicesPackagePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesPackagePostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesPackagePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesPackagePut = scenario("servicesPackagePutSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesPackagePut")
        .httpRequest("PUT","/services/package")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnservicesPackagePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesPackagePut.inject(
        rampUsersPerSec(1) to(servicesPackagePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesPackagePutPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesPackagePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesQueuesGet = scenario("servicesQueuesGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("servicesQueuesGet")
        .httpRequest("GET","/services/queues")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesQueuesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesQueuesGet.inject(
        rampUsersPerSec(1) to(servicesQueuesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesQueuesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesQueuesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesQueuesQueueNameActionsDisableDeliveryPut = scenario("servicesQueuesQueueNameActionsDisableDeliveryPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesQueuesQueueNameActionsDisableDeliveryPut")
        .httpRequest("PUT","/services/queues/${queue_name}/actions/disable_delivery")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesQueuesQueueNameActionsDisableDeliveryPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesQueuesQueueNameActionsDisableDeliveryPut.inject(
        rampUsersPerSec(1) to(servicesQueuesQueueNameActionsDisableDeliveryPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesQueuesQueueNameActionsDisableDeliveryPutPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesQueuesQueueNameActionsDisableDeliveryPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesQueuesQueueNameActionsEnableDeliveryPut = scenario("servicesQueuesQueueNameActionsEnableDeliveryPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesQueuesQueueNameActionsEnableDeliveryPut")
        .httpRequest("PUT","/services/queues/${queue_name}/actions/enable_delivery")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesQueuesQueueNameActionsEnableDeliveryPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesQueuesQueueNameActionsEnableDeliveryPut.inject(
        rampUsersPerSec(1) to(servicesQueuesQueueNameActionsEnableDeliveryPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesQueuesQueueNameActionsEnableDeliveryPutPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesQueuesQueueNameActionsEnableDeliveryPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesQueuesQueueNameActionsResetPut = scenario("servicesQueuesQueueNameActionsResetPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesQueuesQueueNameActionsResetPut")
        .httpRequest("PUT","/services/queues/${queue_name}/actions/reset")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesQueuesQueueNameActionsResetPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesQueuesQueueNameActionsResetPut.inject(
        rampUsersPerSec(1) to(servicesQueuesQueueNameActionsResetPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesQueuesQueueNameActionsResetPutPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesQueuesQueueNameActionsResetPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesQueuesQueueNameGet = scenario("servicesQueuesQueueNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesQueuesQueueNameGet")
        .httpRequest("GET","/services/queues/${queue_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesQueuesQueueNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesQueuesQueueNameGet.inject(
        rampUsersPerSec(1) to(servicesQueuesQueueNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesQueuesQueueNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesQueuesQueueNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnservicesVobjectVaultPackageVPackageIdActionsValidatePost = scenario("servicesVobjectVaultPackageVPackageIdActionsValidatePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("servicesVobjectVaultPackageVPackageIdActionsValidatePost")
        .httpRequest("POST","/services/vobject/vault_package__v/${package_id}/actions/validate")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnservicesVobjectVaultPackageVPackageIdActionsValidatePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnservicesVobjectVaultPackageVPackageIdActionsValidatePost.inject(
        rampUsersPerSec(1) to(servicesVobjectVaultPackageVPackageIdActionsValidatePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(servicesVobjectVaultPackageVPackageIdActionsValidatePostPerSecond) during(durationSeconds),
        rampUsersPerSec(servicesVobjectVaultPackageVPackageIdActionsValidatePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsessionDelete = scenario("sessionDeleteSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("sessionDelete")
        .httpRequest("DELETE","/session")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Authorization","${Authorization}")
)

    // Run scnsessionDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsessionDelete.inject(
        rampUsersPerSec(1) to(sessionDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(sessionDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(sessionDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuicodeDistributionsDistributionNameCodeGet = scenario("uicodeDistributionsDistributionNameCodeGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("uicodeDistributionsDistributionNameCodeGet")
        .httpRequest("GET","/uicode/distributions/${distribution_name}/code")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnuicodeDistributionsDistributionNameCodeGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuicodeDistributionsDistributionNameCodeGet.inject(
        rampUsersPerSec(1) to(uicodeDistributionsDistributionNameCodeGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(uicodeDistributionsDistributionNameCodeGetPerSecond) during(durationSeconds),
        rampUsersPerSec(uicodeDistributionsDistributionNameCodeGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuicodeDistributionsDistributionNameDelete = scenario("uicodeDistributionsDistributionNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("uicodeDistributionsDistributionNameDelete")
        .httpRequest("DELETE","/uicode/distributions/${distribution_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnuicodeDistributionsDistributionNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuicodeDistributionsDistributionNameDelete.inject(
        rampUsersPerSec(1) to(uicodeDistributionsDistributionNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(uicodeDistributionsDistributionNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(uicodeDistributionsDistributionNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuicodeDistributionsDistributionNameGet = scenario("uicodeDistributionsDistributionNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("uicodeDistributionsDistributionNameGet")
        .httpRequest("GET","/uicode/distributions/${distribution_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnuicodeDistributionsDistributionNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuicodeDistributionsDistributionNameGet.inject(
        rampUsersPerSec(1) to(uicodeDistributionsDistributionNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(uicodeDistributionsDistributionNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(uicodeDistributionsDistributionNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuicodeDistributionsGet = scenario("uicodeDistributionsGetSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("uicodeDistributionsGet")
        .httpRequest("GET","/uicode/distributions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnuicodeDistributionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuicodeDistributionsGet.inject(
        rampUsersPerSec(1) to(uicodeDistributionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(uicodeDistributionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(uicodeDistributionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnuicodeDistributionsPost = scenario("uicodeDistributionsPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("uicodeDistributionsPost")
        .httpRequest("POST","/uicode/distributions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnuicodeDistributionsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnuicodeDistributionsPost.inject(
        rampUsersPerSec(1) to(uicodeDistributionsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(uicodeDistributionsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(uicodeDistributionsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectVaultPackageVPackageIdActionsDeployPost = scenario("vobjectVaultPackageVPackageIdActionsDeployPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectVaultPackageVPackageIdActionsDeployPost")
        .httpRequest("POST","/vobject/vault_package__v/${package_id}/actions/deploy")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectVaultPackageVPackageIdActionsDeployPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectVaultPackageVPackageIdActionsDeployPost.inject(
        rampUsersPerSec(1) to(vobjectVaultPackageVPackageIdActionsDeployPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectVaultPackageVPackageIdActionsDeployPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectVaultPackageVPackageIdActionsDeployPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectVaultPackageVPackageIdActionsDeployResultsGet = scenario("vobjectVaultPackageVPackageIdActionsDeployResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectVaultPackageVPackageIdActionsDeployResultsGet")
        .httpRequest("GET","/vobject/vault_package__v/${package_id}/actions/deploy/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectVaultPackageVPackageIdActionsDeployResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectVaultPackageVPackageIdActionsDeployResultsGet.inject(
        rampUsersPerSec(1) to(vobjectVaultPackageVPackageIdActionsDeployResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectVaultPackageVPackageIdActionsDeployResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectVaultPackageVPackageIdActionsDeployResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet = scenario("vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet")
        .httpRequest("GET","/vobjects/cascadedelete/results/${object_name}/${job_status}/${job_id}")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Accept","${Accept}")
)

    // Run scnvobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet.inject(
        rampUsersPerSec(1) to(vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsDeepcopyResultsObjectNameJobStatusJobIdGet = scenario("vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet")
        .httpRequest("GET","/vobjects/deepcopy/results/${object_name}/${job_status}/${job_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsDeepcopyResultsObjectNameJobStatusJobIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsDeepcopyResultsObjectNameJobStatusJobIdGet.inject(
        rampUsersPerSec(1) to(vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsEdlItemVActionsCreateplaceholderPost = scenario("vobjectsEdlItemVActionsCreateplaceholderPostSimulation")
        .feed(nullHEADERFeeder)
        .exec(http("vobjectsEdlItemVActionsCreateplaceholderPost")
        .httpRequest("POST","/vobjects/edl_item__v/actions/createplaceholder")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsEdlItemVActionsCreateplaceholderPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsEdlItemVActionsCreateplaceholderPost.inject(
        rampUsersPerSec(1) to(vobjectsEdlItemVActionsCreateplaceholderPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsEdlItemVActionsCreateplaceholderPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsEdlItemVActionsCreateplaceholderPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsMergesJobIdLogGet = scenario("vobjectsMergesJobIdLogGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsMergesJobIdLogGet")
        .httpRequest("GET","/vobjects/merges/${job_id}/log")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsMergesJobIdLogGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsMergesJobIdLogGet.inject(
        rampUsersPerSec(1) to(vobjectsMergesJobIdLogGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsMergesJobIdLogGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsMergesJobIdLogGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsMergesJobIdResultsGet = scenario("vobjectsMergesJobIdResultsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsMergesJobIdResultsGet")
        .httpRequest("GET","/vobjects/merges/${job_id}/results")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsMergesJobIdResultsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsMergesJobIdResultsGet.inject(
        rampUsersPerSec(1) to(vobjectsMergesJobIdResultsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsMergesJobIdResultsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsMergesJobIdResultsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsMergesJobIdStatusGet = scenario("vobjectsMergesJobIdStatusGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsMergesJobIdStatusGet")
        .httpRequest("GET","/vobjects/merges/${job_id}/status")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsMergesJobIdStatusGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsMergesJobIdStatusGet.inject(
        rampUsersPerSec(1) to(vobjectsMergesJobIdStatusGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsMergesJobIdStatusGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsMergesJobIdStatusGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameActionsActionNamePost = scenario("vobjectsObjectNameActionsActionNamePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameActionsActionNamePost")
        .httpRequest("POST","/vobjects/${object_name}/actions/${action_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameActionsActionNamePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameActionsActionNamePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameActionsActionNamePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameActionsActionNamePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameActionsActionNamePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameActionsChangetypePost = scenario("vobjectsObjectNameActionsChangetypePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameActionsChangetypePost")
        .httpRequest("POST","/vobjects/${object_name}/actions/changetype")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameActionsChangetypePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameActionsChangetypePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameActionsChangetypePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameActionsChangetypePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameActionsChangetypePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameActionsMergePost = scenario("vobjectsObjectNameActionsMergePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameActionsMergePost")
        .httpRequest("POST","/vobjects/${object_name}/actions/merge")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameActionsMergePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameActionsMergePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameActionsMergePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameActionsMergePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameActionsMergePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameActionsRecalculaterollupsGet = scenario("vobjectsObjectNameActionsRecalculaterollupsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameActionsRecalculaterollupsGet")
        .httpRequest("GET","/vobjects/${object_name}/actions/recalculaterollups")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameActionsRecalculaterollupsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameActionsRecalculaterollupsGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameActionsRecalculaterollupsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameActionsRecalculaterollupsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameActionsRecalculaterollupsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameActionsRecalculaterollupsPost = scenario("vobjectsObjectNameActionsRecalculaterollupsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameActionsRecalculaterollupsPost")
        .httpRequest("POST","/vobjects/${object_name}/actions/recalculaterollups")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameActionsRecalculaterollupsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameActionsRecalculaterollupsPost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameActionsRecalculaterollupsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameActionsRecalculaterollupsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameActionsRecalculaterollupsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameActionsUpdatecorporatecurrencyPut = scenario("vobjectsObjectNameActionsUpdatecorporatecurrencyPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameActionsUpdatecorporatecurrencyPut")
        .httpRequest("PUT","/vobjects/${object_name}/actions/updatecorporatecurrency")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameActionsUpdatecorporatecurrencyPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameActionsUpdatecorporatecurrencyPut.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameActionsUpdatecorporatecurrencyPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameActionsUpdatecorporatecurrencyPutPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameActionsUpdatecorporatecurrencyPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameAttachmentsBatchDelete = scenario("vobjectsObjectNameAttachmentsBatchDeleteSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameAttachmentsBatchDelete")
        .httpRequest("DELETE","/vobjects/${object_name}/attachments/batch")
        .queryParam("idParam","${idParam}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameAttachmentsBatchDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameAttachmentsBatchDelete.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameAttachmentsBatchDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameAttachmentsBatchDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameAttachmentsBatchDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameAttachmentsBatchPost = scenario("vobjectsObjectNameAttachmentsBatchPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameAttachmentsBatchPost")
        .httpRequest("POST","/vobjects/${object_name}/attachments/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameAttachmentsBatchPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameAttachmentsBatchPost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameAttachmentsBatchPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameAttachmentsBatchPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameAttachmentsBatchPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameAttachmentsBatchPut = scenario("vobjectsObjectNameAttachmentsBatchPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameAttachmentsBatchPut")
        .httpRequest("PUT","/vobjects/${object_name}/attachments/batch")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameAttachmentsBatchPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameAttachmentsBatchPut.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameAttachmentsBatchPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameAttachmentsBatchPutPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameAttachmentsBatchPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameDelete = scenario("vobjectsObjectNameDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameDelete")
        .httpRequest("DELETE","/vobjects/${object_name}")
        .header("Authorization","${Authorization}")
        .header("Content-Type","${Content-Type}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameDelete.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameIdRolesRoleNameGet = scenario("vobjectsObjectNameIdRolesRoleNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameIdRolesRoleNameGet")
        .httpRequest("GET","/vobjects/${object_name}/${id}/roles/${role_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameIdRolesRoleNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameIdRolesRoleNameGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameIdRolesRoleNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameIdRolesRoleNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameIdRolesRoleNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdActionsActionNameGet = scenario("vobjectsObjectNameObjectRecordIdActionsActionNameGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdActionsActionNameGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/actions/${action_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdActionsActionNameGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdActionsActionNameGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdActionsActionNameGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdActionsActionNameGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdActionsActionNameGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdActionsActionNamePost = scenario("vobjectsObjectNameObjectRecordIdActionsActionNamePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdActionsActionNamePost")
        .httpRequest("POST","/vobjects/${object_name}/${object_record_id}/actions/${action_name}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameObjectRecordIdActionsActionNamePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdActionsActionNamePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdActionsActionNamePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdActionsActionNamePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdActionsActionNamePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdActionsCascadedeletePost = scenario("vobjectsObjectNameObjectRecordIdActionsCascadedeletePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdActionsCascadedeletePost")
        .httpRequest("POST","/vobjects/${object_name}/${object_record_id}/actions/cascadedelete")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdActionsCascadedeletePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdActionsCascadedeletePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdActionsCascadedeletePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdActionsCascadedeletePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdActionsCascadedeletePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdActionsDeepcopyPost = scenario("vobjectsObjectNameObjectRecordIdActionsDeepcopyPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdActionsDeepcopyPost")
        .httpRequest("POST","/vobjects/${object_name}/${object_record_id}/actions/deepcopy")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameObjectRecordIdActionsDeepcopyPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdActionsDeepcopyPost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdActionsDeepcopyPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdActionsDeepcopyPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdActionsDeepcopyPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdActionsGet = scenario("vobjectsObjectNameObjectRecordIdActionsGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdActionsGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/actions")
        .queryParam("loc","${loc}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdActionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdActionsGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdActionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdActionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdActionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachment_fields/${attachment_field_name}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost = scenario("vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost")
        .httpRequest("POST","/vobjects/${object_name}/${object_record_id}/attachment_fields/${attachment_field_name}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachment_fields/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete")
        .httpRequest("DELETE","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut")
        .httpRequest("PUT","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete")
        .httpRequest("DELETE","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost")
        .httpRequest("POST","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}")
        .queryParam("restore","${restore}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsFileGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentsFileGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsFileGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachments/file")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsFileGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsFileGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsFileGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsFileGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsFileGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsGet = scenario("vobjectsObjectNameObjectRecordIdAttachmentsGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/attachments")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAttachmentsPost = scenario("vobjectsObjectNameObjectRecordIdAttachmentsPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAttachmentsPost")
        .httpRequest("POST","/vobjects/${object_name}/${object_record_id}/attachments")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAttachmentsPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAttachmentsPost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAttachmentsPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAttachmentsPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdAudittrailGet = scenario("vobjectsObjectNameObjectRecordIdAudittrailGetSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdAudittrailGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}/audittrail")
        .queryParam("offset","${offset}")
        .queryParam("end_date","${end_date}")
        .queryParam("limit","${limit}")
        .queryParam("start_date","${start_date}")
        .queryParam("events","${events}")
        .queryParam("format_result","${format_result}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdAudittrailGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdAudittrailGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdAudittrailGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdAudittrailGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdAudittrailGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameObjectRecordIdGet = scenario("vobjectsObjectNameObjectRecordIdGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameObjectRecordIdGet")
        .httpRequest("GET","/vobjects/${object_name}/${object_record_id}")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsObjectNameObjectRecordIdGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameObjectRecordIdGet.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameObjectRecordIdGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameObjectRecordIdGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameObjectRecordIdGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNamePost = scenario("vobjectsObjectNamePostSimulation")
        .feed(nullQUERYFeeder)
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNamePost")
        .httpRequest("POST","/vobjects/${object_name}")
        .queryParam("idParam","${idParam}")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-NoTriggers","${X-VaultAPI-NoTriggers}")
        .header("Content-Type","${Content-Type}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
)

    // Run scnvobjectsObjectNamePost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNamePost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNamePostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNamePostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNamePostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNamePut = scenario("vobjectsObjectNamePutSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNamePut")
        .httpRequest("PUT","/vobjects/${object_name}")
        .header("Authorization","${Authorization}")
        .header("X-VaultAPI-NoTriggers","${X-VaultAPI-NoTriggers}")
        .header("Content-Type","${Content-Type}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("X-VaultAPI-MigrationMode","${X-VaultAPI-MigrationMode}")
)

    // Run scnvobjectsObjectNamePut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNamePut.inject(
        rampUsersPerSec(1) to(vobjectsObjectNamePutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNamePutPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNamePutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameRolesDelete = scenario("vobjectsObjectNameRolesDeleteSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameRolesDelete")
        .httpRequest("DELETE","/vobjects/${object_name}/roles")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameRolesDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameRolesDelete.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameRolesDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameRolesDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameRolesDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsObjectNameRolesPost = scenario("vobjectsObjectNameRolesPostSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsObjectNameRolesPost")
        .httpRequest("POST","/vobjects/${object_name}/roles")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
        .header("Content-Type","${Content-Type}")
)

    // Run scnvobjectsObjectNameRolesPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsObjectNameRolesPost.inject(
        rampUsersPerSec(1) to(vobjectsObjectNameRolesPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsObjectNameRolesPostPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsObjectNameRolesPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvobjectsOutboundPackageVPackageIdDependenciesGet = scenario("vobjectsOutboundPackageVPackageIdDependenciesGetSimulation")
        .feed(nullHEADERFeeder)
        .feed(nullPATHFeeder)
        .exec(http("vobjectsOutboundPackageVPackageIdDependenciesGet")
        .httpRequest("GET","/vobjects/outbound_package__v/${package_id}/dependencies")
        .header("Authorization","${Authorization}")
        .header("Accept","${Accept}")
        .header("X-VaultAPI-ClientID","${X-VaultAPI-ClientID}")
)

    // Run scnvobjectsOutboundPackageVPackageIdDependenciesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvobjectsOutboundPackageVPackageIdDependenciesGet.inject(
        rampUsersPerSec(1) to(vobjectsOutboundPackageVPackageIdDependenciesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(vobjectsOutboundPackageVPackageIdDependenciesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(vobjectsOutboundPackageVPackageIdDependenciesGetPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
