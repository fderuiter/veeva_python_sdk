import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Retrieve API Versions
    //
    //Future apiGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test apiGet', () async {
      // TODO
    });

    // Retrieve Content File
    //
    //Future apiMdlComponentsComponentTypeAndRecordNameFilesGet(String componentTypeAndRecordName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test apiMdlComponentsComponentTypeAndRecordNameFilesGet', () async {
      // TODO
    });

    // Retrieve Component Record (MDL)
    //
    //Future apiMdlComponentsComponentTypeAndRecordNameGet(String componentTypeAndRecordName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test apiMdlComponentsComponentTypeAndRecordNameGet', () async {
      // TODO
    });

    // Retrieve Asynchronous MDL Script Results
    //
    //Future apiMdlExecuteAsyncJobIdResultsGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test apiMdlExecuteAsyncJobIdResultsGet', () async {
      // TODO
    });

    // Execute MDL Script Asynchronously
    //
    //Future apiMdlExecuteAsyncPost({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test apiMdlExecuteAsyncPost', () async {
      // TODO
    });

    // Execute MDL Script
    //
    //Future apiMdlExecutePost({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test apiMdlExecutePost', () async {
      // TODO
    });

    // Upload Content File
    //
    //Future apiMdlFilesPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test apiMdlFilesPost', () async {
      // TODO
    });

    // Retrieve Audit Details
    //
    //Future audittrailAuditTrailTypeGet(String auditTrailType, { String startDate, String endDate, String allDates, String formatResult, String limit, String offset, String objects, String events, String authorization, String accept, String xVaultAPIClientID }) async
    test('test audittrailAuditTrailTypeGet', () async {
      // TODO
    });

    // Authentication Type Discovery
    //
    //Future authDiscoveryPost({ String accept, String xVaultAPIClientID }) async
    test('test authDiscoveryPost', () async {
      // TODO
    });

    // OAuth 2.0 / OpenID Connect
    //
    //Future authOauthSessionOathOidcProfileIdPost(String oathOidcProfileId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test authOauthSessionOathOidcProfileIdPost', () async {
      // TODO
    });

    // User Name and Password
    //
    //Future authPost({ String contentType, String accept, String xVaultAPIClientID }) async
    test('test authPost', () async {
      // TODO
    });

    // Delete Single Source Code File
    //
    //Future codeClassNameDelete(String className, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeClassNameDelete', () async {
      // TODO
    });

    // Disable Vault Extension
    //
    //Future codeClassNameDisablePut(String className, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test codeClassNameDisablePut', () async {
      // TODO
    });

    // Enable Vault Extension
    //
    //Future codeClassNameEnablePut(String className, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test codeClassNameEnablePut', () async {
      // TODO
    });

    // Retrieve Single Source Code File
    //
    //Future codeClassNameGet(String className, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeClassNameGet', () async {
      // TODO
    });

    // Retrieve All Profiling Sessions
    //
    //Future codeProfilerGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeProfilerGet', () async {
      // TODO
    });

    // Create Profiling Session
    //
    //Future codeProfilerPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test codeProfilerPost', () async {
      // TODO
    });

    // End Profiling Session
    //
    //Future codeProfilerSessionNameActionsEndPost(String sessionName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeProfilerSessionNameActionsEndPost', () async {
      // TODO
    });

    // Delete Profiling Session
    //
    //Future codeProfilerSessionNameDelete(String sessionName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeProfilerSessionNameDelete', () async {
      // TODO
    });

    // Retrieve Profiling Session
    //
    //Future codeProfilerSessionNameGet(String sessionName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeProfilerSessionNameGet', () async {
      // TODO
    });

    // Download Profiling Session Results
    //
    //Future codeProfilerSessionNameResultsGet(String sessionName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test codeProfilerSessionNameResultsGet', () async {
      // TODO
    });

    // Add or Replace Single Source Code File
    //
    //Future codePut({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test codePut', () async {
      // TODO
    });

    // Retrieve Specific Root Nodes
    //
    //Future compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(String edlHierarchyOrTemplate, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test compositesTreesEdlHierarchyOrTemplateActionsListnodesPost', () async {
      // TODO
    });

    // Retrieve All Root Nodes
    //
    //Future compositesTreesEdlHierarchyOrTemplateGet(String edlHierarchyOrTemplate, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test compositesTreesEdlHierarchyOrTemplateGet', () async {
      // TODO
    });

    // Retrieve a Node's Children
    //
    //Future compositesTreesEdlHierarchyVParentNodeIdChildrenGet(String parentNodeId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test compositesTreesEdlHierarchyVParentNodeIdChildrenGet', () async {
      // TODO
    });

    // Update Node Order
    //
    //Future compositesTreesEdlHierarchyVParentNodeIdChildrenPut(String parentNodeId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test compositesTreesEdlHierarchyVParentNodeIdChildrenPut', () async {
      // TODO
    });

    // Retrieve Component Record (XML/JSON)
    //
    //Future configurationComponentTypeAndRecordNameGet(String componentTypeAndRecordName, { String loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test configurationComponentTypeAndRecordNameGet', () async {
      // TODO
    });

    // Retrieve Component Record Collection
    //
    //Future configurationComponentTypeGet(String componentType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test configurationComponentTypeGet', () async {
      // TODO
    });

    // Retrieve Details from a Specific Object
    //
    //Future configurationObjectNameAndObjectTypeGet(String objectNameAndObjectType, { String loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test configurationObjectNameAndObjectTypeGet', () async {
      // TODO
    });

    // Retrieve Details from All Object Types
    //
    //Future configurationObjecttypeGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test configurationObjecttypeGet', () async {
      // TODO
    });

    // Delete Lifecycle Role Assignment Override Rules
    //
    //Future configurationRoleAssignmentRuleDelete({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test configurationRoleAssignmentRuleDelete', () async {
      // TODO
    });

    // Retrieve Lifecycle Role Assignment Rules (Default & Override)
    //
    //Future configurationRoleAssignmentRuleGet({ String lifecycleV, String roleV, String productV, String countryV, String studyV, String studyCountryV, String authorization, String accept, String xVaultAPIClientID }) async
    test('test configurationRoleAssignmentRuleGet', () async {
      // TODO
    });

    // Create Lifecycle Role Assignment Override Rules
    //
    //Future configurationRoleAssignmentRulePost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test configurationRoleAssignmentRulePost', () async {
      // TODO
    });

    // Update Lifecycle Role Assignment Rules (Default & Override)
    //
    //Future configurationRoleAssignmentRulePut({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test configurationRoleAssignmentRulePut', () async {
      // TODO
    });

    // Initiate Delegated Session
    //
    //Future delegationLoginPost({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test delegationLoginPost', () async {
      // TODO
    });

    // Retrieve Delegations
    //
    //Future delegationVaultsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test delegationVaultsGet', () async {
      // TODO
    });

    // Session Keep Alive
    //
    //Future keepAlivePost({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test keepAlivePost', () async {
      // TODO
    });

    // Retrieve Limits on Objects
    //
    //Future limitsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test limitsGet', () async {
      // TODO
    });

    // Download Daily API Usage
    //
    //Future logsApiUsageGet({ String date, String logFormat, String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsApiUsageGet', () async {
      // TODO
    });

    // Retrieve All Debug Logs
    //
    //Future logsCodeDebugGet({ String userId, bool includeInactive, String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsCodeDebugGet', () async {
      // TODO
    });

    // Delete Debug Log
    //
    //Future logsCodeDebugIdActionsResetDelete(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsCodeDebugIdActionsResetDelete', () async {
      // TODO
    });

    // Reset Debug Log
    //
    //Future logsCodeDebugIdActionsResetPost(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsCodeDebugIdActionsResetPost', () async {
      // TODO
    });

    // Download Debug Log Files
    //
    //Future logsCodeDebugIdFilesGet(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsCodeDebugIdFilesGet', () async {
      // TODO
    });

    // Retrieve Single Debug Log
    //
    //Future logsCodeDebugIdGet(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsCodeDebugIdGet', () async {
      // TODO
    });

    // Create Debug Log
    //
    //Future logsCodeDebugPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test logsCodeDebugPost', () async {
      // TODO
    });

    // Download SDK Runtime Log
    //
    //Future logsCodeRuntimeGet({ String date, String logFormat, String authorization, String accept, String xVaultAPIClientID }) async
    test('test logsCodeRuntimeGet', () async {
      // TODO
    });

    // Import Bulk Translation File
    //
    //Future messagesMessageTypeActionsImportPost(String messageType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test messagesMessageTypeActionsImportPost', () async {
      // TODO
    });

    // Export Bulk Translation File
    //
    //Future messagesMessageTypeLanguageLangActionsExportPost(String messageType, String lang, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test messagesMessageTypeLanguageLangActionsExportPost', () async {
      // TODO
    });

    // Retrieve Audit Metadata
    //
    //Future metadataAudittrailAuditTrailTypeGet(String auditTrailType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataAudittrailAuditTrailTypeGet', () async {
      // TODO
    });

    // Retrieve Audit Types
    //
    //Future metadataAudittrailGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataAudittrailGet', () async {
      // TODO
    });

    // Retrieve Component Type Metadata
    //
    //Future metadataComponentsComponentTypeGet(String componentType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataComponentsComponentTypeGet', () async {
      // TODO
    });

    // Retrieve All Component Metadata
    //
    //Future metadataComponentsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataComponentsGet', () async {
      // TODO
    });

    // Retrieve Binder Template Node Metadata
    //
    //Future metadataObjectsBindersTemplatesBindernodesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsBindersTemplatesBindernodesGet', () async {
      // TODO
    });

    // Retrieve Binder Template Metadata
    //
    //Future metadataObjectsBindersTemplatesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsBindersTemplatesGet', () async {
      // TODO
    });

    // Retrieve Annotation Placemark Type Metadata
    //
    //Future metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(String placemarkType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet', () async {
      // TODO
    });

    // Retrieve Annotation Reference Type Metadata
    //
    //Future metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(String referenceType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet', () async {
      // TODO
    });

    // Retrieve Annotation Type Metadata
    //
    //Future metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(String annotationType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet', () async {
      // TODO
    });

    // Retrieve Document Event SubType Metadata
    //
    //Future metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(String eventType, String eventSubtype, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet', () async {
      // TODO
    });

    // Retrieve Document Event Types and Subtypes
    //
    //Future metadataObjectsDocumentsEventsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsEventsGet', () async {
      // TODO
    });

    // Retrieve Document Lock Metadata
    //
    //Future metadataObjectsDocumentsLockGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsLockGet', () async {
      // TODO
    });

    // Retrieve Common Document Fields
    //
    //Future metadataObjectsDocumentsPropertiesFindCommonPost({ String contentType, String accept, String authorization, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsPropertiesFindCommonPost', () async {
      // TODO
    });

    // Retrieve All Document Fields
    //
    //Future metadataObjectsDocumentsPropertiesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsPropertiesGet', () async {
      // TODO
    });

    // Retrieve Document Template Metadata
    //
    //Future metadataObjectsDocumentsTemplatesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsTemplatesGet', () async {
      // TODO
    });

    // Retrieve All Document Types
    //
    //Future metadataObjectsDocumentsTypesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsTypesGet', () async {
      // TODO
    });

    // Retrieve Document Type
    //
    //Future metadataObjectsDocumentsTypesTypeGet(String type, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsTypesTypeGet', () async {
      // TODO
    });

    // Retrieve Document Type Relationships
    //
    //Future metadataObjectsDocumentsTypesTypeRelationshipsGet(String type, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsTypesTypeRelationshipsGet', () async {
      // TODO
    });

    // Retrieve Document Classification
    //
    //Future metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(String type, String subtype, String classification, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet', () async {
      // TODO
    });

    // Retrieve Document Subtype
    //
    //Future metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(String type, String subtype, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet', () async {
      // TODO
    });

    // Retrieve Group Metadata
    //
    //Future metadataObjectsGroupsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsGroupsGet', () async {
      // TODO
    });

    // Retrieve Security Policy Metadata
    //
    //Future metadataObjectsSecuritypoliciesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsSecuritypoliciesGet', () async {
      // TODO
    });

    // Retrieve User Metadata
    //
    //Future metadataObjectsUsersGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataObjectsUsersGet', () async {
      // TODO
    });

    // Retrieve Archived Document Signature Metadata
    //
    //Future metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet', () async {
      // TODO
    });

    // Retrieve Document Signature Metadata
    //
    //Future metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet', () async {
      // TODO
    });

    // Retrieve Object Collection
    //
    //Future metadataVobjectsGet({ bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataVobjectsGet', () async {
      // TODO
    });

    // Cancel Raw Object Deployment
    //
    //Future metadataVobjectsObjectNameActionsCanceldeploymentPost(String objectName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataVobjectsObjectNameActionsCanceldeploymentPost', () async {
      // TODO
    });

    // Retrieve Object Field Metadata
    //
    //Future metadataVobjectsObjectNameFieldsObjectFieldNameGet(String objectName, String objectFieldName, { bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataVobjectsObjectNameFieldsObjectFieldNameGet', () async {
      // TODO
    });

    // Retrieve Object Metadata
    //
    //Future metadataVobjectsObjectNameGet(String objectName, { bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataVobjectsObjectNameGet', () async {
      // TODO
    });

    // Retrieve Page Layouts
    //
    //Future metadataVobjectsObjectNamePageLayoutsGet(String objectName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataVobjectsObjectNamePageLayoutsGet', () async {
      // TODO
    });

    // Retrieve Page Layout Metadata
    //
    //Future metadataVobjectsObjectNamePageLayoutsLayoutNameGet(String objectName, String layoutName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test metadataVobjectsObjectNamePageLayoutsLayoutNameGet', () async {
      // TODO
    });

    // Retrieve Email Notification Histories
    //
    //Future notificationsHistoriesGet({ String startDate, String endDate, bool allDates, String formatResult, String limit, String offset, String authorization, String accept, String xVaultAPIClientID }) async
    test('test notificationsHistoriesGet', () async {
      // TODO
    });

    // Retrieve Bulk Workflow Action Details
    //
    //Future objectWorkflowActionsActionGet(String action, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsActionGet', () async {
      // TODO
    });

    // Initiate Workflow Actions on Multiple Workflows
    //
    //Future objectWorkflowActionsActionPost(String action, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsActionPost', () async {
      // TODO
    });

    // Cancel Workflow Tasks
    //
    //Future objectWorkflowActionsCanceltasksPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsCanceltasksPost', () async {
      // TODO
    });

    // Cancel Workflows
    //
    //Future objectWorkflowActionsCancelworkflowsPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsCancelworkflowsPost', () async {
      // TODO
    });

    // Retrieve Bulk Workflow Actions
    //
    //Future objectWorkflowActionsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsGet', () async {
      // TODO
    });

    // Reassign Workflow Tasks
    //
    //Future objectWorkflowActionsReassigntasksPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsReassigntasksPost', () async {
      // TODO
    });

    // Replace Workflow Owner
    //
    //Future objectWorkflowActionsReplaceworkflowownerPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectWorkflowActionsReplaceworkflowownerPost', () async {
      // TODO
    });

    // Retrieve Binder Export Results
    //
    //Future objectsBindersActionsExportJobIdResultsGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersActionsExportJobIdResultsGet', () async {
      // TODO
    });

    // Export Binder (Latest Version)
    //
    //Future objectsBindersBinderIdActionsExportPost(String binderId, { bool source_, String renditiontype, String docversion, String attachments, String export_, bool docfield, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdActionsExportPost', () async {
      // TODO
    });

    // Refresh Binder Auto-Filing
    //
    //Future objectsBindersBinderIdActionsPost(String binderId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdActionsPost', () async {
      // TODO
    });

    // Update Binding Rule
    //
    //Future objectsBindersBinderIdBindingRulePut(String binderId, { String contentType, String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdBindingRulePut', () async {
      // TODO
    });

    // Delete Binder
    //
    //Future objectsBindersBinderIdDelete(String binderId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdDelete', () async {
      // TODO
    });

    // Update Binder Document Binding Rule
    //
    //Future objectsBindersBinderIdDocumentsNodeIdBindingRulePut(String binderId, String nodeId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdDocumentsNodeIdBindingRulePut', () async {
      // TODO
    });

    // Add Document to Binder
    //
    //Future objectsBindersBinderIdDocumentsPost(String binderId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdDocumentsPost', () async {
      // TODO
    });

    // Remove Document from Binder
    //
    //Future objectsBindersBinderIdDocumentsSectionIdDelete(String binderId, String sectionId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdDocumentsSectionIdDelete', () async {
      // TODO
    });

    // Move Document in Binder
    //
    //Future objectsBindersBinderIdDocumentsSectionIdPut(String binderId, String sectionId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdDocumentsSectionIdPut', () async {
      // TODO
    });

    // Retrieve Binder
    //
    //Future objectsBindersBinderIdGet(String binderId, { String depth, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdGet', () async {
      // TODO
    });

    // Create Binder Version
    //
    //Future objectsBindersBinderIdPost(String binderId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdPost', () async {
      // TODO
    });

    // Update Binder
    //
    //Future objectsBindersBinderIdPut(String binderId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdPut', () async {
      // TODO
    });

    // Remove Users & Groups from Roles on a Single Binder
    //
    //Future objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(String binderId, String roleNameAndUserOrGroup, String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete', () async {
      // TODO
    });

    // Update Binder Section Binding Rule
    //
    //Future objectsBindersBinderIdSectionsNodeIdBindingRulePut(String binderId, String nodeId, { String contentType, String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdSectionsNodeIdBindingRulePut', () async {
      // TODO
    });

    // Update Binder Section
    //
    //Future objectsBindersBinderIdSectionsNodeIdPut(String binderId, String nodeId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdSectionsNodeIdPut', () async {
      // TODO
    });

    // Create Binder Section
    //
    //Future objectsBindersBinderIdSectionsPost(String binderId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdSectionsPost', () async {
      // TODO
    });

    // Delete Binder Section
    //
    //Future objectsBindersBinderIdSectionsSectionIdDelete(String binderId, String sectionId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdSectionsSectionIdDelete', () async {
      // TODO
    });

    // Retrieve Binder Sections
    //
    //Future objectsBindersBinderIdSectionsSectionIdGet(String binderId, String sectionId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdSectionsSectionIdGet', () async {
      // TODO
    });

    // Retrieve All Binder Versions
    //
    //Future objectsBindersBinderIdVersionsGet(String binderId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsGet', () async {
      // TODO
    });

    // Export Binder (Specific Version)
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(String binderId, String majorVersion, String minorVersion, { bool source_, String renditiontype, String docversion, String attachments, String export_, bool docfield, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost', () async {
      // TODO
    });

    // Delete Binder Version
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(String binderId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete', () async {
      // TODO
    });

    // Retrieve Binder Version
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(String binderId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionGet', () async {
      // TODO
    });

    // Update Binder Version
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(String binderId, String majorVersion, String minorVersion, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionPut', () async {
      // TODO
    });

    // Create Binder Relationship
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(String binderId, String majorVersion, String minorVersion, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost', () async {
      // TODO
    });

    // Delete Binder Relationship
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(String binderId, String majorVersion, String minorVersion, String relationshipId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete', () async {
      // TODO
    });

    // Retrieve Binder Relationship
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(String binderId, String majorVersion, String minorVersion, String relationshipId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet', () async {
      // TODO
    });

    // Retrieve Binder Version Section
    //
    //Future objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(String binderId, String majorVersion, String minorVersion, String sectionId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet', () async {
      // TODO
    });

    // Retrieve All Binder Roles
    //
    //Future objectsBindersIdRolesGet(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersIdRolesGet', () async {
      // TODO
    });

    // Assign Users & Groups to Roles on a Single Binder
    //
    //Future objectsBindersIdRolesPost(String id, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersIdRolesPost', () async {
      // TODO
    });

    // Retrieve Document Role
    //
    //Future objectsBindersIdRolesRoleNameGet(String id, String roleName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersIdRolesRoleNameGet', () async {
      // TODO
    });

    // Retrieve Binder User Actions
    //
    //Future objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(String id, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet', () async {
      // TODO
    });

    // Retrieve Binder Entry Criteria
    //
    //Future objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(String id, String majorVersion, String minorVersion, String nameV, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet', () async {
      // TODO
    });

    // Initiate Binder User Action
    //
    //Future objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(String id, String majorVersion, String minorVersion, String nameV, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut', () async {
      // TODO
    });

    // Retrieve User Actions on Multiple Binders
    //
    //Future objectsBindersLifecycleActionsPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersLifecycleActionsPost', () async {
      // TODO
    });

    // Initiate Bulk Binder User Actions
    //
    //Future objectsBindersLifecycleActionsUserActionNamePut(String userActionName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersLifecycleActionsUserActionNamePut', () async {
      // TODO
    });

    // Create Binder
    //
    //Future objectsBindersPost({ bool async_, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersPost', () async {
      // TODO
    });

    // Retrieve Binder Template Collection
    //
    //Future objectsBindersTemplatesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesGet', () async {
      // TODO
    });

    // Create Binder Template
    //
    //Future objectsBindersTemplatesPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesPost', () async {
      // TODO
    });

    // Update Binder Template
    //
    //Future objectsBindersTemplatesPut({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesPut', () async {
      // TODO
    });

    // Retrieve Binder Template Node Attributes
    //
    //Future objectsBindersTemplatesTemplateNameBindernodesGet(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesTemplateNameBindernodesGet', () async {
      // TODO
    });

    // Create Binder Template Node
    //
    //Future objectsBindersTemplatesTemplateNameBindernodesPost(String templateName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesTemplateNameBindernodesPost', () async {
      // TODO
    });

    // Replace Binder Template Nodes
    //
    //Future objectsBindersTemplatesTemplateNameBindernodesPut(String templateName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesTemplateNameBindernodesPut', () async {
      // TODO
    });

    // Delete Binder Template
    //
    //Future objectsBindersTemplatesTemplateNameDelete(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesTemplateNameDelete', () async {
      // TODO
    });

    // Retrieve Binder Template Attributes
    //
    //Future objectsBindersTemplatesTemplateNameGet(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsBindersTemplatesTemplateNameGet', () async {
      // TODO
    });

    // Retrieve Deleted Document IDs
    //
    //Future objectsDeletionsDocumentsGet({ String startDate, String endDate, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDeletionsDocumentsGet', () async {
      // TODO
    });

    // Retrieve Deleted Object Record ID
    //
    //Future objectsDeletionsVobjectsObjectNameGet(String objectName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDeletionsVobjectsObjectNameGet', () async {
      // TODO
    });

    // Retrieve All Document Workflows
    //
    //Future objectsDocumentsActionsGet({ bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsActionsGet', () async {
      // TODO
    });

    // Download Controlled Copy Job Results
    //
    //Future objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(String lifecycleAndStateAndAction, String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet', () async {
      // TODO
    });

    // Retrieve Document Workflow Details
    //
    //Future objectsDocumentsActionsWorkflowNameGet(String workflowName, { bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsActionsWorkflowNameGet', () async {
      // TODO
    });

    // Initiate Document Workflow
    //
    //Future objectsDocumentsActionsWorkflowNamePost(String workflowName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsActionsWorkflowNamePost', () async {
      // TODO
    });

    // Delete Annotations
    //
    //Future objectsDocumentsAnnotationsBatchDelete({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsAnnotationsBatchDelete', () async {
      // TODO
    });

    // Create Multiple Annotations
    //
    //Future objectsDocumentsAnnotationsBatchPost(String authorization, String contentType, String accept, String xVaultAPIClientID) async
    test('test objectsDocumentsAnnotationsBatchPost', () async {
      // TODO
    });

    // Update Annotations
    //
    //Future objectsDocumentsAnnotationsBatchPut({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsAnnotationsBatchPut', () async {
      // TODO
    });

    // Add Annotation Replies
    //
    //Future objectsDocumentsAnnotationsRepliesBatchPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsAnnotationsRepliesBatchPost', () async {
      // TODO
    });

    // Delete Multiple Document Attachments
    //
    //Future objectsDocumentsAttachmentsBatchDelete({ String accept, String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsAttachmentsBatchDelete', () async {
      // TODO
    });

    // Create Multiple Document Attachments
    //
    //Future objectsDocumentsAttachmentsBatchPost({ String accept, String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsAttachmentsBatchPost', () async {
      // TODO
    });

    // Update Multiple Document Attachment Descriptions
    //
    //Future objectsDocumentsAttachmentsBatchPut({ String accept, String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsAttachmentsBatchPut', () async {
      // TODO
    });

    // Retrieve Document Export Results
    //
    //Future objectsDocumentsBatchActionsFileextractJobIdResultsGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchActionsFileextractJobIdResultsGet', () async {
      // TODO
    });

    // Export Documents
    //
    //Future objectsDocumentsBatchActionsFileextractPost({ bool source_, bool renditions, bool allversions, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchActionsFileextractPost', () async {
      // TODO
    });

    // Reclassify Multiple Documents
    //
    //Future objectsDocumentsBatchActionsReclassifyPut({ String authorization, String contentType, String accept, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchActionsReclassifyPut', () async {
      // TODO
    });

    // Update Multiple Document Renditions
    //
    //Future objectsDocumentsBatchActionsRerenderPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchActionsRerenderPost', () async {
      // TODO
    });

    // Delete Multiple Documents
    //
    //Future objectsDocumentsBatchDelete({ String idParam, String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchDelete', () async {
      // TODO
    });

    // Undo Collaborative Authoring Checkout
    //
    //Future objectsDocumentsBatchLockDelete({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchLockDelete', () async {
      // TODO
    });

    // Create Multiple Documents
    //
    //Future objectsDocumentsBatchPost({ String authorization, String accept, String contentType, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchPost', () async {
      // TODO
    });

    // Update Multiple Documents
    //
    //Future objectsDocumentsBatchPut({ String authorization, String accept, String contentType, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsBatchPut', () async {
      // TODO
    });

    // Retrieve Anchor IDs
    //
    //Future objectsDocumentsDocIdAnchorsGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAnchorsGet', () async {
      // TODO
    });

    // Export Document Annotations to PDF
    //
    //Future objectsDocumentsDocIdAnnotationsFileGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAnnotationsFileGet', () async {
      // TODO
    });

    // Import Document Annotations from PDF
    //
    //Future objectsDocumentsDocIdAnnotationsFilePost(String docId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAnnotationsFilePost', () async {
      // TODO
    });

    // Delete Single Document Attachment
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdDelete(String docId, String attachmentId, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdDelete', () async {
      // TODO
    });

    // Download Document Attachment
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(String docId, String attachmentId, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdFileGet', () async {
      // TODO
    });

    // Retrieve Document Attachment Metadata
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdGet(String docId, String attachmentId, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdGet', () async {
      // TODO
    });

    // Update Document Attachment Description
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdPut(String docId, String attachmentId, { String accept, String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdPut', () async {
      // TODO
    });

    // Delete Single Document Attachment Version
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(String docId, String attachmentId, String attachmentVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete', () async {
      // TODO
    });

    // Download Document Attachment Version
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(String docId, String attachmentId, String attachmentVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet', () async {
      // TODO
    });

    // Retrieve Document Attachment Version Metadata
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(String docId, String attachmentId, String attachmentVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet', () async {
      // TODO
    });

    // Restore Document Attachment Version
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(String docId, String attachmentId, String attachmentVersion, { bool restore, String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost', () async {
      // TODO
    });

    // Retrieve Document Attachment Versions
    //
    //Future objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(String docId, String attachmentId, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet', () async {
      // TODO
    });

    // Download All Document Attachments
    //
    //Future objectsDocumentsDocIdAttachmentsFileGet(String docId, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsFileGet', () async {
      // TODO
    });

    // Retrieve Document Attachments
    //
    //Future objectsDocumentsDocIdAttachmentsGet(String docId, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsGet', () async {
      // TODO
    });

    // Create Document Attachment
    //
    //Future objectsDocumentsDocIdAttachmentsPost(String docId, { String accept, String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAttachmentsPost', () async {
      // TODO
    });

    // Retrieve Complete Audit History for a Single Document
    //
    //Future objectsDocumentsDocIdAudittrailGet(String docId, { String startDate, String endDate, String formatResult, String limit, String offset, String events, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdAudittrailGet', () async {
      // TODO
    });

    // Delete Single Document
    //
    //Future objectsDocumentsDocIdDelete(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdDelete', () async {
      // TODO
    });

    // Retrieve Document Events
    //
    //Future objectsDocumentsDocIdEventsGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdEventsGet', () async {
      // TODO
    });

    // Download Document File
    //
    //Future objectsDocumentsDocIdFileGet(String docId, { bool lockDocument, String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdFileGet', () async {
      // TODO
    });

    // Retrieve Document
    //
    //Future objectsDocumentsDocIdGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdGet', () async {
      // TODO
    });

    // Delete Document Lock
    //
    //Future objectsDocumentsDocIdLockDelete(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdLockDelete', () async {
      // TODO
    });

    // Retrieve Document Lock
    //
    //Future objectsDocumentsDocIdLockGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdLockGet', () async {
      // TODO
    });

    // Create Document Lock
    //
    //Future objectsDocumentsDocIdLockPost(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdLockPost', () async {
      // TODO
    });

    // Download All Document Version Attachments
    //
    //Future objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(String docId, String majorVersion, String minorVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet', () async {
      // TODO
    });

    // Create Single Document Version
    //
    //Future objectsDocumentsDocIdPost(String docId, { String suppressRendition, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdPost', () async {
      // TODO
    });

    // Update Single Document
    //
    //Future objectsDocumentsDocIdPut(String docId, { String authorization, String contentType, String accept, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdPut', () async {
      // TODO
    });

    // Retrieve Document Renditions
    //
    //Future objectsDocumentsDocIdRenditionsGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdRenditionsGet', () async {
      // TODO
    });

    // Delete Single Document Rendition
    //
    //Future objectsDocumentsDocIdRenditionsRenditionTypeDelete(String docId, String renditionType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdRenditionsRenditionTypeDelete', () async {
      // TODO
    });

    // Download Document Rendition File
    //
    //Future objectsDocumentsDocIdRenditionsRenditionTypeGet(String docId, String renditionType, { String steadyState, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdRenditionsRenditionTypeGet', () async {
      // TODO
    });

    // Add Single Document Rendition
    //
    //Future objectsDocumentsDocIdRenditionsRenditionTypePost(String docId, String renditionType, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdRenditionsRenditionTypePost', () async {
      // TODO
    });

    // Replace Document Rendition
    //
    //Future objectsDocumentsDocIdRenditionsRenditionTypePut(String docId, String renditionType, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdRenditionsRenditionTypePut', () async {
      // TODO
    });

    // Remove Users & Groups from Roles on a Single Document
    //
    //Future objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(String docId, String roleNameAndUserOrGroup, String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete', () async {
      // TODO
    });

    // Retrieve Document Version Attachments
    //
    //Future objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(String docId, String majorVersion, String minorVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet', () async {
      // TODO
    });

    // Retrieve Document Versions
    //
    //Future objectsDocumentsDocIdVersionsGet(String docId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsGet', () async {
      // TODO
    });

    // Read Annotations by ID
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(String docId, String majorVersion, String minorVersion, String annotationId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet', () async {
      // TODO
    });

    // Read Replies of Parent Annotation
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(String docId, String majorVersion, String minorVersion, String annotationId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet', () async {
      // TODO
    });

    // Export Document Version Annotations to PDF
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet', () async {
      // TODO
    });

    // Import Document Version Annotations from PDF
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost', () async {
      // TODO
    });

    // Read Annotations by Document Version and Type
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(String docId, String majorVersion, String minorVersion, { String limit, String offset, String annotationTypes, String paginationId, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet', () async {
      // TODO
    });

    // Download Document Version Attachment Version
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(String docId, String majorVersion, String minorVersion, String attachmentId, String attachmentVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet', () async {
      // TODO
    });

    // Retrieve Document Version Attachment Versions
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(String docId, String majorVersion, String minorVersion, String attachmentId, String attachmentVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet', () async {
      // TODO
    });

    // Delete Single Document Version
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete', () async {
      // TODO
    });

    // Retrieve Document Version Notes as CSV
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet', () async {
      // TODO
    });

    // Create Document Event
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost', () async {
      // TODO
    });

    // Retrieve Video Annotations
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet', () async {
      // TODO
    });

    // Download Document Version File
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(String docId, String majorVersion, String minorVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet', () async {
      // TODO
    });

    // Retrieve Document Version
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet', () async {
      // TODO
    });

    // Update Document Version
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(String docId, String majorVersion, String minorVersion, { String authorization, String contentType, String accept, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut', () async {
      // TODO
    });

    // Retrieve Document Relationships
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet', () async {
      // TODO
    });

    // Create Single Document Relationship
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost', () async {
      // TODO
    });

    // Delete Single Document Relationship
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(String docId, String majorVersion, String minorVersion, String relationshipId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete', () async {
      // TODO
    });

    // Retrieve Document Relationship
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(String docId, String majorVersion, String minorVersion, String relationshipId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet', () async {
      // TODO
    });

    // Retrieve Document Version Renditions
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(String docId, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet', () async {
      // TODO
    });

    // Delete Document Version Rendition
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(String docId, String majorVersion, String minorVersion, String renditionType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete', () async {
      // TODO
    });

    // Download Document Version Rendition File
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(String docId, String majorVersion, String minorVersion, String renditionType, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet', () async {
      // TODO
    });

    // Upload Document Version Rendition
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(String docId, String majorVersion, String minorVersion, String renditionType, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost', () async {
      // TODO
    });

    // Replace Document Version Rendition
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(String docId, String majorVersion, String minorVersion, String renditionType, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut', () async {
      // TODO
    });

    // Download Document Version Thumbnail File
    //
    //Future objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(String docId, String majorVersion, String minorVersion, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet', () async {
      // TODO
    });

    // Retrieve All Documents
    //
    //Future objectsDocumentsGet({ String namedFilter, String scope, String versionscope, String search, String limit, String sort, String start, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsGet', () async {
      // TODO
    });

    // Retrieve All Document Roles
    //
    //Future objectsDocumentsIdRolesGet(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsIdRolesGet', () async {
      // TODO
    });

    // Assign Users & Groups to Roles on a Single Document
    //
    //Future objectsDocumentsIdRolesPost(String id, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsIdRolesPost', () async {
      // TODO
    });

    // Retrieve Document Role
    //
    //Future objectsDocumentsIdRolesRoleNameGet(String id, String roleName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsIdRolesRoleNameGet', () async {
      // TODO
    });

    // Retrieve Document User Actions
    //
    //Future objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(String id, String majorVersion, String minorVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet', () async {
      // TODO
    });

    // Retrieve Document Entry Criteria
    //
    //Future objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(String id, String majorVersion, String minorVersion, String nameV, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet', () async {
      // TODO
    });

    // Initiate Document User Action
    //
    //Future objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(String id, String majorVersion, String minorVersion, String nameV, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut', () async {
      // TODO
    });

    // Retrieve User Actions on Multiple Documents
    //
    //Future objectsDocumentsLifecycleActionsPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsLifecycleActionsPost', () async {
      // TODO
    });

    // Initiate Bulk Document User Actions
    //
    //Future objectsDocumentsLifecycleActionsUserActionNamePut(String userActionName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsLifecycleActionsUserActionNamePut', () async {
      // TODO
    });

    // Create Single Document
    //
    //Future objectsDocumentsPost({ String authorization, String accept, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsPost', () async {
      // TODO
    });

    // Delete Multiple Document Relationships
    //
    //Future objectsDocumentsRelationshipsBatchDelete({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsRelationshipsBatchDelete', () async {
      // TODO
    });

    // Create Multiple Document Relationships
    //
    //Future objectsDocumentsRelationshipsBatchPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsRelationshipsBatchPost', () async {
      // TODO
    });

    // Delete Multiple Document Renditions
    //
    //Future objectsDocumentsRenditionsBatchDelete({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsRenditionsBatchDelete', () async {
      // TODO
    });

    // Add Multiple Document Renditions
    //
    //Future objectsDocumentsRenditionsBatchPost({ String idParam, String largeSizeAsset, String authorization, String accept, String contentType, bool xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsRenditionsBatchPost', () async {
      // TODO
    });

    // Remove Users and Groups from Roles on Multiple Documents & Binders
    //
    //Future objectsDocumentsRolesBatchDelete({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsRolesBatchDelete', () async {
      // TODO
    });

    // Assign Users & Groups to Roles on Multiple Documents & Binders
    //
    //Future objectsDocumentsRolesBatchPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsRolesBatchPost', () async {
      // TODO
    });

    // Retrieve Document Template Collection
    //
    //Future objectsDocumentsTemplatesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesGet', () async {
      // TODO
    });

    // Create Single Document Template
    //
    //Future objectsDocumentsTemplatesPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesPost', () async {
      // TODO
    });

    // Update Multiple Document Templates
    //
    //Future objectsDocumentsTemplatesPut({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesPut', () async {
      // TODO
    });

    // Delete Basic Document Template
    //
    //Future objectsDocumentsTemplatesTemplateNameDelete(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesTemplateNameDelete', () async {
      // TODO
    });

    // Download Document Template File
    //
    //Future objectsDocumentsTemplatesTemplateNameFileGet(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesTemplateNameFileGet', () async {
      // TODO
    });

    // Retrieve Document Template Attributes
    //
    //Future objectsDocumentsTemplatesTemplateNameGet(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesTemplateNameGet', () async {
      // TODO
    });

    // Update Single Document Template
    //
    //Future objectsDocumentsTemplatesTemplateNamePut(String templateName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTemplatesTemplateNamePut', () async {
      // TODO
    });

    // Document Tokens
    //
    //Future objectsDocumentsTokensPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsTokensPost', () async {
      // TODO
    });

    // Export Document Versions
    //
    //Future objectsDocumentsVersionsBatchActionsFileextractPost({ bool source_, bool renditions, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsVersionsBatchActionsFileextractPost', () async {
      // TODO
    });

    // Delete Multiple Document Versions
    //
    //Future objectsDocumentsVersionsBatchDelete({ String idParam, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsDocumentsVersionsBatchDelete', () async {
      // TODO
    });

    // Create Multiple Document Versions
    //
    //Future objectsDocumentsVersionsBatchPost({ String idParam, String authorization, String accept, String contentType, String xVaultAPIMigrationMode, String xVaultAPIClientID }) async
    test('test objectsDocumentsVersionsBatchPost', () async {
      // TODO
    });

    // Retrieve Domain Information
    //
    //Future objectsDomainGet({ bool includeApplication, String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDomainGet', () async {
      // TODO
    });

    // Retrieve Domains
    //
    //Future objectsDomainsGet({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsDomainsGet', () async {
      // TODO
    });

    // Add EDL Matched Documents
    //
    //Future objectsEdlMatchedDocumentsBatchActionsAddPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsEdlMatchedDocumentsBatchActionsAddPost', () async {
      // TODO
    });

    // Remove EDL Matched Documents
    //
    //Future objectsEdlMatchedDocumentsBatchActionsRemovePost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsEdlMatchedDocumentsBatchActionsRemovePost', () async {
      // TODO
    });

    // Retrieve Auto Managed Groups
    //
    //Future objectsGroupsAutoGet({ String limit, String offset, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsGroupsAutoGet', () async {
      // TODO
    });

    // Retrieve All Groups
    //
    //Future objectsGroupsGet({ String includeImplied, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsGroupsGet', () async {
      // TODO
    });

    // Delete Group
    //
    //Future objectsGroupsGroupIdDelete(String groupId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsGroupsGroupIdDelete', () async {
      // TODO
    });

    // Retrieve Group
    //
    //Future objectsGroupsGroupIdGet(String groupId, { bool includeImplied, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsGroupsGroupIdGet', () async {
      // TODO
    });

    // Update Group
    //
    //Future objectsGroupsGroupIdPut(String groupId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsGroupsGroupIdPut', () async {
      // TODO
    });

    // Create Group 
    //
    //Future objectsGroupsPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsGroupsPost', () async {
      // TODO
    });

    // Retrieve Application License Usage
    //
    //Future objectsLicensesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsLicensesGet', () async {
      // TODO
    });

    // Retrieve All Multi-Record Workflows
    //
    //Future objectsObjectworkflowsActionsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsActionsGet', () async {
      // TODO
    });

    // Retrieve Multi-Record Workflow Details
    //
    //Future objectsObjectworkflowsActionsWorkflowNameGet(String workflowName, { String authorization, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsActionsWorkflowNameGet', () async {
      // TODO
    });

    // Initiate Multi-Record Workflow
    //
    //Future objectsObjectworkflowsActionsWorkflowNamePost(String workflowName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsActionsWorkflowNamePost', () async {
      // TODO
    });

    // Retrieve Workflows
    //
    //Future objectsObjectworkflowsGet({ String objectV, String recordIdV, String participant, String statusV, String offset, String pageSize, String loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsGet', () async {
      // TODO
    });

    // Retrieve Workflow Tasks
    //
    //Future objectsObjectworkflowsTasksGet({ String objectV, String recordIdV, String assigneeV, String statusV, String offset, String pageSize, String loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksGet', () async {
      // TODO
    });

    // Accept Single Record Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsAcceptPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsAcceptPost', () async {
      // TODO
    });

    // Cancel Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsCancelPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsCancelPost', () async {
      // TODO
    });

    // Complete Single Record Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsCompletePost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsCompletePost', () async {
      // TODO
    });

    // Retrieve Workflow Task Actions
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsGet(String taskId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsGet', () async {
      // TODO
    });

    // Accept Multi-item Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost', () async {
      // TODO
    });

    // Complete Multi-item Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost', () async {
      // TODO
    });

    // Manage Multi-Item Workflow Content
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost', () async {
      // TODO
    });

    // Reassign Multi-item Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost', () async {
      // TODO
    });

    // Reassign Single Record Workflow Task
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsReassignPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsReassignPost', () async {
      // TODO
    });

    // Retrieve Workflow Task Action Details
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(String taskId, String taskAction, { String loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsTaskActionGet', () async {
      // TODO
    });

    // Undo Workflow Task Acceptance
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost', () async {
      // TODO
    });

    // Update Workflow Task Due Date
    //
    //Future objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(String taskId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost', () async {
      // TODO
    });

    // Retrieve Workflow Task Details
    //
    //Future objectsObjectworkflowsTasksTaskIdGet(String taskId, { bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsTasksTaskIdGet', () async {
      // TODO
    });

    // Retrieve Workflow Actions
    //
    //Future objectsObjectworkflowsWorkflowIdActionsGet(String workflowId, { String loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsWorkflowIdActionsGet', () async {
      // TODO
    });

    // Retrieve Workflow Action Details
    //
    //Future objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(String workflowId, String workflowAction, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet', () async {
      // TODO
    });

    // Initiate Workflow Action
    //
    //Future objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(String workflowId, String workflowAction, { String documentsSys, String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost', () async {
      // TODO
    });

    // Retrieve Workflow Details
    //
    //Future objectsObjectworkflowsWorkflowIdGet(String workflowId, { bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsObjectworkflowsWorkflowIdGet', () async {
      // TODO
    });

    // Retrieve All Picklists
    //
    //Future objectsPicklistsGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsPicklistsGet', () async {
      // TODO
    });

    // Retrieve Picklist Values
    //
    //Future objectsPicklistsPicklistNameGet(String picklistName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsPicklistsPicklistNameGet', () async {
      // TODO
    });

    // Inactivate Picklist Value
    //
    //Future objectsPicklistsPicklistNamePicklistValueNameDelete(String picklistName, String picklistValueName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsPicklistsPicklistNamePicklistValueNameDelete', () async {
      // TODO
    });

    // Update Picklist Value
    //
    //Future objectsPicklistsPicklistNamePicklistValueNamePut(String picklistName, String picklistValueName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsPicklistsPicklistNamePicklistValueNamePut', () async {
      // TODO
    });

    // Create Picklist Values
    //
    //Future objectsPicklistsPicklistNamePost(String picklistName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsPicklistsPicklistNamePost', () async {
      // TODO
    });

    // Update Picklist Value Label
    //
    //Future objectsPicklistsPicklistNamePut(String picklistName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsPicklistsPicklistNamePut', () async {
      // TODO
    });

    // Build Production Vault
    //
    //Future objectsSandboxActionsBuildproductionPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxActionsBuildproductionPost', () async {
      // TODO
    });

    // Promote to Production
    //
    //Future objectsSandboxActionsPromoteproductionPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxActionsPromoteproductionPost', () async {
      // TODO
    });

    // Recheck Sandbox Usage Limit
    //
    //Future objectsSandboxActionsRecheckusagePost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxActionsRecheckusagePost', () async {
      // TODO
    });

    // Change Sandbox Size
    //
    //Future objectsSandboxBatchChangesizePost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxBatchChangesizePost', () async {
      // TODO
    });

    // Set Sandbox Entitlements
    //
    //Future objectsSandboxEntitlementsSetPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxEntitlementsSetPost', () async {
      // TODO
    });

    // Retrieve Sandboxes
    //
    //Future objectsSandboxGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxGet', () async {
      // TODO
    });

    // Delete Sandbox
    //
    //Future objectsSandboxNameDelete(String name, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxNameDelete', () async {
      // TODO
    });

    // Create or Refresh Sandbox
    //
    //Future objectsSandboxPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxPost', () async {
      // TODO
    });

    // Update Sandbox Snapshot
    //
    //Future objectsSandboxSnapshotApiNameActionsUpdatePost(String apiName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxSnapshotApiNameActionsUpdatePost', () async {
      // TODO
    });

    // Upgrade Sandbox Snapshot
    //
    //Future objectsSandboxSnapshotApiNameActionsUpgradePost(String apiName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxSnapshotApiNameActionsUpgradePost', () async {
      // TODO
    });

    // Delete Sandbox Snapshot
    //
    //Future objectsSandboxSnapshotApiNameDelete(String apiName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxSnapshotApiNameDelete', () async {
      // TODO
    });

    // Retrieve Sandbox Snapshots
    //
    //Future objectsSandboxSnapshotGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxSnapshotGet', () async {
      // TODO
    });

    // Create Sandbox Snapshot
    //
    //Future objectsSandboxSnapshotPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxSnapshotPost', () async {
      // TODO
    });

    // Refresh Sandbox from Snapshot
    //
    //Future objectsSandboxVaultIdActionsRefreshPost(String vaultId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsSandboxVaultIdActionsRefreshPost', () async {
      // TODO
    });

    // Retrieve Sandbox Details by ID
    //
    //Future objectsSandboxVaultIdGet(String vaultId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSandboxVaultIdGet', () async {
      // TODO
    });

    // Retrieve All Security Policies
    //
    //Future objectsSecuritypoliciesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSecuritypoliciesGet', () async {
      // TODO
    });

    // Retrieve Security Policy
    //
    //Future objectsSecuritypoliciesSecurityPolicyNameGet(String securityPolicyName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsSecuritypoliciesSecurityPolicyNameGet', () async {
      // TODO
    });

    // Retrieve All Users
    //
    //Future objectsUsersGet({ String vaults, String excludeVaultMembership, String excludeAppLicensing, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersGet', () async {
      // TODO
    });

    // Retrieve User
    //
    //Future objectsUsersIdGet(String id, { String excludeVaultMembership, String excludeAppLicensing, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersIdGet', () async {
      // TODO
    });

    // Retrieve User Permissions
    //
    //Future objectsUsersIdPermissionsGet(String id, { String filter, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersIdPermissionsGet', () async {
      // TODO
    });

    // Update Single User
    //
    //Future objectsUsersIdPut(String id, { String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsUsersIdPut', () async {
      // TODO
    });

    // Validate Session User
    //
    //Future objectsUsersMeGet({ String excludeVaultMembership, String excludeAppLicensing, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersMeGet', () async {
      // TODO
    });

    // Change My Password
    //
    //Future objectsUsersMePasswordPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersMePasswordPost', () async {
      // TODO
    });

    // Retrieve My User Permissions
    //
    //Future objectsUsersMePermissionsGet({ String filter, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersMePermissionsGet', () async {
      // TODO
    });

    // Update My User
    //
    //Future objectsUsersMePut({ String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsUsersMePut', () async {
      // TODO
    });

    // Create Single User
    //
    //Future objectsUsersPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test objectsUsersPost', () async {
      // TODO
    });

    // Update Multiple Users
    //
    //Future objectsUsersPut({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersPut', () async {
      // TODO
    });

    // Disable User
    //
    //Future objectsUsersUserIdDelete(String userId, { bool domain, String authorization, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersUserIdDelete', () async {
      // TODO
    });

    // Update Vault Membership
    //
    //Future objectsUsersUserIdVaultMembershipVaultIdPut(String userId, String vaultId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test objectsUsersUserIdVaultMembershipVaultIdPut', () async {
      // TODO
    });

    // Vault Compare
    //
    //Future objectsVaultActionsComparePost({ String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsVaultActionsComparePost', () async {
      // TODO
    });

    // Vault Configuration Report
    //
    //Future objectsVaultActionsConfigreportPost({ String authorization, String contentType, String xVaultAPIClientID }) async
    test('test objectsVaultActionsConfigreportPost', () async {
      // TODO
    });

    // Component Definition Query
    //
    //Future queryComponentsPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test queryComponentsPost', () async {
      // TODO
    });

    // Next Page URL
    //
    //Future queryNextPagePost(String nextPage, { String authorization, String accept, bool xVaultAPIDescribeQuery, String contentType, String xVaultAPIClientID }) async
    test('test queryNextPagePost', () async {
      // TODO
    });

    // Submitting a Query
    //
    //Future queryPost({ String authorization, String accept, bool xVaultAPIDescribeQuery, String contentType, String xVaultAPIClientID }) async
    test('test queryPost', () async {
      // TODO
    });

    // Previous Page URL
    //
    //Future queryPreviousPagePost(String previousPage, { String authorization, String accept, bool xVaultAPIDescribeQuery, String contentType, String xVaultAPIClientID }) async
    test('test queryPreviousPagePost', () async {
      // TODO
    });

    // Retrieve Current User with SCIM
    //
    //Future scimV2MeGet({ String attributes, String excludedAttributes, String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2MeGet', () async {
      // TODO
    });

    // Update Current User with SCIM
    //
    //Future scimV2MePut({ String attributes, String excludedAttributes, String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test scimV2MePut', () async {
      // TODO
    });

    // Retrieve All SCIM Resource Types
    //
    //Future scimV2ResourceTypesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2ResourceTypesGet', () async {
      // TODO
    });

    // Retrieve Single SCIM Resource Type
    //
    //Future scimV2ResourceTypesTypeGet(String type, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2ResourceTypesTypeGet', () async {
      // TODO
    });

    // Retrieve All SCIM Schema Information
    //
    //Future scimV2SchemasGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2SchemasGet', () async {
      // TODO
    });

    // Retrieve Single SCIM Schema Information
    //
    //Future scimV2SchemasIdGet(String id, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2SchemasIdGet', () async {
      // TODO
    });

    // Retrieve SCIM Provider
    //
    //Future scimV2ServiceProviderConfigGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2ServiceProviderConfigGet', () async {
      // TODO
    });

    // Retrieve SCIM Resources
    //
    //Future scimV2TypeGet(String type, { String filter, String attributes, String excludedAttributes, String sortBy, String sortOrder, String startIndex, String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2TypeGet', () async {
      // TODO
    });

    // Retrieve Single SCIM Resource
    //
    //Future scimV2TypeIdGet(String type, String id, { String attributes, String excludedAttributes, String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2TypeIdGet', () async {
      // TODO
    });

    // Retrieve All Users with SCIM
    //
    //Future scimV2UsersGet({ String filter, String attributes, String excludedAttributes, String sortBy, String sortOrder, String count, String startIndex, String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2UsersGet', () async {
      // TODO
    });

    // Retrieve Single User with SCIM
    //
    //Future scimV2UsersIdGet(String id, { String filter, String attributes, String excludedAttributes, String authorization, String accept, String xVaultAPIClientID }) async
    test('test scimV2UsersIdGet', () async {
      // TODO
    });

    // Update User with SCIM
    //
    //Future scimV2UsersIdPut(String id, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test scimV2UsersIdPut', () async {
      // TODO
    });

    // Create User with SCIM
    //
    //Future scimV2UsersPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test scimV2UsersPost', () async {
      // TODO
    });

    // Retrieve Signing Certificate
    //
    //Future servicesCertificateCertIdGet(String certId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesCertificateCertIdGet', () async {
      // TODO
    });

    // Disable Configuration Mode
    //
    //Future servicesConfigurationModeActionsDisablePost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test servicesConfigurationModeActionsDisablePost', () async {
      // TODO
    });

    // Enable Configuration Mode
    //
    //Future servicesConfigurationModeActionsEnablePost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test servicesConfigurationModeActionsEnablePost', () async {
      // TODO
    });

    // Retrieve Available Direct Data Files
    //
    //Future servicesDirectdataFilesGet({ String extractType, int startTime, int stopTime, String accept, String authorization, String xVaultAPIClientID }) async
    test('test servicesDirectdataFilesGet', () async {
      // TODO
    });

    // Download Direct Data File
    //
    //Future servicesDirectdataFilesNameGet(String name, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test servicesDirectdataFilesNameGet', () async {
      // TODO
    });

    // Download Item Content
    //
    //Future servicesFileStagingItemsContentItemGet(String item, { String authorization, String accept, String range, String xVaultAPIClientID }) async
    test('test servicesFileStagingItemsContentItemGet', () async {
      // TODO
    });

    // Delete File or Folder
    //
    //Future servicesFileStagingItemsItemDelete(String item, { String recursive, String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingItemsItemDelete', () async {
      // TODO
    });

    // List Items at a Path
    //
    //Future servicesFileStagingItemsItemGet(String item, { String recursive, String limit, String formatResult, String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingItemsItemGet', () async {
      // TODO
    });

    // Update Folder or File
    //
    //Future servicesFileStagingItemsItemPut(String item, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingItemsItemPut', () async {
      // TODO
    });

    // Create Folder or File
    //
    //Future servicesFileStagingItemsPost({ String authorization, String accept, String contentMD5, String xVaultAPIClientID }) async
    test('test servicesFileStagingItemsPost', () async {
      // TODO
    });

    // List Upload Sessions
    //
    //Future servicesFileStagingUploadGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadGet', () async {
      // TODO
    });

    // Create Resumable Upload Session
    //
    //Future servicesFileStagingUploadPost({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadPost', () async {
      // TODO
    });

    // Abort Upload Session
    //
    //Future servicesFileStagingUploadUploadSessionIdDelete(String uploadSessionId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadUploadSessionIdDelete', () async {
      // TODO
    });

    // Get Upload Session Details
    //
    //Future servicesFileStagingUploadUploadSessionIdGet(String uploadSessionId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadUploadSessionIdGet', () async {
      // TODO
    });

    // List File Parts Uploaded to Session
    //
    //Future servicesFileStagingUploadUploadSessionIdPartsGet(String uploadSessionId, { String limit, String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadUploadSessionIdPartsGet', () async {
      // TODO
    });

    // Commit Upload Session
    //
    //Future servicesFileStagingUploadUploadSessionIdPost(String uploadSessionId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadUploadSessionIdPost', () async {
      // TODO
    });

    // Upload to a Session
    //
    //Future servicesFileStagingUploadUploadSessionIdPut(String uploadSessionId, { String authorization, String accept, String contentType, String xVaultAPIFilePartNumber, String contentMD5, String xVaultAPIClientID }) async
    test('test servicesFileStagingUploadUploadSessionIdPut', () async {
      // TODO
    });

    // Retrieve Job Histories
    //
    //Future servicesJobsHistoriesGet({ String startDate, String endDate, String status, String limit, String offset, String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsHistoriesGet', () async {
      // TODO
    });

    // Retrieve Import Bulk Translation File Job Errors
    //
    //Future servicesJobsJobIdErrorsGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsJobIdErrorsGet', () async {
      // TODO
    });

    // Retrieve Job Status
    //
    //Future servicesJobsJobIdGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsJobIdGet', () async {
      // TODO
    });

    // Retrieve Import Bulk Translation File Job Summary
    //
    //Future servicesJobsJobIdSummaryGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsJobIdSummaryGet', () async {
      // TODO
    });

    // Retrieve SDK Job Tasks
    //
    //Future servicesJobsJobIdTasksGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsJobIdTasksGet', () async {
      // TODO
    });

    // Retrieve Job Monitors
    //
    //Future servicesJobsMonitorsGet({ String startDate, String endDate, String status, String limit, String offset, String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsMonitorsGet', () async {
      // TODO
    });

    // Start Job
    //
    //Future servicesJobsStartNowJobIdPost(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesJobsStartNowJobIdPost', () async {
      // TODO
    });

    // Extract Data Files
    //
    //Future servicesLoaderExtractPost({ String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test servicesLoaderExtractPost', () async {
      // TODO
    });

    // Retrieve Load Failure Log Results
    //
    //Future servicesLoaderJobIdTasksTaskIdFailurelogGet(String jobId, String taskId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesLoaderJobIdTasksTaskIdFailurelogGet', () async {
      // TODO
    });

    // Retrieve Loader Extract Results
    //
    //Future servicesLoaderJobIdTasksTaskIdResultsGet(String jobId, String taskId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesLoaderJobIdTasksTaskIdResultsGet', () async {
      // TODO
    });

    // Retrieve Loader Extract Renditions Results
    //
    //Future servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(String jobId, String taskId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesLoaderJobIdTasksTaskIdResultsRenditionsGet', () async {
      // TODO
    });

    // Retrieve Load Success Log Results
    //
    //Future servicesLoaderJobIdTasksTaskIdSuccesslogGet(String jobId, String taskId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesLoaderJobIdTasksTaskIdSuccesslogGet', () async {
      // TODO
    });

    // Load Data Objects
    //
    //Future servicesLoaderLoadPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test servicesLoaderLoadPost', () async {
      // TODO
    });

    // Validate Package
    //
    //Future servicesPackageActionsValidatePost({ String authorization, String contentType, String xVaultAPIClientID }) async
    test('test servicesPackageActionsValidatePost', () async {
      // TODO
    });

    // Export Package
    //
    //Future servicesPackagePost({ String authorization, String contentType, String xVaultAPIClientID }) async
    test('test servicesPackagePost', () async {
      // TODO
    });

    // Import Package
    //
    //Future servicesPackagePut({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test servicesPackagePut', () async {
      // TODO
    });

    // Retrieve All Queues
    //
    //Future servicesQueuesGet({ String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesQueuesGet', () async {
      // TODO
    });

    // Disable Delivery
    //
    //Future servicesQueuesQueueNameActionsDisableDeliveryPut(String queueName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesQueuesQueueNameActionsDisableDeliveryPut', () async {
      // TODO
    });

    // Enable Delivery
    //
    //Future servicesQueuesQueueNameActionsEnableDeliveryPut(String queueName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesQueuesQueueNameActionsEnableDeliveryPut', () async {
      // TODO
    });

    // Reset Queue
    //
    //Future servicesQueuesQueueNameActionsResetPut(String queueName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesQueuesQueueNameActionsResetPut', () async {
      // TODO
    });

    // Retrieve Queue Status
    //
    //Future servicesQueuesQueueNameGet(String queueName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesQueuesQueueNameGet', () async {
      // TODO
    });

    // Validate Imported Package
    //
    //Future servicesVobjectVaultPackageVPackageIdActionsValidatePost(String packageId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test servicesVobjectVaultPackageVPackageIdActionsValidatePost', () async {
      // TODO
    });

    // End Session
    //
    //Future sessionDelete({ String accept, String authorization, String xVaultAPIClientID }) async
    test('test sessionDelete', () async {
      // TODO
    });

    // Download Single Client Code Distribution
    //
    //Future uicodeDistributionsDistributionNameCodeGet(String distributionName, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test uicodeDistributionsDistributionNameCodeGet', () async {
      // TODO
    });

    // Delete Single Client Code Distribution
    //
    //Future uicodeDistributionsDistributionNameDelete(String distributionName, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test uicodeDistributionsDistributionNameDelete', () async {
      // TODO
    });

    // Retrieve Single Client Code Distribution Metadata
    //
    //Future uicodeDistributionsDistributionNameGet(String distributionName, { String accept, String authorization, String xVaultAPIClientID }) async
    test('test uicodeDistributionsDistributionNameGet', () async {
      // TODO
    });

    // Retrieve All Client Code Distribution Metadata
    //
    //Future uicodeDistributionsGet({ String accept, String authorization, String xVaultAPIClientID }) async
    test('test uicodeDistributionsGet', () async {
      // TODO
    });

    // Add or Replace Single Client Code Distribution
    //
    //Future uicodeDistributionsPost({ String accept, String authorization, String contentType, String xVaultAPIClientID }) async
    test('test uicodeDistributionsPost', () async {
      // TODO
    });

    // Deploy Package
    //
    //Future vobjectVaultPackageVPackageIdActionsDeployPost(String packageId, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test vobjectVaultPackageVPackageIdActionsDeployPost', () async {
      // TODO
    });

    // Retrieve Package Deploy Results
    //
    //Future vobjectVaultPackageVPackageIdActionsDeployResultsGet(String packageId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectVaultPackageVPackageIdActionsDeployResultsGet', () async {
      // TODO
    });

    // Retrieve Results of Cascade Delete Job
    //
    //Future vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(String objectName, String jobStatus, String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet', () async {
      // TODO
    });

    // Retrieve Results of Deep Copy Job
    //
    //Future vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(String objectName, String jobStatus, String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet', () async {
      // TODO
    });

    // Create a Placeholder from an EDL Item
    //
    //Future vobjectsEdlItemVActionsCreateplaceholderPost({ String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test vobjectsEdlItemVActionsCreateplaceholderPost', () async {
      // TODO
    });

    // Download Merge Records Job Log
    //
    //Future vobjectsMergesJobIdLogGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsMergesJobIdLogGet', () async {
      // TODO
    });

    // Retrieve Record Merge Results
    //
    //Future vobjectsMergesJobIdResultsGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsMergesJobIdResultsGet', () async {
      // TODO
    });

    // Retrieve Record Merge Status
    //
    //Future vobjectsMergesJobIdStatusGet(String jobId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsMergesJobIdStatusGet', () async {
      // TODO
    });

    // Initiate Object Action on Multiple Records
    //
    //Future vobjectsObjectNameActionsActionNamePost(String objectName, String actionName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameActionsActionNamePost', () async {
      // TODO
    });

    // Change Object Type
    //
    //Future vobjectsObjectNameActionsChangetypePost(String objectName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameActionsChangetypePost', () async {
      // TODO
    });

    // Initiate Record Merge
    //
    //Future vobjectsObjectNameActionsMergePost(String objectName, { String authorization, String contentType, String accept, String xVaultAPIClientID, BuiltList<VobjectsObjectNameActionsMergePostRequestInner> vobjectsObjectNameActionsMergePostRequestInner }) async
    test('test vobjectsObjectNameActionsMergePost', () async {
      // TODO
    });

    // Retrieve Roll-up Field Recalculation Status
    //
    //Future vobjectsObjectNameActionsRecalculaterollupsGet(String objectName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameActionsRecalculaterollupsGet', () async {
      // TODO
    });

    // Recalculate Roll-up Fields
    //
    //Future vobjectsObjectNameActionsRecalculaterollupsPost(String objectName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameActionsRecalculaterollupsPost', () async {
      // TODO
    });

    // Update Corporate Currency Fields
    //
    //Future vobjectsObjectNameActionsUpdatecorporatecurrencyPut(String objectName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameActionsUpdatecorporatecurrencyPut', () async {
      // TODO
    });

    // Delete Multiple Object Record Attachments
    //
    //Future vobjectsObjectNameAttachmentsBatchDelete(String objectName, { String idParam, String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameAttachmentsBatchDelete', () async {
      // TODO
    });

    // Create Multiple Object Record Attachments
    //
    //Future vobjectsObjectNameAttachmentsBatchPost(String objectName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameAttachmentsBatchPost', () async {
      // TODO
    });

    // Update Multiple Object Record Attachment Descriptions
    //
    //Future vobjectsObjectNameAttachmentsBatchPut(String objectName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameAttachmentsBatchPut', () async {
      // TODO
    });

    // Delete Object Records
    //
    //Future vobjectsObjectNameDelete(String objectName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameDelete', () async {
      // TODO
    });

    // Retrieve Object Record Roles
    //
    //Future vobjectsObjectNameIdRolesRoleNameGet(String objectName, String id, String roleName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameIdRolesRoleNameGet', () async {
      // TODO
    });

    // Retrieve Object User Actions Details
    //
    //Future vobjectsObjectNameObjectRecordIdActionsActionNameGet(String objectName, String objectRecordId, String actionName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdActionsActionNameGet', () async {
      // TODO
    });

    // Initiate Object Action on a Single Record
    //
    //Future vobjectsObjectNameObjectRecordIdActionsActionNamePost(String objectName, String objectRecordId, String actionName, { String authorization, String contentType, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdActionsActionNamePost', () async {
      // TODO
    });

    // Cascade Delete Object Record
    //
    //Future vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(String objectName, String objectRecordId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdActionsCascadedeletePost', () async {
      // TODO
    });

    // Deep Copy Object Record
    //
    //Future vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(String objectName, String objectRecordId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdActionsDeepcopyPost', () async {
      // TODO
    });

    // Retrieve Object Record User Actions
    //
    //Future vobjectsObjectNameObjectRecordIdActionsGet(String objectName, String objectRecordId, { bool loc, String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdActionsGet', () async {
      // TODO
    });

    // Download Attachment Field File
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(String objectName, String objectRecordId, String attachmentFieldName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet', () async {
      // TODO
    });

    // Update Attachment Field File
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(String objectName, String objectRecordId, String attachmentFieldName, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost', () async {
      // TODO
    });

    // Download All Attachment Field Files
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(String objectName, String objectRecordId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet', () async {
      // TODO
    });

    // Delete Object Record Attachment
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(String objectName, String objectRecordId, String attachmentId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete', () async {
      // TODO
    });

    // Retrieve Object Record Attachment Metadata
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(String objectName, String objectRecordId, String attachmentId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet', () async {
      // TODO
    });

    // Update Object Record Attachment Description
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(String objectName, String objectRecordId, String attachmentId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut', () async {
      // TODO
    });

    // Delete Object Record Attachment Version
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(String objectName, String objectRecordId, String attachmentId, String attachmentVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete', () async {
      // TODO
    });

    // Download Object Record Attachment File
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(String objectName, String objectRecordId, String attachmentId, String attachmentVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet', () async {
      // TODO
    });

    // Retrieve Object Record Attachment Version Metadata
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(String objectName, String objectRecordId, String attachmentId, String attachmentVersion, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet', () async {
      // TODO
    });

    // Restore Object Record Attachment Version
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(String objectName, String objectRecordId, String attachmentId, String attachmentVersion, { bool restore, String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost', () async {
      // TODO
    });

    // Retrieve Object Record Attachment Versions
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(String objectName, String objectRecordId, String attachmentId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet', () async {
      // TODO
    });

    // Download All Object Record Attachment Files
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsFileGet(String objectName, String objectRecordId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsFileGet', () async {
      // TODO
    });

    // Retrieve Object Record Attachments
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsGet(String objectName, String objectRecordId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsGet', () async {
      // TODO
    });

    // Create Object Record Attachment
    //
    //Future vobjectsObjectNameObjectRecordIdAttachmentsPost(String objectName, String objectRecordId, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAttachmentsPost', () async {
      // TODO
    });

    // Retrieve Complete Audit History for a Single Object Record
    //
    //Future vobjectsObjectNameObjectRecordIdAudittrailGet(String objectName, String objectRecordId, { String startDate, String endDate, String formatResult, String limit, String offset, String events, String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdAudittrailGet', () async {
      // TODO
    });

    // Retrieve Object Record
    //
    //Future vobjectsObjectNameObjectRecordIdGet(String objectName, String objectRecordId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameObjectRecordIdGet', () async {
      // TODO
    });

    // Create & Upsert Object Records
    //
    //Future vobjectsObjectNamePost(String objectName, { String idParam, String authorization, String contentType, String accept, bool xVaultAPIMigrationMode, bool xVaultAPINoTriggers, String xVaultAPIClientID }) async
    test('test vobjectsObjectNamePost', () async {
      // TODO
    });

    // Update Object Records
    //
    //Future vobjectsObjectNamePut(String objectName, { String authorization, String contentType, String accept, bool xVaultAPIMigrationMode, bool xVaultAPINoTriggers, String xVaultAPIClientID }) async
    test('test vobjectsObjectNamePut', () async {
      // TODO
    });

    // Remove Users & Groups from Roles on Object Records
    //
    //Future vobjectsObjectNameRolesDelete(String objectName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameRolesDelete', () async {
      // TODO
    });

    // Assign Users & Groups to Roles on Object Records
    //
    //Future vobjectsObjectNameRolesPost(String objectName, { String authorization, String accept, String contentType, String xVaultAPIClientID }) async
    test('test vobjectsObjectNameRolesPost', () async {
      // TODO
    });

    // Retrieve Outbound Package Dependencies
    //
    //Future vobjectsOutboundPackageVPackageIdDependenciesGet(String packageId, { String authorization, String accept, String xVaultAPIClientID }) async
    test('test vobjectsOutboundPackageVPackageIdDependenciesGet', () async {
      // TODO
    });

  });
}
