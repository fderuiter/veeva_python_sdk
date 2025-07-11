#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "_vobjects__object_name__actions_merge_post_request_inner.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi() = default;

    /**
    * Retrieve API Versions.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Content File.
    *
    * 
    * \param componentTypeAndRecordName The component type of the record followed by the name of the record from which to retrieve the content file. The format is `{Componenttype}.{record_name}`. For example, `Formattedoutput.my_formatted_output__c`. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiMdlComponentsComponentTypeAndRecordNameFilesGet(
            
            std::string componentTypeAndRecordName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Component Record (MDL).
    *
    * 
    * \param componentTypeAndRecordName The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiMdlComponentsComponentTypeAndRecordNameGet(
            
            std::string componentTypeAndRecordName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Asynchronous MDL Script Results.
    *
    * 
    * \param jobId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiMdlExecuteAsyncJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Execute MDL Script Asynchronously.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiMdlExecuteAsyncPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Execute MDL Script.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiMdlExecutePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Upload Content File.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    apiMdlFilesPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Audit Details.
    *
    * 
    * \param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. *Required*
    * \param startDate Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
    * \param endDate Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
    * \param allDates Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail.
    * \param formatResult To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required.
    * \param limit Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
    * \param objects This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects=product__v,country__v. If omitted, defaults to all objects.
    * \param events This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events=Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    audittrailAuditTrailTypeGet(
            
            std::string auditTrailType
            , 
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            std::string allDates
            , 
            
            std::string formatResult
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string objects
            , 
            
            std::string events
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Authentication Type Discovery.
    *
    * 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    authDiscoveryPost(
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * OAuth 2.0 / OpenID Connect.
    *
    * 
    * \param oathOidcProfileId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    authOauthSessionOathOidcProfileIdPost(
            
            std::string oathOidcProfileId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * User Name and Password.
    *
    * 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    authPost(
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Source Code File.
    *
    * 
    * \param className The fully qualified class name of your file. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeClassNameDelete(
            
            std::string className
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Disable Vault Extension.
    *
    * 
    * \param className The fully qualified class name of your file. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeClassNameDisablePut(
            
            std::string className
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Enable Vault Extension.
    *
    * 
    * \param className The fully qualified class name of your file. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeClassNameEnablePut(
            
            std::string className
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single Source Code File.
    *
    * 
    * \param className The fully qualified class name of your file. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeClassNameGet(
            
            std::string className
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Profiling Sessions.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeProfilerGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Profiling Session.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeProfilerPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * End Profiling Session.
    *
    * 
    * \param sessionName The name of the session, for example,  baseline__c. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeProfilerSessionNameActionsEndPost(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Profiling Session.
    *
    * 
    * \param sessionName The name of the session, for example,  baseline__c. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeProfilerSessionNameDelete(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Profiling Session.
    *
    * 
    * \param sessionName The name of the session, for example,  baseline__c. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeProfilerSessionNameGet(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Profiling Session Results.
    *
    * 
    * \param sessionName The name of the session, for example,  baseline__c. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codeProfilerSessionNameResultsGet(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add or Replace Single Source Code File.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    codePut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Specific Root Nodes.
    *
    * 
    * \param edlHierarchyOrTemplate Choose to retrieve either edl_hierarchy__v or edl_template__v *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(
            
            std::string edlHierarchyOrTemplate
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Root Nodes.
    *
    * 
    * \param edlHierarchyOrTemplate  *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    compositesTreesEdlHierarchyOrTemplateGet(
            
            std::string edlHierarchyOrTemplate
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve a Node's Children.
    *
    * 
    * \param parentNodeId The ID of a parent node in the hierarchy. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    compositesTreesEdlHierarchyVParentNodeIdChildrenGet(
            
            std::string parentNodeId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Node Order.
    *
    * 
    * \param parentNodeId The ID of a parent node in the hierarchy. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    compositesTreesEdlHierarchyVParentNodeIdChildrenPut(
            
            std::string parentNodeId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Component Record (XML/JSON).
    *
    * 
    * \param componentTypeAndRecordName The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationComponentTypeAndRecordNameGet(
            
            std::string componentTypeAndRecordName
            , 
            
            std::string loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Component Record Collection.
    *
    * 
    * \param componentType  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationComponentTypeGet(
            
            std::string componentType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Details from a Specific Object.
    *
    * 
    * \param objectNameAndObjectType The object name followed by the object type in the format `Objecttype.{object_name}.{object_type}`. For example, `Objecttype.product__v.base__v`. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationObjectNameAndObjectTypeGet(
            
            std::string objectNameAndObjectType
            , 
            
            std::string loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Details from All Object Types.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationObjecttypeGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Lifecycle Role Assignment Override Rules.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationRoleAssignmentRuleDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Lifecycle Role Assignment Rules (Default & Override).
    *
    * 
    * \param lifecycleV Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v=general_lifecycle__c
    * \param roleV Include the name of the role from which to retrieve information. For example: role__v=editor__c
    * \param productV Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v=0PR0011001 or product__v.name__v=CholeCap
    * \param countryV Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v=0CR0022002 or country__v.name__v=United States
    * \param studyV In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v=0ST0021J01 or study__v.name__v=CholeCap Study
    * \param studyCountryV In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v=0SC0001001 or study_country__v.name__v=Germany
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationRoleAssignmentRuleGet(
            
            std::string lifecycleV
            , 
            
            std::string roleV
            , 
            
            std::string productV
            , 
            
            std::string countryV
            , 
            
            std::string studyV
            , 
            
            std::string studyCountryV
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Lifecycle Role Assignment Override Rules.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationRoleAssignmentRulePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Lifecycle Role Assignment Rules (Default & Override).
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    configurationRoleAssignmentRulePut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Delegated Session.
    *
    * 
    * \param authorization The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    delegationLoginPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Delegations.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    delegationVaultsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Session Keep Alive.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    keepAlivePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Limits on Objects.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    limitsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Daily API Usage.
    *
    * 
    * \param date The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
    * \param logFormat Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsApiUsageGet(
            
            std::string date
            , 
            
            std::string logFormat
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Debug Logs.
    *
    * 
    * \param userId Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
    * \param includeInactive Set to `true` to include debug log sessions with a status of `inactive__sys` in the response. If omitted, defaults to `false` and inactive sessions are not included in the response.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeDebugGet(
            
            std::string userId
            , 
            
            bool includeInactive
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Debug Log.
    *
    * 
    * \param id The ID of the debug log to delete. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeDebugIdActionsResetDelete(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Reset Debug Log.
    *
    * 
    * \param id The ID of the debug log to delete. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeDebugIdActionsResetPost(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Debug Log Files.
    *
    * 
    * \param id The ID of the debug log to download. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeDebugIdFilesGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single Debug Log.
    *
    * 
    * \param id The ID of the debug log to retrieve. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeDebugIdGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Debug Log.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeDebugPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download SDK Runtime Log.
    *
    * 
    * \param date 
    * \param logFormat Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    logsCodeRuntimeGet(
            
            std::string date
            , 
            
            std::string logFormat
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Import Bulk Translation File.
    *
    * 
    * \param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    messagesMessageTypeActionsImportPost(
            
            std::string messageType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Bulk Translation File.
    *
    * 
    * \param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. *Required*
    * \param lang A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    messagesMessageTypeLanguageLangActionsExportPost(
            
            std::string messageType
            , 
            
            std::string lang
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Audit Metadata.
    *
    * 
    * \param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc). *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataAudittrailAuditTrailTypeGet(
            
            std::string auditTrailType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Audit Types.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataAudittrailGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Component Type Metadata.
    *
    * 
    * \param componentType The component type name (Picklist, Docfield, Doctype, etc.). *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataComponentsComponentTypeGet(
            
            std::string componentType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Component Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataComponentsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Template Node Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsBindersTemplatesBindernodesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Template Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsBindersTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Annotation Placemark Type Metadata.
    *
    * 
    * \param placemarkType The name of the placemark type. For example, sticky__sys. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(
            
            std::string placemarkType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Annotation Reference Type Metadata.
    *
    * 
    * \param referenceType  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(
            
            std::string referenceType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Annotation Type Metadata.
    *
    * 
    * \param annotationType The name of the annotation type. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in Medical and PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(
            
            std::string annotationType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Event SubType Metadata.
    *
    * 
    * \param eventType The event type. For example, distribution__v. *Required*
    * \param eventSubtype The event subtype. For example, approved_email__v. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(
            
            std::string eventType
            , 
            
            std::string eventSubtype
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Event Types and Subtypes.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsEventsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Lock Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsLockGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Common Document Fields.
    *
    * 
    * \param contentType 
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsPropertiesFindCommonPost(
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Document Fields.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsPropertiesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Template Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Document Types.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsTypesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Type.
    *
    * 
    * \param type The document type. See Retrieve Document Types. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsTypesTypeGet(
            
            std::string type
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Type Relationships.
    *
    * 
    * \param type The document type. See Retrieve Document Types. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsTypesTypeRelationshipsGet(
            
            std::string type
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Classification.
    *
    * 
    * \param type The document type. See Retrieve Document Types. *Required*
    * \param subtype The document subtype. See Retrieve Document Types. *Required*
    * \param classification The document classification. See Retrieve Document Types. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(
            
            std::string type
            , 
            
            std::string subtype
            , 
            
            std::string classification
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Subtype.
    *
    * 
    * \param type The document type. See Retrieve Document Types. *Required*
    * \param subtype The document subtype. See Retrieve Document Types. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(
            
            std::string type
            , 
            
            std::string subtype
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Group Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsGroupsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Security Policy Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsSecuritypoliciesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve User Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataObjectsUsersGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Archived Document Signature Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Signature Metadata.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Collection.
    *
    * 
    * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataVobjectsGet(
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Cancel Raw Object Deployment.
    *
    * 
    * \param objectName  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataVobjectsObjectNameActionsCanceldeploymentPost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Field Metadata.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectFieldName The object field name value (id, name__v, external_id__v, etc.). *Required*
    * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataVobjectsObjectNameFieldsObjectFieldNameGet(
            
            std::string objectName
            , 
            
            std::string objectFieldName
            , 
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Metadata.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataVobjectsObjectNameGet(
            
            std::string objectName
            , 
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Page Layouts.
    *
    * 
    * \param objectName  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataVobjectsObjectNamePageLayoutsGet(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Page Layout Metadata.
    *
    * 
    * \param objectName The name of the object from which to retrieve page layout metadata. *Required*
    * \param layoutName The name of the page layout from which to retrieve metadata. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    metadataVobjectsObjectNamePageLayoutsLayoutNameGet(
            
            std::string objectName
            , 
            
            std::string layoutName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Email Notification Histories.
    *
    * 
    * \param startDate Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date.
    * \param endDate Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date.
    * \param allDates Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours.
    * \param formatResult To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv.
    * \param limit Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    notificationsHistoriesGet(
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            bool allDates
            , 
            
            std::string formatResult
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Bulk Workflow Action Details.
    *
    * 
    * \param action  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsActionGet(
            
            std::string action
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Workflow Actions on Multiple Workflows.
    *
    * 
    * \param action  *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsActionPost(
            
            std::string action
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Cancel Workflow Tasks.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsCanceltasksPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Cancel Workflows.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsCancelworkflowsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Bulk Workflow Actions.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Reassign Workflow Tasks.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsReassigntasksPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Replace Workflow Owner.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectWorkflowActionsReplaceworkflowownerPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Export Results.
    *
    * 
    * \param jobId The id value of the requested export job. This is returned with the export binder requests above. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersActionsExportJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Binder (Latest Version).
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param source to include source content or not
    * \param renditiontype to include viewable renditions
    * \param docversion to include all major versions
    * \param attachments to include all versions of attachments
    * \param r_export configurable filename metadata
    * \param docfield to exclude document metadata csv
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdActionsExportPost(
            
            std::string binderId
            , 
            
            bool source
            , 
            
            std::string renditiontype
            , 
            
            std::string docversion
            , 
            
            std::string attachments
            , 
            
            std::string r_export
            , 
            
            bool docfield
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Refresh Binder Auto-Filing.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdActionsPost(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binding Rule.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param contentType 
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdBindingRulePut(
            
            std::string binderId
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Binder.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdDelete(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binder Document Binding Rule.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param nodeId The binder node id field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdDocumentsNodeIdBindingRulePut(
            
            std::string binderId
            , 
            
            std::string nodeId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add Document to Binder.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdDocumentsPost(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Remove Document from Binder.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param sectionId The binder node id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdDocumentsSectionIdDelete(
            
            std::string binderId
            , 
            
            std::string sectionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Move Document in Binder.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param sectionId The binder node id field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdDocumentsSectionIdPut(
            
            std::string binderId
            , 
            
            std::string sectionId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param depth To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdGet(
            
            std::string binderId
            , 
            
            std::string depth
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Binder Version.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdPost(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binder.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdPut(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Remove Users & Groups from Roles on a Single Binder.
    *
    * 
    * \param binderId The id value of the binder from which to remove roles. *Required*
    * \param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. *Required*
    * \param id The id value of the user or group to remove from the role. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(
            
            std::string binderId
            , 
            
            std::string roleNameAndUserOrGroup
            , 
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binder Section Binding Rule.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param nodeId The binder node id field value. *Required*
    * \param contentType 
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdSectionsNodeIdBindingRulePut(
            
            std::string binderId
            , 
            
            std::string nodeId
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binder Section.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param nodeId The binder node id of the section. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdSectionsNodeIdPut(
            
            std::string binderId
            , 
            
            std::string nodeId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Binder Section.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdSectionsPost(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Binder Section.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param sectionId The binder node id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdSectionsSectionIdDelete(
            
            std::string binderId
            , 
            
            std::string sectionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Sections.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param sectionId The binder node id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdSectionsSectionIdGet(
            
            std::string binderId
            , 
            
            std::string sectionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Binder Versions.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsGet(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Binder (Specific Version).
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param source to include source content or not
    * \param renditiontype to include viewable renditions
    * \param docversion to include all major versions
    * \param attachments to include all versions of attachments
    * \param r_export configurable filename metadata
    * \param docfield to exclude document metadata csv
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            bool source
            , 
            
            std::string renditiontype
            , 
            
            std::string docversion
            , 
            
            std::string attachments
            , 
            
            std::string r_export
            , 
            
            bool docfield
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Binder Version.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Version.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binder Version.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Binder Relationship.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Binder Relationship.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param relationshipId The binder relationship id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string relationshipId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Relationship.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param relationshipId The binder relationship id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string relationshipId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Version Section.
    *
    * 
    * \param binderId The binder id field value. *Required*
    * \param majorVersion The binder major_version_number__v field value. *Required*
    * \param minorVersion The binder minor_version_number__v field value. *Required*
    * \param sectionId Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(
            
            std::string binderId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string sectionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Binder Roles.
    *
    * 
    * \param id  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersIdRolesGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Assign Users & Groups to Roles on a Single Binder.
    *
    * 
    * \param id  *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersIdRolesPost(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Role.
    *
    * 
    * \param id The binder `id`. *Required*
    * \param roleName The name of the role to retrieve. For example, `owner__v`. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersIdRolesRoleNameGet(
            
            std::string id
            , 
            
            std::string roleName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder User Actions.
    *
    * 
    * \param id The binder id field value from which to retrieve available user actions. *Required*
    * \param majorVersion The major version number of the binder. *Required*
    * \param minorVersion The minor version number of the binder. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(
            
            std::string id
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Entry Criteria.
    *
    * 
    * \param id The binder id field value from which to retrieve available user actions. *Required*
    * \param majorVersion The major version number of the binder. *Required*
    * \param minorVersion The minor version number of the binder. *Required*
    * \param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(
            
            std::string id
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string nameV
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Binder User Action.
    *
    * 
    * \param id The binder id field value from which to retrieve available user actions. *Required*
    * \param majorVersion The major version number of the binder. *Required*
    * \param minorVersion The minor version number of the binder. *Required*
    * \param nameV The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(
            
            std::string id
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string nameV
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve User Actions on Multiple Binders.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersLifecycleActionsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Bulk Binder User Actions.
    *
    * 
    * \param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersLifecycleActionsUserActionNamePut(
            
            std::string userActionName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Binder.
    *
    * 
    * \param async When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data. 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersPost(
            
            bool async
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Template Collection.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Binder Template.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Binder Template.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesPut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Template Node Attributes.
    *
    * 
    * \param templateName The binder template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesTemplateNameBindernodesGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Binder Template Node.
    *
    * 
    * \param templateName The binder template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesTemplateNameBindernodesPost(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Replace Binder Template Nodes.
    *
    * 
    * \param templateName The binder template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesTemplateNameBindernodesPut(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Binder Template.
    *
    * 
    * \param templateName The binder template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesTemplateNameDelete(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Binder Template Attributes.
    *
    * 
    * \param templateName The binder template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsBindersTemplatesTemplateNameGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Deleted Document IDs.
    *
    * 
    * \param startDate Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
    * \param endDate Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDeletionsDocumentsGet(
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Deleted Object Record ID.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDeletionsVobjectsObjectNameGet(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Document Workflows.
    *
    * 
    * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsActionsGet(
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Controlled Copy Job Results.
    *
    * 
    * \param lifecycleAndStateAndAction The `name__v` values for the lifecycle, state, and action in the format `{lifecycle_name}.{state_name}.{action_name}`. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the `href` under the `artifacts` link. *Required*
    * \param jobId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(
            
            std::string lifecycleAndStateAndAction
            , 
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Workflow Details.
    *
    * 
    * \param workflowName The document workflow name value. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsActionsWorkflowNameGet(
            
            std::string workflowName
            , 
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Document Workflow.
    *
    * 
    * \param workflowName The document workflow name value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsActionsWorkflowNamePost(
            
            std::string workflowName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Annotations.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsAnnotationsBatchDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Multiple Annotations.
    *
    * 
    * \param authorization  *Required*
    * \param contentType  *Required*
    * \param accept  *Required*
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. *Required*
    */
    Response<
            String
        >
    objectsDocumentsAnnotationsBatchPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Annotations.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsAnnotationsBatchPut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add Annotation Replies.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsAnnotationsRepliesBatchPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Multiple Document Attachments.
    *
    * 
    * \param accept 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsAttachmentsBatchDelete(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Multiple Document Attachments.
    *
    * 
    * \param accept 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsAttachmentsBatchPost(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Multiple Document Attachment Descriptions.
    *
    * 
    * \param accept 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsAttachmentsBatchPut(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Export Results.
    *
    * 
    * \param jobId The id value of the requested export job. This is returned with the export document requests. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchActionsFileextractJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Documents.
    *
    * 
    * \param source Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
    * \param renditions Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
    * \param allversions Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false.
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchActionsFileextractPost(
            
            bool source
            , 
            
            bool renditions
            , 
            
            bool allversions
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Reclassify Multiple Documents.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIMigrationMode When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchActionsReclassifyPut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Multiple Document Renditions.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchActionsRerenderPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Multiple Documents.
    *
    * 
    * \param idParam If you’re identifying documents in your input by their external ID
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchDelete(
            
            std::string idParam
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Undo Collaborative Authoring Checkout.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchLockDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Multiple Documents.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIMigrationMode When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Multiple Documents.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIMigrationMode When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsBatchPut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Anchor IDs.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAnchorsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Document Annotations to PDF.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAnnotationsFileGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Import Document Annotations from PDF.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAnnotationsFilePost(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Document Attachment.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdDelete(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Attachment.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Attachment Metadata.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdGet(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Document Attachment Description.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdPut(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Document Attachment Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Attachment Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Attachment Version Metadata.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Restore Document Attachment Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param restore The parameter restore must be set to true. 
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            bool restore
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Attachment Versions.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(
            
            std::string docId
            , 
            
            std::string attachmentId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download All Document Attachments.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsFileGet(
            
            std::string docId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Attachments.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsGet(
            
            std::string docId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Document Attachment.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param accept 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAttachmentsPost(
            
            std::string docId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Complete Audit History for a Single Document.
    *
    * 
    * \param docId The document ID for which to retrieve audit history. *Required*
    * \param startDate Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. 
    * \param endDate Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
    * \param formatResult To request a CSV file of your audit history, use csv. 
    * \param limit Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
    * \param events Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events=WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdAudittrailGet(
            
            std::string docId
            , 
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            std::string formatResult
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string events
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Document.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdDelete(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Events.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdEventsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document File.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param lockDocument Set to true to Check Out this document before retrieval. If omitted, defaults to false.
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdFileGet(
            
            std::string docId
            , 
            
            bool lockDocument
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Document Lock.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdLockDelete(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Lock.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdLockGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Document Lock.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdLockPost(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download All Document Version Attachments.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Single Document Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param suppressRendition Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdPost(
            
            std::string docId
            , 
            
            std::string suppressRendition
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Single Document.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIMigrationMode When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdPut(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Renditions.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdRenditionsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Document Rendition.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdRenditionsRenditionTypeDelete(
            
            std::string docId
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Rendition File.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param steadyState Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdRenditionsRenditionTypeGet(
            
            std::string docId
            , 
            
            std::string renditionType
            , 
            
            std::string steadyState
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add Single Document Rendition.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param content_Type 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdRenditionsRenditionTypePost(
            
            std::string docId
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string content_Type
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Replace Document Rendition.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdRenditionsRenditionTypePut(
            
            std::string docId
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Remove Users & Groups from Roles on a Single Document.
    *
    * 
    * \param docId The id value of the document from which to remove roles. *Required*
    * \param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. *Required*
    * \param id The id value of the user or group to remove from the role. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(
            
            std::string docId
            , 
            
            std::string roleNameAndUserOrGroup
            , 
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Version Attachments.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Versions.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Read Annotations by ID.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param annotationId The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string annotationId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Read Replies of Parent Annotation.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param annotationId The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string annotationId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Document Version Annotations to PDF.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Import Document Version Annotations from PDF.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Read Annotations by Document Version and Type.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param limit Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored.
    * \param offset This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset=201.
    * \param annotationTypes The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` 
    * \param paginationId A unique identifier used to load requests with paginated results.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string annotationTypes
            , 
            
            std::string paginationId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Version Attachment Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param attachmentId The id field value of the attachment. *Required*
    * \param attachmentVersion The version of the attachment. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Version Attachment Versions.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param attachmentId The id of the document attachment to retrieve. *Required*
    * \param attachmentVersion Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Document Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Version Notes as CSV.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Document Event.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Video Annotations.
    *
    * 
    * \param docId The video document id field value. *Required*
    * \param majorVersion The video document major_version_number__v field value. *Required*
    * \param minorVersion The video document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept This `Accept` header only changes the format of the response in the case of an error. On `SUCCESS`, the HTTP Response Header `Content-Type` is set to `text/plain;charset=UnicodeLittle`.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Version File.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Document Version.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIMigrationMode When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Relationships.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Single Document Relationship.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Document Relationship.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param relationshipId The relationship id field value. See Retrieve Document Relationships. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string relationshipId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Relationship.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param relationshipId The relationship id field value. See Retrieve Document Relationships. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string relationshipId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Version Renditions.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Document Version Rendition.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Version Rendition File.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Upload Document Version Rendition.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Replace Document Version Rendition.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param renditionType The document rendition type. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string renditionType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Version Thumbnail File.
    *
    * 
    * \param docId The document id field value. *Required*
    * \param majorVersion The document major_version_number__v field value. *Required*
    * \param minorVersion The document minor_version_number__v field value. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(
            
            std::string docId
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Documents.
    *
    * 
    * \param namedFilter Retrieves only documents which you have created.
    * \param scope Searches only within the document content.
    * \param versionscope Retrieves all document versions, rather than only the latest version.
    * \param search Search for documents based on a {keyword} in searchable document fields.
    * \param limit See VQL documentation for more information.
    * \param sort See VQL documentation for more information.
    * \param start See VQL documentation for more information.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsGet(
            
            std::string namedFilter
            , 
            
            std::string scope
            , 
            
            std::string versionscope
            , 
            
            std::string search
            , 
            
            std::string limit
            , 
            
            std::string sort
            , 
            
            std::string start
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Document Roles.
    *
    * 
    * \param id  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsIdRolesGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Assign Users & Groups to Roles on a Single Document.
    *
    * 
    * \param id  *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsIdRolesPost(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Role.
    *
    * 
    * \param id The document `id`. *Required*
    * \param roleName The name of the role to retrieve. For example, `owner__v`. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsIdRolesRoleNameGet(
            
            std::string id
            , 
            
            std::string roleName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document User Actions.
    *
    * 
    * \param id The document id field value from which to retrieve available user actions. *Required*
    * \param majorVersion The major version number of the document. *Required*
    * \param minorVersion The minor version number of the document. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(
            
            std::string id
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Entry Criteria.
    *
    * 
    * \param id The document id field value from which to retrieve available user actions. *Required*
    * \param majorVersion The major version number of the document. *Required*
    * \param minorVersion The minor version number of the document. *Required*
    * \param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(
            
            std::string id
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string nameV
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Document User Action.
    *
    * 
    * \param id The document id field value from which to retrieve available user actions. *Required*
    * \param majorVersion The major version number of the document. *Required*
    * \param minorVersion The minor version number of the document. *Required*
    * \param nameV The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(
            
            std::string id
            , 
            
            std::string majorVersion
            , 
            
            std::string minorVersion
            , 
            
            std::string nameV
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve User Actions on Multiple Documents.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsLifecycleActionsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Bulk Document User Actions.
    *
    * 
    * \param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsLifecycleActionsUserActionNamePut(
            
            std::string userActionName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Single Document.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIMigrationMode When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Multiple Document Relationships.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsRelationshipsBatchDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Multiple Document Relationships.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsRelationshipsBatchPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Multiple Document Renditions.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsRenditionsBatchDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add Multiple Document Renditions.
    *
    * 
    * \param idParam If you’re identifying documents in your input by their external ID
    * \param largeSizeAsset If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIMigrationMode Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsRenditionsBatchPost(
            
            std::string idParam
            , 
            
            std::string largeSizeAsset
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Remove Users and Groups from Roles on Multiple Documents & Binders.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsRolesBatchDelete(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Assign Users & Groups to Roles on Multiple Documents & Binders.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsRolesBatchPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Template Collection.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Single Document Template.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Multiple Document Templates.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesPut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Basic Document Template.
    *
    * 
    * \param templateName The document template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesTemplateNameDelete(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Document Template File.
    *
    * 
    * \param templateName The document template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesTemplateNameFileGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Document Template Attributes.
    *
    * 
    * \param templateName The document template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesTemplateNameGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Single Document Template.
    *
    * 
    * \param templateName The document template name__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTemplatesTemplateNamePut(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Document Tokens.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsTokensPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Document Versions.
    *
    * 
    * \param source Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
    * \param renditions Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsVersionsBatchActionsFileextractPost(
            
            bool source
            , 
            
            bool renditions
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Multiple Document Versions.
    *
    * 
    * \param idParam If you’re identifying documents in your input by their external ID
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsVersionsBatchDelete(
            
            std::string idParam
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Multiple Document Versions.
    *
    * 
    * \param idParam If you’re identifying documents in your input by their external ID
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIMigrationMode Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the `status__v` field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDocumentsVersionsBatchPost(
            
            std::string idParam
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Domain Information.
    *
    * 
    * \param includeApplication To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDomainGet(
            
            bool includeApplication
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Domains.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsDomainsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add EDL Matched Documents.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsEdlMatchedDocumentsBatchActionsAddPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Remove EDL Matched Documents.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsEdlMatchedDocumentsBatchActionsRemovePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Auto Managed Groups.
    *
    * 
    * \param limit Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsGroupsAutoGet(
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Groups.
    *
    * 
    * \param includeImplied When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsGroupsGet(
            
            std::string includeImplied
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Group.
    *
    * 
    * \param groupId The group id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsGroupsGroupIdDelete(
            
            std::string groupId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Group.
    *
    * 
    * \param groupId The group id field value. *Required*
    * \param includeImplied When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsGroupsGroupIdGet(
            
            std::string groupId
            , 
            
            bool includeImplied
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Group.
    *
    * 
    * \param groupId The group id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsGroupsGroupIdPut(
            
            std::string groupId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Group .
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsGroupsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Application License Usage.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsLicensesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Multi-Record Workflows.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsActionsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Multi-Record Workflow Details.
    *
    * 
    * \param workflowName  *Required*
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsActionsWorkflowNameGet(
            
            std::string workflowName
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Multi-Record Workflow.
    *
    * 
    * \param workflowName  *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsActionsWorkflowNamePost(
            
            std::string workflowName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflows.
    *
    * 
    * \param objectV To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. 
    * \param recordIdV To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the participant parameter is not used. 
    * \param participant To retrieve all workflows available to a particular user, include the user id field value as ?participant={id}. To retrieve your own workflows, set this value to ?participant=me. This parameter is required when the object__v and record_id__v parameters are not used. 
    * \param statusV To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v=active__v, status__v=active__v,completed__v. Workflows with `status__v=active__v` are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v
    * \param offset This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. 
    * \param pageSize This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. 
    * \param loc When localized (translated) strings are available, retrieve them by including ?loc=true. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsGet(
            
            std::string objectV
            , 
            
            std::string recordIdV
            , 
            
            std::string participant
            , 
            
            std::string statusV
            , 
            
            std::string offset
            , 
            
            std::string pageSize
            , 
            
            std::string loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Tasks.
    *
    * 
    * \param objectV To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used.
    * \param recordIdV To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v={name__v}&record_id__v={id}. These two parameters are required when the assignee__v parameter is not used.
    * \param assigneeV To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v={id}. To retrieve your own workflow tasks, set this value to ?assignee__v=me. This parameter is required when the object__v and record_id__v parameters are not used. 
    * \param statusV To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v=available__v or ?status__v=available__v,completed__v. 
    * \param offset This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset=201. 
    * \param pageSize This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size=1000. 
    * \param loc When localized (translated) strings are available, retrieve them by including ?loc=true. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksGet(
            
            std::string objectV
            , 
            
            std::string recordIdV
            , 
            
            std::string assigneeV
            , 
            
            std::string statusV
            , 
            
            std::string offset
            , 
            
            std::string pageSize
            , 
            
            std::string loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Accept Single Record Workflow Task.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsAcceptPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Cancel Workflow Task.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsCancelPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Complete Single Record Workflow Task.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsCompletePost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Task Actions.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsGet(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Accept Multi-item Workflow Task.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Complete Multi-item Workflow Task.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Manage Multi-Item Workflow Content.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Reassign Multi-item Workflow Task.
    *
    * 
    * \param taskId The id of the task to reassign. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Reassign Single Record Workflow Task.
    *
    * 
    * \param taskId The id of the task to reassign. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsReassignPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Task Action Details.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param taskAction The name of the task action retrieved from Retrieve Workflow Task Actions. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by including loc=true. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(
            
            std::string taskId
            , 
            
            std::string taskAction
            , 
            
            std::string loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Undo Workflow Task Acceptance.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Workflow Task Due Date.
    *
    * 
    * \param taskId The id of the task. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Task Details.
    *
    * 
    * \param taskId The task id field value. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by including loc=true.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsTasksTaskIdGet(
            
            std::string taskId
            , 
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Actions.
    *
    * 
    * \param workflowId The workflow id field value. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by including loc=true. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsWorkflowIdActionsGet(
            
            std::string workflowId
            , 
            
            std::string loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Action Details.
    *
    * 
    * \param workflowId The workflow id field value. *Required*
    * \param workflowAction The workflow action name retrieved from Retrieve Workflow Actions. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(
            
            std::string workflowId
            , 
            
            std::string workflowAction
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Workflow Action.
    *
    * 
    * \param workflowId The workflow id field value. *Required*
    * \param workflowAction The workflow action name retrieved from Retrieve Workflow Actions. *Required*
    * \param documentsSys Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(
            
            std::string workflowId
            , 
            
            std::string workflowAction
            , 
            
            std::string documentsSys
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Workflow Details.
    *
    * 
    * \param workflowId The workflow id field value. *Required*
    * \param loc When localized (translated) strings are available, retrieve them by including loc=true.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsObjectworkflowsWorkflowIdGet(
            
            std::string workflowId
            , 
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Picklists.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsPicklistsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Picklist Values.
    *
    * 
    * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsPicklistsPicklistNameGet(
            
            std::string picklistName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Inactivate Picklist Value.
    *
    * 
    * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
    * \param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.) *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsPicklistsPicklistNamePicklistValueNameDelete(
            
            std::string picklistName
            , 
            
            std::string picklistValueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Picklist Value.
    *
    * 
    * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
    * \param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.) *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsPicklistsPicklistNamePicklistValueNamePut(
            
            std::string picklistName
            , 
            
            std::string picklistValueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Picklist Values.
    *
    * 
    * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsPicklistsPicklistNamePost(
            
            std::string picklistName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Picklist Value Label.
    *
    * 
    * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsPicklistsPicklistNamePut(
            
            std::string picklistName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Build Production Vault.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxActionsBuildproductionPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Promote to Production.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxActionsPromoteproductionPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Recheck Sandbox Usage Limit.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxActionsRecheckusagePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Change Sandbox Size.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxBatchChangesizePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Set Sandbox Entitlements.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxEntitlementsSetPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Sandboxes.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Sandbox.
    *
    * 
    * \param name The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxNameDelete(
            
            std::string name
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create or Refresh Sandbox.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Sandbox Snapshot.
    *
    * 
    * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxSnapshotApiNameActionsUpdatePost(
            
            std::string apiName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Upgrade Sandbox Snapshot.
    *
    * 
    * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxSnapshotApiNameActionsUpgradePost(
            
            std::string apiName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Sandbox Snapshot.
    *
    * 
    * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxSnapshotApiNameDelete(
            
            std::string apiName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Sandbox Snapshots.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxSnapshotGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Sandbox Snapshot.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxSnapshotPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Refresh Sandbox from Snapshot.
    *
    * 
    * \param vaultId The Vault ID of the sandbox to be refreshed. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxVaultIdActionsRefreshPost(
            
            std::string vaultId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Sandbox Details by ID.
    *
    * 
    * \param vaultId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSandboxVaultIdGet(
            
            std::string vaultId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Security Policies.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSecuritypoliciesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Security Policy.
    *
    * 
    * \param securityPolicyName Security policy name__v field value (retrieved from previous request). This is typically a numeric value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsSecuritypoliciesSecurityPolicyNameGet(
            
            std::string securityPolicyName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Users.
    *
    * 
    * \param vaults Retrieve all users assigned to all Vaults in your domain.
    * \param excludeVaultMembership Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
    * \param excludeAppLicensing Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersGet(
            
            std::string vaults
            , 
            
            std::string excludeVaultMembership
            , 
            
            std::string excludeAppLicensing
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve User.
    *
    * 
    * \param id The user id field value. Use the value me to get information for the currently authenticated user. *Required*
    * \param excludeVaultMembership Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
    * \param excludeAppLicensing Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersIdGet(
            
            std::string id
            , 
            
            std::string excludeVaultMembership
            , 
            
            std::string excludeAppLicensing
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve User Permissions.
    *
    * 
    * \param id The ID of the user. Use the value me to retrieve information for the currently authenticated user. *Required*
    * \param filter Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersIdPermissionsGet(
            
            std::string id
            , 
            
            std::string filter
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Single User.
    *
    * 
    * \param id The user id field value. Use the value me to get information for the currently authenticated user. *Required*
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersIdPut(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Validate Session User.
    *
    * 
    * \param excludeVaultMembership Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
    * \param excludeAppLicensing Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersMeGet(
            
            std::string excludeVaultMembership
            , 
            
            std::string excludeAppLicensing
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Change My Password.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersMePasswordPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve My User Permissions.
    *
    * 
    * \param filter Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersMePermissionsGet(
            
            std::string filter
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update My User.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersMePut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Single User.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Multiple Users.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersPut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Disable User.
    *
    * 
    * \param userId The user id field value.  *Required*
    * \param domain When true, this disables the user account in all vaults in the domain.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersUserIdDelete(
            
            std::string userId
            , 
            
            bool domain
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Vault Membership.
    *
    * 
    * \param userId The user id field value. *Required*
    * \param vaultId The system-managed id field value assigned to each vault in the domain. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsUsersUserIdVaultMembershipVaultIdPut(
            
            std::string userId
            , 
            
            std::string vaultId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Vault Compare.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsVaultActionsComparePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Vault Configuration Report.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    objectsVaultActionsConfigreportPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Component Definition Query.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    queryComponentsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Next Page URL.
    *
    * 
    * \param nextPage  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIDescribeQuery 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    queryNextPagePost(
            
            std::string nextPage
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIDescribeQuery
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Submitting a Query.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIDescribeQuery 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    queryPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIDescribeQuery
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Previous Page URL.
    *
    * 
    * \param previousPage  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIDescribeQuery 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    queryPreviousPagePost(
            
            std::string previousPage
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIDescribeQuery
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Current User with SCIM.
    *
    * 
    * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
    * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2MeGet(
            
            std::string attributes
            , 
            
            std::string excludedAttributes
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Current User with SCIM.
    *
    * 
    * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
    * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2MePut(
            
            std::string attributes
            , 
            
            std::string excludedAttributes
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All SCIM Resource Types.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2ResourceTypesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single SCIM Resource Type.
    *
    * 
    * \param type A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2ResourceTypesTypeGet(
            
            std::string type
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All SCIM Schema Information.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2SchemasGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single SCIM Schema Information.
    *
    * 
    * \param id The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2SchemasIdGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve SCIM Provider.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2ServiceProviderConfigGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve SCIM Resources.
    *
    * 
    * \param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. *Required*
    * \param filter Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
    * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
    * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
    * \param sortBy Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
    * \param sortOrder Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
    * \param startIndex Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2TypeGet(
            
            std::string type
            , 
            
            std::string filter
            , 
            
            std::string attributes
            , 
            
            std::string excludedAttributes
            , 
            
            std::string sortBy
            , 
            
            std::string sortOrder
            , 
            
            std::string startIndex
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single SCIM Resource.
    *
    * 
    * \param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. *Required*
    * \param id The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. *Required*
    * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
    * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2TypeIdGet(
            
            std::string type
            , 
            
            std::string id
            , 
            
            std::string attributes
            , 
            
            std::string excludedAttributes
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Users with SCIM.
    *
    * 
    * \param filter Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
    * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
    * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
    * \param sortBy Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
    * \param sortOrder Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending.
    * \param count Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
    * \param startIndex Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2UsersGet(
            
            std::string filter
            , 
            
            std::string attributes
            , 
            
            std::string excludedAttributes
            , 
            
            std::string sortBy
            , 
            
            std::string sortOrder
            , 
            
            std::string count
            , 
            
            std::string startIndex
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single User with SCIM.
    *
    * 
    * \param id The id of the user you wish to update. *Required*
    * \param filter Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
    * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
    * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2UsersIdGet(
            
            std::string id
            , 
            
            std::string filter
            , 
            
            std::string attributes
            , 
            
            std::string excludedAttributes
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update User with SCIM.
    *
    * 
    * \param id The id of the user you wish to update. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2UsersIdPut(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create User with SCIM.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    scimV2UsersPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Signing Certificate.
    *
    * 
    * \param certId The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesCertificateCertIdGet(
            
            std::string certId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Disable Configuration Mode.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesConfigurationModeActionsDisablePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Enable Configuration Mode.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesConfigurationModeActionsEnablePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Available Direct Data Files.
    *
    * 
    * \param extractType The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
    * \param startTime Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
    * \param stopTime Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesDirectdataFilesGet(
            
            std::string extractType
            , 
            
            int startTime
            , 
            
            int stopTime
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Direct Data File.
    *
    * 
    * \param name The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesDirectdataFilesNameGet(
            
            std::string name
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Item Content.
    *
    * 
    * \param item The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
    * \param authorization 
    * \param accept 
    * \param range Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format `bytes={min}-{max}`. For example, `bytes=0-1000`.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingItemsContentItemGet(
            
            std::string item
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string range
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete File or Folder.
    *
    * 
    * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
    * \param recursive Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingItemsItemDelete(
            
            std::string item
            , 
            
            std::string recursive
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * List Items at a Path.
    *
    * 
    * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
    * \param recursive If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
    * \param limit Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
    * \param formatResult If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingItemsItemGet(
            
            std::string item
            , 
            
            std::string recursive
            , 
            
            std::string limit
            , 
            
            std::string formatResult
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Folder or File.
    *
    * 
    * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingItemsItemPut(
            
            std::string item
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Folder or File.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentMD5 Optional: The MD5 checksum of the file being uploaded.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingItemsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentMD5
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * List Upload Sessions.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Resumable Upload Session.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Abort Upload Session.
    *
    * 
    * \param uploadSessionId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadUploadSessionIdDelete(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Get Upload Session Details.
    *
    * 
    * \param uploadSessionId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadUploadSessionIdGet(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * List File Parts Uploaded to Session.
    *
    * 
    * \param uploadSessionId  *Required*
    * \param limit Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadUploadSessionIdPartsGet(
            
            std::string uploadSessionId
            , 
            
            std::string limit
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Commit Upload Session.
    *
    * 
    * \param uploadSessionId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadUploadSessionIdPost(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Upload to a Session.
    *
    * 
    * \param uploadSessionId  *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIFilePartNumber The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
    * \param contentMD5 Optional: The MD5 checksum of the file part being uploaded.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesFileStagingUploadUploadSessionIdPut(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIFilePartNumber
            , 
            
            std::string contentMD5
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Job Histories.
    *
    * 
    * \param startDate Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
    * \param endDate Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
    * \param status Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses.
    * \param limit Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsHistoriesGet(
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            std::string status
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Import Bulk Translation File Job Errors.
    *
    * 
    * \param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsJobIdErrorsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Job Status.
    *
    * 
    * \param jobId The ID of the job, returned from the original job request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsJobIdGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Import Bulk Translation File Job Summary.
    *
    * 
    * \param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsJobIdSummaryGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve SDK Job Tasks.
    *
    * 
    * \param jobId The ID of the SDK job, returned from the original job request. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsJobIdTasksGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Job Monitors.
    *
    * 
    * \param startDate Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
    * \param endDate Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
    * \param status Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses.
    * \param limit Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsMonitorsGet(
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            std::string status
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Start Job.
    *
    * 
    * \param jobId The ID of the scheduled job instance to start. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesJobsStartNowJobIdPost(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Extract Data Files.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesLoaderExtractPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Load Failure Log Results.
    *
    * 
    * \param jobId The id value of the requested extract job. *Required*
    * \param taskId The id value of the requested extract task. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesLoaderJobIdTasksTaskIdFailurelogGet(
            
            std::string jobId
            , 
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Loader Extract Results.
    *
    * 
    * \param jobId The id value of the requested extract job. *Required*
    * \param taskId The id value of the requested extract task. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesLoaderJobIdTasksTaskIdResultsGet(
            
            std::string jobId
            , 
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Loader Extract Renditions Results.
    *
    * 
    * \param jobId The id value of the requested extract job. *Required*
    * \param taskId The id value of the requested extract task. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(
            
            std::string jobId
            , 
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Load Success Log Results.
    *
    * 
    * \param jobId The id value of the requested extract job. *Required*
    * \param taskId The id value of the requested extract task. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesLoaderJobIdTasksTaskIdSuccesslogGet(
            
            std::string jobId
            , 
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Load Data Objects.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesLoaderLoadPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Validate Package.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesPackageActionsValidatePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Export Package.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesPackagePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Import Package.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesPackagePut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Queues.
    *
    * 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesQueuesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Disable Delivery.
    *
    * 
    * \param queueName The name of a specific Queue. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesQueuesQueueNameActionsDisableDeliveryPut(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Enable Delivery.
    *
    * 
    * \param queueName The name of a specific Queue. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesQueuesQueueNameActionsEnableDeliveryPut(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Reset Queue.
    *
    * 
    * \param queueName The name of a specific Queue. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesQueuesQueueNameActionsResetPut(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Queue Status.
    *
    * 
    * \param queueName The name of a specific queue. For example, queue__c. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesQueuesQueueNameGet(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Validate Imported Package.
    *
    * 
    * \param packageId The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    servicesVobjectVaultPackageVPackageIdActionsValidatePost(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * End Session.
    *
    * 
    * \param accept 
    * \param authorization The Vault sessionId to end.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    sessionDelete(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Single Client Code Distribution.
    *
    * 
    * \param distributionName The name attribute of the client code distribution to download. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    uicodeDistributionsDistributionNameCodeGet(
            
            std::string distributionName
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Single Client Code Distribution.
    *
    * 
    * \param distributionName The name attribute of the client code distribution to delete. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    uicodeDistributionsDistributionNameDelete(
            
            std::string distributionName
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Single Client Code Distribution Metadata.
    *
    * 
    * \param distributionName The name attribute of the client code distribution to delete. *Required*
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    uicodeDistributionsDistributionNameGet(
            
            std::string distributionName
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve All Client Code Distribution Metadata.
    *
    * 
    * \param accept 
    * \param authorization 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    uicodeDistributionsGet(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Add or Replace Single Client Code Distribution.
    *
    * 
    * \param accept 
    * \param authorization 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    uicodeDistributionsPost(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Deploy Package.
    *
    * 
    * \param packageId The id field value of the vault_package__v object record used for deployment. See Import Package. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectVaultPackageVPackageIdActionsDeployPost(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Package Deploy Results.
    *
    * 
    * \param packageId The id field value of the vault_package__v object record used for deployment. See Deploy Package. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectVaultPackageVPackageIdActionsDeployResultsGet(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Results of Cascade Delete Job.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param jobStatus  *Required*
    * \param jobId  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(
            
            std::string objectName
            , 
            
            std::string jobStatus
            , 
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Results of Deep Copy Job.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param jobStatus The ID of the job, retrieved from the response of the job request. *Required*
    * \param jobId Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(
            
            std::string objectName
            , 
            
            std::string jobStatus
            , 
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create a Placeholder from an EDL Item.
    *
    * 
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsEdlItemVActionsCreateplaceholderPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Merge Records Job Log.
    *
    * 
    * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsMergesJobIdLogGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Record Merge Results.
    *
    * 
    * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsMergesJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Record Merge Status.
    *
    * 
    * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsMergesJobIdStatusGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Object Action on Multiple Records.
    *
    * 
    * \param objectName The object name__v field value. *Required*
    * \param actionName Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameActionsActionNamePost(
            
            std::string objectName
            , 
            
            std::string actionName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Change Object Type.
    *
    * 
    * \param objectName The name of the object. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameActionsChangetypePost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Record Merge.
    *
    * 
    * \param objectName The object name__v field value. For example, account__v. This object must have Enable Merges configured. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    * \param vobjectsObjectNameActionsMergePostRequestInner 
    */
    Response<
            String
        >
    vobjectsObjectNameActionsMergePost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            , 
            std::list<_vobjects__object_name__actions_merge_post_request_inner> vobjectsObjectNameActionsMergePostRequestInner
            
            
    );
    /**
    * Retrieve Roll-up Field Recalculation Status.
    *
    * 
    * \param objectName The name of the object for which to check the status of a Roll-up field recalculation. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameActionsRecalculaterollupsGet(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Recalculate Roll-up Fields.
    *
    * 
    * \param objectName The name of the object for which to check the status of a Roll-up field recalculation. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameActionsRecalculaterollupsPost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Corporate Currency Fields.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameActionsUpdatecorporatecurrencyPut(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Multiple Object Record Attachments.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param idParam 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameAttachmentsBatchDelete(
            
            std::string objectName
            , 
            
            std::string idParam
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Multiple Object Record Attachments.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameAttachmentsBatchPost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Multiple Object Record Attachment Descriptions.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameAttachmentsBatchPut(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Object Records.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param authorization 
    * \param contentType Can be text/csv or application/json
    * \param accept Can be text/csv or application/json
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameDelete(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record Roles.
    *
    * 
    * \param objectName The object name. *Required*
    * \param id The id of the document, binder, or object record. *Required*
    * \param roleName Optional: Include a role name to filter for a specific role. For example, owner__v. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameIdRolesRoleNameGet(
            
            std::string objectName
            , 
            
            std::string id
            , 
            
            std::string roleName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object User Actions Details.
    *
    * 
    * \param objectName The object name__v field value. *Required*
    * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
    * \param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdActionsActionNameGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string actionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Initiate Object Action on a Single Record.
    *
    * 
    * \param objectName The object name__v field value. *Required*
    * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
    * \param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
    * \param authorization 
    * \param contentType 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdActionsActionNamePost(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string actionName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Cascade Delete Object Record.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Deep Copy Object Record.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record User Actions.
    *
    * 
    * \param objectName The object name__v field value. *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param loc Optional: When true, retrieves localized (translated) strings for the label. 
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdActionsGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Attachment Field File.
    *
    * 
    * \param objectName The object name__v field value. For example, product__v. *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentFieldName The name of the Attachment field to update. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentFieldName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Attachment Field File.
    *
    * 
    * \param objectName The object name__v field value. For example, product__v. *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentFieldName The name of the Attachment field to update. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentFieldName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download All Attachment Field Files.
    *
    * 
    * \param objectName The object name__v field value. For example, product__v. *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Object Record Attachment.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record Attachment Metadata.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Object Record Attachment Description.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Delete Object Record Attachment Version.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download Object Record Attachment File.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion  *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record Attachment Version Metadata.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Restore Object Record Attachment Version.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param attachmentVersion The attachment version__v field value. *Required*
    * \param restore 
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string attachmentVersion
            , 
            
            bool restore
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record Attachment Versions.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param attachmentId The attachment id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string attachmentId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Download All Object Record Attachment Files.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsFileGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record Attachments.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create Object Record Attachment.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAttachmentsPost(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Complete Audit History for a Single Object Record.
    *
    * 
    * \param objectName The object name__v field value. *Required*
    * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
    * \param startDate Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. 
    * \param endDate Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
    * \param formatResult To request a CSV file of your audit history, use csv. 
    * \param limit Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
    * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
    * \param events Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events=Copy,Edit,Delete. If omitted, defaults to all audit events.
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdAudittrailGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string startDate
            , 
            
            std::string endDate
            , 
            
            std::string formatResult
            , 
            
            std::string limit
            , 
            
            std::string offset
            , 
            
            std::string events
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Object Record.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param objectRecordId The object record id field value. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameObjectRecordIdGet(
            
            std::string objectName
            , 
            
            std::string objectRecordId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Create & Upsert Object Records.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param idParam To upsert object records, add `idParam={field_name}` to the request endpoint. You can use any object field which has `unique` set to `true` in the object metadata. For example, `idParam=external_id__v`.
    * \param authorization 
    * \param contentType Can be text/csv or application/json
    * \param accept Can be text/csv or application/json
    * \param xVaultAPIMigrationMode If set to `true`, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
    * \param xVaultAPINoTriggers If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNamePost(
            
            std::string objectName
            , 
            
            std::string idParam
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            bool xVaultAPINoTriggers
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Update Object Records.
    *
    * 
    * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
    * \param authorization 
    * \param contentType Can be text/csv or application/json
    * \param accept Can be text/csv or application/json
    * \param xVaultAPIMigrationMode If set to `true`, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
    * \param xVaultAPINoTriggers If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNamePut(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            bool xVaultAPINoTriggers
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Remove Users & Groups from Roles on Object Records.
    *
    * 
    * \param objectName The name of the object where you want to remove roles. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameRolesDelete(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Assign Users & Groups to Roles on Object Records.
    *
    * 
    * \param objectName The name of the object where you want to remove roles. *Required*
    * \param authorization 
    * \param accept 
    * \param contentType 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsObjectNameRolesPost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
    );
    /**
    * Retrieve Outbound Package Dependencies.
    *
    * 
    * \param packageId The ID of the outbound_package__v record from which to retrieve dependencies. *Required*
    * \param authorization 
    * \param accept 
    * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
    */
    Response<
            String
        >
    vobjectsOutboundPackageVPackageIdDependenciesGet(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */