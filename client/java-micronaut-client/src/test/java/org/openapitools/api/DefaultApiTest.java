package org.openapitools.api;

import org.openapitools.model.VobjectsObjectNameActionsMergePostRequestInner;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Retrieve API Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void apiGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the apiGetTest()
    }

    
    /**
     * Retrieve Content File
     */
    @Test
    @Disabled("Not Implemented")
    public void apiMdlComponentsComponentTypeAndRecordNameFilesGetTest() {
        // given
        String componentTypeAndRecordName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the apiMdlComponentsComponentTypeAndRecordNameFilesGetTest()
    }

    
    /**
     * Retrieve Component Record (MDL)
     */
    @Test
    @Disabled("Not Implemented")
    public void apiMdlComponentsComponentTypeAndRecordNameGetTest() {
        // given
        String componentTypeAndRecordName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the apiMdlComponentsComponentTypeAndRecordNameGetTest()
    }

    
    /**
     * Retrieve Asynchronous MDL Script Results
     */
    @Test
    @Disabled("Not Implemented")
    public void apiMdlExecuteAsyncJobIdResultsGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiMdlExecuteAsyncJobIdResultsGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the apiMdlExecuteAsyncJobIdResultsGetTest()
    }

    
    /**
     * Execute MDL Script Asynchronously
     */
    @Test
    @Disabled("Not Implemented")
    public void apiMdlExecuteAsyncPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiMdlExecuteAsyncPost(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the apiMdlExecuteAsyncPostTest()
    }

    
    /**
     * Execute MDL Script
     */
    @Test
    @Disabled("Not Implemented")
    public void apiMdlExecutePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiMdlExecutePost(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the apiMdlExecutePostTest()
    }

    
    /**
     * Upload Content File
     */
    @Test
    @Disabled("Not Implemented")
    public void apiMdlFilesPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.apiMdlFilesPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the apiMdlFilesPostTest()
    }

    
    /**
     * Retrieve Audit Details
     */
    @Test
    @Disabled("Not Implemented")
    public void audittrailAuditTrailTypeGetTest() {
        // given
        String auditTrailType = "example";
        String startDate = "example";
        String endDate = "example";
        String allDates = "example";
        String formatResult = "example";
        String limit = "example";
        String offset = "example";
        String objects = "example";
        String events = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.audittrailAuditTrailTypeGet(auditTrailType, startDate, endDate, allDates, formatResult, limit, offset, objects, events, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the audittrailAuditTrailTypeGetTest()
    }

    
    /**
     * Authentication Type Discovery
     */
    @Test
    @Disabled("Not Implemented")
    public void authDiscoveryPostTest() {
        // given
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.authDiscoveryPost(accept, xVaultAPIClientID).block();

        // then
        // TODO implement the authDiscoveryPostTest()
    }

    
    /**
     * OAuth 2.0 / OpenID Connect
     */
    @Test
    @Disabled("Not Implemented")
    public void authOauthSessionOathOidcProfileIdPostTest() {
        // given
        String oathOidcProfileId = "{{oath_oidc_profile_id}}";
        String _authorization = "Bearer {{access_token}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.authOauthSessionOathOidcProfileIdPost(oathOidcProfileId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the authOauthSessionOathOidcProfileIdPostTest()
    }

    
    /**
     * User Name and Password
     */
    @Test
    @Disabled("Not Implemented")
    public void authPostTest() {
        // given
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.authPost(contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the authPostTest()
    }

    
    /**
     * Delete Single Source Code File
     */
    @Test
    @Disabled("Not Implemented")
    public void codeClassNameDeleteTest() {
        // given
        String className = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeClassNameDelete(className, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeClassNameDeleteTest()
    }

    
    /**
     * Disable Vault Extension
     */
    @Test
    @Disabled("Not Implemented")
    public void codeClassNameDisablePutTest() {
        // given
        String className = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeClassNameDisablePut(className, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the codeClassNameDisablePutTest()
    }

    
    /**
     * Enable Vault Extension
     */
    @Test
    @Disabled("Not Implemented")
    public void codeClassNameEnablePutTest() {
        // given
        String className = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeClassNameEnablePut(className, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the codeClassNameEnablePutTest()
    }

    
    /**
     * Retrieve Single Source Code File
     */
    @Test
    @Disabled("Not Implemented")
    public void codeClassNameGetTest() {
        // given
        String className = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeClassNameGet(className, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeClassNameGetTest()
    }

    
    /**
     * Retrieve All Profiling Sessions
     */
    @Test
    @Disabled("Not Implemented")
    public void codeProfilerGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeProfilerGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeProfilerGetTest()
    }

    
    /**
     * Create Profiling Session
     */
    @Test
    @Disabled("Not Implemented")
    public void codeProfilerPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeProfilerPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeProfilerPostTest()
    }

    
    /**
     * End Profiling Session
     */
    @Test
    @Disabled("Not Implemented")
    public void codeProfilerSessionNameActionsEndPostTest() {
        // given
        String sessionName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeProfilerSessionNameActionsEndPost(sessionName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeProfilerSessionNameActionsEndPostTest()
    }

    
    /**
     * Delete Profiling Session
     */
    @Test
    @Disabled("Not Implemented")
    public void codeProfilerSessionNameDeleteTest() {
        // given
        String sessionName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeProfilerSessionNameDelete(sessionName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeProfilerSessionNameDeleteTest()
    }

    
    /**
     * Retrieve Profiling Session
     */
    @Test
    @Disabled("Not Implemented")
    public void codeProfilerSessionNameGetTest() {
        // given
        String sessionName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeProfilerSessionNameGet(sessionName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeProfilerSessionNameGetTest()
    }

    
    /**
     * Download Profiling Session Results
     */
    @Test
    @Disabled("Not Implemented")
    public void codeProfilerSessionNameResultsGetTest() {
        // given
        String sessionName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codeProfilerSessionNameResultsGet(sessionName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the codeProfilerSessionNameResultsGetTest()
    }

    
    /**
     * Add or Replace Single Source Code File
     */
    @Test
    @Disabled("Not Implemented")
    public void codePutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.codePut(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the codePutTest()
    }

    
    /**
     * Retrieve Specific Root Nodes
     */
    @Test
    @Disabled("Not Implemented")
    public void compositesTreesEdlHierarchyOrTemplateActionsListnodesPostTest() {
        // given
        String edlHierarchyOrTemplate = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the compositesTreesEdlHierarchyOrTemplateActionsListnodesPostTest()
    }

    
    /**
     * Retrieve All Root Nodes
     */
    @Test
    @Disabled("Not Implemented")
    public void compositesTreesEdlHierarchyOrTemplateGetTest() {
        // given
        String edlHierarchyOrTemplate = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the compositesTreesEdlHierarchyOrTemplateGetTest()
    }

    
    /**
     * Retrieve a Node&#39;s Children
     */
    @Test
    @Disabled("Not Implemented")
    public void compositesTreesEdlHierarchyVParentNodeIdChildrenGetTest() {
        // given
        String parentNodeId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the compositesTreesEdlHierarchyVParentNodeIdChildrenGetTest()
    }

    
    /**
     * Update Node Order
     */
    @Test
    @Disabled("Not Implemented")
    public void compositesTreesEdlHierarchyVParentNodeIdChildrenPutTest() {
        // given
        String parentNodeId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the compositesTreesEdlHierarchyVParentNodeIdChildrenPutTest()
    }

    
    /**
     * Retrieve Component Record (XML/JSON)
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationComponentTypeAndRecordNameGetTest() {
        // given
        String componentTypeAndRecordName = "example";
        String loc = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationComponentTypeAndRecordNameGetTest()
    }

    
    /**
     * Retrieve Component Record Collection
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationComponentTypeGetTest() {
        // given
        String componentType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationComponentTypeGet(componentType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationComponentTypeGetTest()
    }

    
    /**
     * Retrieve Details from a Specific Object
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationObjectNameAndObjectTypeGetTest() {
        // given
        String objectNameAndObjectType = "example";
        String loc = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationObjectNameAndObjectTypeGet(objectNameAndObjectType, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationObjectNameAndObjectTypeGetTest()
    }

    
    /**
     * Retrieve Details from All Object Types
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationObjecttypeGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationObjecttypeGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationObjecttypeGetTest()
    }

    
    /**
     * Delete Lifecycle Role Assignment Override Rules
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationRoleAssignmentRuleDeleteTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationRoleAssignmentRuleDelete(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationRoleAssignmentRuleDeleteTest()
    }

    
    /**
     * Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationRoleAssignmentRuleGetTest() {
        // given
        String lifecycleV = "example";
        String roleV = "example";
        String productV = "example";
        String countryV = "example";
        String studyV = "example";
        String studyCountryV = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationRoleAssignmentRuleGet(lifecycleV, roleV, productV, countryV, studyV, studyCountryV, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationRoleAssignmentRuleGetTest()
    }

    
    /**
     * Create Lifecycle Role Assignment Override Rules
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationRoleAssignmentRulePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationRoleAssignmentRulePost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationRoleAssignmentRulePostTest()
    }

    
    /**
     * Update Lifecycle Role Assignment Rules (Default &amp; Override)
     */
    @Test
    @Disabled("Not Implemented")
    public void configurationRoleAssignmentRulePutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.configurationRoleAssignmentRulePut(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the configurationRoleAssignmentRulePutTest()
    }

    
    /**
     * Initiate Delegated Session
     */
    @Test
    @Disabled("Not Implemented")
    public void delegationLoginPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.delegationLoginPost(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the delegationLoginPostTest()
    }

    
    /**
     * Retrieve Delegations
     */
    @Test
    @Disabled("Not Implemented")
    public void delegationVaultsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.delegationVaultsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the delegationVaultsGetTest()
    }

    
    /**
     * Session Keep Alive
     */
    @Test
    @Disabled("Not Implemented")
    public void keepAlivePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.keepAlivePost(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the keepAlivePostTest()
    }

    
    /**
     * Retrieve Limits on Objects
     */
    @Test
    @Disabled("Not Implemented")
    public void limitsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.limitsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the limitsGetTest()
    }

    
    /**
     * Download Daily API Usage
     */
    @Test
    @Disabled("Not Implemented")
    public void logsApiUsageGetTest() {
        // given
        String date = "example";
        String logFormat = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsApiUsageGet(date, logFormat, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsApiUsageGetTest()
    }

    
    /**
     * Retrieve All Debug Logs
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeDebugGetTest() {
        // given
        String userId = "example";
        Boolean includeInactive = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeDebugGet(userId, includeInactive, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeDebugGetTest()
    }

    
    /**
     * Delete Debug Log
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeDebugIdActionsResetDeleteTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeDebugIdActionsResetDelete(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeDebugIdActionsResetDeleteTest()
    }

    
    /**
     * Reset Debug Log
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeDebugIdActionsResetPostTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeDebugIdActionsResetPost(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeDebugIdActionsResetPostTest()
    }

    
    /**
     * Download Debug Log Files
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeDebugIdFilesGetTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeDebugIdFilesGet(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeDebugIdFilesGetTest()
    }

    
    /**
     * Retrieve Single Debug Log
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeDebugIdGetTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeDebugIdGet(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeDebugIdGetTest()
    }

    
    /**
     * Create Debug Log
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeDebugPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeDebugPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeDebugPostTest()
    }

    
    /**
     * Download SDK Runtime Log
     */
    @Test
    @Disabled("Not Implemented")
    public void logsCodeRuntimeGetTest() {
        // given
        String date = "YYYY-MM-DD";
        String logFormat = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.logsCodeRuntimeGet(date, logFormat, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the logsCodeRuntimeGetTest()
    }

    
    /**
     * Import Bulk Translation File
     */
    @Test
    @Disabled("Not Implemented")
    public void messagesMessageTypeActionsImportPostTest() {
        // given
        String messageType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.messagesMessageTypeActionsImportPost(messageType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the messagesMessageTypeActionsImportPostTest()
    }

    
    /**
     * Export Bulk Translation File
     */
    @Test
    @Disabled("Not Implemented")
    public void messagesMessageTypeLanguageLangActionsExportPostTest() {
        // given
        String messageType = "example";
        String lang = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.messagesMessageTypeLanguageLangActionsExportPost(messageType, lang, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the messagesMessageTypeLanguageLangActionsExportPostTest()
    }

    
    /**
     * Retrieve Audit Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataAudittrailAuditTrailTypeGetTest() {
        // given
        String auditTrailType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataAudittrailAuditTrailTypeGet(auditTrailType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataAudittrailAuditTrailTypeGetTest()
    }

    
    /**
     * Retrieve Audit Types
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataAudittrailGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataAudittrailGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataAudittrailGetTest()
    }

    
    /**
     * Retrieve Component Type Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataComponentsComponentTypeGetTest() {
        // given
        String componentType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataComponentsComponentTypeGet(componentType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataComponentsComponentTypeGetTest()
    }

    
    /**
     * Retrieve All Component Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataComponentsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataComponentsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataComponentsGetTest()
    }

    
    /**
     * Retrieve Binder Template Node Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsBindersTemplatesBindernodesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsBindersTemplatesBindernodesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsBindersTemplatesBindernodesGetTest()
    }

    
    /**
     * Retrieve Binder Template Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsBindersTemplatesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsBindersTemplatesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsBindersTemplatesGetTest()
    }

    
    /**
     * Retrieve Annotation Placemark Type Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetTest() {
        // given
        String placemarkType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetTest()
    }

    
    /**
     * Retrieve Annotation Reference Type Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetTest() {
        // given
        String referenceType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetTest()
    }

    
    /**
     * Retrieve Annotation Type Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetTest() {
        // given
        String annotationType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetTest()
    }

    
    /**
     * Retrieve Document Event SubType Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetTest() {
        // given
        String eventType = "example";
        String eventSubtype = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType, eventSubtype, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetTest()
    }

    
    /**
     * Retrieve Document Event Types and Subtypes
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsEventsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsEventsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsEventsGetTest()
    }

    
    /**
     * Retrieve Document Lock Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsLockGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsLockGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsLockGetTest()
    }

    
    /**
     * Retrieve Common Document Fields
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsPropertiesFindCommonPostTest() {
        // given
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsPropertiesFindCommonPost(contentType, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsPropertiesFindCommonPostTest()
    }

    
    /**
     * Retrieve All Document Fields
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsPropertiesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsPropertiesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsPropertiesGetTest()
    }

    
    /**
     * Retrieve Document Template Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsTemplatesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsTemplatesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsTemplatesGetTest()
    }

    
    /**
     * Retrieve All Document Types
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsTypesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsTypesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsTypesGetTest()
    }

    
    /**
     * Retrieve Document Type
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsTypesTypeGetTest() {
        // given
        String type = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsTypesTypeGet(type, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsTypesTypeGetTest()
    }

    
    /**
     * Retrieve Document Type Relationships
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsTypesTypeRelationshipsGetTest() {
        // given
        String type = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsTypesTypeRelationshipsGet(type, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsTypesTypeRelationshipsGetTest()
    }

    
    /**
     * Retrieve Document Classification
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetTest() {
        // given
        String type = "example";
        String subtype = "example";
        String classification = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(type, subtype, classification, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetTest()
    }

    
    /**
     * Retrieve Document Subtype
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetTest() {
        // given
        String type = "example";
        String subtype = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(type, subtype, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetTest()
    }

    
    /**
     * Retrieve Group Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsGroupsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsGroupsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsGroupsGetTest()
    }

    
    /**
     * Retrieve Security Policy Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsSecuritypoliciesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsSecuritypoliciesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsSecuritypoliciesGetTest()
    }

    
    /**
     * Retrieve User Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataObjectsUsersGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataObjectsUsersGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataObjectsUsersGetTest()
    }

    
    /**
     * Retrieve Archived Document Signature Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetTest()
    }

    
    /**
     * Retrieve Document Signature Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetTest()
    }

    
    /**
     * Retrieve Object Collection
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataVobjectsGetTest() {
        // given
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataVobjectsGet(loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataVobjectsGetTest()
    }

    
    /**
     * Cancel Raw Object Deployment
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataVobjectsObjectNameActionsCanceldeploymentPostTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataVobjectsObjectNameActionsCanceldeploymentPostTest()
    }

    
    /**
     * Retrieve Object Field Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataVobjectsObjectNameFieldsObjectFieldNameGetTest() {
        // given
        String objectName = "example";
        String objectFieldName = "example";
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName, objectFieldName, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataVobjectsObjectNameFieldsObjectFieldNameGetTest()
    }

    
    /**
     * Retrieve Object Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataVobjectsObjectNameGetTest() {
        // given
        String objectName = "example";
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataVobjectsObjectNameGet(objectName, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataVobjectsObjectNameGetTest()
    }

    
    /**
     * Retrieve Page Layouts
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataVobjectsObjectNamePageLayoutsGetTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataVobjectsObjectNamePageLayoutsGet(objectName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataVobjectsObjectNamePageLayoutsGetTest()
    }

    
    /**
     * Retrieve Page Layout Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void metadataVobjectsObjectNamePageLayoutsLayoutNameGetTest() {
        // given
        String objectName = "example";
        String layoutName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName, layoutName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the metadataVobjectsObjectNamePageLayoutsLayoutNameGetTest()
    }

    
    /**
     * Retrieve Email Notification Histories
     */
    @Test
    @Disabled("Not Implemented")
    public void notificationsHistoriesGetTest() {
        // given
        String startDate = "YYYY-MM-DD";
        String endDate = "YYYY-MM-DD";
        Boolean allDates = true;
        String formatResult = "csv";
        String limit = "example";
        String offset = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.notificationsHistoriesGet(startDate, endDate, allDates, formatResult, limit, offset, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the notificationsHistoriesGetTest()
    }

    
    /**
     * Retrieve Bulk Workflow Action Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsActionGetTest() {
        // given
        String action = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsActionGet(action, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsActionGetTest()
    }

    
    /**
     * Initiate Workflow Actions on Multiple Workflows
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsActionPostTest() {
        // given
        String action = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsActionPost(action, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsActionPostTest()
    }

    
    /**
     * Cancel Workflow Tasks
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsCanceltasksPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsCanceltasksPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsCanceltasksPostTest()
    }

    
    /**
     * Cancel Workflows
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsCancelworkflowsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsCancelworkflowsPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsCancelworkflowsPostTest()
    }

    
    /**
     * Retrieve Bulk Workflow Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsGetTest()
    }

    
    /**
     * Reassign Workflow Tasks
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsReassigntasksPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsReassigntasksPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsReassigntasksPostTest()
    }

    
    /**
     * Replace Workflow Owner
     */
    @Test
    @Disabled("Not Implemented")
    public void objectWorkflowActionsReplaceworkflowownerPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectWorkflowActionsReplaceworkflowownerPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectWorkflowActionsReplaceworkflowownerPostTest()
    }

    
    /**
     * Retrieve Binder Export Results
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersActionsExportJobIdResultsGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersActionsExportJobIdResultsGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersActionsExportJobIdResultsGetTest()
    }

    
    /**
     * Export Binder (Latest Version)
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdActionsExportPostTest() {
        // given
        String binderId = "example";
        Boolean source = true;
        String renditiontype = "viewable_rendition__v";
        String docversion = "major";
        String attachments = "all";
        String export = "name__v,title__v,document_number__v";
        Boolean docfield = false;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdActionsExportPost(binderId, source, renditiontype, docversion, attachments, export, docfield, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdActionsExportPostTest()
    }

    
    /**
     * Refresh Binder Auto-Filing
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdActionsPostTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdActionsPost(binderId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdActionsPostTest()
    }

    
    /**
     * Update Binding Rule
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdBindingRulePutTest() {
        // given
        String binderId = "example";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdBindingRulePut(binderId, contentType, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdBindingRulePutTest()
    }

    
    /**
     * Delete Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdDeleteTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdDelete(binderId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdDeleteTest()
    }

    
    /**
     * Update Binder Document Binding Rule
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdDocumentsNodeIdBindingRulePutTest() {
        // given
        String binderId = "example";
        String nodeId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId, nodeId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdDocumentsNodeIdBindingRulePutTest()
    }

    
    /**
     * Add Document to Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdDocumentsPostTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdDocumentsPost(binderId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdDocumentsPostTest()
    }

    
    /**
     * Remove Document from Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdDocumentsSectionIdDeleteTest() {
        // given
        String binderId = "example";
        String sectionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdDocumentsSectionIdDelete(binderId, sectionId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdDocumentsSectionIdDeleteTest()
    }

    
    /**
     * Move Document in Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdDocumentsSectionIdPutTest() {
        // given
        String binderId = "example";
        String sectionId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdDocumentsSectionIdPut(binderId, sectionId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdDocumentsSectionIdPutTest()
    }

    
    /**
     * Retrieve Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdGetTest() {
        // given
        String binderId = "example";
        String depth = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdGet(binderId, depth, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdGetTest()
    }

    
    /**
     * Create Binder Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdPostTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdPost(binderId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdPostTest()
    }

    
    /**
     * Update Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdPutTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdPut(binderId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdPutTest()
    }

    
    /**
     * Remove Users &amp; Groups from Roles on a Single Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteTest() {
        // given
        String binderId = "example";
        String roleNameAndUserOrGroup = "example";
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId, roleNameAndUserOrGroup, id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteTest()
    }

    
    /**
     * Update Binder Section Binding Rule
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdSectionsNodeIdBindingRulePutTest() {
        // given
        String binderId = "example";
        String nodeId = "example";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId, nodeId, contentType, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdSectionsNodeIdBindingRulePutTest()
    }

    
    /**
     * Update Binder Section
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdSectionsNodeIdPutTest() {
        // given
        String binderId = "example";
        String nodeId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdSectionsNodeIdPut(binderId, nodeId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdSectionsNodeIdPutTest()
    }

    
    /**
     * Create Binder Section
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdSectionsPostTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdSectionsPost(binderId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdSectionsPostTest()
    }

    
    /**
     * Delete Binder Section
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdSectionsSectionIdDeleteTest() {
        // given
        String binderId = "example";
        String sectionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdSectionsSectionIdDelete(binderId, sectionId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdSectionsSectionIdDeleteTest()
    }

    
    /**
     * Retrieve Binder Sections
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdSectionsSectionIdGetTest() {
        // given
        String binderId = "example";
        String sectionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdSectionsSectionIdGet(binderId, sectionId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdSectionsSectionIdGetTest()
    }

    
    /**
     * Retrieve All Binder Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsGetTest() {
        // given
        String binderId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsGet(binderId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsGetTest()
    }

    
    /**
     * Export Binder (Specific Version)
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        Boolean source = true;
        String renditiontype = "viewable_rendition__v";
        String docversion = "major";
        String attachments = "all";
        String export = "name__v,title__v,document_number__v";
        Boolean docfield = false;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId, majorVersion, minorVersion, source, renditiontype, docversion, attachments, export, docfield, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostTest()
    }

    
    /**
     * Delete Binder Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteTest()
    }

    
    /**
     * Retrieve Binder Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionGetTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionGetTest()
    }

    
    /**
     * Update Binder Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionPutTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId, majorVersion, minorVersion, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionPutTest()
    }

    
    /**
     * Create Binder Relationship
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId, majorVersion, minorVersion, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostTest()
    }

    
    /**
     * Delete Binder Relationship
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String relationshipId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId, majorVersion, minorVersion, relationshipId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteTest()
    }

    
    /**
     * Retrieve Binder Relationship
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String relationshipId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId, majorVersion, minorVersion, relationshipId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetTest()
    }

    
    /**
     * Retrieve Binder Version Section
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetTest() {
        // given
        String binderId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String sectionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId, majorVersion, minorVersion, sectionId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetTest()
    }

    
    /**
     * Retrieve All Binder Roles
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersIdRolesGetTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersIdRolesGet(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersIdRolesGetTest()
    }

    
    /**
     * Assign Users &amp; Groups to Roles on a Single Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersIdRolesPostTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersIdRolesPost(id, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersIdRolesPostTest()
    }

    
    /**
     * Retrieve Document Role
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersIdRolesRoleNameGetTest() {
        // given
        String id = "example";
        String roleName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersIdRolesRoleNameGet(id, roleName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersIdRolesRoleNameGetTest()
    }

    
    /**
     * Retrieve Binder User Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetTest() {
        // given
        String id = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetTest()
    }

    
    /**
     * Retrieve Binder Entry Criteria
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetTest() {
        // given
        String id = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String nameV = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetTest()
    }

    
    /**
     * Initiate Binder User Action
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutTest() {
        // given
        String id = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String nameV = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutTest()
    }

    
    /**
     * Retrieve User Actions on Multiple Binders
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersLifecycleActionsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersLifecycleActionsPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersLifecycleActionsPostTest()
    }

    
    /**
     * Initiate Bulk Binder User Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersLifecycleActionsUserActionNamePutTest() {
        // given
        String userActionName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersLifecycleActionsUserActionNamePut(userActionName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersLifecycleActionsUserActionNamePutTest()
    }

    
    /**
     * Create Binder
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersPostTest() {
        // given
        Boolean async = true;
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersPost(async, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersPostTest()
    }

    
    /**
     * Retrieve Binder Template Collection
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesGetTest()
    }

    
    /**
     * Create Binder Template
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesPostTest()
    }

    
    /**
     * Update Binder Template
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesPutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesPut(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesPutTest()
    }

    
    /**
     * Retrieve Binder Template Node Attributes
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesTemplateNameBindernodesGetTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesTemplateNameBindernodesGet(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesTemplateNameBindernodesGetTest()
    }

    
    /**
     * Create Binder Template Node
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesTemplateNameBindernodesPostTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesTemplateNameBindernodesPost(templateName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesTemplateNameBindernodesPostTest()
    }

    
    /**
     * Replace Binder Template Nodes
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesTemplateNameBindernodesPutTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesTemplateNameBindernodesPut(templateName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesTemplateNameBindernodesPutTest()
    }

    
    /**
     * Delete Binder Template
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesTemplateNameDeleteTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesTemplateNameDelete(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesTemplateNameDeleteTest()
    }

    
    /**
     * Retrieve Binder Template Attributes
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsBindersTemplatesTemplateNameGetTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsBindersTemplatesTemplateNameGet(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsBindersTemplatesTemplateNameGetTest()
    }

    
    /**
     * Retrieve Deleted Document IDs
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDeletionsDocumentsGetTest() {
        // given
        String startDate = "example";
        String endDate = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDeletionsDocumentsGet(startDate, endDate, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDeletionsDocumentsGetTest()
    }

    
    /**
     * Retrieve Deleted Object Record ID
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDeletionsVobjectsObjectNameGetTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDeletionsVobjectsObjectNameGet(objectName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDeletionsVobjectsObjectNameGetTest()
    }

    
    /**
     * Retrieve All Document Workflows
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsActionsGetTest() {
        // given
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsActionsGet(loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsActionsGetTest()
    }

    
    /**
     * Download Controlled Copy Job Results
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetTest() {
        // given
        String lifecycleAndStateAndAction = "example";
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction, jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetTest()
    }

    
    /**
     * Retrieve Document Workflow Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsActionsWorkflowNameGetTest() {
        // given
        String workflowName = "example";
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsActionsWorkflowNameGet(workflowName, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsActionsWorkflowNameGetTest()
    }

    
    /**
     * Initiate Document Workflow
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsActionsWorkflowNamePostTest() {
        // given
        String workflowName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsActionsWorkflowNamePost(workflowName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsActionsWorkflowNamePostTest()
    }

    
    /**
     * Delete Annotations
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAnnotationsBatchDeleteTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAnnotationsBatchDelete(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAnnotationsBatchDeleteTest()
    }

    
    /**
     * Create Multiple Annotations
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAnnotationsBatchPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAnnotationsBatchPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAnnotationsBatchPostTest()
    }

    
    /**
     * Update Annotations
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAnnotationsBatchPutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAnnotationsBatchPut(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAnnotationsBatchPutTest()
    }

    
    /**
     * Add Annotation Replies
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAnnotationsRepliesBatchPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAnnotationsRepliesBatchPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAnnotationsRepliesBatchPostTest()
    }

    
    /**
     * Delete Multiple Document Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAttachmentsBatchDeleteTest() {
        // given
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAttachmentsBatchDelete(accept, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAttachmentsBatchDeleteTest()
    }

    
    /**
     * Create Multiple Document Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAttachmentsBatchPostTest() {
        // given
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAttachmentsBatchPost(accept, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAttachmentsBatchPostTest()
    }

    
    /**
     * Update Multiple Document Attachment Descriptions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsAttachmentsBatchPutTest() {
        // given
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsAttachmentsBatchPut(accept, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsAttachmentsBatchPutTest()
    }

    
    /**
     * Retrieve Document Export Results
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchActionsFileextractJobIdResultsGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchActionsFileextractJobIdResultsGetTest()
    }

    
    /**
     * Export Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchActionsFileextractPostTest() {
        // given
        Boolean source = true;
        Boolean renditions = false;
        Boolean allversions = true;
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchActionsFileextractPost(source, renditions, allversions, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchActionsFileextractPostTest()
    }

    
    /**
     * Reclassify Multiple Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchActionsReclassifyPutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "text/csv";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchActionsReclassifyPut(_authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchActionsReclassifyPutTest()
    }

    
    /**
     * Update Multiple Document Renditions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchActionsRerenderPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchActionsRerenderPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchActionsRerenderPostTest()
    }

    
    /**
     * Delete Multiple Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchDeleteTest() {
        // given
        String idParam = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchDelete(idParam, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchDeleteTest()
    }

    
    /**
     * Undo Collaborative Authoring Checkout
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchLockDeleteTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchLockDelete(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchLockDeleteTest()
    }

    
    /**
     * Create Multiple Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchPost(_authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchPostTest()
    }

    
    /**
     * Update Multiple Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsBatchPutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsBatchPut(_authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsBatchPutTest()
    }

    
    /**
     * Retrieve Anchor IDs
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAnchorsGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAnchorsGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAnchorsGetTest()
    }

    
    /**
     * Export Document Annotations to PDF
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAnnotationsFileGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAnnotationsFileGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAnnotationsFileGetTest()
    }

    
    /**
     * Import Document Annotations from PDF
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAnnotationsFilePostTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAnnotationsFilePost(docId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAnnotationsFilePostTest()
    }

    
    /**
     * Delete Single Document Attachment
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdDeleteTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId, attachmentId, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdDeleteTest()
    }

    
    /**
     * Download Document Attachment
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdFileGetTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId, attachmentId, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdFileGetTest()
    }

    
    /**
     * Retrieve Document Attachment Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdGetTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId, attachmentId, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdGetTest()
    }

    
    /**
     * Update Document Attachment Description
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdPutTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId, attachmentId, accept, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdPutTest()
    }

    
    /**
     * Delete Single Document Attachment Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId, attachmentId, attachmentVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteTest()
    }

    
    /**
     * Download Document Attachment Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, attachmentId, attachmentVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest()
    }

    
    /**
     * Retrieve Document Attachment Version Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, attachmentId, attachmentVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetTest()
    }

    
    /**
     * Restore Document Attachment Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        Boolean restore = true;
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId, attachmentId, attachmentVersion, restore, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostTest()
    }

    
    /**
     * Retrieve Document Attachment Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetTest() {
        // given
        String docId = "example";
        String attachmentId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId, attachmentId, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetTest()
    }

    
    /**
     * Download All Document Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsFileGetTest() {
        // given
        String docId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsFileGet(docId, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsFileGetTest()
    }

    
    /**
     * Retrieve Document Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsGetTest() {
        // given
        String docId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsGet(docId, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsGetTest()
    }

    
    /**
     * Create Document Attachment
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAttachmentsPostTest() {
        // given
        String docId = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAttachmentsPost(docId, accept, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAttachmentsPostTest()
    }

    
    /**
     * Retrieve Complete Audit History for a Single Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdAudittrailGetTest() {
        // given
        String docId = "example";
        String startDate = "example";
        String endDate = "example";
        String formatResult = "example";
        String limit = "example";
        String offset = "example";
        String events = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdAudittrailGet(docId, startDate, endDate, formatResult, limit, offset, events, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdAudittrailGetTest()
    }

    
    /**
     * Delete Single Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdDeleteTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdDelete(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdDeleteTest()
    }

    
    /**
     * Retrieve Document Events
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdEventsGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdEventsGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdEventsGetTest()
    }

    
    /**
     * Download Document File
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdFileGetTest() {
        // given
        String docId = "example";
        Boolean lockDocument = false;
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdFileGet(docId, lockDocument, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdFileGetTest()
    }

    
    /**
     * Retrieve Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdGetTest()
    }

    
    /**
     * Delete Document Lock
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdLockDeleteTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdLockDelete(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdLockDeleteTest()
    }

    
    /**
     * Retrieve Document Lock
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdLockGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdLockGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdLockGetTest()
    }

    
    /**
     * Create Document Lock
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdLockPostTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdLockPost(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdLockPostTest()
    }

    
    /**
     * Download All Document Version Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId, majorVersion, minorVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetTest()
    }

    
    /**
     * Create Single Document Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdPostTest() {
        // given
        String docId = "example";
        String suppressRendition = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "multipart/form-data";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdPost(docId, suppressRendition, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdPostTest()
    }

    
    /**
     * Update Single Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdPutTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdPut(docId, _authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdPutTest()
    }

    
    /**
     * Retrieve Document Renditions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdRenditionsGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdRenditionsGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdRenditionsGetTest()
    }

    
    /**
     * Delete Single Document Rendition
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdRenditionsRenditionTypeDeleteTest() {
        // given
        String docId = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId, renditionType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdRenditionsRenditionTypeDeleteTest()
    }

    
    /**
     * Download Document Rendition File
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdRenditionsRenditionTypeGetTest() {
        // given
        String docId = "example";
        String renditionType = "example";
        String steadyState = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdRenditionsRenditionTypeGet(docId, renditionType, steadyState, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdRenditionsRenditionTypeGetTest()
    }

    
    /**
     * Add Single Document Rendition
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdRenditionsRenditionTypePostTest() {
        // given
        String docId = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdRenditionsRenditionTypePost(docId, renditionType, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdRenditionsRenditionTypePostTest()
    }

    
    /**
     * Replace Document Rendition
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdRenditionsRenditionTypePutTest() {
        // given
        String docId = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdRenditionsRenditionTypePut(docId, renditionType, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdRenditionsRenditionTypePutTest()
    }

    
    /**
     * Remove Users &amp; Groups from Roles on a Single Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteTest() {
        // given
        String docId = "example";
        String roleNameAndUserOrGroup = "example";
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId, roleNameAndUserOrGroup, id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteTest()
    }

    
    /**
     * Retrieve Document Version Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId, majorVersion, minorVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetTest()
    }

    
    /**
     * Retrieve Document Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsGetTest() {
        // given
        String docId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsGet(docId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsGetTest()
    }

    
    /**
     * Read Annotations by ID
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String annotationId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId, majorVersion, minorVersion, annotationId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetTest()
    }

    
    /**
     * Read Replies of Parent Annotation
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String annotationId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId, majorVersion, minorVersion, annotationId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetTest()
    }

    
    /**
     * Export Document Version Annotations to PDF
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetTest()
    }

    
    /**
     * Import Document Version Annotations from PDF
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId, majorVersion, minorVersion, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostTest()
    }

    
    /**
     * Read Annotations by Document Version and Type
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String limit = "example";
        String offset = "example";
        String annotationTypes = "example";
        String paginationId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId, majorVersion, minorVersion, limit, offset, annotationTypes, paginationId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetTest()
    }

    
    /**
     * Download Document Version Attachment Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest()
    }

    
    /**
     * Retrieve Document Version Attachment Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetTest()
    }

    
    /**
     * Delete Single Document Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteTest()
    }

    
    /**
     * Retrieve Document Version Notes as CSV
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetTest()
    }

    
    /**
     * Create Document Event
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId, majorVersion, minorVersion, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostTest()
    }

    
    /**
     * Retrieve Video Annotations
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetTest()
    }

    
    /**
     * Download Document Version File
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId, majorVersion, minorVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetTest()
    }

    
    /**
     * Retrieve Document Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetTest()
    }

    
    /**
     * Update Document Version
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId, majorVersion, minorVersion, _authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutTest()
    }

    
    /**
     * Retrieve Document Relationships
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetTest()
    }

    
    /**
     * Create Single Document Relationship
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId, majorVersion, minorVersion, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostTest()
    }

    
    /**
     * Delete Single Document Relationship
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String relationshipId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId, majorVersion, minorVersion, relationshipId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteTest()
    }

    
    /**
     * Retrieve Document Relationship
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String relationshipId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId, majorVersion, minorVersion, relationshipId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetTest()
    }

    
    /**
     * Retrieve Document Version Renditions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetTest()
    }

    
    /**
     * Delete Document Version Rendition
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId, majorVersion, minorVersion, renditionType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteTest()
    }

    
    /**
     * Download Document Version Rendition File
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId, majorVersion, minorVersion, renditionType, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetTest()
    }

    
    /**
     * Upload Document Version Rendition
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId, majorVersion, minorVersion, renditionType, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostTest()
    }

    
    /**
     * Replace Document Version Rendition
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String renditionType = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId, majorVersion, minorVersion, renditionType, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutTest()
    }

    
    /**
     * Download Document Version Thumbnail File
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetTest() {
        // given
        String docId = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId, majorVersion, minorVersion, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetTest()
    }

    
    /**
     * Retrieve All Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsGetTest() {
        // given
        String namedFilter = "My Documents";
        String scope = "contents";
        String versionscope = "all";
        String search = "{keyword}";
        String limit = "example";
        String sort = "example";
        String start = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsGet(namedFilter, scope, versionscope, search, limit, sort, start, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsGetTest()
    }

    
    /**
     * Retrieve All Document Roles
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsIdRolesGetTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsIdRolesGet(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsIdRolesGetTest()
    }

    
    /**
     * Assign Users &amp; Groups to Roles on a Single Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsIdRolesPostTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsIdRolesPost(id, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsIdRolesPostTest()
    }

    
    /**
     * Retrieve Document Role
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsIdRolesRoleNameGetTest() {
        // given
        String id = "example";
        String roleName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsIdRolesRoleNameGet(id, roleName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsIdRolesRoleNameGetTest()
    }

    
    /**
     * Retrieve Document User Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetTest() {
        // given
        String id = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetTest()
    }

    
    /**
     * Retrieve Document Entry Criteria
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetTest() {
        // given
        String id = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String nameV = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetTest()
    }

    
    /**
     * Initiate Document User Action
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutTest() {
        // given
        String id = "example";
        String majorVersion = "example";
        String minorVersion = "example";
        String nameV = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutTest()
    }

    
    /**
     * Retrieve User Actions on Multiple Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsLifecycleActionsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsLifecycleActionsPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsLifecycleActionsPostTest()
    }

    
    /**
     * Initiate Bulk Document User Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsLifecycleActionsUserActionNamePutTest() {
        // given
        String userActionName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsLifecycleActionsUserActionNamePut(userActionName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsLifecycleActionsUserActionNamePutTest()
    }

    
    /**
     * Create Single Document
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsPost(_authorization, accept, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsPostTest()
    }

    
    /**
     * Delete Multiple Document Relationships
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsRelationshipsBatchDeleteTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsRelationshipsBatchDelete(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsRelationshipsBatchDeleteTest()
    }

    
    /**
     * Create Multiple Document Relationships
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsRelationshipsBatchPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsRelationshipsBatchPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsRelationshipsBatchPostTest()
    }

    
    /**
     * Delete Multiple Document Renditions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsRenditionsBatchDeleteTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsRenditionsBatchDelete(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsRenditionsBatchDeleteTest()
    }

    
    /**
     * Add Multiple Document Renditions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsRenditionsBatchPostTest() {
        // given
        String idParam = "example";
        String largeSizeAsset = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        Boolean xVaultAPIMigrationMode = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsRenditionsBatchPost(idParam, largeSizeAsset, _authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsRenditionsBatchPostTest()
    }

    
    /**
     * Remove Users and Groups from Roles on Multiple Documents &amp; Binders
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsRolesBatchDeleteTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsRolesBatchDelete(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsRolesBatchDeleteTest()
    }

    
    /**
     * Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsRolesBatchPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsRolesBatchPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsRolesBatchPostTest()
    }

    
    /**
     * Retrieve Document Template Collection
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesGetTest()
    }

    
    /**
     * Create Single Document Template
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "multipart/form-data";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesPostTest()
    }

    
    /**
     * Update Multiple Document Templates
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesPutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesPut(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesPutTest()
    }

    
    /**
     * Delete Basic Document Template
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesTemplateNameDeleteTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesTemplateNameDelete(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesTemplateNameDeleteTest()
    }

    
    /**
     * Download Document Template File
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesTemplateNameFileGetTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesTemplateNameFileGet(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesTemplateNameFileGetTest()
    }

    
    /**
     * Retrieve Document Template Attributes
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesTemplateNameGetTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesTemplateNameGet(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesTemplateNameGetTest()
    }

    
    /**
     * Update Single Document Template
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTemplatesTemplateNamePutTest() {
        // given
        String templateName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTemplatesTemplateNamePut(templateName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTemplatesTemplateNamePutTest()
    }

    
    /**
     * Document Tokens
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsTokensPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsTokensPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsTokensPostTest()
    }

    
    /**
     * Export Document Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsVersionsBatchActionsFileextractPostTest() {
        // given
        Boolean source = true;
        Boolean renditions = false;
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsVersionsBatchActionsFileextractPost(source, renditions, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsVersionsBatchActionsFileextractPostTest()
    }

    
    /**
     * Delete Multiple Document Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsVersionsBatchDeleteTest() {
        // given
        String idParam = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsVersionsBatchDelete(idParam, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsVersionsBatchDeleteTest()
    }

    
    /**
     * Create Multiple Document Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDocumentsVersionsBatchPostTest() {
        // given
        String idParam = "external_id__v";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIMigrationMode = "example";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDocumentsVersionsBatchPost(idParam, _authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDocumentsVersionsBatchPostTest()
    }

    
    /**
     * Retrieve Domain Information
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDomainGetTest() {
        // given
        Boolean includeApplication = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDomainGet(includeApplication, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDomainGetTest()
    }

    
    /**
     * Retrieve Domains
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsDomainsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsDomainsGet(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsDomainsGetTest()
    }

    
    /**
     * Add EDL Matched Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsEdlMatchedDocumentsBatchActionsAddPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsEdlMatchedDocumentsBatchActionsAddPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsEdlMatchedDocumentsBatchActionsAddPostTest()
    }

    
    /**
     * Remove EDL Matched Documents
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsEdlMatchedDocumentsBatchActionsRemovePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsEdlMatchedDocumentsBatchActionsRemovePost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsEdlMatchedDocumentsBatchActionsRemovePostTest()
    }

    
    /**
     * Retrieve Auto Managed Groups
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsGroupsAutoGetTest() {
        // given
        String limit = "example";
        String offset = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsGroupsAutoGet(limit, offset, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsGroupsAutoGetTest()
    }

    
    /**
     * Retrieve All Groups
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsGroupsGetTest() {
        // given
        String includeImplied = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsGroupsGet(includeImplied, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsGroupsGetTest()
    }

    
    /**
     * Delete Group
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsGroupsGroupIdDeleteTest() {
        // given
        String groupId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsGroupsGroupIdDelete(groupId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsGroupsGroupIdDeleteTest()
    }

    
    /**
     * Retrieve Group
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsGroupsGroupIdGetTest() {
        // given
        String groupId = "example";
        Boolean includeImplied = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsGroupsGroupIdGet(groupId, includeImplied, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsGroupsGroupIdGetTest()
    }

    
    /**
     * Update Group
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsGroupsGroupIdPutTest() {
        // given
        String groupId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsGroupsGroupIdPut(groupId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsGroupsGroupIdPutTest()
    }

    
    /**
     * Create Group 
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsGroupsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsGroupsPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsGroupsPostTest()
    }

    
    /**
     * Retrieve Application License Usage
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsLicensesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsLicensesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsLicensesGetTest()
    }

    
    /**
     * Retrieve All Multi-Record Workflows
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsActionsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsActionsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsActionsGetTest()
    }

    
    /**
     * Retrieve Multi-Record Workflow Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsActionsWorkflowNameGetTest() {
        // given
        String workflowName = "example";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsActionsWorkflowNameGet(workflowName, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsActionsWorkflowNameGetTest()
    }

    
    /**
     * Initiate Multi-Record Workflow
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsActionsWorkflowNamePostTest() {
        // given
        String workflowName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsActionsWorkflowNamePost(workflowName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsActionsWorkflowNamePostTest()
    }

    
    /**
     * Retrieve Workflows
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsGetTest() {
        // given
        String objectV = "example";
        String recordIdV = "example";
        String participant = "example";
        String statusV = "example";
        String offset = "example";
        String pageSize = "example";
        String loc = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsGet(objectV, recordIdV, participant, statusV, offset, pageSize, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsGetTest()
    }

    
    /**
     * Retrieve Workflow Tasks
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksGetTest() {
        // given
        String objectV = "example";
        String recordIdV = "example";
        String assigneeV = "example";
        String statusV = "example";
        String offset = "example";
        String pageSize = "example";
        String loc = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksGet(objectV, recordIdV, assigneeV, statusV, offset, pageSize, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksGetTest()
    }

    
    /**
     * Accept Single Record Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsAcceptPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsAcceptPostTest()
    }

    
    /**
     * Cancel Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsCancelPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsCancelPostTest()
    }

    
    /**
     * Complete Single Record Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsCompletePostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsCompletePostTest()
    }

    
    /**
     * Retrieve Workflow Task Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsGetTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsGet(taskId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsGetTest()
    }

    
    /**
     * Accept Multi-item Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostTest()
    }

    
    /**
     * Complete Multi-item Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostTest()
    }

    
    /**
     * Manage Multi-Item Workflow Content
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostTest()
    }

    
    /**
     * Reassign Multi-item Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostTest()
    }

    
    /**
     * Reassign Single Record Workflow Task
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsReassignPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsReassignPostTest()
    }

    
    /**
     * Retrieve Workflow Task Action Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsTaskActionGetTest() {
        // given
        String taskId = "example";
        String taskAction = "example";
        String loc = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId, taskAction, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsTaskActionGetTest()
    }

    
    /**
     * Undo Workflow Task Acceptance
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostTest()
    }

    
    /**
     * Update Workflow Task Due Date
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostTest() {
        // given
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostTest()
    }

    
    /**
     * Retrieve Workflow Task Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsTasksTaskIdGetTest() {
        // given
        String taskId = "example";
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsTasksTaskIdGet(taskId, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsTasksTaskIdGetTest()
    }

    
    /**
     * Retrieve Workflow Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsWorkflowIdActionsGetTest() {
        // given
        String workflowId = "example";
        String loc = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsWorkflowIdActionsGet(workflowId, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsWorkflowIdActionsGetTest()
    }

    
    /**
     * Retrieve Workflow Action Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetTest() {
        // given
        String workflowId = "example";
        String workflowAction = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId, workflowAction, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetTest()
    }

    
    /**
     * Initiate Workflow Action
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostTest() {
        // given
        String workflowId = "example";
        String workflowAction = "example";
        String documentsSys = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId, workflowAction, documentsSys, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostTest()
    }

    
    /**
     * Retrieve Workflow Details
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsObjectworkflowsWorkflowIdGetTest() {
        // given
        String workflowId = "example";
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsObjectworkflowsWorkflowIdGet(workflowId, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsObjectworkflowsWorkflowIdGetTest()
    }

    
    /**
     * Retrieve All Picklists
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsPicklistsGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsPicklistsGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsPicklistsGetTest()
    }

    
    /**
     * Retrieve Picklist Values
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsPicklistsPicklistNameGetTest() {
        // given
        String picklistName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsPicklistsPicklistNameGet(picklistName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsPicklistsPicklistNameGetTest()
    }

    
    /**
     * Inactivate Picklist Value
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsPicklistsPicklistNamePicklistValueNameDeleteTest() {
        // given
        String picklistName = "example";
        String picklistValueName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName, picklistValueName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsPicklistsPicklistNamePicklistValueNameDeleteTest()
    }

    
    /**
     * Update Picklist Value
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsPicklistsPicklistNamePicklistValueNamePutTest() {
        // given
        String picklistName = "example";
        String picklistValueName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsPicklistsPicklistNamePicklistValueNamePut(picklistName, picklistValueName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsPicklistsPicklistNamePicklistValueNamePutTest()
    }

    
    /**
     * Create Picklist Values
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsPicklistsPicklistNamePostTest() {
        // given
        String picklistName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsPicklistsPicklistNamePost(picklistName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsPicklistsPicklistNamePostTest()
    }

    
    /**
     * Update Picklist Value Label
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsPicklistsPicklistNamePutTest() {
        // given
        String picklistName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsPicklistsPicklistNamePut(picklistName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsPicklistsPicklistNamePutTest()
    }

    
    /**
     * Build Production Vault
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxActionsBuildproductionPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxActionsBuildproductionPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxActionsBuildproductionPostTest()
    }

    
    /**
     * Promote to Production
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxActionsPromoteproductionPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxActionsPromoteproductionPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxActionsPromoteproductionPostTest()
    }

    
    /**
     * Recheck Sandbox Usage Limit
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxActionsRecheckusagePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxActionsRecheckusagePost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxActionsRecheckusagePostTest()
    }

    
    /**
     * Change Sandbox Size
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxBatchChangesizePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxBatchChangesizePost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxBatchChangesizePostTest()
    }

    
    /**
     * Set Sandbox Entitlements
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxEntitlementsSetPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxEntitlementsSetPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxEntitlementsSetPostTest()
    }

    
    /**
     * Retrieve Sandboxes
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxGetTest()
    }

    
    /**
     * Delete Sandbox
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxNameDeleteTest() {
        // given
        String name = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxNameDelete(name, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxNameDeleteTest()
    }

    
    /**
     * Create or Refresh Sandbox
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxPostTest()
    }

    
    /**
     * Update Sandbox Snapshot
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxSnapshotApiNameActionsUpdatePostTest() {
        // given
        String apiName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxSnapshotApiNameActionsUpdatePost(apiName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxSnapshotApiNameActionsUpdatePostTest()
    }

    
    /**
     * Upgrade Sandbox Snapshot
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxSnapshotApiNameActionsUpgradePostTest() {
        // given
        String apiName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxSnapshotApiNameActionsUpgradePost(apiName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxSnapshotApiNameActionsUpgradePostTest()
    }

    
    /**
     * Delete Sandbox Snapshot
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxSnapshotApiNameDeleteTest() {
        // given
        String apiName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxSnapshotApiNameDelete(apiName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxSnapshotApiNameDeleteTest()
    }

    
    /**
     * Retrieve Sandbox Snapshots
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxSnapshotGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxSnapshotGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxSnapshotGetTest()
    }

    
    /**
     * Create Sandbox Snapshot
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxSnapshotPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxSnapshotPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxSnapshotPostTest()
    }

    
    /**
     * Refresh Sandbox from Snapshot
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxVaultIdActionsRefreshPostTest() {
        // given
        String vaultId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxVaultIdActionsRefreshPost(vaultId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxVaultIdActionsRefreshPostTest()
    }

    
    /**
     * Retrieve Sandbox Details by ID
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSandboxVaultIdGetTest() {
        // given
        String vaultId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSandboxVaultIdGet(vaultId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSandboxVaultIdGetTest()
    }

    
    /**
     * Retrieve All Security Policies
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSecuritypoliciesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSecuritypoliciesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSecuritypoliciesGetTest()
    }

    
    /**
     * Retrieve Security Policy
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsSecuritypoliciesSecurityPolicyNameGetTest() {
        // given
        String securityPolicyName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsSecuritypoliciesSecurityPolicyNameGetTest()
    }

    
    /**
     * Retrieve All Users
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersGetTest() {
        // given
        String vaults = "all";
        String excludeVaultMembership = "example";
        String excludeAppLicensing = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersGet(vaults, excludeVaultMembership, excludeAppLicensing, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersGetTest()
    }

    
    /**
     * Retrieve User
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersIdGetTest() {
        // given
        String id = "example";
        String excludeVaultMembership = "example";
        String excludeAppLicensing = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersIdGet(id, excludeVaultMembership, excludeAppLicensing, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersIdGetTest()
    }

    
    /**
     * Retrieve User Permissions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersIdPermissionsGetTest() {
        // given
        String id = "example";
        String filter = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersIdPermissionsGet(id, filter, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersIdPermissionsGetTest()
    }

    
    /**
     * Update Single User
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersIdPutTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersIdPut(id, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersIdPutTest()
    }

    
    /**
     * Validate Session User
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersMeGetTest() {
        // given
        String excludeVaultMembership = "example";
        String excludeAppLicensing = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersMeGet(excludeVaultMembership, excludeAppLicensing, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersMeGetTest()
    }

    
    /**
     * Change My Password
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersMePasswordPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersMePasswordPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersMePasswordPostTest()
    }

    
    /**
     * Retrieve My User Permissions
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersMePermissionsGetTest() {
        // given
        String filter = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersMePermissionsGet(filter, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersMePermissionsGetTest()
    }

    
    /**
     * Update My User
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersMePutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersMePut(_authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersMePutTest()
    }

    
    /**
     * Create Single User
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersPostTest()
    }

    
    /**
     * Update Multiple Users
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersPutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersPut(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersPutTest()
    }

    
    /**
     * Disable User
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersUserIdDeleteTest() {
        // given
        String userId = "example";
        Boolean domain = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersUserIdDelete(userId, domain, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersUserIdDeleteTest()
    }

    
    /**
     * Update Vault Membership
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsUsersUserIdVaultMembershipVaultIdPutTest() {
        // given
        String userId = "example";
        String vaultId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsUsersUserIdVaultMembershipVaultIdPut(userId, vaultId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsUsersUserIdVaultMembershipVaultIdPutTest()
    }

    
    /**
     * Vault Compare
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsVaultActionsComparePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsVaultActionsComparePost(_authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsVaultActionsComparePostTest()
    }

    
    /**
     * Vault Configuration Report
     */
    @Test
    @Disabled("Not Implemented")
    public void objectsVaultActionsConfigreportPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.objectsVaultActionsConfigreportPost(_authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the objectsVaultActionsConfigreportPostTest()
    }

    
    /**
     * Component Definition Query
     */
    @Test
    @Disabled("Not Implemented")
    public void queryComponentsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.queryComponentsPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the queryComponentsPostTest()
    }

    
    /**
     * Next Page URL
     */
    @Test
    @Disabled("Not Implemented")
    public void queryNextPagePostTest() {
        // given
        String nextPage = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        Boolean xVaultAPIDescribeQuery = true;
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.queryNextPagePost(nextPage, _authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the queryNextPagePostTest()
    }

    
    /**
     * Submitting a Query
     */
    @Test
    @Disabled("Not Implemented")
    public void queryPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        Boolean xVaultAPIDescribeQuery = true;
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.queryPost(_authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the queryPostTest()
    }

    
    /**
     * Previous Page URL
     */
    @Test
    @Disabled("Not Implemented")
    public void queryPreviousPagePostTest() {
        // given
        String previousPage = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        Boolean xVaultAPIDescribeQuery = true;
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.queryPreviousPagePost(previousPage, _authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the queryPreviousPagePostTest()
    }

    
    /**
     * Retrieve Current User with SCIM
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2MeGetTest() {
        // given
        String attributes = "example";
        String excludedAttributes = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2MeGet(attributes, excludedAttributes, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2MeGetTest()
    }

    
    /**
     * Update Current User with SCIM
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2MePutTest() {
        // given
        String attributes = "example";
        String excludedAttributes = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String contentType = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2MePut(attributes, excludedAttributes, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2MePutTest()
    }

    
    /**
     * Retrieve All SCIM Resource Types
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2ResourceTypesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2ResourceTypesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2ResourceTypesGetTest()
    }

    
    /**
     * Retrieve Single SCIM Resource Type
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2ResourceTypesTypeGetTest() {
        // given
        String type = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2ResourceTypesTypeGet(type, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2ResourceTypesTypeGetTest()
    }

    
    /**
     * Retrieve All SCIM Schema Information
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2SchemasGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2SchemasGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2SchemasGetTest()
    }

    
    /**
     * Retrieve Single SCIM Schema Information
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2SchemasIdGetTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2SchemasIdGet(id, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2SchemasIdGetTest()
    }

    
    /**
     * Retrieve SCIM Provider
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2ServiceProviderConfigGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2ServiceProviderConfigGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2ServiceProviderConfigGetTest()
    }

    
    /**
     * Retrieve SCIM Resources
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2TypeGetTest() {
        // given
        String type = "example";
        String filter = "example";
        String attributes = "example";
        String excludedAttributes = "example";
        String sortBy = "example";
        String sortOrder = "example";
        String startIndex = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2TypeGet(type, filter, attributes, excludedAttributes, sortBy, sortOrder, startIndex, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2TypeGetTest()
    }

    
    /**
     * Retrieve Single SCIM Resource
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2TypeIdGetTest() {
        // given
        String type = "example";
        String id = "example";
        String attributes = "example";
        String excludedAttributes = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2TypeIdGet(type, id, attributes, excludedAttributes, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2TypeIdGetTest()
    }

    
    /**
     * Retrieve All Users with SCIM
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2UsersGetTest() {
        // given
        String filter = "example";
        String attributes = "example";
        String excludedAttributes = "example";
        String sortBy = "example";
        String sortOrder = "example";
        String count = "example";
        String startIndex = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2UsersGet(filter, attributes, excludedAttributes, sortBy, sortOrder, count, startIndex, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2UsersGetTest()
    }

    
    /**
     * Retrieve Single User with SCIM
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2UsersIdGetTest() {
        // given
        String id = "example";
        String filter = "example";
        String attributes = "example";
        String excludedAttributes = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2UsersIdGet(id, filter, attributes, excludedAttributes, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2UsersIdGetTest()
    }

    
    /**
     * Update User with SCIM
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2UsersIdPutTest() {
        // given
        String id = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String contentType = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2UsersIdPut(id, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2UsersIdPutTest()
    }

    
    /**
     * Create User with SCIM
     */
    @Test
    @Disabled("Not Implemented")
    public void scimV2UsersPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/scim+json";
        String contentType = "application/scim+json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.scimV2UsersPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the scimV2UsersPostTest()
    }

    
    /**
     * Retrieve Signing Certificate
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesCertificateCertIdGetTest() {
        // given
        String certId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesCertificateCertIdGet(certId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesCertificateCertIdGetTest()
    }

    
    /**
     * Disable Configuration Mode
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesConfigurationModeActionsDisablePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "example";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesConfigurationModeActionsDisablePost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesConfigurationModeActionsDisablePostTest()
    }

    
    /**
     * Enable Configuration Mode
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesConfigurationModeActionsEnablePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "example";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesConfigurationModeActionsEnablePost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesConfigurationModeActionsEnablePostTest()
    }

    
    /**
     * Retrieve Available Direct Data Files
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesDirectdataFilesGetTest() {
        // given
        String extractType = "incremental_directdata";
        Integer startTime = 2023-12-07T00:00Z;
        Integer stopTime = 2023-12-08T00:00Z;
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesDirectdataFilesGet(extractType, startTime, stopTime, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesDirectdataFilesGetTest()
    }

    
    /**
     * Download Direct Data File
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesDirectdataFilesNameGetTest() {
        // given
        String name = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesDirectdataFilesNameGet(name, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesDirectdataFilesNameGetTest()
    }

    
    /**
     * Download Item Content
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingItemsContentItemGetTest() {
        // given
        String item = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String range = "example";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingItemsContentItemGet(item, _authorization, accept, range, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingItemsContentItemGetTest()
    }

    
    /**
     * Delete File or Folder
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingItemsItemDeleteTest() {
        // given
        String item = "example";
        String recursive = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingItemsItemDelete(item, recursive, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingItemsItemDeleteTest()
    }

    
    /**
     * List Items at a Path
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingItemsItemGetTest() {
        // given
        String item = "example";
        String recursive = "example";
        String limit = "example";
        String formatResult = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingItemsItemGet(item, recursive, limit, formatResult, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingItemsItemGetTest()
    }

    
    /**
     * Update Folder or File
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingItemsItemPutTest() {
        // given
        String item = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingItemsItemPut(item, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingItemsItemPutTest()
    }

    
    /**
     * Create Folder or File
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingItemsPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentMD5 = "example";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingItemsPost(_authorization, accept, contentMD5, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingItemsPostTest()
    }

    
    /**
     * List Upload Sessions
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadGetTest()
    }

    
    /**
     * Create Resumable Upload Session
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadPost(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadPostTest()
    }

    
    /**
     * Abort Upload Session
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadUploadSessionIdDeleteTest() {
        // given
        String uploadSessionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadUploadSessionIdDeleteTest()
    }

    
    /**
     * Get Upload Session Details
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadUploadSessionIdGetTest() {
        // given
        String uploadSessionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadUploadSessionIdGet(uploadSessionId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadUploadSessionIdGetTest()
    }

    
    /**
     * List File Parts Uploaded to Session
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadUploadSessionIdPartsGetTest() {
        // given
        String uploadSessionId = "example";
        String limit = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId, limit, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadUploadSessionIdPartsGetTest()
    }

    
    /**
     * Commit Upload Session
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadUploadSessionIdPostTest() {
        // given
        String uploadSessionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadUploadSessionIdPost(uploadSessionId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadUploadSessionIdPostTest()
    }

    
    /**
     * Upload to a Session
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesFileStagingUploadUploadSessionIdPutTest() {
        // given
        String uploadSessionId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/octet-stream";
        String xVaultAPIFilePartNumber = "example";
        String contentMD5 = "example";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesFileStagingUploadUploadSessionIdPut(uploadSessionId, _authorization, accept, contentType, xVaultAPIFilePartNumber, contentMD5, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesFileStagingUploadUploadSessionIdPutTest()
    }

    
    /**
     * Retrieve Job Histories
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsHistoriesGetTest() {
        // given
        String startDate = "example";
        String endDate = "example";
        String status = "example";
        String limit = "example";
        String offset = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsHistoriesGet(startDate, endDate, status, limit, offset, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsHistoriesGetTest()
    }

    
    /**
     * Retrieve Import Bulk Translation File Job Errors
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsJobIdErrorsGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsJobIdErrorsGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsJobIdErrorsGetTest()
    }

    
    /**
     * Retrieve Job Status
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsJobIdGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsJobIdGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsJobIdGetTest()
    }

    
    /**
     * Retrieve Import Bulk Translation File Job Summary
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsJobIdSummaryGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsJobIdSummaryGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsJobIdSummaryGetTest()
    }

    
    /**
     * Retrieve SDK Job Tasks
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsJobIdTasksGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsJobIdTasksGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsJobIdTasksGetTest()
    }

    
    /**
     * Retrieve Job Monitors
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsMonitorsGetTest() {
        // given
        String startDate = "example";
        String endDate = "example";
        String status = "example";
        String limit = "example";
        String offset = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsMonitorsGet(startDate, endDate, status, limit, offset, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsMonitorsGetTest()
    }

    
    /**
     * Start Job
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesJobsStartNowJobIdPostTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesJobsStartNowJobIdPost(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesJobsStartNowJobIdPostTest()
    }

    
    /**
     * Extract Data Files
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesLoaderExtractPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesLoaderExtractPost(_authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesLoaderExtractPostTest()
    }

    
    /**
     * Retrieve Load Failure Log Results
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesLoaderJobIdTasksTaskIdFailurelogGetTest() {
        // given
        String jobId = "example";
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId, taskId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesLoaderJobIdTasksTaskIdFailurelogGetTest()
    }

    
    /**
     * Retrieve Loader Extract Results
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesLoaderJobIdTasksTaskIdResultsGetTest() {
        // given
        String jobId = "example";
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesLoaderJobIdTasksTaskIdResultsGet(jobId, taskId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesLoaderJobIdTasksTaskIdResultsGetTest()
    }

    
    /**
     * Retrieve Loader Extract Renditions Results
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesLoaderJobIdTasksTaskIdResultsRenditionsGetTest() {
        // given
        String jobId = "example";
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId, taskId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesLoaderJobIdTasksTaskIdResultsRenditionsGetTest()
    }

    
    /**
     * Retrieve Load Success Log Results
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesLoaderJobIdTasksTaskIdSuccesslogGetTest() {
        // given
        String jobId = "example";
        String taskId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId, taskId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesLoaderJobIdTasksTaskIdSuccesslogGetTest()
    }

    
    /**
     * Load Data Objects
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesLoaderLoadPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesLoaderLoadPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesLoaderLoadPostTest()
    }

    
    /**
     * Validate Package
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesPackageActionsValidatePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesPackageActionsValidatePost(_authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesPackageActionsValidatePostTest()
    }

    
    /**
     * Export Package
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesPackagePostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesPackagePost(_authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesPackagePostTest()
    }

    
    /**
     * Import Package
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesPackagePutTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "multipart/form-data";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesPackagePut(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesPackagePutTest()
    }

    
    /**
     * Retrieve All Queues
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesQueuesGetTest() {
        // given
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesQueuesGet(_authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesQueuesGetTest()
    }

    
    /**
     * Disable Delivery
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesQueuesQueueNameActionsDisableDeliveryPutTest() {
        // given
        String queueName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesQueuesQueueNameActionsDisableDeliveryPut(queueName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesQueuesQueueNameActionsDisableDeliveryPutTest()
    }

    
    /**
     * Enable Delivery
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesQueuesQueueNameActionsEnableDeliveryPutTest() {
        // given
        String queueName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesQueuesQueueNameActionsEnableDeliveryPut(queueName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesQueuesQueueNameActionsEnableDeliveryPutTest()
    }

    
    /**
     * Reset Queue
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesQueuesQueueNameActionsResetPutTest() {
        // given
        String queueName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesQueuesQueueNameActionsResetPut(queueName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesQueuesQueueNameActionsResetPutTest()
    }

    
    /**
     * Retrieve Queue Status
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesQueuesQueueNameGetTest() {
        // given
        String queueName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesQueuesQueueNameGet(queueName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesQueuesQueueNameGetTest()
    }

    
    /**
     * Validate Imported Package
     */
    @Test
    @Disabled("Not Implemented")
    public void servicesVobjectVaultPackageVPackageIdActionsValidatePostTest() {
        // given
        String packageId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the servicesVobjectVaultPackageVPackageIdActionsValidatePostTest()
    }

    
    /**
     * End Session
     */
    @Test
    @Disabled("Not Implemented")
    public void sessionDeleteTest() {
        // given
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.sessionDelete(accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the sessionDeleteTest()
    }

    
    /**
     * Download Single Client Code Distribution
     */
    @Test
    @Disabled("Not Implemented")
    public void uicodeDistributionsDistributionNameCodeGetTest() {
        // given
        String distributionName = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.uicodeDistributionsDistributionNameCodeGet(distributionName, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the uicodeDistributionsDistributionNameCodeGetTest()
    }

    
    /**
     * Delete Single Client Code Distribution
     */
    @Test
    @Disabled("Not Implemented")
    public void uicodeDistributionsDistributionNameDeleteTest() {
        // given
        String distributionName = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.uicodeDistributionsDistributionNameDelete(distributionName, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the uicodeDistributionsDistributionNameDeleteTest()
    }

    
    /**
     * Retrieve Single Client Code Distribution Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void uicodeDistributionsDistributionNameGetTest() {
        // given
        String distributionName = "example";
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.uicodeDistributionsDistributionNameGet(distributionName, accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the uicodeDistributionsDistributionNameGetTest()
    }

    
    /**
     * Retrieve All Client Code Distribution Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void uicodeDistributionsGetTest() {
        // given
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.uicodeDistributionsGet(accept, _authorization, xVaultAPIClientID).block();

        // then
        // TODO implement the uicodeDistributionsGetTest()
    }

    
    /**
     * Add or Replace Single Client Code Distribution
     */
    @Test
    @Disabled("Not Implemented")
    public void uicodeDistributionsPostTest() {
        // given
        String accept = "application/json";
        String _authorization = "{{sessionId}}";
        String contentType = "multipart/form-data";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.uicodeDistributionsPost(accept, _authorization, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the uicodeDistributionsPostTest()
    }

    
    /**
     * Deploy Package
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectVaultPackageVPackageIdActionsDeployPostTest() {
        // given
        String packageId = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectVaultPackageVPackageIdActionsDeployPost(packageId, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectVaultPackageVPackageIdActionsDeployPostTest()
    }

    
    /**
     * Retrieve Package Deploy Results
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectVaultPackageVPackageIdActionsDeployResultsGetTest() {
        // given
        String packageId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectVaultPackageVPackageIdActionsDeployResultsGetTest()
    }

    
    /**
     * Retrieve Results of Cascade Delete Job
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetTest() {
        // given
        String objectName = "example";
        String jobStatus = "example";
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetTest()
    }

    
    /**
     * Retrieve Results of Deep Copy Job
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetTest() {
        // given
        String objectName = "example";
        String jobStatus = "example";
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetTest()
    }

    
    /**
     * Create a Placeholder from an EDL Item
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsEdlItemVActionsCreateplaceholderPostTest() {
        // given
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsEdlItemVActionsCreateplaceholderPost(_authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsEdlItemVActionsCreateplaceholderPostTest()
    }

    
    /**
     * Download Merge Records Job Log
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsMergesJobIdLogGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsMergesJobIdLogGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsMergesJobIdLogGetTest()
    }

    
    /**
     * Retrieve Record Merge Results
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsMergesJobIdResultsGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsMergesJobIdResultsGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsMergesJobIdResultsGetTest()
    }

    
    /**
     * Retrieve Record Merge Status
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsMergesJobIdStatusGetTest() {
        // given
        String jobId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsMergesJobIdStatusGet(jobId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsMergesJobIdStatusGetTest()
    }

    
    /**
     * Initiate Object Action on Multiple Records
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameActionsActionNamePostTest() {
        // given
        String objectName = "example";
        String actionName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameActionsActionNamePost(objectName, actionName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameActionsActionNamePostTest()
    }

    
    /**
     * Change Object Type
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameActionsChangetypePostTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameActionsChangetypePost(objectName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameActionsChangetypePostTest()
    }

    
    /**
     * Initiate Record Merge
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameActionsMergePostTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/json";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";
        List<@Valid VobjectsObjectNameActionsMergePostRequestInner> vobjectsObjectNameActionsMergePostRequestInner = Arrays.asList();

        // when
        api.vobjectsObjectNameActionsMergePost(objectName, _authorization, contentType, accept, xVaultAPIClientID, vobjectsObjectNameActionsMergePostRequestInner).block();

        // then
        // TODO implement the vobjectsObjectNameActionsMergePostTest()
    }

    
    /**
     * Retrieve Roll-up Field Recalculation Status
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameActionsRecalculaterollupsGetTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameActionsRecalculaterollupsGet(objectName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameActionsRecalculaterollupsGetTest()
    }

    
    /**
     * Recalculate Roll-up Fields
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameActionsRecalculaterollupsPostTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameActionsRecalculaterollupsPost(objectName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameActionsRecalculaterollupsPostTest()
    }

    
    /**
     * Update Corporate Currency Fields
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameActionsUpdatecorporatecurrencyPutTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameActionsUpdatecorporatecurrencyPutTest()
    }

    
    /**
     * Delete Multiple Object Record Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameAttachmentsBatchDeleteTest() {
        // given
        String objectName = "example";
        String idParam = "If you’re identifying attachments in your input by external id, add idParam=external_id__v to the request endpoint.";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameAttachmentsBatchDelete(objectName, idParam, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameAttachmentsBatchDeleteTest()
    }

    
    /**
     * Create Multiple Object Record Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameAttachmentsBatchPostTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameAttachmentsBatchPost(objectName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameAttachmentsBatchPostTest()
    }

    
    /**
     * Update Multiple Object Record Attachment Descriptions
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameAttachmentsBatchPutTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameAttachmentsBatchPut(objectName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameAttachmentsBatchPutTest()
    }

    
    /**
     * Delete Object Records
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameDeleteTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameDelete(objectName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameDeleteTest()
    }

    
    /**
     * Retrieve Object Record Roles
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameIdRolesRoleNameGetTest() {
        // given
        String objectName = "example";
        String id = "example";
        String roleName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameIdRolesRoleNameGet(objectName, id, roleName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameIdRolesRoleNameGetTest()
    }

    
    /**
     * Retrieve Object User Actions Details
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdActionsActionNameGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String actionName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName, objectRecordId, actionName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdActionsActionNameGetTest()
    }

    
    /**
     * Initiate Object Action on a Single Record
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdActionsActionNamePostTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String actionName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "application/x-www-form-urlencoded";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName, objectRecordId, actionName, _authorization, contentType, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdActionsActionNamePostTest()
    }

    
    /**
     * Cascade Delete Object Record
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdActionsCascadedeletePostTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName, objectRecordId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdActionsCascadedeletePostTest()
    }

    
    /**
     * Deep Copy Object Record
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdActionsDeepcopyPostTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName, objectRecordId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdActionsDeepcopyPostTest()
    }

    
    /**
     * Retrieve Object Record User Actions
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdActionsGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        Boolean loc = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdActionsGet(objectName, objectRecordId, loc, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdActionsGetTest()
    }

    
    /**
     * Download Attachment Field File
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentFieldName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName, objectRecordId, attachmentFieldName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetTest()
    }

    
    /**
     * Update Attachment Field File
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentFieldName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName, objectRecordId, attachmentFieldName, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostTest()
    }

    
    /**
     * Download All Attachment Field Files
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName, objectRecordId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetTest()
    }

    
    /**
     * Delete Object Record Attachment
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName, objectRecordId, attachmentId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteTest()
    }

    
    /**
     * Retrieve Object Record Attachment Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName, objectRecordId, attachmentId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetTest()
    }

    
    /**
     * Update Object Record Attachment Description
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName, objectRecordId, attachmentId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutTest()
    }

    
    /**
     * Delete Object Record Attachment Version
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName, objectRecordId, attachmentId, attachmentVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteTest()
    }

    
    /**
     * Download Object Record Attachment File
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName, objectRecordId, attachmentId, attachmentVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest()
    }

    
    /**
     * Retrieve Object Record Attachment Version Metadata
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName, objectRecordId, attachmentId, attachmentVersion, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetTest()
    }

    
    /**
     * Restore Object Record Attachment Version
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String attachmentVersion = "example";
        Boolean restore = true;
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName, objectRecordId, attachmentId, attachmentVersion, restore, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostTest()
    }

    
    /**
     * Retrieve Object Record Attachment Versions
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String attachmentId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName, objectRecordId, attachmentId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetTest()
    }

    
    /**
     * Download All Object Record Attachment Files
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsFileGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName, objectRecordId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsFileGetTest()
    }

    
    /**
     * Retrieve Object Record Attachments
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName, objectRecordId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsGetTest()
    }

    
    /**
     * Create Object Record Attachment
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAttachmentsPostTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName, objectRecordId, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAttachmentsPostTest()
    }

    
    /**
     * Retrieve Complete Audit History for a Single Object Record
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdAudittrailGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String startDate = "example";
        String endDate = "example";
        String formatResult = "example";
        String limit = "example";
        String offset = "example";
        String events = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdAudittrailGet(objectName, objectRecordId, startDate, endDate, formatResult, limit, offset, events, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdAudittrailGetTest()
    }

    
    /**
     * Retrieve Object Record
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameObjectRecordIdGetTest() {
        // given
        String objectName = "example";
        String objectRecordId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameObjectRecordIdGet(objectName, objectRecordId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameObjectRecordIdGetTest()
    }

    
    /**
     * Create &amp; Upsert Object Records
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNamePostTest() {
        // given
        String objectName = "example";
        String idParam = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "application/json";
        Boolean xVaultAPIMigrationMode = true;
        Boolean xVaultAPINoTriggers = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNamePost(objectName, idParam, _authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNamePostTest()
    }

    
    /**
     * Update Object Records
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNamePutTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String contentType = "text/csv";
        String accept = "application/json";
        Boolean xVaultAPIMigrationMode = true;
        Boolean xVaultAPINoTriggers = true;
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNamePut(objectName, _authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNamePutTest()
    }

    
    /**
     * Remove Users &amp; Groups from Roles on Object Records
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameRolesDeleteTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameRolesDelete(objectName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameRolesDeleteTest()
    }

    
    /**
     * Assign Users &amp; Groups to Roles on Object Records
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsObjectNameRolesPostTest() {
        // given
        String objectName = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String contentType = "text/csv";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsObjectNameRolesPost(objectName, _authorization, accept, contentType, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsObjectNameRolesPostTest()
    }

    
    /**
     * Retrieve Outbound Package Dependencies
     */
    @Test
    @Disabled("Not Implemented")
    public void vobjectsOutboundPackageVPackageIdDependenciesGetTest() {
        // given
        String packageId = "example";
        String _authorization = "{{sessionId}}";
        String accept = "application/json";
        String xVaultAPIClientID = "{{clientId}}";

        // when
        api.vobjectsOutboundPackageVPackageIdDependenciesGet(packageId, _authorization, accept, xVaultAPIClientID).block();

        // then
        // TODO implement the vobjectsOutboundPackageVPackageIdDependenciesGetTest()
    }

    
}
