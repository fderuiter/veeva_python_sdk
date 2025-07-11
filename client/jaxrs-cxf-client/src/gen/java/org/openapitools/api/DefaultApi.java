package org.openapitools.api;

import org.openapitools.model.VobjectsObjectNameActionsMergePostRequestInner;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Veeva Vault API v25.1
 *
 * <p>The latest GA version of the Vault REST API.
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Retrieve API Versions
     *
     */
    @GET
    @Path("/api/")
    @ApiOperation(value = "Retrieve API Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Content File
     *
     */
    @GET
    @Path("/api/mdl/components/{component_type_and_record_name}/files")
    @ApiOperation(value = "Retrieve Content File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiMdlComponentsComponentTypeAndRecordNameFilesGet(@PathParam("component_type_and_record_name") String componentTypeAndRecordName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Component Record (MDL)
     *
     */
    @GET
    @Path("/api/mdl/components/{component_type_and_record_name}")
    @ApiOperation(value = "Retrieve Component Record (MDL)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiMdlComponentsComponentTypeAndRecordNameGet(@PathParam("component_type_and_record_name") String componentTypeAndRecordName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Asynchronous MDL Script Results
     *
     */
    @GET
    @Path("/api/mdl/execute_async/{job_id}/results")
    @ApiOperation(value = "Retrieve Asynchronous MDL Script Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiMdlExecuteAsyncJobIdResultsGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Execute MDL Script Asynchronously
     *
     */
    @POST
    @Path("/api/mdl/execute_async")
    @ApiOperation(value = "Execute MDL Script Asynchronously", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiMdlExecuteAsyncPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Execute MDL Script
     *
     */
    @POST
    @Path("/api/mdl/execute")
    @ApiOperation(value = "Execute MDL Script", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiMdlExecutePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Upload Content File
     *
     */
    @POST
    @Path("/api/mdl/files")
    @ApiOperation(value = "Upload Content File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void apiMdlFilesPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Audit Details
     *
     */
    @GET
    @Path("/audittrail/{audit_trail_type}")
    @ApiOperation(value = "Retrieve Audit Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void audittrailAuditTrailTypeGet(@PathParam("audit_trail_type") String auditTrailType, @QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("all_dates") String allDates, @QueryParam("format_result") String formatResult, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @QueryParam("objects") String objects, @QueryParam("events") String events, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Authentication Type Discovery
     *
     */
    @POST
    @Path("/auth/discovery")
    @ApiOperation(value = "Authentication Type Discovery", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void authDiscoveryPost(@HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * OAuth 2.0 / OpenID Connect
     *
     */
    @POST
    @Path("/auth/oauth/session/{oath_oidc_profile_id}")
    @ApiOperation(value = "OAuth 2.0 / OpenID Connect", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void authOauthSessionOathOidcProfileIdPost(@PathParam("oath_oidc_profile_id") String oathOidcProfileId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * User Name and Password
     *
     */
    @POST
    @Path("/auth")
    @ApiOperation(value = "User Name and Password", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void authPost(@HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Source Code File
     *
     */
    @DELETE
    @Path("/code/{class_name}")
    @ApiOperation(value = "Delete Single Source Code File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeClassNameDelete(@PathParam("class_name") String className, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Disable Vault Extension
     *
     */
    @PUT
    @Path("/code/{class_name}/disable")
    @ApiOperation(value = "Disable Vault Extension", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeClassNameDisablePut(@PathParam("class_name") String className, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Enable Vault Extension
     *
     */
    @PUT
    @Path("/code/{class_name}/enable")
    @ApiOperation(value = "Enable Vault Extension", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeClassNameEnablePut(@PathParam("class_name") String className, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single Source Code File
     *
     */
    @GET
    @Path("/code/{class_name}")
    @ApiOperation(value = "Retrieve Single Source Code File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeClassNameGet(@PathParam("class_name") String className, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Profiling Sessions
     *
     */
    @GET
    @Path("/code/profiler")
    @ApiOperation(value = "Retrieve All Profiling Sessions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeProfilerGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Profiling Session
     *
     */
    @POST
    @Path("/code/profiler")
    @ApiOperation(value = "Create Profiling Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeProfilerPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * End Profiling Session
     *
     */
    @POST
    @Path("/code/profiler/{session_name}/actions/end")
    @ApiOperation(value = "End Profiling Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeProfilerSessionNameActionsEndPost(@PathParam("session_name") String sessionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Profiling Session
     *
     */
    @DELETE
    @Path("/code/profiler/{session_name}")
    @ApiOperation(value = "Delete Profiling Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeProfilerSessionNameDelete(@PathParam("session_name") String sessionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Profiling Session
     *
     */
    @GET
    @Path("/code/profiler/{session_name}")
    @ApiOperation(value = "Retrieve Profiling Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeProfilerSessionNameGet(@PathParam("session_name") String sessionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Profiling Session Results
     *
     */
    @GET
    @Path("/code/profiler/{session_name}/results")
    @ApiOperation(value = "Download Profiling Session Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codeProfilerSessionNameResultsGet(@PathParam("session_name") String sessionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add or Replace Single Source Code File
     *
     */
    @PUT
    @Path("/code")
    @ApiOperation(value = "Add or Replace Single Source Code File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void codePut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Specific Root Nodes
     *
     */
    @POST
    @Path("/composites/trees/{edl_hierarchy_or_template}/actions/listnodes")
    @ApiOperation(value = "Retrieve Specific Root Nodes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(@PathParam("edl_hierarchy_or_template") String edlHierarchyOrTemplate, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Root Nodes
     *
     */
    @GET
    @Path("/composites/trees/{edl_hierarchy_or_template}")
    @ApiOperation(value = "Retrieve All Root Nodes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void compositesTreesEdlHierarchyOrTemplateGet(@PathParam("edl_hierarchy_or_template") String edlHierarchyOrTemplate, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve a Node&#39;s Children
     *
     */
    @GET
    @Path("/composites/trees/edl_hierarchy__v/{parent_node_id}/children")
    @ApiOperation(value = "Retrieve a Node's Children", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void compositesTreesEdlHierarchyVParentNodeIdChildrenGet(@PathParam("parent_node_id") String parentNodeId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Node Order
     *
     */
    @PUT
    @Path("/composites/trees/edl_hierarchy__v/{parent_node_id}/children")
    @ApiOperation(value = "Update Node Order", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void compositesTreesEdlHierarchyVParentNodeIdChildrenPut(@PathParam("parent_node_id") String parentNodeId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Component Record (XML/JSON)
     *
     */
    @GET
    @Path("/configuration/{component_type_and_record_name}")
    @ApiOperation(value = "Retrieve Component Record (XML/JSON)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationComponentTypeAndRecordNameGet(@PathParam("component_type_and_record_name") String componentTypeAndRecordName, @QueryParam("loc") String loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Component Record Collection
     *
     */
    @GET
    @Path("/configuration/{component_type}")
    @ApiOperation(value = "Retrieve Component Record Collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationComponentTypeGet(@PathParam("component_type") String componentType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Details from a Specific Object
     *
     */
    @GET
    @Path("/configuration/{object_name_and_object_type}")
    @ApiOperation(value = "Retrieve Details from a Specific Object", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationObjectNameAndObjectTypeGet(@PathParam("object_name_and_object_type") String objectNameAndObjectType, @QueryParam("loc") String loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Details from All Object Types
     *
     */
    @GET
    @Path("/configuration/Objecttype")
    @ApiOperation(value = "Retrieve Details from All Object Types", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationObjecttypeGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Lifecycle Role Assignment Override Rules
     *
     */
    @DELETE
    @Path("/configuration/role_assignment_rule")
    @ApiOperation(value = "Delete Lifecycle Role Assignment Override Rules", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationRoleAssignmentRuleDelete(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
     *
     */
    @GET
    @Path("/configuration/role_assignment_rule")
    @ApiOperation(value = "Retrieve Lifecycle Role Assignment Rules (Default & Override)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationRoleAssignmentRuleGet(@QueryParam("lifecycle__v") String lifecycleV, @QueryParam("role__v") String roleV, @QueryParam("product__v") String productV, @QueryParam("country__v") String countryV, @QueryParam("study__v") String studyV, @QueryParam("study_country__v") String studyCountryV, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Lifecycle Role Assignment Override Rules
     *
     */
    @POST
    @Path("/configuration/role_assignment_rule")
    @ApiOperation(value = "Create Lifecycle Role Assignment Override Rules", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationRoleAssignmentRulePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Lifecycle Role Assignment Rules (Default &amp; Override)
     *
     */
    @PUT
    @Path("/configuration/role_assignment_rule")
    @ApiOperation(value = "Update Lifecycle Role Assignment Rules (Default & Override)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void configurationRoleAssignmentRulePut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Delegated Session
     *
     */
    @POST
    @Path("/delegation/login")
    @ApiOperation(value = "Initiate Delegated Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void delegationLoginPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Delegations
     *
     */
    @GET
    @Path("/delegation/vaults")
    @ApiOperation(value = "Retrieve Delegations", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void delegationVaultsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Session Keep Alive
     *
     */
    @POST
    @Path("/keep-alive")
    @ApiOperation(value = "Session Keep Alive", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void keepAlivePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Limits on Objects
     *
     */
    @GET
    @Path("/limits")
    @ApiOperation(value = "Retrieve Limits on Objects", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void limitsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Daily API Usage
     *
     */
    @GET
    @Path("/logs/api_usage")
    @ApiOperation(value = "Download Daily API Usage", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsApiUsageGet(@QueryParam("date") String date, @QueryParam("log_format") String logFormat, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Debug Logs
     *
     */
    @GET
    @Path("/logs/code/debug")
    @ApiOperation(value = "Retrieve All Debug Logs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeDebugGet(@QueryParam("user_id") String userId, @QueryParam("include_inactive") Boolean includeInactive, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Debug Log
     *
     */
    @DELETE
    @Path("/logs/code/debug/{id}/actions/reset")
    @ApiOperation(value = "Delete Debug Log", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeDebugIdActionsResetDelete(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Reset Debug Log
     *
     */
    @POST
    @Path("/logs/code/debug/{id}/actions/reset")
    @ApiOperation(value = "Reset Debug Log", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeDebugIdActionsResetPost(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Debug Log Files
     *
     */
    @GET
    @Path("/logs/code/debug/{id}/files")
    @ApiOperation(value = "Download Debug Log Files", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeDebugIdFilesGet(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single Debug Log
     *
     */
    @GET
    @Path("/logs/code/debug/{id}")
    @ApiOperation(value = "Retrieve Single Debug Log", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeDebugIdGet(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Debug Log
     *
     */
    @POST
    @Path("/logs/code/debug")
    @ApiOperation(value = "Create Debug Log", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeDebugPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download SDK Runtime Log
     *
     */
    @GET
    @Path("/logs/code/runtime")
    @ApiOperation(value = "Download SDK Runtime Log", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void logsCodeRuntimeGet(@QueryParam("date") String date, @QueryParam("log_format") String logFormat, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Import Bulk Translation File
     *
     */
    @POST
    @Path("/messages/{message_type}/actions/import")
    @ApiOperation(value = "Import Bulk Translation File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void messagesMessageTypeActionsImportPost(@PathParam("message_type") String messageType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Bulk Translation File
     *
     */
    @POST
    @Path("/messages/{message_type}/language/{lang}/actions/export")
    @ApiOperation(value = "Export Bulk Translation File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void messagesMessageTypeLanguageLangActionsExportPost(@PathParam("message_type") String messageType, @PathParam("lang") String lang, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Audit Metadata
     *
     */
    @GET
    @Path("/metadata/audittrail/{audit_trail_type}")
    @ApiOperation(value = "Retrieve Audit Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataAudittrailAuditTrailTypeGet(@PathParam("audit_trail_type") String auditTrailType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Audit Types
     *
     */
    @GET
    @Path("/metadata/audittrail")
    @ApiOperation(value = "Retrieve Audit Types", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataAudittrailGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Component Type Metadata
     *
     */
    @GET
    @Path("/metadata/components/{component_type}")
    @ApiOperation(value = "Retrieve Component Type Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataComponentsComponentTypeGet(@PathParam("component_type") String componentType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Component Metadata
     *
     */
    @GET
    @Path("/metadata/components")
    @ApiOperation(value = "Retrieve All Component Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataComponentsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Template Node Metadata
     *
     */
    @GET
    @Path("/metadata/objects/binders/templates/bindernodes")
    @ApiOperation(value = "Retrieve Binder Template Node Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsBindersTemplatesBindernodesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Template Metadata
     *
     */
    @GET
    @Path("/metadata/objects/binders/templates")
    @ApiOperation(value = "Retrieve Binder Template Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsBindersTemplatesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Annotation Placemark Type Metadata
     *
     */
    @GET
    @Path("/metadata/objects/documents/annotations/placemarks/types/{placemark_type}")
    @ApiOperation(value = "Retrieve Annotation Placemark Type Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(@PathParam("placemark_type") String placemarkType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Annotation Reference Type Metadata
     *
     */
    @GET
    @Path("/metadata/objects/documents/annotations/references/types/{reference_type}")
    @ApiOperation(value = "Retrieve Annotation Reference Type Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(@PathParam("reference_type") String referenceType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Annotation Type Metadata
     *
     */
    @GET
    @Path("/metadata/objects/documents/annotations/types/{annotation_type}")
    @ApiOperation(value = "Retrieve Annotation Type Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(@PathParam("annotation_type") String annotationType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Event SubType Metadata
     *
     */
    @GET
    @Path("/metadata/objects/documents/events/{event_type}/types/{event_subtype}")
    @ApiOperation(value = "Retrieve Document Event SubType Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(@PathParam("event_type") String eventType, @PathParam("event_subtype") String eventSubtype, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Event Types and Subtypes
     *
     */
    @GET
    @Path("/metadata/objects/documents/events")
    @ApiOperation(value = "Retrieve Document Event Types and Subtypes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsEventsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Lock Metadata
     *
     */
    @GET
    @Path("/metadata/objects/documents/lock")
    @ApiOperation(value = "Retrieve Document Lock Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsLockGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Common Document Fields
     *
     */
    @POST
    @Path("/metadata/objects/documents/properties/find_common")
    @ApiOperation(value = "Retrieve Common Document Fields", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsPropertiesFindCommonPost(@HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Document Fields
     *
     */
    @GET
    @Path("/metadata/objects/documents/properties")
    @ApiOperation(value = "Retrieve All Document Fields", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsPropertiesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Template Metadata
     *
     */
    @GET
    @Path("/metadata/objects/documents/templates")
    @ApiOperation(value = "Retrieve Document Template Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsTemplatesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Document Types
     *
     */
    @GET
    @Path("/metadata/objects/documents/types")
    @ApiOperation(value = "Retrieve All Document Types", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsTypesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Type
     *
     */
    @GET
    @Path("/metadata/objects/documents/types/{type}")
    @ApiOperation(value = "Retrieve Document Type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsTypesTypeGet(@PathParam("type") String type, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Type Relationships
     *
     */
    @GET
    @Path("/metadata/objects/documents/types/{type}/relationships")
    @ApiOperation(value = "Retrieve Document Type Relationships", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsTypesTypeRelationshipsGet(@PathParam("type") String type, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Classification
     *
     */
    @GET
    @Path("/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}")
    @ApiOperation(value = "Retrieve Document Classification", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(@PathParam("type") String type, @PathParam("subtype") String subtype, @PathParam("classification") String classification, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Subtype
     *
     */
    @GET
    @Path("/metadata/objects/documents/types/{type}/subtypes/{subtype}")
    @ApiOperation(value = "Retrieve Document Subtype", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(@PathParam("type") String type, @PathParam("subtype") String subtype, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Group Metadata
     *
     */
    @GET
    @Path("/metadata/objects/groups")
    @ApiOperation(value = "Retrieve Group Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsGroupsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Security Policy Metadata
     *
     */
    @GET
    @Path("/metadata/objects/securitypolicies")
    @ApiOperation(value = "Retrieve Security Policy Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsSecuritypoliciesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve User Metadata
     *
     */
    @GET
    @Path("/metadata/objects/users")
    @ApiOperation(value = "Retrieve User Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataObjectsUsersGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Archived Document Signature Metadata
     *
     */
    @GET
    @Path("/metadata/query/archived_documents/relationships/document_signature__sysr")
    @ApiOperation(value = "Retrieve Archived Document Signature Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Signature Metadata
     *
     */
    @GET
    @Path("/metadata/query/documents/relationships/document_signature__sysr")
    @ApiOperation(value = "Retrieve Document Signature Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Collection
     *
     */
    @GET
    @Path("/metadata/vobjects")
    @ApiOperation(value = "Retrieve Object Collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataVobjectsGet(@QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Cancel Raw Object Deployment
     *
     */
    @POST
    @Path("/metadata/vobjects/{object_name}/actions/canceldeployment")
    @ApiOperation(value = "Cancel Raw Object Deployment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataVobjectsObjectNameActionsCanceldeploymentPost(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Field Metadata
     *
     */
    @GET
    @Path("/metadata/vobjects/{object_name}/fields/{object_field_name}")
    @ApiOperation(value = "Retrieve Object Field Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataVobjectsObjectNameFieldsObjectFieldNameGet(@PathParam("object_name") String objectName, @PathParam("object_field_name") String objectFieldName, @QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Metadata
     *
     */
    @GET
    @Path("/metadata/vobjects/{object_name}")
    @ApiOperation(value = "Retrieve Object Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataVobjectsObjectNameGet(@PathParam("object_name") String objectName, @QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Page Layouts
     *
     */
    @GET
    @Path("/metadata/vobjects/{object_name}/page_layouts")
    @ApiOperation(value = "Retrieve Page Layouts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataVobjectsObjectNamePageLayoutsGet(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Page Layout Metadata
     *
     */
    @GET
    @Path("/metadata/vobjects/{object_name}/page_layouts/{layout_name}")
    @ApiOperation(value = "Retrieve Page Layout Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void metadataVobjectsObjectNamePageLayoutsLayoutNameGet(@PathParam("object_name") String objectName, @PathParam("layout_name") String layoutName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Email Notification Histories
     *
     */
    @GET
    @Path("/notifications/histories")
    @ApiOperation(value = "Retrieve Email Notification Histories", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void notificationsHistoriesGet(@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("all_dates") Boolean allDates, @QueryParam("format_result") String formatResult, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Bulk Workflow Action Details
     *
     */
    @GET
    @Path("/object/workflow/actions/{action}")
    @ApiOperation(value = "Retrieve Bulk Workflow Action Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsActionGet(@PathParam("action") String action, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Workflow Actions on Multiple Workflows
     *
     */
    @POST
    @Path("/object/workflow/actions/{action}")
    @ApiOperation(value = "Initiate Workflow Actions on Multiple Workflows", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsActionPost(@PathParam("action") String action, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Cancel Workflow Tasks
     *
     */
    @POST
    @Path("/object/workflow/actions/canceltasks")
    @ApiOperation(value = "Cancel Workflow Tasks", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsCanceltasksPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Cancel Workflows
     *
     */
    @POST
    @Path("/object/workflow/actions/cancelworkflows")
    @ApiOperation(value = "Cancel Workflows", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsCancelworkflowsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Bulk Workflow Actions
     *
     */
    @GET
    @Path("/object/workflow/actions")
    @ApiOperation(value = "Retrieve Bulk Workflow Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Reassign Workflow Tasks
     *
     */
    @POST
    @Path("/object/workflow/actions/reassigntasks")
    @ApiOperation(value = "Reassign Workflow Tasks", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsReassigntasksPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Replace Workflow Owner
     *
     */
    @POST
    @Path("/object/workflow/actions/replaceworkflowowner")
    @ApiOperation(value = "Replace Workflow Owner", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectWorkflowActionsReplaceworkflowownerPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Export Results
     *
     */
    @GET
    @Path("/objects/binders/actions/export/{job_id}/results")
    @ApiOperation(value = "Retrieve Binder Export Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersActionsExportJobIdResultsGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Binder (Latest Version)
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}/actions/export")
    @ApiOperation(value = "Export Binder (Latest Version)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdActionsExportPost(@PathParam("binder_id") String binderId, @QueryParam("source") Boolean source, @QueryParam("renditiontype") String renditiontype, @QueryParam("docversion") String docversion, @QueryParam("attachments") String attachments, @QueryParam("export") String export, @QueryParam("docfield") Boolean docfield, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Refresh Binder Auto-Filing
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}/actions")
    @ApiOperation(value = "Refresh Binder Auto-Filing", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdActionsPost(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binding Rule
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}/binding_rule")
    @ApiOperation(value = "Update Binding Rule", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdBindingRulePut(@PathParam("binder_id") String binderId, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Binder
     *
     */
    @DELETE
    @Path("/objects/binders/{binder_id}")
    @ApiOperation(value = "Delete Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdDelete(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binder Document Binding Rule
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}/documents/{node_id}/binding_rule")
    @ApiOperation(value = "Update Binder Document Binding Rule", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdDocumentsNodeIdBindingRulePut(@PathParam("binder_id") String binderId, @PathParam("node_id") String nodeId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add Document to Binder
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}/documents")
    @ApiOperation(value = "Add Document to Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdDocumentsPost(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Remove Document from Binder
     *
     */
    @DELETE
    @Path("/objects/binders/{binder_id}/documents/{section_id}")
    @ApiOperation(value = "Remove Document from Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdDocumentsSectionIdDelete(@PathParam("binder_id") String binderId, @PathParam("section_id") String sectionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Move Document in Binder
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}/documents/{section_id}")
    @ApiOperation(value = "Move Document in Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdDocumentsSectionIdPut(@PathParam("binder_id") String binderId, @PathParam("section_id") String sectionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder
     *
     */
    @GET
    @Path("/objects/binders/{binder_id}")
    @ApiOperation(value = "Retrieve Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdGet(@PathParam("binder_id") String binderId, @QueryParam("depth") String depth, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Binder Version
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}")
    @ApiOperation(value = "Create Binder Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdPost(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binder
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}")
    @ApiOperation(value = "Update Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdPut(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Remove Users &amp; Groups from Roles on a Single Binder
     *
     */
    @DELETE
    @Path("/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}")
    @ApiOperation(value = "Remove Users & Groups from Roles on a Single Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(@PathParam("binder_id") String binderId, @PathParam("role_name_and_user_or_group") String roleNameAndUserOrGroup, @PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binder Section Binding Rule
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}/sections/{node_id}/binding_rule")
    @ApiOperation(value = "Update Binder Section Binding Rule", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdSectionsNodeIdBindingRulePut(@PathParam("binder_id") String binderId, @PathParam("node_id") String nodeId, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binder Section
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}/sections/{node_id}")
    @ApiOperation(value = "Update Binder Section", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdSectionsNodeIdPut(@PathParam("binder_id") String binderId, @PathParam("node_id") String nodeId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Binder Section
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}/sections")
    @ApiOperation(value = "Create Binder Section", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdSectionsPost(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Binder Section
     *
     */
    @DELETE
    @Path("/objects/binders/{binder_id}/sections/{section_id}")
    @ApiOperation(value = "Delete Binder Section", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdSectionsSectionIdDelete(@PathParam("binder_id") String binderId, @PathParam("section_id") String sectionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Sections
     *
     */
    @GET
    @Path("/objects/binders/{binder_id}/sections/{section_id}")
    @ApiOperation(value = "Retrieve Binder Sections", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdSectionsSectionIdGet(@PathParam("binder_id") String binderId, @PathParam("section_id") String sectionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Binder Versions
     *
     */
    @GET
    @Path("/objects/binders/{binder_id}/versions")
    @ApiOperation(value = "Retrieve All Binder Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsGet(@PathParam("binder_id") String binderId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Binder (Specific Version)
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export")
    @ApiOperation(value = "Export Binder (Specific Version)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @QueryParam("source") Boolean source, @QueryParam("renditiontype") String renditiontype, @QueryParam("docversion") String docversion, @QueryParam("attachments") String attachments, @QueryParam("export") String export, @QueryParam("docfield") Boolean docfield, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Binder Version
     *
     */
    @DELETE
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}")
    @ApiOperation(value = "Delete Binder Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Version
     *
     */
    @GET
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}")
    @ApiOperation(value = "Retrieve Binder Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binder Version
     *
     */
    @PUT
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}")
    @ApiOperation(value = "Update Binder Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Binder Relationship
     *
     */
    @POST
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships")
    @ApiOperation(value = "Create Binder Relationship", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Binder Relationship
     *
     */
    @DELETE
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}")
    @ApiOperation(value = "Delete Binder Relationship", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("relationship_id") String relationshipId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Relationship
     *
     */
    @GET
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}")
    @ApiOperation(value = "Retrieve Binder Relationship", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("relationship_id") String relationshipId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Version Section
     *
     */
    @GET
    @Path("/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}")
    @ApiOperation(value = "Retrieve Binder Version Section", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(@PathParam("binder_id") String binderId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("section_id") String sectionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Binder Roles
     *
     */
    @GET
    @Path("/objects/binders/{id}/roles")
    @ApiOperation(value = "Retrieve All Binder Roles", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersIdRolesGet(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Assign Users &amp; Groups to Roles on a Single Binder
     *
     */
    @POST
    @Path("/objects/binders/{id}/roles")
    @ApiOperation(value = "Assign Users & Groups to Roles on a Single Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersIdRolesPost(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Role
     *
     */
    @GET
    @Path("/objects/binders/{id}/roles/{role_name}")
    @ApiOperation(value = "Retrieve Document Role", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersIdRolesRoleNameGet(@PathParam("id") String id, @PathParam("role_name") String roleName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder User Actions
     *
     */
    @GET
    @Path("/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions")
    @ApiOperation(value = "Retrieve Binder User Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(@PathParam("id") String id, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Entry Criteria
     *
     */
    @GET
    @Path("/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements")
    @ApiOperation(value = "Retrieve Binder Entry Criteria", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(@PathParam("id") String id, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("name__v") String nameV, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Binder User Action
     *
     */
    @PUT
    @Path("/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}")
    @ApiOperation(value = "Initiate Binder User Action", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(@PathParam("id") String id, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("name__v") String nameV, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve User Actions on Multiple Binders
     *
     */
    @POST
    @Path("/objects/binders/lifecycle_actions")
    @ApiOperation(value = "Retrieve User Actions on Multiple Binders", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersLifecycleActionsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Bulk Binder User Actions
     *
     */
    @PUT
    @Path("/objects/binders/lifecycle_actions/{user_action_name}")
    @ApiOperation(value = "Initiate Bulk Binder User Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersLifecycleActionsUserActionNamePut(@PathParam("user_action_name") String userActionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Binder
     *
     */
    @POST
    @Path("/objects/binders")
    @ApiOperation(value = "Create Binder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersPost(@QueryParam("async") Boolean async, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Template Collection
     *
     */
    @GET
    @Path("/objects/binders/templates")
    @ApiOperation(value = "Retrieve Binder Template Collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Binder Template
     *
     */
    @POST
    @Path("/objects/binders/templates")
    @ApiOperation(value = "Create Binder Template", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Binder Template
     *
     */
    @PUT
    @Path("/objects/binders/templates")
    @ApiOperation(value = "Update Binder Template", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesPut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Template Node Attributes
     *
     */
    @GET
    @Path("/objects/binders/templates/{template_name}/bindernodes")
    @ApiOperation(value = "Retrieve Binder Template Node Attributes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesTemplateNameBindernodesGet(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Binder Template Node
     *
     */
    @POST
    @Path("/objects/binders/templates/{template_name}/bindernodes")
    @ApiOperation(value = "Create Binder Template Node", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesTemplateNameBindernodesPost(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Replace Binder Template Nodes
     *
     */
    @PUT
    @Path("/objects/binders/templates/{template_name}/bindernodes")
    @ApiOperation(value = "Replace Binder Template Nodes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesTemplateNameBindernodesPut(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Binder Template
     *
     */
    @DELETE
    @Path("/objects/binders/templates/{template_name}")
    @ApiOperation(value = "Delete Binder Template", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesTemplateNameDelete(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Binder Template Attributes
     *
     */
    @GET
    @Path("/objects/binders/templates/{template_name}")
    @ApiOperation(value = "Retrieve Binder Template Attributes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsBindersTemplatesTemplateNameGet(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Deleted Document IDs
     *
     */
    @GET
    @Path("/objects/deletions/documents")
    @ApiOperation(value = "Retrieve Deleted Document IDs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDeletionsDocumentsGet(@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Deleted Object Record ID
     *
     */
    @GET
    @Path("/objects/deletions/vobjects/{object_name}")
    @ApiOperation(value = "Retrieve Deleted Object Record ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDeletionsVobjectsObjectNameGet(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Document Workflows
     *
     */
    @GET
    @Path("/objects/documents/actions")
    @ApiOperation(value = "Retrieve All Document Workflows", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsActionsGet(@QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Controlled Copy Job Results
     *
     */
    @GET
    @Path("/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results")
    @ApiOperation(value = "Download Controlled Copy Job Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(@PathParam("lifecycle_and_state_and_action") String lifecycleAndStateAndAction, @PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Workflow Details
     *
     */
    @GET
    @Path("/objects/documents/actions/{workflow_name}")
    @ApiOperation(value = "Retrieve Document Workflow Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsActionsWorkflowNameGet(@PathParam("workflow_name") String workflowName, @QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Document Workflow
     *
     */
    @POST
    @Path("/objects/documents/actions/{workflow_name}")
    @ApiOperation(value = "Initiate Document Workflow", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsActionsWorkflowNamePost(@PathParam("workflow_name") String workflowName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Annotations
     *
     */
    @DELETE
    @Path("/objects/documents/annotations/batch")
    @ApiOperation(value = "Delete Annotations", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAnnotationsBatchDelete(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Multiple Annotations
     *
     */
    @POST
    @Path("/objects/documents/annotations/batch")
    @ApiOperation(value = "Create Multiple Annotations", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAnnotationsBatchPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Annotations
     *
     */
    @PUT
    @Path("/objects/documents/annotations/batch")
    @ApiOperation(value = "Update Annotations", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAnnotationsBatchPut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add Annotation Replies
     *
     */
    @POST
    @Path("/objects/documents/annotations/replies/batch")
    @ApiOperation(value = "Add Annotation Replies", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAnnotationsRepliesBatchPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Multiple Document Attachments
     *
     */
    @DELETE
    @Path("/objects/documents/attachments/batch")
    @ApiOperation(value = "Delete Multiple Document Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAttachmentsBatchDelete(@HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Multiple Document Attachments
     *
     */
    @POST
    @Path("/objects/documents/attachments/batch")
    @ApiOperation(value = "Create Multiple Document Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAttachmentsBatchPost(@HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Multiple Document Attachment Descriptions
     *
     */
    @PUT
    @Path("/objects/documents/attachments/batch")
    @ApiOperation(value = "Update Multiple Document Attachment Descriptions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsAttachmentsBatchPut(@HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Export Results
     *
     */
    @GET
    @Path("/objects/documents/batch/actions/fileextract/{job_id}/results")
    @ApiOperation(value = "Retrieve Document Export Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchActionsFileextractJobIdResultsGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Documents
     *
     */
    @POST
    @Path("/objects/documents/batch/actions/fileextract")
    @ApiOperation(value = "Export Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchActionsFileextractPost(@QueryParam("source") Boolean source, @QueryParam("renditions") Boolean renditions, @QueryParam("allversions") Boolean allversions, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Reclassify Multiple Documents
     *
     */
    @PUT
    @Path("/objects/documents/batch/actions/reclassify")
    @ApiOperation(value = "Reclassify Multiple Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchActionsReclassifyPut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Multiple Document Renditions
     *
     */
    @POST
    @Path("/objects/documents/batch/actions/rerender")
    @ApiOperation(value = "Update Multiple Document Renditions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchActionsRerenderPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Multiple Documents
     *
     */
    @DELETE
    @Path("/objects/documents/batch")
    @ApiOperation(value = "Delete Multiple Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchDelete(@QueryParam("idParam") String idParam, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Undo Collaborative Authoring Checkout
     *
     */
    @DELETE
    @Path("/objects/documents/batch/lock")
    @ApiOperation(value = "Undo Collaborative Authoring Checkout", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchLockDelete(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Multiple Documents
     *
     */
    @POST
    @Path("/objects/documents/batch")
    @ApiOperation(value = "Create Multiple Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Multiple Documents
     *
     */
    @PUT
    @Path("/objects/documents/batch")
    @ApiOperation(value = "Update Multiple Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsBatchPut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Anchor IDs
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/anchors")
    @ApiOperation(value = "Retrieve Anchor IDs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAnchorsGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Document Annotations to PDF
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/annotations/file")
    @ApiOperation(value = "Export Document Annotations to PDF", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAnnotationsFileGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Import Document Annotations from PDF
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/annotations/file")
    @ApiOperation(value = "Import Document Annotations from PDF", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAnnotationsFilePost(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Document Attachment
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}")
    @ApiOperation(value = "Delete Single Document Attachment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdDelete(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Attachment
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}/file")
    @ApiOperation(value = "Download Document Attachment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Attachment Metadata
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}")
    @ApiOperation(value = "Retrieve Document Attachment Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdGet(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Document Attachment Description
     *
     */
    @PUT
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}")
    @ApiOperation(value = "Update Document Attachment Description", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdPut(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Document Attachment Version
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Delete Single Document Attachment Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Attachment Version
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file")
    @ApiOperation(value = "Download Document Attachment Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Attachment Version Metadata
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Retrieve Document Attachment Version Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Restore Document Attachment Version
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Restore Document Attachment Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @QueryParam("restore") Boolean restore, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Attachment Versions
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments/{attachment_id}/versions")
    @ApiOperation(value = "Retrieve Document Attachment Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(@PathParam("doc_id") String docId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download All Document Attachments
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments/file")
    @ApiOperation(value = "Download All Document Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsFileGet(@PathParam("doc_id") String docId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Attachments
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/attachments")
    @ApiOperation(value = "Retrieve Document Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsGet(@PathParam("doc_id") String docId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Document Attachment
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/attachments")
    @ApiOperation(value = "Create Document Attachment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAttachmentsPost(@PathParam("doc_id") String docId, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Complete Audit History for a Single Document
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/audittrail")
    @ApiOperation(value = "Retrieve Complete Audit History for a Single Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdAudittrailGet(@PathParam("doc_id") String docId, @QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("format_result") String formatResult, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @QueryParam("events") String events, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Document
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}")
    @ApiOperation(value = "Delete Single Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdDelete(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Events
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/events")
    @ApiOperation(value = "Retrieve Document Events", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdEventsGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document File
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/file")
    @ApiOperation(value = "Download Document File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdFileGet(@PathParam("doc_id") String docId, @QueryParam("lockDocument") Boolean lockDocument, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}")
    @ApiOperation(value = "Retrieve Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Document Lock
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/lock")
    @ApiOperation(value = "Delete Document Lock", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdLockDelete(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Lock
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/lock")
    @ApiOperation(value = "Retrieve Document Lock", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdLockGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Document Lock
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/lock")
    @ApiOperation(value = "Create Document Lock", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdLockPost(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download All Document Version Attachments
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file")
    @ApiOperation(value = "Download All Document Version Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Single Document Version
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}")
    @ApiOperation(value = "Create Single Document Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdPost(@PathParam("doc_id") String docId, @QueryParam("suppressRendition") String suppressRendition, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Single Document
     *
     */
    @PUT
    @Path("/objects/documents/{doc_id}")
    @ApiOperation(value = "Update Single Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdPut(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Renditions
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/renditions")
    @ApiOperation(value = "Retrieve Document Renditions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdRenditionsGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Document Rendition
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/renditions/{rendition_type}")
    @ApiOperation(value = "Delete Single Document Rendition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdRenditionsRenditionTypeDelete(@PathParam("doc_id") String docId, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Rendition File
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/renditions/{rendition_type}")
    @ApiOperation(value = "Download Document Rendition File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdRenditionsRenditionTypeGet(@PathParam("doc_id") String docId, @PathParam("rendition_type") String renditionType, @QueryParam("steadyState") String steadyState, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add Single Document Rendition
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/renditions/{rendition_type}")
    @ApiOperation(value = "Add Single Document Rendition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdRenditionsRenditionTypePost(@PathParam("doc_id") String docId, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Replace Document Rendition
     *
     */
    @PUT
    @Path("/objects/documents/{doc_id}/renditions/{rendition_type}")
    @ApiOperation(value = "Replace Document Rendition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdRenditionsRenditionTypePut(@PathParam("doc_id") String docId, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Remove Users &amp; Groups from Roles on a Single Document
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}")
    @ApiOperation(value = "Remove Users & Groups from Roles on a Single Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(@PathParam("doc_id") String docId, @PathParam("role_name_and_user_or_group") String roleNameAndUserOrGroup, @PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Version Attachments
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments")
    @ApiOperation(value = "Retrieve Document Version Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Versions
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions")
    @ApiOperation(value = "Retrieve Document Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsGet(@PathParam("doc_id") String docId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Read Annotations by ID
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}")
    @ApiOperation(value = "Read Annotations by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("annotation_id") String annotationId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Read Replies of Parent Annotation
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies")
    @ApiOperation(value = "Read Replies of Parent Annotation", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("annotation_id") String annotationId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Document Version Annotations to PDF
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file")
    @ApiOperation(value = "Export Document Version Annotations to PDF", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Import Document Version Annotations from PDF
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file")
    @ApiOperation(value = "Import Document Version Annotations from PDF", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Read Annotations by Document Version and Type
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations")
    @ApiOperation(value = "Read Annotations by Document Version and Type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @QueryParam("annotation_types") String annotationTypes, @QueryParam("pagination_id") String paginationId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Version Attachment Version
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file")
    @ApiOperation(value = "Download Document Version Attachment Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Version Attachment Versions
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Retrieve Document Version Attachment Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Document Version
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}")
    @ApiOperation(value = "Delete Single Document Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Version Notes as CSV
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv")
    @ApiOperation(value = "Retrieve Document Version Notes as CSV", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Document Event
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events")
    @ApiOperation(value = "Create Document Event", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Video Annotations
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations")
    @ApiOperation(value = "Retrieve Video Annotations", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Version File
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file")
    @ApiOperation(value = "Download Document Version File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Version
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}")
    @ApiOperation(value = "Retrieve Document Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Document Version
     *
     */
    @PUT
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}")
    @ApiOperation(value = "Update Document Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Relationships
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships")
    @ApiOperation(value = "Retrieve Document Relationships", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Single Document Relationship
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships")
    @ApiOperation(value = "Create Single Document Relationship", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Document Relationship
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}")
    @ApiOperation(value = "Delete Single Document Relationship", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("relationship_id") String relationshipId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Relationship
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}")
    @ApiOperation(value = "Retrieve Document Relationship", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("relationship_id") String relationshipId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Version Renditions
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions")
    @ApiOperation(value = "Retrieve Document Version Renditions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Document Version Rendition
     *
     */
    @DELETE
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}")
    @ApiOperation(value = "Delete Document Version Rendition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Version Rendition File
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}")
    @ApiOperation(value = "Download Document Version Rendition File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Upload Document Version Rendition
     *
     */
    @POST
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}")
    @ApiOperation(value = "Upload Document Version Rendition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Replace Document Version Rendition
     *
     */
    @PUT
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}")
    @ApiOperation(value = "Replace Document Version Rendition", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("rendition_type") String renditionType, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Version Thumbnail File
     *
     */
    @GET
    @Path("/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail")
    @ApiOperation(value = "Download Document Version Thumbnail File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(@PathParam("doc_id") String docId, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Documents
     *
     */
    @GET
    @Path("/objects/documents")
    @ApiOperation(value = "Retrieve All Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsGet(@QueryParam("named_filter") String namedFilter, @QueryParam("scope") String scope, @QueryParam("versionscope") String versionscope, @QueryParam("search") String search, @QueryParam("limit") String limit, @QueryParam("sort") String sort, @QueryParam("start") String start, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Document Roles
     *
     */
    @GET
    @Path("/objects/documents/{id}/roles")
    @ApiOperation(value = "Retrieve All Document Roles", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsIdRolesGet(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Assign Users &amp; Groups to Roles on a Single Document
     *
     */
    @POST
    @Path("/objects/documents/{id}/roles")
    @ApiOperation(value = "Assign Users & Groups to Roles on a Single Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsIdRolesPost(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Role
     *
     */
    @GET
    @Path("/objects/documents/{id}/roles/{role_name}")
    @ApiOperation(value = "Retrieve Document Role", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsIdRolesRoleNameGet(@PathParam("id") String id, @PathParam("role_name") String roleName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document User Actions
     *
     */
    @GET
    @Path("/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions")
    @ApiOperation(value = "Retrieve Document User Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(@PathParam("id") String id, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Entry Criteria
     *
     */
    @GET
    @Path("/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements")
    @ApiOperation(value = "Retrieve Document Entry Criteria", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(@PathParam("id") String id, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("name__v") String nameV, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Document User Action
     *
     */
    @PUT
    @Path("/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}")
    @ApiOperation(value = "Initiate Document User Action", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(@PathParam("id") String id, @PathParam("major_version") String majorVersion, @PathParam("minor_version") String minorVersion, @PathParam("name__v") String nameV, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve User Actions on Multiple Documents
     *
     */
    @POST
    @Path("/objects/documents/lifecycle_actions")
    @ApiOperation(value = "Retrieve User Actions on Multiple Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsLifecycleActionsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Bulk Document User Actions
     *
     */
    @PUT
    @Path("/objects/documents/lifecycle_actions/{user_action_name}")
    @ApiOperation(value = "Initiate Bulk Document User Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsLifecycleActionsUserActionNamePut(@PathParam("user_action_name") String userActionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Single Document
     *
     */
    @POST
    @Path("/objects/documents")
    @ApiOperation(value = "Create Single Document", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Multiple Document Relationships
     *
     */
    @DELETE
    @Path("/objects/documents/relationships/batch")
    @ApiOperation(value = "Delete Multiple Document Relationships", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsRelationshipsBatchDelete(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Multiple Document Relationships
     *
     */
    @POST
    @Path("/objects/documents/relationships/batch")
    @ApiOperation(value = "Create Multiple Document Relationships", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsRelationshipsBatchPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Multiple Document Renditions
     *
     */
    @DELETE
    @Path("/objects/documents/renditions/batch")
    @ApiOperation(value = "Delete Multiple Document Renditions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsRenditionsBatchDelete(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add Multiple Document Renditions
     *
     */
    @POST
    @Path("/objects/documents/renditions/batch")
    @ApiOperation(value = "Add Multiple Document Renditions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsRenditionsBatchPost(@QueryParam("idParam") String idParam, @QueryParam("largeSizeAsset") String largeSizeAsset, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Remove Users and Groups from Roles on Multiple Documents &amp; Binders
     *
     */
    @DELETE
    @Path("/objects/documents/roles/batch")
    @ApiOperation(value = "Remove Users and Groups from Roles on Multiple Documents & Binders", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsRolesBatchDelete(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
     *
     */
    @POST
    @Path("/objects/documents/roles/batch")
    @ApiOperation(value = "Assign Users & Groups to Roles on Multiple Documents & Binders", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsRolesBatchPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Template Collection
     *
     */
    @GET
    @Path("/objects/documents/templates")
    @ApiOperation(value = "Retrieve Document Template Collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Single Document Template
     *
     */
    @POST
    @Path("/objects/documents/templates")
    @ApiOperation(value = "Create Single Document Template", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Multiple Document Templates
     *
     */
    @PUT
    @Path("/objects/documents/templates")
    @ApiOperation(value = "Update Multiple Document Templates", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesPut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Basic Document Template
     *
     */
    @DELETE
    @Path("/objects/documents/templates/{template_name}")
    @ApiOperation(value = "Delete Basic Document Template", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesTemplateNameDelete(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Document Template File
     *
     */
    @GET
    @Path("/objects/documents/templates/{template_name}/file")
    @ApiOperation(value = "Download Document Template File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesTemplateNameFileGet(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Document Template Attributes
     *
     */
    @GET
    @Path("/objects/documents/templates/{template_name}")
    @ApiOperation(value = "Retrieve Document Template Attributes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesTemplateNameGet(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Single Document Template
     *
     */
    @PUT
    @Path("/objects/documents/templates/{template_name}")
    @ApiOperation(value = "Update Single Document Template", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTemplatesTemplateNamePut(@PathParam("template_name") String templateName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Document Tokens
     *
     */
    @POST
    @Path("/objects/documents/tokens")
    @ApiOperation(value = "Document Tokens", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsTokensPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Document Versions
     *
     */
    @POST
    @Path("/objects/documents/versions/batch/actions/fileextract")
    @ApiOperation(value = "Export Document Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsVersionsBatchActionsFileextractPost(@QueryParam("source") Boolean source, @QueryParam("renditions") Boolean renditions, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Multiple Document Versions
     *
     */
    @DELETE
    @Path("/objects/documents/versions/batch")
    @ApiOperation(value = "Delete Multiple Document Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsVersionsBatchDelete(@QueryParam("idParam") String idParam, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Multiple Document Versions
     *
     */
    @POST
    @Path("/objects/documents/versions/batch")
    @ApiOperation(value = "Create Multiple Document Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDocumentsVersionsBatchPost(@QueryParam("idParam") String idParam, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-MigrationMode")  String xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Domain Information
     *
     */
    @GET
    @Path("/objects/domain")
    @ApiOperation(value = "Retrieve Domain Information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDomainGet(@QueryParam("include_application") Boolean includeApplication, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Domains
     *
     */
    @GET
    @Path("/objects/domains")
    @ApiOperation(value = "Retrieve Domains", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsDomainsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add EDL Matched Documents
     *
     */
    @POST
    @Path("/objects/edl_matched_documents/batch/actions/add")
    @ApiOperation(value = "Add EDL Matched Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsEdlMatchedDocumentsBatchActionsAddPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Remove EDL Matched Documents
     *
     */
    @POST
    @Path("/objects/edl_matched_documents/batch/actions/remove")
    @ApiOperation(value = "Remove EDL Matched Documents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsEdlMatchedDocumentsBatchActionsRemovePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Auto Managed Groups
     *
     */
    @GET
    @Path("/objects/groups/auto")
    @ApiOperation(value = "Retrieve Auto Managed Groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsGroupsAutoGet(@QueryParam("limit") String limit, @QueryParam("offset") String offset, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Groups
     *
     */
    @GET
    @Path("/objects/groups")
    @ApiOperation(value = "Retrieve All Groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsGroupsGet(@QueryParam("includeImplied") String includeImplied, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Group
     *
     */
    @DELETE
    @Path("/objects/groups/{group_id}")
    @ApiOperation(value = "Delete Group", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsGroupsGroupIdDelete(@PathParam("group_id") String groupId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Group
     *
     */
    @GET
    @Path("/objects/groups/{group_id}")
    @ApiOperation(value = "Retrieve Group", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsGroupsGroupIdGet(@PathParam("group_id") String groupId, @QueryParam("includeImplied") Boolean includeImplied, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Group
     *
     */
    @PUT
    @Path("/objects/groups/{group_id}")
    @ApiOperation(value = "Update Group", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsGroupsGroupIdPut(@PathParam("group_id") String groupId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Group 
     *
     */
    @POST
    @Path("/objects/groups")
    @ApiOperation(value = "Create Group ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsGroupsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Application License Usage
     *
     */
    @GET
    @Path("/objects/licenses")
    @ApiOperation(value = "Retrieve Application License Usage", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsLicensesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Multi-Record Workflows
     *
     */
    @GET
    @Path("/objects/objectworkflows/actions")
    @ApiOperation(value = "Retrieve All Multi-Record Workflows", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsActionsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Multi-Record Workflow Details
     *
     */
    @GET
    @Path("/objects/objectworkflows/actions/{workflow_name}")
    @ApiOperation(value = "Retrieve Multi-Record Workflow Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsActionsWorkflowNameGet(@PathParam("workflow_name") String workflowName, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Multi-Record Workflow
     *
     */
    @POST
    @Path("/objects/objectworkflows/actions/{workflow_name}")
    @ApiOperation(value = "Initiate Multi-Record Workflow", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsActionsWorkflowNamePost(@PathParam("workflow_name") String workflowName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflows
     *
     */
    @GET
    @Path("/objects/objectworkflows")
    @ApiOperation(value = "Retrieve Workflows", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsGet(@QueryParam("object__v") String objectV, @QueryParam("record_id__v") String recordIdV, @QueryParam("participant") String participant, @QueryParam("status__v") String statusV, @QueryParam("offset") String offset, @QueryParam("page_size") String pageSize, @QueryParam("loc") String loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Tasks
     *
     */
    @GET
    @Path("/objects/objectworkflows/tasks")
    @ApiOperation(value = "Retrieve Workflow Tasks", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksGet(@QueryParam("object__v") String objectV, @QueryParam("record_id__v") String recordIdV, @QueryParam("assignee__v") String assigneeV, @QueryParam("status__v") String statusV, @QueryParam("offset") String offset, @QueryParam("page_size") String pageSize, @QueryParam("loc") String loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Accept Single Record Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/accept")
    @ApiOperation(value = "Accept Single Record Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsAcceptPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Cancel Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/cancel")
    @ApiOperation(value = "Cancel Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsCancelPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Complete Single Record Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/complete")
    @ApiOperation(value = "Complete Single Record Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsCompletePost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Task Actions
     *
     */
    @GET
    @Path("/objects/objectworkflows/tasks/{task_id}/actions")
    @ApiOperation(value = "Retrieve Workflow Task Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsGet(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Accept Multi-item Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept")
    @ApiOperation(value = "Accept Multi-item Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Complete Multi-item Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete")
    @ApiOperation(value = "Complete Multi-item Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Manage Multi-Item Workflow Content
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent")
    @ApiOperation(value = "Manage Multi-Item Workflow Content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Reassign Multi-item Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign")
    @ApiOperation(value = "Reassign Multi-item Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Reassign Single Record Workflow Task
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/reassign")
    @ApiOperation(value = "Reassign Single Record Workflow Task", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsReassignPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Task Action Details
     *
     */
    @GET
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/{task_action}")
    @ApiOperation(value = "Retrieve Workflow Task Action Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(@PathParam("task_id") String taskId, @PathParam("task_action") String taskAction, @QueryParam("loc") String loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Undo Workflow Task Acceptance
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/undoaccept")
    @ApiOperation(value = "Undo Workflow Task Acceptance", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Workflow Task Due Date
     *
     */
    @POST
    @Path("/objects/objectworkflows/tasks/{task_id}/actions/updateduedate")
    @ApiOperation(value = "Update Workflow Task Due Date", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(@PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Task Details
     *
     */
    @GET
    @Path("/objects/objectworkflows/tasks/{task_id}")
    @ApiOperation(value = "Retrieve Workflow Task Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsTasksTaskIdGet(@PathParam("task_id") String taskId, @QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Actions
     *
     */
    @GET
    @Path("/objects/objectworkflows/{workflow_id}/actions")
    @ApiOperation(value = "Retrieve Workflow Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsWorkflowIdActionsGet(@PathParam("workflow_id") String workflowId, @QueryParam("loc") String loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Action Details
     *
     */
    @GET
    @Path("/objects/objectworkflows/{workflow_id}/actions/{workflow_action}")
    @ApiOperation(value = "Retrieve Workflow Action Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(@PathParam("workflow_id") String workflowId, @PathParam("workflow_action") String workflowAction, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Workflow Action
     *
     */
    @POST
    @Path("/objects/objectworkflows/{workflow_id}/actions/{workflow_action}")
    @ApiOperation(value = "Initiate Workflow Action", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(@PathParam("workflow_id") String workflowId, @PathParam("workflow_action") String workflowAction, @QueryParam("documents__sys") String documentsSys, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Workflow Details
     *
     */
    @GET
    @Path("/objects/objectworkflows/{workflow_id}")
    @ApiOperation(value = "Retrieve Workflow Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsObjectworkflowsWorkflowIdGet(@PathParam("workflow_id") String workflowId, @QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Picklists
     *
     */
    @GET
    @Path("/objects/picklists")
    @ApiOperation(value = "Retrieve All Picklists", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsPicklistsGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Picklist Values
     *
     */
    @GET
    @Path("/objects/picklists/{picklist_name}")
    @ApiOperation(value = "Retrieve Picklist Values", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsPicklistsPicklistNameGet(@PathParam("picklist_name") String picklistName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Inactivate Picklist Value
     *
     */
    @DELETE
    @Path("/objects/picklists/{picklist_name}/{picklist_value_name}")
    @ApiOperation(value = "Inactivate Picklist Value", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsPicklistsPicklistNamePicklistValueNameDelete(@PathParam("picklist_name") String picklistName, @PathParam("picklist_value_name") String picklistValueName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Picklist Value
     *
     */
    @PUT
    @Path("/objects/picklists/{picklist_name}/{picklist_value_name}")
    @ApiOperation(value = "Update Picklist Value", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsPicklistsPicklistNamePicklistValueNamePut(@PathParam("picklist_name") String picklistName, @PathParam("picklist_value_name") String picklistValueName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Picklist Values
     *
     */
    @POST
    @Path("/objects/picklists/{picklist_name}")
    @ApiOperation(value = "Create Picklist Values", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsPicklistsPicklistNamePost(@PathParam("picklist_name") String picklistName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Picklist Value Label
     *
     */
    @PUT
    @Path("/objects/picklists/{picklist_name}")
    @ApiOperation(value = "Update Picklist Value Label", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsPicklistsPicklistNamePut(@PathParam("picklist_name") String picklistName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Build Production Vault
     *
     */
    @POST
    @Path("/objects/sandbox/actions/buildproduction")
    @ApiOperation(value = "Build Production Vault", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxActionsBuildproductionPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Promote to Production
     *
     */
    @POST
    @Path("/objects/sandbox/actions/promoteproduction")
    @ApiOperation(value = "Promote to Production", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxActionsPromoteproductionPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Recheck Sandbox Usage Limit
     *
     */
    @POST
    @Path("/objects/sandbox/actions/recheckusage")
    @ApiOperation(value = "Recheck Sandbox Usage Limit", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxActionsRecheckusagePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Change Sandbox Size
     *
     */
    @POST
    @Path("/objects/sandbox/batch/changesize")
    @ApiOperation(value = "Change Sandbox Size", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxBatchChangesizePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Set Sandbox Entitlements
     *
     */
    @POST
    @Path("/objects/sandbox/entitlements/set")
    @ApiOperation(value = "Set Sandbox Entitlements", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxEntitlementsSetPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Sandboxes
     *
     */
    @GET
    @Path("/objects/sandbox")
    @ApiOperation(value = "Retrieve Sandboxes", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Sandbox
     *
     */
    @DELETE
    @Path("/objects/sandbox/{name}")
    @ApiOperation(value = "Delete Sandbox", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxNameDelete(@PathParam("name") String name, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create or Refresh Sandbox
     *
     */
    @POST
    @Path("/objects/sandbox")
    @ApiOperation(value = "Create or Refresh Sandbox", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Sandbox Snapshot
     *
     */
    @POST
    @Path("/objects/sandbox/snapshot/{api_name}/actions/update")
    @ApiOperation(value = "Update Sandbox Snapshot", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxSnapshotApiNameActionsUpdatePost(@PathParam("api_name") String apiName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Upgrade Sandbox Snapshot
     *
     */
    @POST
    @Path("/objects/sandbox/snapshot/{api_name}/actions/upgrade")
    @ApiOperation(value = "Upgrade Sandbox Snapshot", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxSnapshotApiNameActionsUpgradePost(@PathParam("api_name") String apiName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Sandbox Snapshot
     *
     */
    @DELETE
    @Path("/objects/sandbox/snapshot/{api_name}")
    @ApiOperation(value = "Delete Sandbox Snapshot", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxSnapshotApiNameDelete(@PathParam("api_name") String apiName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Sandbox Snapshots
     *
     */
    @GET
    @Path("/objects/sandbox/snapshot")
    @ApiOperation(value = "Retrieve Sandbox Snapshots", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxSnapshotGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Sandbox Snapshot
     *
     */
    @POST
    @Path("/objects/sandbox/snapshot")
    @ApiOperation(value = "Create Sandbox Snapshot", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxSnapshotPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Refresh Sandbox from Snapshot
     *
     */
    @POST
    @Path("/objects/sandbox/{vault_id}/actions/refresh")
    @ApiOperation(value = "Refresh Sandbox from Snapshot", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxVaultIdActionsRefreshPost(@PathParam("vault_id") String vaultId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Sandbox Details by ID
     *
     */
    @GET
    @Path("/objects/sandbox/{vault_id}")
    @ApiOperation(value = "Retrieve Sandbox Details by ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSandboxVaultIdGet(@PathParam("vault_id") String vaultId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Security Policies
     *
     */
    @GET
    @Path("/objects/securitypolicies")
    @ApiOperation(value = "Retrieve All Security Policies", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSecuritypoliciesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Security Policy
     *
     */
    @GET
    @Path("/objects/securitypolicies/{security_policy_name}")
    @ApiOperation(value = "Retrieve Security Policy", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsSecuritypoliciesSecurityPolicyNameGet(@PathParam("security_policy_name") String securityPolicyName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Users
     *
     */
    @GET
    @Path("/objects/users/")
    @ApiOperation(value = "Retrieve All Users", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersGet(@QueryParam("vaults") String vaults, @QueryParam("exclude_vault_membership") String excludeVaultMembership, @QueryParam("exclude_app_licensing") String excludeAppLicensing, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve User
     *
     */
    @GET
    @Path("/objects/users/{id}")
    @ApiOperation(value = "Retrieve User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersIdGet(@PathParam("id") String id, @QueryParam("exclude_vault_membership") String excludeVaultMembership, @QueryParam("exclude_app_licensing") String excludeAppLicensing, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve User Permissions
     *
     */
    @GET
    @Path("/objects/users/{id}/permissions")
    @ApiOperation(value = "Retrieve User Permissions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersIdPermissionsGet(@PathParam("id") String id, @QueryParam("filter") String filter, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Single User
     *
     */
    @PUT
    @Path("/objects/users/{id}")
    @ApiOperation(value = "Update Single User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersIdPut(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Validate Session User
     *
     */
    @GET
    @Path("/objects/users/me")
    @ApiOperation(value = "Validate Session User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersMeGet(@QueryParam("exclude_vault_membership") String excludeVaultMembership, @QueryParam("exclude_app_licensing") String excludeAppLicensing, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Change My Password
     *
     */
    @POST
    @Path("/objects/users/me/password")
    @ApiOperation(value = "Change My Password", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersMePasswordPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve My User Permissions
     *
     */
    @GET
    @Path("/objects/users/me/permissions")
    @ApiOperation(value = "Retrieve My User Permissions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersMePermissionsGet(@QueryParam("filter") String filter, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update My User
     *
     */
    @PUT
    @Path("/objects/users/me")
    @ApiOperation(value = "Update My User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersMePut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Single User
     *
     */
    @POST
    @Path("/objects/users")
    @ApiOperation(value = "Create Single User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Multiple Users
     *
     */
    @PUT
    @Path("/objects/users")
    @ApiOperation(value = "Update Multiple Users", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersPut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Disable User
     *
     */
    @DELETE
    @Path("/objects/users/{user_id}")
    @ApiOperation(value = "Disable User", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersUserIdDelete(@PathParam("user_id") String userId, @QueryParam("domain") Boolean domain, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Vault Membership
     *
     */
    @PUT
    @Path("/objects/users/{user_id}/vault_membership/{vault_id}")
    @ApiOperation(value = "Update Vault Membership", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsUsersUserIdVaultMembershipVaultIdPut(@PathParam("user_id") String userId, @PathParam("vault_id") String vaultId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Vault Compare
     *
     */
    @POST
    @Path("/objects/vault/actions/compare")
    @ApiOperation(value = "Vault Compare", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsVaultActionsComparePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Vault Configuration Report
     *
     */
    @POST
    @Path("/objects/vault/actions/configreport")
    @ApiOperation(value = "Vault Configuration Report", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void objectsVaultActionsConfigreportPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Component Definition Query
     *
     */
    @POST
    @Path("/query/components")
    @ApiOperation(value = "Component Definition Query", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void queryComponentsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Next Page URL
     *
     */
    @POST
    @Path("/query/{next_page}")
    @ApiOperation(value = "Next Page URL", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void queryNextPagePost(@PathParam("next_page") String nextPage, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-DescribeQuery")  Boolean xVaultAPIDescribeQuery, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Submitting a Query
     *
     */
    @POST
    @Path("/query")
    @ApiOperation(value = "Submitting a Query", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void queryPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-DescribeQuery")  Boolean xVaultAPIDescribeQuery, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Previous Page URL
     *
     */
    @POST
    @Path("/query/{previous_page}")
    @ApiOperation(value = "Previous Page URL", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void queryPreviousPagePost(@PathParam("previous_page") String previousPage, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-DescribeQuery")  Boolean xVaultAPIDescribeQuery, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Current User with SCIM
     *
     */
    @GET
    @Path("/scim/v2/Me")
    @ApiOperation(value = "Retrieve Current User with SCIM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2MeGet(@QueryParam("attributes") String attributes, @QueryParam("excludedAttributes") String excludedAttributes, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Current User with SCIM
     *
     */
    @PUT
    @Path("/scim/v2/Me")
    @ApiOperation(value = "Update Current User with SCIM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2MePut(@QueryParam("attributes") String attributes, @QueryParam("excludedAttributes") String excludedAttributes, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All SCIM Resource Types
     *
     */
    @GET
    @Path("/scim/v2/ResourceTypes")
    @ApiOperation(value = "Retrieve All SCIM Resource Types", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2ResourceTypesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single SCIM Resource Type
     *
     */
    @GET
    @Path("/scim/v2/ResourceTypes/{type}")
    @ApiOperation(value = "Retrieve Single SCIM Resource Type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2ResourceTypesTypeGet(@PathParam("type") String type, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All SCIM Schema Information
     *
     */
    @GET
    @Path("/scim/v2/Schemas")
    @ApiOperation(value = "Retrieve All SCIM Schema Information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2SchemasGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single SCIM Schema Information
     *
     */
    @GET
    @Path("/scim/v2/Schemas/{id}")
    @ApiOperation(value = "Retrieve Single SCIM Schema Information", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2SchemasIdGet(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve SCIM Provider
     *
     */
    @GET
    @Path("/scim/v2/ServiceProviderConfig")
    @ApiOperation(value = "Retrieve SCIM Provider", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2ServiceProviderConfigGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve SCIM Resources
     *
     */
    @GET
    @Path("/scim/v2/{type}")
    @ApiOperation(value = "Retrieve SCIM Resources", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2TypeGet(@PathParam("type") String type, @QueryParam("filter") String filter, @QueryParam("attributes") String attributes, @QueryParam("excludedAttributes") String excludedAttributes, @QueryParam("sortBy") String sortBy, @QueryParam("sortOrder") String sortOrder, @QueryParam("startIndex") String startIndex, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single SCIM Resource
     *
     */
    @GET
    @Path("/scim/v2/{type}/{id}")
    @ApiOperation(value = "Retrieve Single SCIM Resource", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2TypeIdGet(@PathParam("type") String type, @PathParam("id") String id, @QueryParam("attributes") String attributes, @QueryParam("excludedAttributes") String excludedAttributes, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Users with SCIM
     *
     */
    @GET
    @Path("/scim/v2/Users")
    @ApiOperation(value = "Retrieve All Users with SCIM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2UsersGet(@QueryParam("filter") String filter, @QueryParam("attributes") String attributes, @QueryParam("excludedAttributes") String excludedAttributes, @QueryParam("sortBy") String sortBy, @QueryParam("sortOrder") String sortOrder, @QueryParam("count") String count, @QueryParam("startIndex") String startIndex, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single User with SCIM
     *
     */
    @GET
    @Path("/scim/v2/Users/{id}")
    @ApiOperation(value = "Retrieve Single User with SCIM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2UsersIdGet(@PathParam("id") String id, @QueryParam("filter") String filter, @QueryParam("attributes") String attributes, @QueryParam("excludedAttributes") String excludedAttributes, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update User with SCIM
     *
     */
    @PUT
    @Path("/scim/v2/Users/{id}")
    @ApiOperation(value = "Update User with SCIM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2UsersIdPut(@PathParam("id") String id, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create User with SCIM
     *
     */
    @POST
    @Path("/scim/v2/Users")
    @ApiOperation(value = "Create User with SCIM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void scimV2UsersPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Signing Certificate
     *
     */
    @GET
    @Path("/services/certificate/{cert_id}")
    @ApiOperation(value = "Retrieve Signing Certificate", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesCertificateCertIdGet(@PathParam("cert_id") String certId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Disable Configuration Mode
     *
     */
    @POST
    @Path("/services/configuration_mode/actions/disable")
    @ApiOperation(value = "Disable Configuration Mode", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesConfigurationModeActionsDisablePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Enable Configuration Mode
     *
     */
    @POST
    @Path("/services/configuration_mode/actions/enable")
    @ApiOperation(value = "Enable Configuration Mode", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesConfigurationModeActionsEnablePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Available Direct Data Files
     *
     */
    @GET
    @Path("/services/directdata/files")
    @ApiOperation(value = "Retrieve Available Direct Data Files", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesDirectdataFilesGet(@QueryParam("extract_type") String extractType, @QueryParam("start_time") Integer startTime, @QueryParam("stop_time") Integer stopTime, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Direct Data File
     *
     */
    @GET
    @Path("/services/directdata/files/{name}")
    @ApiOperation(value = "Download Direct Data File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesDirectdataFilesNameGet(@PathParam("name") String name, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Item Content
     *
     */
    @GET
    @Path("/services/file_staging/items/content/{item}")
    @ApiOperation(value = "Download Item Content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingItemsContentItemGet(@PathParam("item") String item, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Range")  String range, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete File or Folder
     *
     */
    @DELETE
    @Path("/services/file_staging/items/{item}")
    @ApiOperation(value = "Delete File or Folder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingItemsItemDelete(@PathParam("item") String item, @QueryParam("recursive") String recursive, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * List Items at a Path
     *
     */
    @GET
    @Path("/services/file_staging/items/{item}")
    @ApiOperation(value = "List Items at a Path", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingItemsItemGet(@PathParam("item") String item, @QueryParam("recursive") String recursive, @QueryParam("limit") String limit, @QueryParam("format_result") String formatResult, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Folder or File
     *
     */
    @PUT
    @Path("/services/file_staging/items/{item}")
    @ApiOperation(value = "Update Folder or File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingItemsItemPut(@PathParam("item") String item, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Folder or File
     *
     */
    @POST
    @Path("/services/file_staging/items")
    @ApiOperation(value = "Create Folder or File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingItemsPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-MD5")  String contentMD5, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * List Upload Sessions
     *
     */
    @GET
    @Path("/services/file_staging/upload/")
    @ApiOperation(value = "List Upload Sessions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Resumable Upload Session
     *
     */
    @POST
    @Path("/services/file_staging/upload")
    @ApiOperation(value = "Create Resumable Upload Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Abort Upload Session
     *
     */
    @DELETE
    @Path("/services/file_staging/upload/{upload_session_id}")
    @ApiOperation(value = "Abort Upload Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadUploadSessionIdDelete(@PathParam("upload_session_id") String uploadSessionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Get Upload Session Details
     *
     */
    @GET
    @Path("/services/file_staging/upload/{upload_session_id}")
    @ApiOperation(value = "Get Upload Session Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadUploadSessionIdGet(@PathParam("upload_session_id") String uploadSessionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * List File Parts Uploaded to Session
     *
     */
    @GET
    @Path("/services/file_staging/upload/{upload_session_id}/parts")
    @ApiOperation(value = "List File Parts Uploaded to Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadUploadSessionIdPartsGet(@PathParam("upload_session_id") String uploadSessionId, @QueryParam("limit") String limit, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Commit Upload Session
     *
     */
    @POST
    @Path("/services/file_staging/upload/{upload_session_id}")
    @ApiOperation(value = "Commit Upload Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadUploadSessionIdPost(@PathParam("upload_session_id") String uploadSessionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Upload to a Session
     *
     */
    @PUT
    @Path("/services/file_staging/upload/{upload_session_id}")
    @ApiOperation(value = "Upload to a Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesFileStagingUploadUploadSessionIdPut(@PathParam("upload_session_id") String uploadSessionId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-FilePartNumber")  String xVaultAPIFilePartNumber, @HeaderParam("Content-MD5")  String contentMD5, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Job Histories
     *
     */
    @GET
    @Path("/services/jobs/histories")
    @ApiOperation(value = "Retrieve Job Histories", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsHistoriesGet(@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("status") String status, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Import Bulk Translation File Job Errors
     *
     */
    @GET
    @Path("/services/jobs/{job_id}/errors")
    @ApiOperation(value = "Retrieve Import Bulk Translation File Job Errors", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsJobIdErrorsGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Job Status
     *
     */
    @GET
    @Path("/services/jobs/{job_id}")
    @ApiOperation(value = "Retrieve Job Status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsJobIdGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Import Bulk Translation File Job Summary
     *
     */
    @GET
    @Path("/services/jobs/{job_id}/summary")
    @ApiOperation(value = "Retrieve Import Bulk Translation File Job Summary", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsJobIdSummaryGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve SDK Job Tasks
     *
     */
    @GET
    @Path("/services/jobs/{job_id}/tasks")
    @ApiOperation(value = "Retrieve SDK Job Tasks", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsJobIdTasksGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Job Monitors
     *
     */
    @GET
    @Path("/services/jobs/monitors")
    @ApiOperation(value = "Retrieve Job Monitors", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsMonitorsGet(@QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("status") String status, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Start Job
     *
     */
    @POST
    @Path("/services/jobs/start_now/{job_id}")
    @ApiOperation(value = "Start Job", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesJobsStartNowJobIdPost(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Extract Data Files
     *
     */
    @POST
    @Path("/services/loader/extract")
    @ApiOperation(value = "Extract Data Files", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesLoaderExtractPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Load Failure Log Results
     *
     */
    @GET
    @Path("/services/loader/{job_id}/tasks/{task_id}/failurelog")
    @ApiOperation(value = "Retrieve Load Failure Log Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesLoaderJobIdTasksTaskIdFailurelogGet(@PathParam("job_id") String jobId, @PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Loader Extract Results
     *
     */
    @GET
    @Path("/services/loader/{job_id}/tasks/{task_id}/results")
    @ApiOperation(value = "Retrieve Loader Extract Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesLoaderJobIdTasksTaskIdResultsGet(@PathParam("job_id") String jobId, @PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Loader Extract Renditions Results
     *
     */
    @GET
    @Path("/services/loader/{job_id}/tasks/{task_id}/results/renditions")
    @ApiOperation(value = "Retrieve Loader Extract Renditions Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(@PathParam("job_id") String jobId, @PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Load Success Log Results
     *
     */
    @GET
    @Path("/services/loader/{job_id}/tasks/{task_id}/successlog")
    @ApiOperation(value = "Retrieve Load Success Log Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesLoaderJobIdTasksTaskIdSuccesslogGet(@PathParam("job_id") String jobId, @PathParam("task_id") String taskId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Load Data Objects
     *
     */
    @POST
    @Path("/services/loader/load")
    @ApiOperation(value = "Load Data Objects", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesLoaderLoadPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Validate Package
     *
     */
    @POST
    @Path("/services/package/actions/validate")
    @ApiOperation(value = "Validate Package", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesPackageActionsValidatePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Export Package
     *
     */
    @POST
    @Path("/services/package")
    @ApiOperation(value = "Export Package", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesPackagePost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Import Package
     *
     */
    @PUT
    @Path("/services/package")
    @ApiOperation(value = "Import Package", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesPackagePut(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Queues
     *
     */
    @GET
    @Path("/services/queues")
    @ApiOperation(value = "Retrieve All Queues", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesQueuesGet(@HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Disable Delivery
     *
     */
    @PUT
    @Path("/services/queues/{queue_name}/actions/disable_delivery")
    @ApiOperation(value = "Disable Delivery", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesQueuesQueueNameActionsDisableDeliveryPut(@PathParam("queue_name") String queueName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Enable Delivery
     *
     */
    @PUT
    @Path("/services/queues/{queue_name}/actions/enable_delivery")
    @ApiOperation(value = "Enable Delivery", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesQueuesQueueNameActionsEnableDeliveryPut(@PathParam("queue_name") String queueName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Reset Queue
     *
     */
    @PUT
    @Path("/services/queues/{queue_name}/actions/reset")
    @ApiOperation(value = "Reset Queue", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesQueuesQueueNameActionsResetPut(@PathParam("queue_name") String queueName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Queue Status
     *
     */
    @GET
    @Path("/services/queues/{queue_name}")
    @ApiOperation(value = "Retrieve Queue Status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesQueuesQueueNameGet(@PathParam("queue_name") String queueName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Validate Imported Package
     *
     */
    @POST
    @Path("/services/vobject/vault_package__v/{package_id}/actions/validate")
    @ApiOperation(value = "Validate Imported Package", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void servicesVobjectVaultPackageVPackageIdActionsValidatePost(@PathParam("package_id") String packageId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * End Session
     *
     */
    @DELETE
    @Path("/session")
    @ApiOperation(value = "End Session", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void sessionDelete(@HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Single Client Code Distribution
     *
     */
    @GET
    @Path("/uicode/distributions/{distribution_name}/code")
    @ApiOperation(value = "Download Single Client Code Distribution", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void uicodeDistributionsDistributionNameCodeGet(@PathParam("distribution_name") String distributionName, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Single Client Code Distribution
     *
     */
    @DELETE
    @Path("/uicode/distributions/{distribution_name}")
    @ApiOperation(value = "Delete Single Client Code Distribution", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void uicodeDistributionsDistributionNameDelete(@PathParam("distribution_name") String distributionName, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Single Client Code Distribution Metadata
     *
     */
    @GET
    @Path("/uicode/distributions/{distribution_name}")
    @ApiOperation(value = "Retrieve Single Client Code Distribution Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void uicodeDistributionsDistributionNameGet(@PathParam("distribution_name") String distributionName, @HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve All Client Code Distribution Metadata
     *
     */
    @GET
    @Path("/uicode/distributions")
    @ApiOperation(value = "Retrieve All Client Code Distribution Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void uicodeDistributionsGet(@HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Add or Replace Single Client Code Distribution
     *
     */
    @POST
    @Path("/uicode/distributions")
    @ApiOperation(value = "Add or Replace Single Client Code Distribution", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void uicodeDistributionsPost(@HeaderParam("Accept")  String accept, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Deploy Package
     *
     */
    @POST
    @Path("/vobject/vault_package__v/{package_id}/actions/deploy")
    @ApiOperation(value = "Deploy Package", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectVaultPackageVPackageIdActionsDeployPost(@PathParam("package_id") String packageId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Package Deploy Results
     *
     */
    @GET
    @Path("/vobject/vault_package__v/{package_id}/actions/deploy/results")
    @ApiOperation(value = "Retrieve Package Deploy Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectVaultPackageVPackageIdActionsDeployResultsGet(@PathParam("package_id") String packageId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Results of Cascade Delete Job
     *
     */
    @GET
    @Path("/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}")
    @ApiOperation(value = "Retrieve Results of Cascade Delete Job", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(@PathParam("object_name") String objectName, @PathParam("job_status") String jobStatus, @PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Results of Deep Copy Job
     *
     */
    @GET
    @Path("/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}")
    @ApiOperation(value = "Retrieve Results of Deep Copy Job", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(@PathParam("object_name") String objectName, @PathParam("job_status") String jobStatus, @PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create a Placeholder from an EDL Item
     *
     */
    @POST
    @Path("/vobjects/edl_item__v/actions/createplaceholder")
    @ApiOperation(value = "Create a Placeholder from an EDL Item", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsEdlItemVActionsCreateplaceholderPost(@HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Merge Records Job Log
     *
     */
    @GET
    @Path("/vobjects/merges/{job_id}/log")
    @ApiOperation(value = "Download Merge Records Job Log", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsMergesJobIdLogGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Record Merge Results
     *
     */
    @GET
    @Path("/vobjects/merges/{job_id}/results")
    @ApiOperation(value = "Retrieve Record Merge Results", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsMergesJobIdResultsGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Record Merge Status
     *
     */
    @GET
    @Path("/vobjects/merges/{job_id}/status")
    @ApiOperation(value = "Retrieve Record Merge Status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsMergesJobIdStatusGet(@PathParam("job_id") String jobId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Object Action on Multiple Records
     *
     */
    @POST
    @Path("/vobjects/{object_name}/actions/{action_name}")
    @ApiOperation(value = "Initiate Object Action on Multiple Records", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameActionsActionNamePost(@PathParam("object_name") String objectName, @PathParam("action_name") String actionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Change Object Type
     *
     */
    @POST
    @Path("/vobjects/{object_name}/actions/changetype")
    @ApiOperation(value = "Change Object Type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameActionsChangetypePost(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Record Merge
     *
     */
    @POST
    @Path("/vobjects/{object_name}/actions/merge")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Initiate Record Merge", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameActionsMergePost(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID, List<VobjectsObjectNameActionsMergePostRequestInner> vobjectsObjectNameActionsMergePostRequestInner);

    /**
     * Retrieve Roll-up Field Recalculation Status
     *
     */
    @GET
    @Path("/vobjects/{object_name}/actions/recalculaterollups")
    @ApiOperation(value = "Retrieve Roll-up Field Recalculation Status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameActionsRecalculaterollupsGet(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Recalculate Roll-up Fields
     *
     */
    @POST
    @Path("/vobjects/{object_name}/actions/recalculaterollups")
    @ApiOperation(value = "Recalculate Roll-up Fields", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameActionsRecalculaterollupsPost(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Corporate Currency Fields
     *
     */
    @PUT
    @Path("/vobjects/{object_name}/actions/updatecorporatecurrency")
    @ApiOperation(value = "Update Corporate Currency Fields", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameActionsUpdatecorporatecurrencyPut(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Multiple Object Record Attachments
     *
     */
    @DELETE
    @Path("/vobjects/{object_name}/attachments/batch")
    @ApiOperation(value = "Delete Multiple Object Record Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameAttachmentsBatchDelete(@PathParam("object_name") String objectName, @QueryParam("idParam") String idParam, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Multiple Object Record Attachments
     *
     */
    @POST
    @Path("/vobjects/{object_name}/attachments/batch")
    @ApiOperation(value = "Create Multiple Object Record Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameAttachmentsBatchPost(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Multiple Object Record Attachment Descriptions
     *
     */
    @PUT
    @Path("/vobjects/{object_name}/attachments/batch")
    @ApiOperation(value = "Update Multiple Object Record Attachment Descriptions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameAttachmentsBatchPut(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Object Records
     *
     */
    @DELETE
    @Path("/vobjects/{object_name}")
    @ApiOperation(value = "Delete Object Records", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameDelete(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record Roles
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{id}/roles/{role_name}")
    @ApiOperation(value = "Retrieve Object Record Roles", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameIdRolesRoleNameGet(@PathParam("object_name") String objectName, @PathParam("id") String id, @PathParam("role_name") String roleName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object User Actions Details
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/actions/{action_name}")
    @ApiOperation(value = "Retrieve Object User Actions Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdActionsActionNameGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("action_name") String actionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Initiate Object Action on a Single Record
     *
     */
    @POST
    @Path("/vobjects/{object_name}/{object_record_id}/actions/{action_name}")
    @ApiOperation(value = "Initiate Object Action on a Single Record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdActionsActionNamePost(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("action_name") String actionName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Cascade Delete Object Record
     *
     */
    @POST
    @Path("/vobjects/{object_name}/{object_record_id}/actions/cascadedelete")
    @ApiOperation(value = "Cascade Delete Object Record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Deep Copy Object Record
     *
     */
    @POST
    @Path("/vobjects/{object_name}/{object_record_id}/actions/deepcopy")
    @ApiOperation(value = "Deep Copy Object Record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record User Actions
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/actions")
    @ApiOperation(value = "Retrieve Object Record User Actions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdActionsGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @QueryParam("loc") Boolean loc, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Attachment Field File
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file")
    @ApiOperation(value = "Download Attachment Field File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_field_name") String attachmentFieldName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Attachment Field File
     *
     */
    @POST
    @Path("/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file")
    @ApiOperation(value = "Update Attachment Field File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_field_name") String attachmentFieldName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download All Attachment Field Files
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachment_fields/file")
    @ApiOperation(value = "Download All Attachment Field Files", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Object Record Attachment
     *
     */
    @DELETE
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}")
    @ApiOperation(value = "Delete Object Record Attachment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record Attachment Metadata
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}")
    @ApiOperation(value = "Retrieve Object Record Attachment Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Object Record Attachment Description
     *
     */
    @PUT
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}")
    @ApiOperation(value = "Update Object Record Attachment Description", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Delete Object Record Attachment Version
     *
     */
    @DELETE
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Delete Object Record Attachment Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download Object Record Attachment File
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file")
    @ApiOperation(value = "Download Object Record Attachment File", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record Attachment Version Metadata
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Retrieve Object Record Attachment Version Metadata", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Restore Object Record Attachment Version
     *
     */
    @POST
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}")
    @ApiOperation(value = "Restore Object Record Attachment Version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @PathParam("attachment_version") String attachmentVersion, @QueryParam("restore") Boolean restore, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record Attachment Versions
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions")
    @ApiOperation(value = "Retrieve Object Record Attachment Versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @PathParam("attachment_id") String attachmentId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Download All Object Record Attachment Files
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachments/file")
    @ApiOperation(value = "Download All Object Record Attachment Files", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsFileGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record Attachments
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/attachments")
    @ApiOperation(value = "Retrieve Object Record Attachments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create Object Record Attachment
     *
     */
    @POST
    @Path("/vobjects/{object_name}/{object_record_id}/attachments")
    @ApiOperation(value = "Create Object Record Attachment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAttachmentsPost(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Complete Audit History for a Single Object Record
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}/audittrail")
    @ApiOperation(value = "Retrieve Complete Audit History for a Single Object Record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdAudittrailGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @QueryParam("start_date") String startDate, @QueryParam("end_date") String endDate, @QueryParam("format_result") String formatResult, @QueryParam("limit") String limit, @QueryParam("offset") String offset, @QueryParam("events") String events, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Object Record
     *
     */
    @GET
    @Path("/vobjects/{object_name}/{object_record_id}")
    @ApiOperation(value = "Retrieve Object Record", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameObjectRecordIdGet(@PathParam("object_name") String objectName, @PathParam("object_record_id") String objectRecordId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Create &amp; Upsert Object Records
     *
     */
    @POST
    @Path("/vobjects/{object_name}")
    @ApiOperation(value = "Create & Upsert Object Records", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNamePost(@PathParam("object_name") String objectName, @QueryParam("idParam") String idParam, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-NoTriggers")  Boolean xVaultAPINoTriggers, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Update Object Records
     *
     */
    @PUT
    @Path("/vobjects/{object_name}")
    @ApiOperation(value = "Update Object Records", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNamePut(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Content-Type")  String contentType, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-MigrationMode")  Boolean xVaultAPIMigrationMode, @HeaderParam("X-VaultAPI-NoTriggers")  Boolean xVaultAPINoTriggers, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Remove Users &amp; Groups from Roles on Object Records
     *
     */
    @DELETE
    @Path("/vobjects/{object_name}/roles")
    @ApiOperation(value = "Remove Users & Groups from Roles on Object Records", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameRolesDelete(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Assign Users &amp; Groups to Roles on Object Records
     *
     */
    @POST
    @Path("/vobjects/{object_name}/roles")
    @ApiOperation(value = "Assign Users & Groups to Roles on Object Records", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsObjectNameRolesPost(@PathParam("object_name") String objectName, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("Content-Type")  String contentType, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);

    /**
     * Retrieve Outbound Package Dependencies
     *
     */
    @GET
    @Path("/vobjects/outbound_package__v/{package_id}/dependencies")
    @ApiOperation(value = "Retrieve Outbound Package Dependencies", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void vobjectsOutboundPackageVPackageIdDependenciesGet(@PathParam("package_id") String packageId, @HeaderParam("Authorization")  String authorization, @HeaderParam("Accept")  String accept, @HeaderParam("X-VaultAPI-ClientID")  String xVaultAPIClientID);
}
