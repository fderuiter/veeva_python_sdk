import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

import { VobjectsObjectNameActionsMergePostRequestInner } from '../models/VobjectsObjectNameActionsMergePostRequestInner';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiApiGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiApiMdlComponentsComponentTypeAndRecordNameFilesGetRequest {
    /**
     * The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameFilesGet
     */
    componentTypeAndRecordName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameFilesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameFilesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameFilesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiApiMdlComponentsComponentTypeAndRecordNameGetRequest {
    /**
     * The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameGet
     */
    componentTypeAndRecordName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlComponentsComponentTypeAndRecordNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiApiMdlExecuteAsyncJobIdResultsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncJobIdResultsGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncJobIdResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncJobIdResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncJobIdResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiApiMdlExecuteAsyncPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecuteAsyncPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiApiMdlExecutePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecutePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecutePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlExecutePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiApiMdlFilesPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlFilesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlFilesPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlFilesPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiapiMdlFilesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiAudittrailAuditTrailTypeGetRequest {
    /**
     * The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    auditTrailType: string
    /**
     * Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    startDate?: string
    /**
     * Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    endDate?: string
    /**
     * Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    allDates?: string
    /**
     * To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    formatResult?: string
    /**
     * Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    offset?: string
    /**
     * This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    objects?: string
    /**
     * This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    events?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiaudittrailAuditTrailTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiAuthDiscoveryPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthDiscoveryPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthDiscoveryPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiAuthOauthSessionOathOidcProfileIdPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthOauthSessionOathOidcProfileIdPost
     */
    oathOidcProfileId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthOauthSessionOathOidcProfileIdPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthOauthSessionOathOidcProfileIdPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthOauthSessionOathOidcProfileIdPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiAuthPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiauthPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeClassNameDeleteRequest {
    /**
     * The fully qualified class name of your file.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDelete
     */
    className: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeClassNameDisablePutRequest {
    /**
     * The fully qualified class name of your file.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDisablePut
     */
    className: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDisablePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDisablePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDisablePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameDisablePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeClassNameEnablePutRequest {
    /**
     * The fully qualified class name of your file.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameEnablePut
     */
    className: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameEnablePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameEnablePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameEnablePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameEnablePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeClassNameGetRequest {
    /**
     * The fully qualified class name of your file.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameGet
     */
    className: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeClassNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeProfilerGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeProfilerPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeProfilerSessionNameActionsEndPostRequest {
    /**
     * The name of the session, for example,  baseline__c.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameActionsEndPost
     */
    sessionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameActionsEndPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameActionsEndPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameActionsEndPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeProfilerSessionNameDeleteRequest {
    /**
     * The name of the session, for example,  baseline__c.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameDelete
     */
    sessionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeProfilerSessionNameGetRequest {
    /**
     * The name of the session, for example,  baseline__c.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameGet
     */
    sessionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodeProfilerSessionNameResultsGetRequest {
    /**
     * The name of the session, for example,  baseline__c.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameResultsGet
     */
    sessionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodeProfilerSessionNameResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCodePutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicodePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCompositesTreesEdlHierarchyOrTemplateActionsListnodesPostRequest {
    /**
     * Choose to retrieve either edl_hierarchy__v or edl_template__v
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateActionsListnodesPost
     */
    edlHierarchyOrTemplate: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateActionsListnodesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateActionsListnodesPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateActionsListnodesPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateActionsListnodesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCompositesTreesEdlHierarchyOrTemplateGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateGet
     */
    edlHierarchyOrTemplate: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateGet
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyOrTemplateGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCompositesTreesEdlHierarchyVParentNodeIdChildrenGetRequest {
    /**
     * The ID of a parent node in the hierarchy.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenGet
     */
    parentNodeId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenGet
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiCompositesTreesEdlHierarchyVParentNodeIdChildrenPutRequest {
    /**
     * The ID of a parent node in the hierarchy.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenPut
     */
    parentNodeId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApicompositesTreesEdlHierarchyVParentNodeIdChildrenPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationComponentTypeAndRecordNameGetRequest {
    /**
     * The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeAndRecordNameGet
     */
    componentTypeAndRecordName: string
    /**
     * When localized (translated) strings are available, retrieve them by setting loc to true.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeAndRecordNameGet
     */
    loc?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeAndRecordNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeAndRecordNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeAndRecordNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationComponentTypeGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeGet
     */
    componentType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationComponentTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationObjectNameAndObjectTypeGetRequest {
    /**
     * The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjectNameAndObjectTypeGet
     */
    objectNameAndObjectType: string
    /**
     * When localized (translated) strings are available, retrieve them by setting loc to true.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjectNameAndObjectTypeGet
     */
    loc?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjectNameAndObjectTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjectNameAndObjectTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjectNameAndObjectTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationObjecttypeGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjecttypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjecttypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationObjecttypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationRoleAssignmentRuleDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationRoleAssignmentRuleGetRequest {
    /**
     * Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    lifecycleV?: string
    /**
     * Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    roleV?: string
    /**
     * Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    productV?: string
    /**
     * Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    countryV?: string
    /**
     * In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    studyV?: string
    /**
     * In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    studyCountryV?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRuleGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationRoleAssignmentRulePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiConfigurationRoleAssignmentRulePutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiconfigurationRoleAssignmentRulePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiDelegationLoginPostRequest {
    /**
     * The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApidelegationLoginPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApidelegationLoginPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApidelegationLoginPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiDelegationVaultsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApidelegationVaultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApidelegationVaultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApidelegationVaultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiKeepAlivePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApikeepAlivePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApikeepAlivePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApikeepAlivePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLimitsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilimitsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilimitsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilimitsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsApiUsageGetRequest {
    /**
     * The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsApiUsageGet
     */
    date?: string
    /**
     * Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsApiUsageGet
     */
    logFormat?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsApiUsageGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsApiUsageGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsApiUsageGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeDebugGetRequest {
    /**
     * Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugGet
     */
    userId?: string
    /**
     * Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApilogsCodeDebugGet
     */
    includeInactive?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeDebugIdActionsResetDeleteRequest {
    /**
     * The ID of the debug log to delete.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetDelete
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeDebugIdActionsResetPostRequest {
    /**
     * The ID of the debug log to delete.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetPost
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdActionsResetPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeDebugIdFilesGetRequest {
    /**
     * The ID of the debug log to download.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdFilesGet
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdFilesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdFilesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdFilesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeDebugIdGetRequest {
    /**
     * The ID of the debug log to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdGet
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeDebugPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeDebugPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiLogsCodeRuntimeGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeRuntimeGet
     */
    date?: string
    /**
     * Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeRuntimeGet
     */
    logFormat?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeRuntimeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeRuntimeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApilogsCodeRuntimeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMessagesMessageTypeActionsImportPostRequest {
    /**
     * The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeActionsImportPost
     */
    messageType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeActionsImportPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeActionsImportPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeActionsImportPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMessagesMessageTypeLanguageLangActionsExportPostRequest {
    /**
     * The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeLanguageLangActionsExportPost
     */
    messageType: string
    /**
     * A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeLanguageLangActionsExportPost
     */
    lang: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeLanguageLangActionsExportPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeLanguageLangActionsExportPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimessagesMessageTypeLanguageLangActionsExportPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataAudittrailAuditTrailTypeGetRequest {
    /**
     * The name of the specified audit type (document_audit_trail, object_audit_trail, etc).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailAuditTrailTypeGet
     */
    auditTrailType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailAuditTrailTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailAuditTrailTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailAuditTrailTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataAudittrailGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataAudittrailGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataComponentsComponentTypeGetRequest {
    /**
     * The component type name (Picklist, Docfield, Doctype, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsComponentTypeGet
     */
    componentType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsComponentTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsComponentTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsComponentTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataComponentsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataComponentsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsBindersTemplatesBindernodesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsBindersTemplatesBindernodesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsBindersTemplatesBindernodesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsBindersTemplatesBindernodesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsBindersTemplatesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsBindersTemplatesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsBindersTemplatesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsBindersTemplatesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetRequest {
    /**
     * The name of the placemark type. For example, sticky__sys.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet
     */
    placemarkType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet
     */
    referenceType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetRequest {
    /**
     * The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet
     */
    annotationType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetRequest {
    /**
     * The event type. For example, distribution__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet
     */
    eventType: string
    /**
     * The event subtype. For example, approved_email__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet
     */
    eventSubtype: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsEventsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsEventsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsLockGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsLockGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsLockGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsLockGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsPropertiesFindCommonPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesFindCommonPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesFindCommonPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesFindCommonPost
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesFindCommonPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsPropertiesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsPropertiesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsTemplatesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTemplatesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTemplatesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTemplatesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsTypesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsTypesTypeGetRequest {
    /**
     * The document type. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeGet
     */
    type: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsTypesTypeRelationshipsGetRequest {
    /**
     * The document type. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeRelationshipsGet
     */
    type: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeRelationshipsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeRelationshipsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeRelationshipsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetRequest {
    /**
     * The document type. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
     */
    type: string
    /**
     * The document subtype. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
     */
    subtype: string
    /**
     * The document classification. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
     */
    classification: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsDocumentsTypesTypeSubtypesSubtypeGetRequest {
    /**
     * The document type. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet
     */
    type: string
    /**
     * The document subtype. See Retrieve Document Types.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet
     */
    subtype: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsGroupsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsGroupsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsGroupsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsGroupsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsSecuritypoliciesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsSecuritypoliciesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsSecuritypoliciesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsSecuritypoliciesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataObjectsUsersGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsUsersGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsUsersGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataObjectsUsersGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataQueryDocumentsRelationshipsDocumentSignatureSysrGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataVobjectsGetRequest {
    /**
     * To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApimetadataVobjectsGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataVobjectsObjectNameActionsCanceldeploymentPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameActionsCanceldeploymentPost
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameActionsCanceldeploymentPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameActionsCanceldeploymentPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameActionsCanceldeploymentPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataVobjectsObjectNameFieldsObjectFieldNameGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameFieldsObjectFieldNameGet
     */
    objectName: string
    /**
     * The object field name value (id, name__v, external_id__v, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameFieldsObjectFieldNameGet
     */
    objectFieldName: string
    /**
     * To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApimetadataVobjectsObjectNameFieldsObjectFieldNameGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameFieldsObjectFieldNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameFieldsObjectFieldNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameFieldsObjectFieldNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataVobjectsObjectNameGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameGet
     */
    objectName: string
    /**
     * To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApimetadataVobjectsObjectNameGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataVobjectsObjectNamePageLayoutsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsGet
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiMetadataVobjectsObjectNamePageLayoutsLayoutNameGetRequest {
    /**
     * The name of the object from which to retrieve page layout metadata.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsLayoutNameGet
     */
    objectName: string
    /**
     * The name of the page layout from which to retrieve metadata.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsLayoutNameGet
     */
    layoutName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsLayoutNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsLayoutNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApimetadataVobjectsObjectNamePageLayoutsLayoutNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiNotificationsHistoriesGetRequest {
    /**
     * Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    startDate?: string
    /**
     * Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    endDate?: string
    /**
     * Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApinotificationsHistoriesGet
     */
    allDates?: boolean
    /**
     * To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    formatResult?: string
    /**
     * Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    offset?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApinotificationsHistoriesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsActionGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionGet
     */
    action: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsActionPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionPost
     */
    action: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsActionPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsCanceltasksPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCanceltasksPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCanceltasksPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCanceltasksPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCanceltasksPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsCancelworkflowsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCancelworkflowsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCancelworkflowsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCancelworkflowsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsCancelworkflowsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsReassigntasksPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReassigntasksPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReassigntasksPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReassigntasksPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReassigntasksPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectWorkflowActionsReplaceworkflowownerPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReplaceworkflowownerPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReplaceworkflowownerPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReplaceworkflowownerPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectWorkflowActionsReplaceworkflowownerPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersActionsExportJobIdResultsGetRequest {
    /**
     * The id value of the requested export job. This is returned with the export binder requests above.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersActionsExportJobIdResultsGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersActionsExportJobIdResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersActionsExportJobIdResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersActionsExportJobIdResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdActionsExportPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    binderId: string
    /**
     * to include source content or not
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    source?: boolean
    /**
     * to include viewable renditions
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    renditiontype?: string
    /**
     * to include all major versions
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    docversion?: string
    /**
     * to include all versions of attachments
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    attachments?: string
    /**
     * configurable filename metadata
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    _export?: string
    /**
     * to exclude document metadata csv
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    docfield?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsExportPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdActionsPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsPost
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdActionsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdBindingRulePutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdBindingRulePut
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdBindingRulePut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdBindingRulePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdBindingRulePut
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdBindingRulePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdDeleteRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDelete
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdDocumentsNodeIdBindingRulePutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsNodeIdBindingRulePut
     */
    binderId: string
    /**
     * The binder node id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsNodeIdBindingRulePut
     */
    nodeId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsNodeIdBindingRulePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsNodeIdBindingRulePut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsNodeIdBindingRulePut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsNodeIdBindingRulePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdDocumentsPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsPost
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdDocumentsSectionIdDeleteRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdDelete
     */
    binderId: string
    /**
     * The binder node id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdDelete
     */
    sectionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdDocumentsSectionIdPutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdPut
     */
    binderId: string
    /**
     * The binder node id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdPut
     */
    sectionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdDocumentsSectionIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdGetRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdGet
     */
    binderId: string
    /**
     * To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdGet
     */
    depth?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPost
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdPutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPut
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteRequest {
    /**
     * The id value of the binder from which to remove roles.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
     */
    binderId: string
    /**
     * The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
     */
    roleNameAndUserOrGroup: string
    /**
     * The id value of the user or group to remove from the role.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdSectionsNodeIdBindingRulePutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdBindingRulePut
     */
    binderId: string
    /**
     * The binder node id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdBindingRulePut
     */
    nodeId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdBindingRulePut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdBindingRulePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdBindingRulePut
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdBindingRulePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdSectionsNodeIdPutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdPut
     */
    binderId: string
    /**
     * The binder node id of the section.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdPut
     */
    nodeId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsNodeIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdSectionsPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsPost
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdSectionsSectionIdDeleteRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdDelete
     */
    binderId: string
    /**
     * The binder node id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdDelete
     */
    sectionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdSectionsSectionIdGetRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdGet
     */
    binderId: string
    /**
     * The binder node id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdGet
     */
    sectionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdSectionsSectionIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsGetRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsGet
     */
    binderId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    minorVersion: string
    /**
     * to include source content or not
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    source?: boolean
    /**
     * to include viewable renditions
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    renditiontype?: string
    /**
     * to include all major versions
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    docversion?: string
    /**
     * to include all versions of attachments
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    attachments?: string
    /**
     * configurable filename metadata
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    _export?: string
    /**
     * to exclude document metadata csv
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    docfield?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionGetRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionPutRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    minorVersion: string
    /**
     * The binder relationship id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    relationshipId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    minorVersion: string
    /**
     * The binder relationship id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    relationshipId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetRequest {
    /**
     * The binder id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    binderId: string
    /**
     * The binder major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    majorVersion: string
    /**
     * The binder minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    minorVersion: string
    /**
     * Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    sectionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersIdRolesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesGet
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersIdRolesPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesPost
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersIdRolesRoleNameGetRequest {
    /**
     * The binder &#x60;id&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesRoleNameGet
     */
    id: string
    /**
     * The name of the role to retrieve. For example, &#x60;owner__v&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesRoleNameGet
     */
    roleName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesRoleNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesRoleNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdRolesRoleNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetRequest {
    /**
     * The binder id field value from which to retrieve available user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    id: string
    /**
     * The major version number of the binder.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    majorVersion: string
    /**
     * The minor version number of the binder.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRequest {
    /**
     * The binder id field value from which to retrieve available user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    id: string
    /**
     * The major version number of the binder.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    majorVersion: string
    /**
     * The minor version number of the binder.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    minorVersion: string
    /**
     * The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    nameV: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRequest {
    /**
     * The binder id field value from which to retrieve available user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    id: string
    /**
     * The major version number of the binder.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    majorVersion: string
    /**
     * The minor version number of the binder.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    minorVersion: string
    /**
     * The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    nameV: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersLifecycleActionsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersLifecycleActionsUserActionNamePutRequest {
    /**
     * The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsUserActionNamePut
     */
    userActionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsUserActionNamePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsUserActionNamePut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsUserActionNamePut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersLifecycleActionsUserActionNamePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersPostRequest {
    /**
     * When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data. 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsBindersPost
     */
    async?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesTemplateNameBindernodesGetRequest {
    /**
     * The binder template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesGet
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesTemplateNameBindernodesPostRequest {
    /**
     * The binder template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPost
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesTemplateNameBindernodesPutRequest {
    /**
     * The binder template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPut
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameBindernodesPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesTemplateNameDeleteRequest {
    /**
     * The binder template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameDelete
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsBindersTemplatesTemplateNameGetRequest {
    /**
     * The binder template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameGet
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsBindersTemplatesTemplateNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDeletionsDocumentsGetRequest {
    /**
     * Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsDocumentsGet
     */
    startDate?: string
    /**
     * Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsDocumentsGet
     */
    endDate?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsDocumentsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsDocumentsGet
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsDocumentsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsDocumentsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDeletionsVobjectsObjectNameGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsVobjectsObjectNameGet
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsVobjectsObjectNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsVobjectsObjectNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDeletionsVobjectsObjectNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsActionsGetRequest {
    /**
     * When localized (translated) strings are available, retrieve them by setting loc to true.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsActionsGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetRequest {
    /**
     * The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet
     */
    lifecycleAndStateAndAction: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsActionsWorkflowNameGetRequest {
    /**
     * The document workflow name value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNameGet
     */
    workflowName: string
    /**
     * When localized (translated) strings are available, retrieve them by setting loc to true.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNameGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsActionsWorkflowNamePostRequest {
    /**
     * The document workflow name value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNamePost
     */
    workflowName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNamePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNamePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNamePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsActionsWorkflowNamePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsAnnotationsBatchDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsAnnotationsBatchPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPost
     */
    authorization: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPost
     */
    contentType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPost
     */
    accept: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPost
     */
    xVaultAPIClientID: string
}

export interface DefaultApiObjectsDocumentsAnnotationsBatchPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsBatchPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsAnnotationsRepliesBatchPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsRepliesBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsRepliesBatchPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsRepliesBatchPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAnnotationsRepliesBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsAttachmentsBatchDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsAttachmentsBatchPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsAttachmentsBatchPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsAttachmentsBatchPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchActionsFileextractJobIdResultsGetRequest {
    /**
     * The id value of the requested export job. This is returned with the export document requests.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractJobIdResultsGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractJobIdResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractJobIdResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractJobIdResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchActionsFileextractPostRequest {
    /**
     * Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    source?: boolean
    /**
     * Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    renditions?: boolean
    /**
     * Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    allversions?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsFileextractPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchActionsReclassifyPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsReclassifyPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsReclassifyPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsReclassifyPut
     */
    accept?: string
    /**
     * When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsBatchActionsReclassifyPut
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsReclassifyPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchActionsRerenderPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsRerenderPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsRerenderPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsRerenderPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchActionsRerenderPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchDeleteRequest {
    /**
     * If you’re identifying documents in your input by their external ID
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchDelete
     */
    idParam?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchLockDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchLockDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchLockDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchLockDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchLockDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPost
     */
    contentType?: string
    /**
     * When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsBatchPost
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsBatchPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPut
     */
    contentType?: string
    /**
     * When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsBatchPut
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsBatchPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAnchorsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnchorsGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnchorsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnchorsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnchorsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAnnotationsFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFileGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAnnotationsFilePostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFilePost
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFilePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFilePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFilePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAnnotationsFilePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdDelete
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdDelete
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdDelete
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdGet
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdGet
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdPutRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdPut
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdPut
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    attachmentVersion: string
    /**
     * The parameter restore must be set to true. 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    restore?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet
     */
    docId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsFileGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAttachmentsPostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsPost
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAttachmentsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdAudittrailGetRequest {
    /**
     * The document ID for which to retrieve audit history.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    docId: string
    /**
     * Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    startDate?: string
    /**
     * Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    endDate?: string
    /**
     * To request a CSV file of your audit history, use csv. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    formatResult?: string
    /**
     * Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    offset?: string
    /**
     * Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    events?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdAudittrailGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdDelete
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdEventsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdEventsGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdEventsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdEventsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdEventsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdFileGet
     */
    docId: string
    /**
     * Set to true to Check Out this document before retrieval. If omitted, defaults to false.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsDocIdFileGet
     */
    lockDocument?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdLockDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockDelete
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdLockGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdLockPostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockPost
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdLockPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdPostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPost
     */
    docId: string
    /**
     * Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPost
     */
    suppressRendition?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdPutRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPut
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPut
     */
    accept?: string
    /**
     * When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsDocIdPut
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdRenditionsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypeDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeDelete
     */
    docId: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeDelete
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypeGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeGet
     */
    docId: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeGet
     */
    renditionType: string
    /**
     * Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeGet
     */
    steadyState?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypePostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePost
     */
    docId: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePost
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypePutRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePut
     */
    docId: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePut
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRenditionsRenditionTypePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteRequest {
    /**
     * The id value of the document from which to remove roles.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
     */
    docId: string
    /**
     * The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
     */
    roleNameAndUserOrGroup: string
    /**
     * The id value of the user or group to remove from the role.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsGet
     */
    docId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    minorVersion: string
    /**
     * The annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    annotationId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    minorVersion: string
    /**
     * The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    annotationId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    minorVersion: string
    /**
     * Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    limit?: string
    /**
     * This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    offset?: string
    /**
     * The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    annotationTypes?: string
    /**
     * A unique identifier used to load requests with paginated results.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    paginationId?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    minorVersion: string
    /**
     * The id field value of the attachment.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    attachmentId: string
    /**
     * The version of the attachment.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    minorVersion: string
    /**
     * The id of the document attachment to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    attachmentId: string
    /**
     * Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetRequest {
    /**
     * The video document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
     */
    docId: string
    /**
     * The video document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
     */
    majorVersion: string
    /**
     * The video document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
     */
    authorization?: string
    /**
     * This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPutRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    accept?: string
    /**
     * When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    minorVersion: string
    /**
     * The relationship id field value. See Retrieve Document Relationships.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    relationshipId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    minorVersion: string
    /**
     * The relationship id field value. See Retrieve Document Relationships.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    relationshipId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    minorVersion: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    minorVersion: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    minorVersion: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    minorVersion: string
    /**
     * The document rendition type.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    renditionType: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetRequest {
    /**
     * The document id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
     */
    docId: string
    /**
     * The document major_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
     */
    majorVersion: string
    /**
     * The document minor_version_number__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsGetRequest {
    /**
     * Retrieves only documents which you have created.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    namedFilter?: string
    /**
     * Searches only within the document content.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    scope?: string
    /**
     * Retrieves all document versions, rather than only the latest version.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    versionscope?: string
    /**
     * Search for documents based on a {keyword} in searchable document fields.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    search?: string
    /**
     * See VQL documentation for more information.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    limit?: string
    /**
     * See VQL documentation for more information.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    sort?: string
    /**
     * See VQL documentation for more information.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    start?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsIdRolesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesGet
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsIdRolesPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesPost
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsIdRolesRoleNameGetRequest {
    /**
     * The document &#x60;id&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesRoleNameGet
     */
    id: string
    /**
     * The name of the role to retrieve. For example, &#x60;owner__v&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesRoleNameGet
     */
    roleName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesRoleNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesRoleNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdRolesRoleNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetRequest {
    /**
     * The document id field value from which to retrieve available user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    id: string
    /**
     * The major version number of the document.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    majorVersion: string
    /**
     * The minor version number of the document.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    minorVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRequest {
    /**
     * The document id field value from which to retrieve available user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    id: string
    /**
     * The major version number of the document.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    majorVersion: string
    /**
     * The minor version number of the document.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    minorVersion: string
    /**
     * The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    nameV: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRequest {
    /**
     * The document id field value from which to retrieve available user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    id: string
    /**
     * The major version number of the document.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    majorVersion: string
    /**
     * The minor version number of the document.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    minorVersion: string
    /**
     * The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    nameV: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsLifecycleActionsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsLifecycleActionsUserActionNamePutRequest {
    /**
     * The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsUserActionNamePut
     */
    userActionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsUserActionNamePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsUserActionNamePut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsUserActionNamePut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsLifecycleActionsUserActionNamePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsPost
     */
    accept?: string
    /**
     * When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsPost
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsRelationshipsBatchDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsRelationshipsBatchPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRelationshipsBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsRenditionsBatchDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsRenditionsBatchPostRequest {
    /**
     * If you’re identifying documents in your input by their external ID
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    idParam?: string
    /**
     * If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    largeSizeAsset?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    contentType?: string
    /**
     * Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRenditionsBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsRolesBatchDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchDelete
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsRolesBatchPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsRolesBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesTemplateNameDeleteRequest {
    /**
     * The document template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameDelete
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesTemplateNameFileGetRequest {
    /**
     * The document template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameFileGet
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesTemplateNameGetRequest {
    /**
     * The document template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameGet
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTemplatesTemplateNamePutRequest {
    /**
     * The document template name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNamePut
     */
    templateName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNamePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNamePut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTemplatesTemplateNamePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsTokensPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTokensPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTokensPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTokensPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsTokensPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsVersionsBatchActionsFileextractPostRequest {
    /**
     * Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsVersionsBatchActionsFileextractPost
     */
    source?: boolean
    /**
     * Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDocumentsVersionsBatchActionsFileextractPost
     */
    renditions?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchActionsFileextractPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchActionsFileextractPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchActionsFileextractPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchActionsFileextractPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsVersionsBatchDeleteRequest {
    /**
     * If you’re identifying documents in your input by their external ID
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchDelete
     */
    idParam?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchDelete
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDocumentsVersionsBatchPostRequest {
    /**
     * If you’re identifying documents in your input by their external ID
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchPost
     */
    idParam?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchPost
     */
    contentType?: string
    /**
     * Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchPost
     */
    xVaultAPIMigrationMode?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDocumentsVersionsBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDomainGetRequest {
    /**
     * To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsDomainGet
     */
    includeApplication?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainGet
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsDomainsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainsGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainsGet
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsDomainsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsEdlMatchedDocumentsBatchActionsAddPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsAddPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsAddPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsAddPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsAddPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsEdlMatchedDocumentsBatchActionsRemovePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsRemovePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsRemovePost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsRemovePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsEdlMatchedDocumentsBatchActionsRemovePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsGroupsAutoGetRequest {
    /**
     * Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsAutoGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsAutoGet
     */
    offset?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsAutoGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsAutoGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsAutoGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsGroupsGetRequest {
    /**
     * When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGet
     */
    includeImplied?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsGroupsGroupIdDeleteRequest {
    /**
     * The group id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdDelete
     */
    groupId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsGroupsGroupIdGetRequest {
    /**
     * The group id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdGet
     */
    groupId: string
    /**
     * When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsGroupsGroupIdGet
     */
    includeImplied?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsGroupsGroupIdPutRequest {
    /**
     * The group id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdPut
     */
    groupId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsGroupIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsGroupsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsGroupsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsLicensesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsLicensesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsLicensesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsLicensesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsActionsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsActionsWorkflowNameGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNameGet
     */
    workflowName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNameGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsActionsWorkflowNamePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNamePost
     */
    workflowName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNamePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNamePost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNamePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsActionsWorkflowNamePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsGetRequest {
    /**
     * To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    objectV?: string
    /**
     * To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    recordIdV?: string
    /**
     * To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    participant?: string
    /**
     * To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    statusV?: string
    /**
     * This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    offset?: string
    /**
     * This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    pageSize?: string
    /**
     * When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    loc?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksGetRequest {
    /**
     * To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    objectV?: string
    /**
     * To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    recordIdV?: string
    /**
     * To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    assigneeV?: string
    /**
     * To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    statusV?: string
    /**
     * This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    offset?: string
    /**
     * This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    pageSize?: string
    /**
     * When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    loc?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsAcceptPostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsAcceptPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsAcceptPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsAcceptPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsAcceptPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsAcceptPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsCancelPostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCancelPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCancelPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCancelPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCancelPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCancelPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsCompletePostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCompletePost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCompletePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCompletePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCompletePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsCompletePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsGetRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsGet
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPostRequest {
    /**
     * The id of the task to reassign.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsReassignPostRequest {
    /**
     * The id of the task to reassign.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsReassignPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsReassignPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsReassignPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsReassignPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsReassignPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsTaskActionGetRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet
     */
    taskId: string
    /**
     * The name of the task action retrieved from Retrieve Workflow Task Actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet
     */
    taskAction: string
    /**
     * When localized (translated) strings are available, retrieve them by including loc&#x3D;true. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet
     */
    loc?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsTaskActionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPostRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostRequest {
    /**
     * The id of the task.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsTasksTaskIdGetRequest {
    /**
     * The task id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdGet
     */
    taskId: string
    /**
     * When localized (translated) strings are available, retrieve them by including loc&#x3D;true.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsTasksTaskIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsWorkflowIdActionsGetRequest {
    /**
     * The workflow id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsGet
     */
    workflowId: string
    /**
     * When localized (translated) strings are available, retrieve them by including loc&#x3D;true. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsGet
     */
    loc?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGetRequest {
    /**
     * The workflow id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet
     */
    workflowId: string
    /**
     * The workflow action name retrieved from Retrieve Workflow Actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet
     */
    workflowAction: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPostRequest {
    /**
     * The workflow id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    workflowId: string
    /**
     * The workflow action name retrieved from Retrieve Workflow Actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    workflowAction: string
    /**
     * Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    documentsSys?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsObjectworkflowsWorkflowIdGetRequest {
    /**
     * The workflow id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdGet
     */
    workflowId: string
    /**
     * When localized (translated) strings are available, retrieve them by including loc&#x3D;true.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsObjectworkflowsWorkflowIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsPicklistsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsPicklistsPicklistNameGetRequest {
    /**
     * The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNameGet
     */
    picklistName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsPicklistsPicklistNamePicklistValueNameDeleteRequest {
    /**
     * The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNameDelete
     */
    picklistName: string
    /**
     * The picklist value name field value (north_america__c, south_america__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNameDelete
     */
    picklistValueName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsPicklistsPicklistNamePicklistValueNamePutRequest {
    /**
     * The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNamePut
     */
    picklistName: string
    /**
     * The picklist value name field value (north_america__c, south_america__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNamePut
     */
    picklistValueName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNamePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNamePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNamePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePicklistValueNamePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsPicklistsPicklistNamePostRequest {
    /**
     * The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePost
     */
    picklistName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsPicklistsPicklistNamePutRequest {
    /**
     * The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePut
     */
    picklistName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsPicklistsPicklistNamePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxActionsBuildproductionPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsBuildproductionPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsBuildproductionPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsBuildproductionPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsBuildproductionPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxActionsPromoteproductionPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsPromoteproductionPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsPromoteproductionPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsPromoteproductionPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsPromoteproductionPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxActionsRecheckusagePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsRecheckusagePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsRecheckusagePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsRecheckusagePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxActionsRecheckusagePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxBatchChangesizePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxBatchChangesizePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxBatchChangesizePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxBatchChangesizePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxBatchChangesizePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxEntitlementsSetPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxEntitlementsSetPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxEntitlementsSetPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxEntitlementsSetPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxEntitlementsSetPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxNameDeleteRequest {
    /**
     * The name of the sandbox vault to delete. This is the name which appears on the My Vaults page.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxNameDelete
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxSnapshotApiNameActionsUpdatePostRequest {
    /**
     * The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpdatePost
     */
    apiName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpdatePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpdatePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpdatePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxSnapshotApiNameActionsUpgradePostRequest {
    /**
     * The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpgradePost
     */
    apiName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpgradePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpgradePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameActionsUpgradePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxSnapshotApiNameDeleteRequest {
    /**
     * The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameDelete
     */
    apiName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotApiNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxSnapshotGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxSnapshotPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxSnapshotPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxVaultIdActionsRefreshPostRequest {
    /**
     * The Vault ID of the sandbox to be refreshed.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdActionsRefreshPost
     */
    vaultId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdActionsRefreshPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdActionsRefreshPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdActionsRefreshPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdActionsRefreshPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSandboxVaultIdGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdGet
     */
    vaultId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSandboxVaultIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSecuritypoliciesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsSecuritypoliciesSecurityPolicyNameGetRequest {
    /**
     * Security policy name__v field value (retrieved from previous request). This is typically a numeric value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesSecurityPolicyNameGet
     */
    securityPolicyName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesSecurityPolicyNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesSecurityPolicyNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsSecuritypoliciesSecurityPolicyNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersGetRequest {
    /**
     * Retrieve all users assigned to all Vaults in your domain.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersGet
     */
    vaults?: string
    /**
     * Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersGet
     */
    excludeVaultMembership?: string
    /**
     * Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersGet
     */
    excludeAppLicensing?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersIdGetRequest {
    /**
     * The user id field value. Use the value me to get information for the currently authenticated user.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdGet
     */
    id: string
    /**
     * Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdGet
     */
    excludeVaultMembership?: string
    /**
     * Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdGet
     */
    excludeAppLicensing?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersIdPermissionsGetRequest {
    /**
     * The ID of the user. Use the value me to retrieve information for the currently authenticated user.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPermissionsGet
     */
    id: string
    /**
     * Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPermissionsGet
     */
    filter?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPermissionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPermissionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPermissionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersIdPutRequest {
    /**
     * The user id field value. Use the value me to get information for the currently authenticated user.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPut
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersMeGetRequest {
    /**
     * Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMeGet
     */
    excludeVaultMembership?: string
    /**
     * Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMeGet
     */
    excludeAppLicensing?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersMePasswordPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePasswordPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePasswordPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePasswordPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePasswordPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersMePermissionsGetRequest {
    /**
     * Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePermissionsGet
     */
    filter?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePermissionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePermissionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePermissionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersMePutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersMePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersUserIdDeleteRequest {
    /**
     * The user id field value. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdDelete
     */
    userId: string
    /**
     * When true, this disables the user account in all vaults in the domain.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiobjectsUsersUserIdDelete
     */
    domain?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsUsersUserIdVaultMembershipVaultIdPutRequest {
    /**
     * The user id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdVaultMembershipVaultIdPut
     */
    userId: string
    /**
     * The system-managed id field value assigned to each vault in the domain.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdVaultMembershipVaultIdPut
     */
    vaultId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdVaultMembershipVaultIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdVaultMembershipVaultIdPut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdVaultMembershipVaultIdPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsUsersUserIdVaultMembershipVaultIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsVaultActionsComparePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsVaultActionsComparePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsVaultActionsComparePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsVaultActionsComparePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiObjectsVaultActionsConfigreportPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsVaultActionsConfigreportPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsVaultActionsConfigreportPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiobjectsVaultActionsConfigreportPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiQueryComponentsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryComponentsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryComponentsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryComponentsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryComponentsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiQueryNextPagePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryNextPagePost
     */
    nextPage: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryNextPagePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryNextPagePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiqueryNextPagePost
     */
    xVaultAPIDescribeQuery?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryNextPagePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryNextPagePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiQueryPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiqueryPost
     */
    xVaultAPIDescribeQuery?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiQueryPreviousPagePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPreviousPagePost
     */
    previousPage: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPreviousPagePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPreviousPagePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApiqueryPreviousPagePost
     */
    xVaultAPIDescribeQuery?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPreviousPagePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiqueryPreviousPagePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2MeGetRequest {
    /**
     * Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MeGet
     */
    attributes?: string
    /**
     * Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MeGet
     */
    excludedAttributes?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2MePutRequest {
    /**
     * Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MePut
     */
    attributes?: string
    /**
     * Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MePut
     */
    excludedAttributes?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MePut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MePut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2MePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2ResourceTypesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2ResourceTypesTypeGetRequest {
    /**
     * A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesTypeGet
     */
    type: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesTypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesTypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ResourceTypesTypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2SchemasGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2SchemasIdGetRequest {
    /**
     * The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasIdGet
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2SchemasIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2ServiceProviderConfigGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ServiceProviderConfigGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ServiceProviderConfigGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2ServiceProviderConfigGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2TypeGetRequest {
    /**
     * The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    type: string
    /**
     * Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    filter?: string
    /**
     * Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    attributes?: string
    /**
     * Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    excludedAttributes?: string
    /**
     * Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    sortBy?: string
    /**
     * Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    sortOrder?: string
    /**
     * Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    startIndex?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2TypeIdGetRequest {
    /**
     * The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    type: string
    /**
     * The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    id: string
    /**
     * Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    attributes?: string
    /**
     * Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    excludedAttributes?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2TypeIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2UsersGetRequest {
    /**
     * Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    filter?: string
    /**
     * Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    attributes?: string
    /**
     * Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    excludedAttributes?: string
    /**
     * Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    sortBy?: string
    /**
     * Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    sortOrder?: string
    /**
     * Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    count?: string
    /**
     * Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    startIndex?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2UsersIdGetRequest {
    /**
     * The id of the user you wish to update.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    id: string
    /**
     * Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    filter?: string
    /**
     * Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    attributes?: string
    /**
     * Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    excludedAttributes?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2UsersIdPutRequest {
    /**
     * The id of the user you wish to update.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdPut
     */
    id: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiScimV2UsersPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiscimV2UsersPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesCertificateCertIdGetRequest {
    /**
     * The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesCertificateCertIdGet
     */
    certId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesCertificateCertIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesCertificateCertIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesCertificateCertIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesConfigurationModeActionsDisablePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsDisablePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsDisablePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsDisablePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsDisablePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesConfigurationModeActionsEnablePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsEnablePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsEnablePost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsEnablePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesConfigurationModeActionsEnablePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesDirectdataFilesGetRequest {
    /**
     * The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesGet
     */
    extractType?: string
    /**
     * Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
     * Defaults to: undefined
     * @type number
     * @memberof DefaultApiservicesDirectdataFilesGet
     */
    startTime?: number
    /**
     * Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
     * Defaults to: undefined
     * @type number
     * @memberof DefaultApiservicesDirectdataFilesGet
     */
    stopTime?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesDirectdataFilesNameGetRequest {
    /**
     * The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesNameGet
     */
    name: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesNameGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesNameGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesDirectdataFilesNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingItemsContentItemGetRequest {
    /**
     * The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsContentItemGet
     */
    item: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsContentItemGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsContentItemGet
     */
    accept?: string
    /**
     * Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsContentItemGet
     */
    range?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsContentItemGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingItemsItemDeleteRequest {
    /**
     * The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemDelete
     */
    item: string
    /**
     * Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemDelete
     */
    recursive?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingItemsItemGetRequest {
    /**
     * The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    item: string
    /**
     * If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    recursive?: string
    /**
     * Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    limit?: string
    /**
     * If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    formatResult?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingItemsItemPutRequest {
    /**
     * The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemPut
     */
    item: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsItemPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingItemsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsPost
     */
    accept?: string
    /**
     * Optional: The MD5 checksum of the file being uploaded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsPost
     */
    contentMD5?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingItemsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadUploadSessionIdDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdDelete
     */
    uploadSessionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadUploadSessionIdGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdGet
     */
    uploadSessionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadUploadSessionIdPartsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPartsGet
     */
    uploadSessionId: string
    /**
     * Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPartsGet
     */
    limit?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPartsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPartsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPartsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadUploadSessionIdPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPost
     */
    uploadSessionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesFileStagingUploadUploadSessionIdPutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    uploadSessionId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    contentType?: string
    /**
     * The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    xVaultAPIFilePartNumber?: string
    /**
     * Optional: The MD5 checksum of the file part being uploaded.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    contentMD5?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesFileStagingUploadUploadSessionIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsHistoriesGetRequest {
    /**
     * Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    startDate?: string
    /**
     * Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    endDate?: string
    /**
     * Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    status?: string
    /**
     * Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    offset?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsHistoriesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsJobIdErrorsGetRequest {
    /**
     * The id value of the requested import job. This was returned from the Import Bulk Translation File request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdErrorsGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdErrorsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdErrorsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdErrorsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsJobIdGetRequest {
    /**
     * The ID of the job, returned from the original job request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsJobIdSummaryGetRequest {
    /**
     * The id value of the requested import job. This was returned from the Import Bulk Translation File request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdSummaryGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdSummaryGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdSummaryGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdSummaryGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsJobIdTasksGetRequest {
    /**
     * The ID of the SDK job, returned from the original job request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdTasksGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdTasksGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdTasksGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsJobIdTasksGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsMonitorsGetRequest {
    /**
     * Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    startDate?: string
    /**
     * Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    endDate?: string
    /**
     * Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    status?: string
    /**
     * Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    offset?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsMonitorsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesJobsStartNowJobIdPostRequest {
    /**
     * The ID of the scheduled job instance to start.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsStartNowJobIdPost
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsStartNowJobIdPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsStartNowJobIdPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesJobsStartNowJobIdPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesLoaderExtractPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderExtractPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderExtractPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderExtractPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderExtractPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesLoaderJobIdTasksTaskIdFailurelogGetRequest {
    /**
     * The id value of the requested extract job.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdFailurelogGet
     */
    jobId: string
    /**
     * The id value of the requested extract task.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdFailurelogGet
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdFailurelogGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdFailurelogGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdFailurelogGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesLoaderJobIdTasksTaskIdResultsGetRequest {
    /**
     * The id value of the requested extract job.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsGet
     */
    jobId: string
    /**
     * The id value of the requested extract task.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsGet
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesLoaderJobIdTasksTaskIdResultsRenditionsGetRequest {
    /**
     * The id value of the requested extract job.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsRenditionsGet
     */
    jobId: string
    /**
     * The id value of the requested extract task.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsRenditionsGet
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsRenditionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsRenditionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdResultsRenditionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesLoaderJobIdTasksTaskIdSuccesslogGetRequest {
    /**
     * The id value of the requested extract job.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdSuccesslogGet
     */
    jobId: string
    /**
     * The id value of the requested extract task.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdSuccesslogGet
     */
    taskId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdSuccesslogGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdSuccesslogGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderJobIdTasksTaskIdSuccesslogGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesLoaderLoadPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderLoadPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderLoadPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderLoadPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesLoaderLoadPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesPackageActionsValidatePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackageActionsValidatePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackageActionsValidatePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackageActionsValidatePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesPackagePostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesPackagePutRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePut
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesPackagePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesQueuesGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesQueuesQueueNameActionsDisableDeliveryPutRequest {
    /**
     * The name of a specific Queue.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsDisableDeliveryPut
     */
    queueName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsDisableDeliveryPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsDisableDeliveryPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsDisableDeliveryPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesQueuesQueueNameActionsEnableDeliveryPutRequest {
    /**
     * The name of a specific Queue.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsEnableDeliveryPut
     */
    queueName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsEnableDeliveryPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsEnableDeliveryPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsEnableDeliveryPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesQueuesQueueNameActionsResetPutRequest {
    /**
     * The name of a specific Queue.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsResetPut
     */
    queueName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsResetPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsResetPut
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameActionsResetPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesQueuesQueueNameGetRequest {
    /**
     * The name of a specific queue. For example, queue__c.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameGet
     */
    queueName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesQueuesQueueNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiServicesVobjectVaultPackageVPackageIdActionsValidatePostRequest {
    /**
     * The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesVobjectVaultPackageVPackageIdActionsValidatePost
     */
    packageId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesVobjectVaultPackageVPackageIdActionsValidatePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesVobjectVaultPackageVPackageIdActionsValidatePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiservicesVobjectVaultPackageVPackageIdActionsValidatePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiSessionDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApisessionDelete
     */
    accept?: string
    /**
     * The Vault sessionId to end.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApisessionDelete
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApisessionDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiUicodeDistributionsDistributionNameCodeGetRequest {
    /**
     * The name attribute of the client code distribution to download.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameCodeGet
     */
    distributionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameCodeGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameCodeGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameCodeGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiUicodeDistributionsDistributionNameDeleteRequest {
    /**
     * The name attribute of the client code distribution to delete.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameDelete
     */
    distributionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameDelete
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiUicodeDistributionsDistributionNameGetRequest {
    /**
     * The name attribute of the client code distribution to delete.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameGet
     */
    distributionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsDistributionNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiUicodeDistributionsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsGet
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsGet
     */
    authorization?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiUicodeDistributionsPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiuicodeDistributionsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectVaultPackageVPackageIdActionsDeployPostRequest {
    /**
     * The id field value of the vault_package__v object record used for deployment. See Import Package.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployPost
     */
    packageId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectVaultPackageVPackageIdActionsDeployResultsGetRequest {
    /**
     * The id field value of the vault_package__v object record used for deployment. See Deploy Package.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployResultsGet
     */
    packageId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectVaultPackageVPackageIdActionsDeployResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
     */
    jobStatus: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsDeepcopyResultsObjectNameJobStatusJobIdGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
     */
    objectName: string
    /**
     * The ID of the job, retrieved from the response of the job request.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
     */
    jobStatus: string
    /**
     * Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsDeepcopyResultsObjectNameJobStatusJobIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsEdlItemVActionsCreateplaceholderPostRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsEdlItemVActionsCreateplaceholderPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsEdlItemVActionsCreateplaceholderPost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsEdlItemVActionsCreateplaceholderPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsEdlItemVActionsCreateplaceholderPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsMergesJobIdLogGetRequest {
    /**
     * The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdLogGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdLogGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdLogGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdLogGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsMergesJobIdResultsGetRequest {
    /**
     * The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdResultsGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdResultsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdResultsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdResultsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsMergesJobIdStatusGetRequest {
    /**
     * The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdStatusGet
     */
    jobId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdStatusGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdStatusGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsMergesJobIdStatusGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameActionsActionNamePostRequest {
    /**
     * The object name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsActionNamePost
     */
    objectName: string
    /**
     * Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsActionNamePost
     */
    actionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsActionNamePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsActionNamePost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsActionNamePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsActionNamePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameActionsChangetypePostRequest {
    /**
     * The name of the object.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsChangetypePost
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsChangetypePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsChangetypePost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsChangetypePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsChangetypePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameActionsMergePostRequest {
    /**
     * The object name__v field value. For example, account__v. This object must have Enable Merges configured.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsMergePost
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsMergePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsMergePost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsMergePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsMergePost
     */
    xVaultAPIClientID?: string
    /**
     * 
     * @type Array&lt;VobjectsObjectNameActionsMergePostRequestInner&gt;
     * @memberof DefaultApivobjectsObjectNameActionsMergePost
     */
    vobjectsObjectNameActionsMergePostRequestInner?: Array<VobjectsObjectNameActionsMergePostRequestInner>
}

export interface DefaultApiVobjectsObjectNameActionsRecalculaterollupsGetRequest {
    /**
     * The name of the object for which to check the status of a Roll-up field recalculation.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsGet
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameActionsRecalculaterollupsPostRequest {
    /**
     * The name of the object for which to check the status of a Roll-up field recalculation.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsPost
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsPost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsRecalculaterollupsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameActionsUpdatecorporatecurrencyPutRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsUpdatecorporatecurrencyPut
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsUpdatecorporatecurrencyPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsUpdatecorporatecurrencyPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsUpdatecorporatecurrencyPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameActionsUpdatecorporatecurrencyPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameAttachmentsBatchDeleteRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchDelete
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchDelete
     */
    idParam?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameAttachmentsBatchPostRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPost
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameAttachmentsBatchPutRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPut
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameAttachmentsBatchPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameDeleteRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameDelete
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameDelete
     */
    authorization?: string
    /**
     * Can be text/csv or application/json
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameDelete
     */
    contentType?: string
    /**
     * Can be text/csv or application/json
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameIdRolesRoleNameGetRequest {
    /**
     * The object name.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameIdRolesRoleNameGet
     */
    objectName: string
    /**
     * The id of the document, binder, or object record.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameIdRolesRoleNameGet
     */
    id: string
    /**
     * Optional: Include a role name to filter for a specific role. For example, owner__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameIdRolesRoleNameGet
     */
    roleName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameIdRolesRoleNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameIdRolesRoleNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameIdRolesRoleNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdActionsActionNameGetRequest {
    /**
     * The object name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNameGet
     */
    objectName: string
    /**
     * The object record id field value from which to retrieve user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNameGet
     */
    objectRecordId: string
    /**
     * The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNameGet
     */
    actionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNameGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNameGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNameGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdActionsActionNamePostRequest {
    /**
     * The object name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    objectName: string
    /**
     * The object record id field value from which to retrieve user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    objectRecordId: string
    /**
     * The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    actionName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    contentType?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsActionNamePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdActionsCascadedeletePostRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsCascadedeletePost
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsCascadedeletePost
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsCascadedeletePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsCascadedeletePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsCascadedeletePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdActionsDeepcopyPostRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsDeepcopyPost
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsDeepcopyPost
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsDeepcopyPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsDeepcopyPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsDeepcopyPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsDeepcopyPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdActionsGetRequest {
    /**
     * The object name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsGet
     */
    objectRecordId: string
    /**
     * Optional: When true, retrieves localized (translated) strings for the label. 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsGet
     */
    loc?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdActionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetRequest {
    /**
     * The object name__v field value. For example, product__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
     */
    objectRecordId: string
    /**
     * The name of the Attachment field to update.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
     */
    attachmentFieldName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostRequest {
    /**
     * The object name__v field value. For example, product__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
     */
    objectRecordId: string
    /**
     * The name of the Attachment field to update.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
     */
    attachmentFieldName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetRequest {
    /**
     * The object name__v field value. For example, product__v.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    attachmentId: string
    /**
     * The attachment version__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    attachmentVersion: string
    /**
     * 
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    restore?: boolean
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
     */
    objectRecordId: string
    /**
     * The attachment id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
     */
    attachmentId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsFileGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsFileGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsFileGet
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsFileGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsFileGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsFileGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsGet
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsPostRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsPost
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsPost
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAttachmentsPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdAudittrailGetRequest {
    /**
     * The object name__v field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    objectName: string
    /**
     * The object record id field value from which to retrieve user actions.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    objectRecordId: string
    /**
     * Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    startDate?: string
    /**
     * Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    endDate?: string
    /**
     * To request a CSV file of your audit history, use csv. 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    formatResult?: string
    /**
     * Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    limit?: string
    /**
     * Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    offset?: string
    /**
     * Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    events?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdAudittrailGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameObjectRecordIdGetRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdGet
     */
    objectName: string
    /**
     * The object record id field value.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdGet
     */
    objectRecordId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameObjectRecordIdGet
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNamePostRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePost
     */
    objectName: string
    /**
     * To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePost
     */
    idParam?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePost
     */
    authorization?: string
    /**
     * Can be text/csv or application/json
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePost
     */
    contentType?: string
    /**
     * Can be text/csv or application/json
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePost
     */
    accept?: string
    /**
     * If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApivobjectsObjectNamePost
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApivobjectsObjectNamePost
     */
    xVaultAPINoTriggers?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNamePutRequest {
    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePut
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePut
     */
    authorization?: string
    /**
     * Can be text/csv or application/json
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePut
     */
    contentType?: string
    /**
     * Can be text/csv or application/json
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePut
     */
    accept?: string
    /**
     * If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApivobjectsObjectNamePut
     */
    xVaultAPIMigrationMode?: boolean
    /**
     * If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * Defaults to: undefined
     * @type boolean
     * @memberof DefaultApivobjectsObjectNamePut
     */
    xVaultAPINoTriggers?: boolean
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNamePut
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameRolesDeleteRequest {
    /**
     * The name of the object where you want to remove roles.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesDelete
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesDelete
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesDelete
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesDelete
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesDelete
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsObjectNameRolesPostRequest {
    /**
     * The name of the object where you want to remove roles.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesPost
     */
    objectName: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesPost
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesPost
     */
    accept?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesPost
     */
    contentType?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsObjectNameRolesPost
     */
    xVaultAPIClientID?: string
}

export interface DefaultApiVobjectsOutboundPackageVPackageIdDependenciesGetRequest {
    /**
     * The ID of the outbound_package__v record from which to retrieve dependencies.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsOutboundPackageVPackageIdDependenciesGet
     */
    packageId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsOutboundPackageVPackageIdDependenciesGet
     */
    authorization?: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsOutboundPackageVPackageIdDependenciesGet
     */
    accept?: string
    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApivobjectsOutboundPackageVPackageIdDependenciesGet
     */
    xVaultAPIClientID?: string
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve API Versions
     * @param param the request object
     */
    public apiGetWithHttpInfo(param: DefaultApiApiGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve API Versions
     * @param param the request object
     */
    public apiGet(param: DefaultApiApiGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Content File
     * @param param the request object
     */
    public apiMdlComponentsComponentTypeAndRecordNameFilesGetWithHttpInfo(param: DefaultApiApiMdlComponentsComponentTypeAndRecordNameFilesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiMdlComponentsComponentTypeAndRecordNameFilesGetWithHttpInfo(param.componentTypeAndRecordName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Content File
     * @param param the request object
     */
    public apiMdlComponentsComponentTypeAndRecordNameFilesGet(param: DefaultApiApiMdlComponentsComponentTypeAndRecordNameFilesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiMdlComponentsComponentTypeAndRecordNameFilesGet(param.componentTypeAndRecordName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Record (MDL)
     * @param param the request object
     */
    public apiMdlComponentsComponentTypeAndRecordNameGetWithHttpInfo(param: DefaultApiApiMdlComponentsComponentTypeAndRecordNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiMdlComponentsComponentTypeAndRecordNameGetWithHttpInfo(param.componentTypeAndRecordName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Record (MDL)
     * @param param the request object
     */
    public apiMdlComponentsComponentTypeAndRecordNameGet(param: DefaultApiApiMdlComponentsComponentTypeAndRecordNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiMdlComponentsComponentTypeAndRecordNameGet(param.componentTypeAndRecordName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     * @param param the request object
     */
    public apiMdlExecuteAsyncJobIdResultsGetWithHttpInfo(param: DefaultApiApiMdlExecuteAsyncJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiMdlExecuteAsyncJobIdResultsGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     * @param param the request object
     */
    public apiMdlExecuteAsyncJobIdResultsGet(param: DefaultApiApiMdlExecuteAsyncJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiMdlExecuteAsyncJobIdResultsGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Execute MDL Script Asynchronously
     * @param param the request object
     */
    public apiMdlExecuteAsyncPostWithHttpInfo(param: DefaultApiApiMdlExecuteAsyncPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiMdlExecuteAsyncPostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Execute MDL Script Asynchronously
     * @param param the request object
     */
    public apiMdlExecuteAsyncPost(param: DefaultApiApiMdlExecuteAsyncPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiMdlExecuteAsyncPost(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Execute MDL Script
     * @param param the request object
     */
    public apiMdlExecutePostWithHttpInfo(param: DefaultApiApiMdlExecutePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiMdlExecutePostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Execute MDL Script
     * @param param the request object
     */
    public apiMdlExecutePost(param: DefaultApiApiMdlExecutePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiMdlExecutePost(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upload Content File
     * @param param the request object
     */
    public apiMdlFilesPostWithHttpInfo(param: DefaultApiApiMdlFilesPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.apiMdlFilesPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upload Content File
     * @param param the request object
     */
    public apiMdlFilesPost(param: DefaultApiApiMdlFilesPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.apiMdlFilesPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Audit Details
     * @param param the request object
     */
    public audittrailAuditTrailTypeGetWithHttpInfo(param: DefaultApiAudittrailAuditTrailTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.audittrailAuditTrailTypeGetWithHttpInfo(param.auditTrailType, param.startDate, param.endDate, param.allDates, param.formatResult, param.limit, param.offset, param.objects, param.events, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Audit Details
     * @param param the request object
     */
    public audittrailAuditTrailTypeGet(param: DefaultApiAudittrailAuditTrailTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.audittrailAuditTrailTypeGet(param.auditTrailType, param.startDate, param.endDate, param.allDates, param.formatResult, param.limit, param.offset, param.objects, param.events, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Authentication Type Discovery
     * @param param the request object
     */
    public authDiscoveryPostWithHttpInfo(param: DefaultApiAuthDiscoveryPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.authDiscoveryPostWithHttpInfo(param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Authentication Type Discovery
     * @param param the request object
     */
    public authDiscoveryPost(param: DefaultApiAuthDiscoveryPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.authDiscoveryPost(param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * OAuth 2.0 / OpenID Connect
     * @param param the request object
     */
    public authOauthSessionOathOidcProfileIdPostWithHttpInfo(param: DefaultApiAuthOauthSessionOathOidcProfileIdPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.authOauthSessionOathOidcProfileIdPostWithHttpInfo(param.oathOidcProfileId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * OAuth 2.0 / OpenID Connect
     * @param param the request object
     */
    public authOauthSessionOathOidcProfileIdPost(param: DefaultApiAuthOauthSessionOathOidcProfileIdPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.authOauthSessionOathOidcProfileIdPost(param.oathOidcProfileId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * User Name and Password
     * @param param the request object
     */
    public authPostWithHttpInfo(param: DefaultApiAuthPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.authPostWithHttpInfo(param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * User Name and Password
     * @param param the request object
     */
    public authPost(param: DefaultApiAuthPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.authPost(param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Source Code File
     * @param param the request object
     */
    public codeClassNameDeleteWithHttpInfo(param: DefaultApiCodeClassNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeClassNameDeleteWithHttpInfo(param.className, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Source Code File
     * @param param the request object
     */
    public codeClassNameDelete(param: DefaultApiCodeClassNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeClassNameDelete(param.className, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable Vault Extension
     * @param param the request object
     */
    public codeClassNameDisablePutWithHttpInfo(param: DefaultApiCodeClassNameDisablePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeClassNameDisablePutWithHttpInfo(param.className, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable Vault Extension
     * @param param the request object
     */
    public codeClassNameDisablePut(param: DefaultApiCodeClassNameDisablePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeClassNameDisablePut(param.className, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Enable Vault Extension
     * @param param the request object
     */
    public codeClassNameEnablePutWithHttpInfo(param: DefaultApiCodeClassNameEnablePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeClassNameEnablePutWithHttpInfo(param.className, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Enable Vault Extension
     * @param param the request object
     */
    public codeClassNameEnablePut(param: DefaultApiCodeClassNameEnablePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeClassNameEnablePut(param.className, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single Source Code File
     * @param param the request object
     */
    public codeClassNameGetWithHttpInfo(param: DefaultApiCodeClassNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeClassNameGetWithHttpInfo(param.className, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single Source Code File
     * @param param the request object
     */
    public codeClassNameGet(param: DefaultApiCodeClassNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeClassNameGet(param.className, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Profiling Sessions
     * @param param the request object
     */
    public codeProfilerGetWithHttpInfo(param: DefaultApiCodeProfilerGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeProfilerGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Profiling Sessions
     * @param param the request object
     */
    public codeProfilerGet(param: DefaultApiCodeProfilerGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeProfilerGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Profiling Session
     * @param param the request object
     */
    public codeProfilerPostWithHttpInfo(param: DefaultApiCodeProfilerPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeProfilerPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Profiling Session
     * @param param the request object
     */
    public codeProfilerPost(param: DefaultApiCodeProfilerPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeProfilerPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * End Profiling Session
     * @param param the request object
     */
    public codeProfilerSessionNameActionsEndPostWithHttpInfo(param: DefaultApiCodeProfilerSessionNameActionsEndPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeProfilerSessionNameActionsEndPostWithHttpInfo(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * End Profiling Session
     * @param param the request object
     */
    public codeProfilerSessionNameActionsEndPost(param: DefaultApiCodeProfilerSessionNameActionsEndPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeProfilerSessionNameActionsEndPost(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Profiling Session
     * @param param the request object
     */
    public codeProfilerSessionNameDeleteWithHttpInfo(param: DefaultApiCodeProfilerSessionNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeProfilerSessionNameDeleteWithHttpInfo(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Profiling Session
     * @param param the request object
     */
    public codeProfilerSessionNameDelete(param: DefaultApiCodeProfilerSessionNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeProfilerSessionNameDelete(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Profiling Session
     * @param param the request object
     */
    public codeProfilerSessionNameGetWithHttpInfo(param: DefaultApiCodeProfilerSessionNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeProfilerSessionNameGetWithHttpInfo(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Profiling Session
     * @param param the request object
     */
    public codeProfilerSessionNameGet(param: DefaultApiCodeProfilerSessionNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeProfilerSessionNameGet(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Profiling Session Results
     * @param param the request object
     */
    public codeProfilerSessionNameResultsGetWithHttpInfo(param: DefaultApiCodeProfilerSessionNameResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codeProfilerSessionNameResultsGetWithHttpInfo(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Profiling Session Results
     * @param param the request object
     */
    public codeProfilerSessionNameResultsGet(param: DefaultApiCodeProfilerSessionNameResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.codeProfilerSessionNameResultsGet(param.sessionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add or Replace Single Source Code File
     * @param param the request object
     */
    public codePutWithHttpInfo(param: DefaultApiCodePutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.codePutWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add or Replace Single Source Code File
     * @param param the request object
     */
    public codePut(param: DefaultApiCodePutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.codePut(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Specific Root Nodes
     * @param param the request object
     */
    public compositesTreesEdlHierarchyOrTemplateActionsListnodesPostWithHttpInfo(param: DefaultApiCompositesTreesEdlHierarchyOrTemplateActionsListnodesPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.compositesTreesEdlHierarchyOrTemplateActionsListnodesPostWithHttpInfo(param.edlHierarchyOrTemplate, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Specific Root Nodes
     * @param param the request object
     */
    public compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(param: DefaultApiCompositesTreesEdlHierarchyOrTemplateActionsListnodesPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(param.edlHierarchyOrTemplate, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Root Nodes
     * @param param the request object
     */
    public compositesTreesEdlHierarchyOrTemplateGetWithHttpInfo(param: DefaultApiCompositesTreesEdlHierarchyOrTemplateGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.compositesTreesEdlHierarchyOrTemplateGetWithHttpInfo(param.edlHierarchyOrTemplate, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Root Nodes
     * @param param the request object
     */
    public compositesTreesEdlHierarchyOrTemplateGet(param: DefaultApiCompositesTreesEdlHierarchyOrTemplateGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.compositesTreesEdlHierarchyOrTemplateGet(param.edlHierarchyOrTemplate, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve a Node\'s Children
     * @param param the request object
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenGetWithHttpInfo(param: DefaultApiCompositesTreesEdlHierarchyVParentNodeIdChildrenGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenGetWithHttpInfo(param.parentNodeId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve a Node\'s Children
     * @param param the request object
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenGet(param: DefaultApiCompositesTreesEdlHierarchyVParentNodeIdChildrenGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenGet(param.parentNodeId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Node Order
     * @param param the request object
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenPutWithHttpInfo(param: DefaultApiCompositesTreesEdlHierarchyVParentNodeIdChildrenPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenPutWithHttpInfo(param.parentNodeId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Node Order
     * @param param the request object
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenPut(param: DefaultApiCompositesTreesEdlHierarchyVParentNodeIdChildrenPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenPut(param.parentNodeId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Record (XML/JSON)
     * @param param the request object
     */
    public configurationComponentTypeAndRecordNameGetWithHttpInfo(param: DefaultApiConfigurationComponentTypeAndRecordNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationComponentTypeAndRecordNameGetWithHttpInfo(param.componentTypeAndRecordName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Record (XML/JSON)
     * @param param the request object
     */
    public configurationComponentTypeAndRecordNameGet(param: DefaultApiConfigurationComponentTypeAndRecordNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationComponentTypeAndRecordNameGet(param.componentTypeAndRecordName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Record Collection
     * @param param the request object
     */
    public configurationComponentTypeGetWithHttpInfo(param: DefaultApiConfigurationComponentTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationComponentTypeGetWithHttpInfo(param.componentType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Record Collection
     * @param param the request object
     */
    public configurationComponentTypeGet(param: DefaultApiConfigurationComponentTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationComponentTypeGet(param.componentType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Details from a Specific Object
     * @param param the request object
     */
    public configurationObjectNameAndObjectTypeGetWithHttpInfo(param: DefaultApiConfigurationObjectNameAndObjectTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationObjectNameAndObjectTypeGetWithHttpInfo(param.objectNameAndObjectType, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Details from a Specific Object
     * @param param the request object
     */
    public configurationObjectNameAndObjectTypeGet(param: DefaultApiConfigurationObjectNameAndObjectTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationObjectNameAndObjectTypeGet(param.objectNameAndObjectType, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Details from All Object Types
     * @param param the request object
     */
    public configurationObjecttypeGetWithHttpInfo(param: DefaultApiConfigurationObjecttypeGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationObjecttypeGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Details from All Object Types
     * @param param the request object
     */
    public configurationObjecttypeGet(param: DefaultApiConfigurationObjecttypeGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationObjecttypeGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param param the request object
     */
    public configurationRoleAssignmentRuleDeleteWithHttpInfo(param: DefaultApiConfigurationRoleAssignmentRuleDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationRoleAssignmentRuleDeleteWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param param the request object
     */
    public configurationRoleAssignmentRuleDelete(param: DefaultApiConfigurationRoleAssignmentRuleDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationRoleAssignmentRuleDelete(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param param the request object
     */
    public configurationRoleAssignmentRuleGetWithHttpInfo(param: DefaultApiConfigurationRoleAssignmentRuleGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationRoleAssignmentRuleGetWithHttpInfo(param.lifecycleV, param.roleV, param.productV, param.countryV, param.studyV, param.studyCountryV, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param param the request object
     */
    public configurationRoleAssignmentRuleGet(param: DefaultApiConfigurationRoleAssignmentRuleGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationRoleAssignmentRuleGet(param.lifecycleV, param.roleV, param.productV, param.countryV, param.studyV, param.studyCountryV, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param param the request object
     */
    public configurationRoleAssignmentRulePostWithHttpInfo(param: DefaultApiConfigurationRoleAssignmentRulePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationRoleAssignmentRulePostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param param the request object
     */
    public configurationRoleAssignmentRulePost(param: DefaultApiConfigurationRoleAssignmentRulePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationRoleAssignmentRulePost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param param the request object
     */
    public configurationRoleAssignmentRulePutWithHttpInfo(param: DefaultApiConfigurationRoleAssignmentRulePutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.configurationRoleAssignmentRulePutWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param param the request object
     */
    public configurationRoleAssignmentRulePut(param: DefaultApiConfigurationRoleAssignmentRulePutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.configurationRoleAssignmentRulePut(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Delegated Session
     * @param param the request object
     */
    public delegationLoginPostWithHttpInfo(param: DefaultApiDelegationLoginPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.delegationLoginPostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Delegated Session
     * @param param the request object
     */
    public delegationLoginPost(param: DefaultApiDelegationLoginPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.delegationLoginPost(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Delegations
     * @param param the request object
     */
    public delegationVaultsGetWithHttpInfo(param: DefaultApiDelegationVaultsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.delegationVaultsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Delegations
     * @param param the request object
     */
    public delegationVaultsGet(param: DefaultApiDelegationVaultsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.delegationVaultsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Session Keep Alive
     * @param param the request object
     */
    public keepAlivePostWithHttpInfo(param: DefaultApiKeepAlivePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.keepAlivePostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Session Keep Alive
     * @param param the request object
     */
    public keepAlivePost(param: DefaultApiKeepAlivePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.keepAlivePost(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Limits on Objects
     * @param param the request object
     */
    public limitsGetWithHttpInfo(param: DefaultApiLimitsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.limitsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Limits on Objects
     * @param param the request object
     */
    public limitsGet(param: DefaultApiLimitsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.limitsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Daily API Usage
     * @param param the request object
     */
    public logsApiUsageGetWithHttpInfo(param: DefaultApiLogsApiUsageGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsApiUsageGetWithHttpInfo(param.date, param.logFormat, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Daily API Usage
     * @param param the request object
     */
    public logsApiUsageGet(param: DefaultApiLogsApiUsageGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsApiUsageGet(param.date, param.logFormat, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Debug Logs
     * @param param the request object
     */
    public logsCodeDebugGetWithHttpInfo(param: DefaultApiLogsCodeDebugGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeDebugGetWithHttpInfo(param.userId, param.includeInactive, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Debug Logs
     * @param param the request object
     */
    public logsCodeDebugGet(param: DefaultApiLogsCodeDebugGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeDebugGet(param.userId, param.includeInactive, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Debug Log
     * @param param the request object
     */
    public logsCodeDebugIdActionsResetDeleteWithHttpInfo(param: DefaultApiLogsCodeDebugIdActionsResetDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeDebugIdActionsResetDeleteWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Debug Log
     * @param param the request object
     */
    public logsCodeDebugIdActionsResetDelete(param: DefaultApiLogsCodeDebugIdActionsResetDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeDebugIdActionsResetDelete(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reset Debug Log
     * @param param the request object
     */
    public logsCodeDebugIdActionsResetPostWithHttpInfo(param: DefaultApiLogsCodeDebugIdActionsResetPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeDebugIdActionsResetPostWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reset Debug Log
     * @param param the request object
     */
    public logsCodeDebugIdActionsResetPost(param: DefaultApiLogsCodeDebugIdActionsResetPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeDebugIdActionsResetPost(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Debug Log Files
     * @param param the request object
     */
    public logsCodeDebugIdFilesGetWithHttpInfo(param: DefaultApiLogsCodeDebugIdFilesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeDebugIdFilesGetWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Debug Log Files
     * @param param the request object
     */
    public logsCodeDebugIdFilesGet(param: DefaultApiLogsCodeDebugIdFilesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeDebugIdFilesGet(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single Debug Log
     * @param param the request object
     */
    public logsCodeDebugIdGetWithHttpInfo(param: DefaultApiLogsCodeDebugIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeDebugIdGetWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single Debug Log
     * @param param the request object
     */
    public logsCodeDebugIdGet(param: DefaultApiLogsCodeDebugIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeDebugIdGet(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Debug Log
     * @param param the request object
     */
    public logsCodeDebugPostWithHttpInfo(param: DefaultApiLogsCodeDebugPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeDebugPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Debug Log
     * @param param the request object
     */
    public logsCodeDebugPost(param: DefaultApiLogsCodeDebugPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeDebugPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download SDK Runtime Log
     * @param param the request object
     */
    public logsCodeRuntimeGetWithHttpInfo(param: DefaultApiLogsCodeRuntimeGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.logsCodeRuntimeGetWithHttpInfo(param.date, param.logFormat, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download SDK Runtime Log
     * @param param the request object
     */
    public logsCodeRuntimeGet(param: DefaultApiLogsCodeRuntimeGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.logsCodeRuntimeGet(param.date, param.logFormat, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Bulk Translation File
     * @param param the request object
     */
    public messagesMessageTypeActionsImportPostWithHttpInfo(param: DefaultApiMessagesMessageTypeActionsImportPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.messagesMessageTypeActionsImportPostWithHttpInfo(param.messageType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Bulk Translation File
     * @param param the request object
     */
    public messagesMessageTypeActionsImportPost(param: DefaultApiMessagesMessageTypeActionsImportPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.messagesMessageTypeActionsImportPost(param.messageType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Bulk Translation File
     * @param param the request object
     */
    public messagesMessageTypeLanguageLangActionsExportPostWithHttpInfo(param: DefaultApiMessagesMessageTypeLanguageLangActionsExportPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.messagesMessageTypeLanguageLangActionsExportPostWithHttpInfo(param.messageType, param.lang, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Bulk Translation File
     * @param param the request object
     */
    public messagesMessageTypeLanguageLangActionsExportPost(param: DefaultApiMessagesMessageTypeLanguageLangActionsExportPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.messagesMessageTypeLanguageLangActionsExportPost(param.messageType, param.lang, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Audit Metadata
     * @param param the request object
     */
    public metadataAudittrailAuditTrailTypeGetWithHttpInfo(param: DefaultApiMetadataAudittrailAuditTrailTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataAudittrailAuditTrailTypeGetWithHttpInfo(param.auditTrailType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Audit Metadata
     * @param param the request object
     */
    public metadataAudittrailAuditTrailTypeGet(param: DefaultApiMetadataAudittrailAuditTrailTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataAudittrailAuditTrailTypeGet(param.auditTrailType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Audit Types
     * @param param the request object
     */
    public metadataAudittrailGetWithHttpInfo(param: DefaultApiMetadataAudittrailGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataAudittrailGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Audit Types
     * @param param the request object
     */
    public metadataAudittrailGet(param: DefaultApiMetadataAudittrailGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataAudittrailGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Type Metadata
     * @param param the request object
     */
    public metadataComponentsComponentTypeGetWithHttpInfo(param: DefaultApiMetadataComponentsComponentTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataComponentsComponentTypeGetWithHttpInfo(param.componentType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Component Type Metadata
     * @param param the request object
     */
    public metadataComponentsComponentTypeGet(param: DefaultApiMetadataComponentsComponentTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataComponentsComponentTypeGet(param.componentType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Component Metadata
     * @param param the request object
     */
    public metadataComponentsGetWithHttpInfo(param: DefaultApiMetadataComponentsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataComponentsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Component Metadata
     * @param param the request object
     */
    public metadataComponentsGet(param: DefaultApiMetadataComponentsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataComponentsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Node Metadata
     * @param param the request object
     */
    public metadataObjectsBindersTemplatesBindernodesGetWithHttpInfo(param: DefaultApiMetadataObjectsBindersTemplatesBindernodesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsBindersTemplatesBindernodesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Node Metadata
     * @param param the request object
     */
    public metadataObjectsBindersTemplatesBindernodesGet(param: DefaultApiMetadataObjectsBindersTemplatesBindernodesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsBindersTemplatesBindernodesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Metadata
     * @param param the request object
     */
    public metadataObjectsBindersTemplatesGetWithHttpInfo(param: DefaultApiMetadataObjectsBindersTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsBindersTemplatesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Metadata
     * @param param the request object
     */
    public metadataObjectsBindersTemplatesGet(param: DefaultApiMetadataObjectsBindersTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsBindersTemplatesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetWithHttpInfo(param.placemarkType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(param: DefaultApiMetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(param.placemarkType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetWithHttpInfo(param.referenceType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(param: DefaultApiMetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(param.referenceType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Annotation Type Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetWithHttpInfo(param.annotationType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Annotation Type Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(param: DefaultApiMetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(param.annotationType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Event SubType Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetWithHttpInfo(param.eventType, param.eventSubtype, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Event SubType Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(param: DefaultApiMetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(param.eventType, param.eventSubtype, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Event Types and Subtypes
     * @param param the request object
     */
    public metadataObjectsDocumentsEventsGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsEventsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsEventsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Event Types and Subtypes
     * @param param the request object
     */
    public metadataObjectsDocumentsEventsGet(param: DefaultApiMetadataObjectsDocumentsEventsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsEventsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Lock Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsLockGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsLockGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsLockGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Lock Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsLockGet(param: DefaultApiMetadataObjectsDocumentsLockGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsLockGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Common Document Fields
     * @param param the request object
     */
    public metadataObjectsDocumentsPropertiesFindCommonPostWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsPropertiesFindCommonPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsPropertiesFindCommonPostWithHttpInfo(param.contentType, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Common Document Fields
     * @param param the request object
     */
    public metadataObjectsDocumentsPropertiesFindCommonPost(param: DefaultApiMetadataObjectsDocumentsPropertiesFindCommonPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsPropertiesFindCommonPost(param.contentType, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Fields
     * @param param the request object
     */
    public metadataObjectsDocumentsPropertiesGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsPropertiesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsPropertiesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Fields
     * @param param the request object
     */
    public metadataObjectsDocumentsPropertiesGet(param: DefaultApiMetadataObjectsDocumentsPropertiesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsPropertiesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Template Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsTemplatesGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsTemplatesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Template Metadata
     * @param param the request object
     */
    public metadataObjectsDocumentsTemplatesGet(param: DefaultApiMetadataObjectsDocumentsTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsTemplatesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Types
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsTypesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsTypesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Types
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesGet(param: DefaultApiMetadataObjectsDocumentsTypesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsTypesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Type
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsTypesTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsTypesTypeGetWithHttpInfo(param.type, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Type
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeGet(param: DefaultApiMetadataObjectsDocumentsTypesTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsTypesTypeGet(param.type, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Type Relationships
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeRelationshipsGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsTypesTypeRelationshipsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsTypesTypeRelationshipsGetWithHttpInfo(param.type, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Type Relationships
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeRelationshipsGet(param: DefaultApiMetadataObjectsDocumentsTypesTypeRelationshipsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsTypesTypeRelationshipsGet(param.type, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Classification
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetWithHttpInfo(param.type, param.subtype, param.classification, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Classification
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(param: DefaultApiMetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(param.type, param.subtype, param.classification, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Subtype
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetWithHttpInfo(param: DefaultApiMetadataObjectsDocumentsTypesTypeSubtypesSubtypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetWithHttpInfo(param.type, param.subtype, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Subtype
     * @param param the request object
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(param: DefaultApiMetadataObjectsDocumentsTypesTypeSubtypesSubtypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(param.type, param.subtype, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Group Metadata
     * @param param the request object
     */
    public metadataObjectsGroupsGetWithHttpInfo(param: DefaultApiMetadataObjectsGroupsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsGroupsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Group Metadata
     * @param param the request object
     */
    public metadataObjectsGroupsGet(param: DefaultApiMetadataObjectsGroupsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsGroupsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Security Policy Metadata
     * @param param the request object
     */
    public metadataObjectsSecuritypoliciesGetWithHttpInfo(param: DefaultApiMetadataObjectsSecuritypoliciesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsSecuritypoliciesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Security Policy Metadata
     * @param param the request object
     */
    public metadataObjectsSecuritypoliciesGet(param: DefaultApiMetadataObjectsSecuritypoliciesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsSecuritypoliciesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Metadata
     * @param param the request object
     */
    public metadataObjectsUsersGetWithHttpInfo(param: DefaultApiMetadataObjectsUsersGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataObjectsUsersGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Metadata
     * @param param the request object
     */
    public metadataObjectsUsersGet(param: DefaultApiMetadataObjectsUsersGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataObjectsUsersGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Archived Document Signature Metadata
     * @param param the request object
     */
    public metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(param: DefaultApiMetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Archived Document Signature Metadata
     * @param param the request object
     */
    public metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(param: DefaultApiMetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Signature Metadata
     * @param param the request object
     */
    public metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(param: DefaultApiMetadataQueryDocumentsRelationshipsDocumentSignatureSysrGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Signature Metadata
     * @param param the request object
     */
    public metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(param: DefaultApiMetadataQueryDocumentsRelationshipsDocumentSignatureSysrGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Collection
     * @param param the request object
     */
    public metadataVobjectsGetWithHttpInfo(param: DefaultApiMetadataVobjectsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataVobjectsGetWithHttpInfo(param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Collection
     * @param param the request object
     */
    public metadataVobjectsGet(param: DefaultApiMetadataVobjectsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataVobjectsGet(param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Raw Object Deployment
     * @param param the request object
     */
    public metadataVobjectsObjectNameActionsCanceldeploymentPostWithHttpInfo(param: DefaultApiMetadataVobjectsObjectNameActionsCanceldeploymentPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataVobjectsObjectNameActionsCanceldeploymentPostWithHttpInfo(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Raw Object Deployment
     * @param param the request object
     */
    public metadataVobjectsObjectNameActionsCanceldeploymentPost(param: DefaultApiMetadataVobjectsObjectNameActionsCanceldeploymentPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataVobjectsObjectNameActionsCanceldeploymentPost(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Field Metadata
     * @param param the request object
     */
    public metadataVobjectsObjectNameFieldsObjectFieldNameGetWithHttpInfo(param: DefaultApiMetadataVobjectsObjectNameFieldsObjectFieldNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataVobjectsObjectNameFieldsObjectFieldNameGetWithHttpInfo(param.objectName, param.objectFieldName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Field Metadata
     * @param param the request object
     */
    public metadataVobjectsObjectNameFieldsObjectFieldNameGet(param: DefaultApiMetadataVobjectsObjectNameFieldsObjectFieldNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataVobjectsObjectNameFieldsObjectFieldNameGet(param.objectName, param.objectFieldName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Metadata
     * @param param the request object
     */
    public metadataVobjectsObjectNameGetWithHttpInfo(param: DefaultApiMetadataVobjectsObjectNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataVobjectsObjectNameGetWithHttpInfo(param.objectName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Metadata
     * @param param the request object
     */
    public metadataVobjectsObjectNameGet(param: DefaultApiMetadataVobjectsObjectNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataVobjectsObjectNameGet(param.objectName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Page Layouts
     * @param param the request object
     */
    public metadataVobjectsObjectNamePageLayoutsGetWithHttpInfo(param: DefaultApiMetadataVobjectsObjectNamePageLayoutsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataVobjectsObjectNamePageLayoutsGetWithHttpInfo(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Page Layouts
     * @param param the request object
     */
    public metadataVobjectsObjectNamePageLayoutsGet(param: DefaultApiMetadataVobjectsObjectNamePageLayoutsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataVobjectsObjectNamePageLayoutsGet(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Page Layout Metadata
     * @param param the request object
     */
    public metadataVobjectsObjectNamePageLayoutsLayoutNameGetWithHttpInfo(param: DefaultApiMetadataVobjectsObjectNamePageLayoutsLayoutNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.metadataVobjectsObjectNamePageLayoutsLayoutNameGetWithHttpInfo(param.objectName, param.layoutName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Page Layout Metadata
     * @param param the request object
     */
    public metadataVobjectsObjectNamePageLayoutsLayoutNameGet(param: DefaultApiMetadataVobjectsObjectNamePageLayoutsLayoutNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.metadataVobjectsObjectNamePageLayoutsLayoutNameGet(param.objectName, param.layoutName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Email Notification Histories
     * @param param the request object
     */
    public notificationsHistoriesGetWithHttpInfo(param: DefaultApiNotificationsHistoriesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.notificationsHistoriesGetWithHttpInfo(param.startDate, param.endDate, param.allDates, param.formatResult, param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Email Notification Histories
     * @param param the request object
     */
    public notificationsHistoriesGet(param: DefaultApiNotificationsHistoriesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.notificationsHistoriesGet(param.startDate, param.endDate, param.allDates, param.formatResult, param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Bulk Workflow Action Details
     * @param param the request object
     */
    public objectWorkflowActionsActionGetWithHttpInfo(param: DefaultApiObjectWorkflowActionsActionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsActionGetWithHttpInfo(param.action, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Bulk Workflow Action Details
     * @param param the request object
     */
    public objectWorkflowActionsActionGet(param: DefaultApiObjectWorkflowActionsActionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsActionGet(param.action, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param param the request object
     */
    public objectWorkflowActionsActionPostWithHttpInfo(param: DefaultApiObjectWorkflowActionsActionPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsActionPostWithHttpInfo(param.action, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param param the request object
     */
    public objectWorkflowActionsActionPost(param: DefaultApiObjectWorkflowActionsActionPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsActionPost(param.action, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Workflow Tasks
     * @param param the request object
     */
    public objectWorkflowActionsCanceltasksPostWithHttpInfo(param: DefaultApiObjectWorkflowActionsCanceltasksPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsCanceltasksPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Workflow Tasks
     * @param param the request object
     */
    public objectWorkflowActionsCanceltasksPost(param: DefaultApiObjectWorkflowActionsCanceltasksPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsCanceltasksPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Workflows
     * @param param the request object
     */
    public objectWorkflowActionsCancelworkflowsPostWithHttpInfo(param: DefaultApiObjectWorkflowActionsCancelworkflowsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsCancelworkflowsPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Workflows
     * @param param the request object
     */
    public objectWorkflowActionsCancelworkflowsPost(param: DefaultApiObjectWorkflowActionsCancelworkflowsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsCancelworkflowsPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Bulk Workflow Actions
     * @param param the request object
     */
    public objectWorkflowActionsGetWithHttpInfo(param: DefaultApiObjectWorkflowActionsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Bulk Workflow Actions
     * @param param the request object
     */
    public objectWorkflowActionsGet(param: DefaultApiObjectWorkflowActionsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reassign Workflow Tasks
     * @param param the request object
     */
    public objectWorkflowActionsReassigntasksPostWithHttpInfo(param: DefaultApiObjectWorkflowActionsReassigntasksPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsReassigntasksPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reassign Workflow Tasks
     * @param param the request object
     */
    public objectWorkflowActionsReassigntasksPost(param: DefaultApiObjectWorkflowActionsReassigntasksPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsReassigntasksPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Workflow Owner
     * @param param the request object
     */
    public objectWorkflowActionsReplaceworkflowownerPostWithHttpInfo(param: DefaultApiObjectWorkflowActionsReplaceworkflowownerPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectWorkflowActionsReplaceworkflowownerPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Workflow Owner
     * @param param the request object
     */
    public objectWorkflowActionsReplaceworkflowownerPost(param: DefaultApiObjectWorkflowActionsReplaceworkflowownerPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectWorkflowActionsReplaceworkflowownerPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Export Results
     * @param param the request object
     */
    public objectsBindersActionsExportJobIdResultsGetWithHttpInfo(param: DefaultApiObjectsBindersActionsExportJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersActionsExportJobIdResultsGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Export Results
     * @param param the request object
     */
    public objectsBindersActionsExportJobIdResultsGet(param: DefaultApiObjectsBindersActionsExportJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersActionsExportJobIdResultsGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Binder (Latest Version)
     * @param param the request object
     */
    public objectsBindersBinderIdActionsExportPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdActionsExportPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdActionsExportPostWithHttpInfo(param.binderId, param.source, param.renditiontype, param.docversion, param.attachments, param._export, param.docfield, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Binder (Latest Version)
     * @param param the request object
     */
    public objectsBindersBinderIdActionsExportPost(param: DefaultApiObjectsBindersBinderIdActionsExportPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdActionsExportPost(param.binderId, param.source, param.renditiontype, param.docversion, param.attachments, param._export, param.docfield, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Refresh Binder Auto-Filing
     * @param param the request object
     */
    public objectsBindersBinderIdActionsPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdActionsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdActionsPostWithHttpInfo(param.binderId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Refresh Binder Auto-Filing
     * @param param the request object
     */
    public objectsBindersBinderIdActionsPost(param: DefaultApiObjectsBindersBinderIdActionsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdActionsPost(param.binderId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binding Rule
     * @param param the request object
     */
    public objectsBindersBinderIdBindingRulePutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdBindingRulePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdBindingRulePutWithHttpInfo(param.binderId, param.contentType, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binding Rule
     * @param param the request object
     */
    public objectsBindersBinderIdBindingRulePut(param: DefaultApiObjectsBindersBinderIdBindingRulePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdBindingRulePut(param.binderId, param.contentType, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDeleteWithHttpInfo(param: DefaultApiObjectsBindersBinderIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdDeleteWithHttpInfo(param.binderId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDelete(param: DefaultApiObjectsBindersBinderIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdDelete(param.binderId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Document Binding Rule
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsNodeIdBindingRulePutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdDocumentsNodeIdBindingRulePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdDocumentsNodeIdBindingRulePutWithHttpInfo(param.binderId, param.nodeId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Document Binding Rule
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsNodeIdBindingRulePut(param: DefaultApiObjectsBindersBinderIdDocumentsNodeIdBindingRulePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdDocumentsNodeIdBindingRulePut(param.binderId, param.nodeId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Document to Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdDocumentsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdDocumentsPostWithHttpInfo(param.binderId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Document to Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsPost(param: DefaultApiObjectsBindersBinderIdDocumentsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdDocumentsPost(param.binderId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Document from Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsSectionIdDeleteWithHttpInfo(param: DefaultApiObjectsBindersBinderIdDocumentsSectionIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdDocumentsSectionIdDeleteWithHttpInfo(param.binderId, param.sectionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Document from Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsSectionIdDelete(param: DefaultApiObjectsBindersBinderIdDocumentsSectionIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdDocumentsSectionIdDelete(param.binderId, param.sectionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Move Document in Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsSectionIdPutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdDocumentsSectionIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdDocumentsSectionIdPutWithHttpInfo(param.binderId, param.sectionId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Move Document in Binder
     * @param param the request object
     */
    public objectsBindersBinderIdDocumentsSectionIdPut(param: DefaultApiObjectsBindersBinderIdDocumentsSectionIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdDocumentsSectionIdPut(param.binderId, param.sectionId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder
     * @param param the request object
     */
    public objectsBindersBinderIdGetWithHttpInfo(param: DefaultApiObjectsBindersBinderIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdGetWithHttpInfo(param.binderId, param.depth, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder
     * @param param the request object
     */
    public objectsBindersBinderIdGet(param: DefaultApiObjectsBindersBinderIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdGet(param.binderId, param.depth, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdPostWithHttpInfo(param.binderId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdPost(param: DefaultApiObjectsBindersBinderIdPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdPost(param.binderId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder
     * @param param the request object
     */
    public objectsBindersBinderIdPutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdPutWithHttpInfo(param.binderId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder
     * @param param the request object
     */
    public objectsBindersBinderIdPut(param: DefaultApiObjectsBindersBinderIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdPut(param.binderId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param param the request object
     */
    public objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(param: DefaultApiObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(param.binderId, param.roleNameAndUserOrGroup, param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param param the request object
     */
    public objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(param: DefaultApiObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(param.binderId, param.roleNameAndUserOrGroup, param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Section Binding Rule
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsNodeIdBindingRulePutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdSectionsNodeIdBindingRulePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdSectionsNodeIdBindingRulePutWithHttpInfo(param.binderId, param.nodeId, param.contentType, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Section Binding Rule
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsNodeIdBindingRulePut(param: DefaultApiObjectsBindersBinderIdSectionsNodeIdBindingRulePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdSectionsNodeIdBindingRulePut(param.binderId, param.nodeId, param.contentType, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Section
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsNodeIdPutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdSectionsNodeIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdSectionsNodeIdPutWithHttpInfo(param.binderId, param.nodeId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Section
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsNodeIdPut(param: DefaultApiObjectsBindersBinderIdSectionsNodeIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdSectionsNodeIdPut(param.binderId, param.nodeId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Section
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdSectionsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdSectionsPostWithHttpInfo(param.binderId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Section
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsPost(param: DefaultApiObjectsBindersBinderIdSectionsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdSectionsPost(param.binderId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Section
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsSectionIdDeleteWithHttpInfo(param: DefaultApiObjectsBindersBinderIdSectionsSectionIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdSectionsSectionIdDeleteWithHttpInfo(param.binderId, param.sectionId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Section
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsSectionIdDelete(param: DefaultApiObjectsBindersBinderIdSectionsSectionIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdSectionsSectionIdDelete(param.binderId, param.sectionId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Sections
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsSectionIdGetWithHttpInfo(param: DefaultApiObjectsBindersBinderIdSectionsSectionIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdSectionsSectionIdGetWithHttpInfo(param.binderId, param.sectionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Sections
     * @param param the request object
     */
    public objectsBindersBinderIdSectionsSectionIdGet(param: DefaultApiObjectsBindersBinderIdSectionsSectionIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdSectionsSectionIdGet(param.binderId, param.sectionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Binder Versions
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsGetWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsGetWithHttpInfo(param.binderId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Binder Versions
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsGet(param: DefaultApiObjectsBindersBinderIdVersionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsGet(param.binderId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Binder (Specific Version)
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.source, param.renditiontype, param.docversion, param.attachments, param._export, param.docfield, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Binder (Specific Version)
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(param.binderId, param.majorVersion, param.minorVersion, param.source, param.renditiontype, param.docversion, param.attachments, param._export, param.docfield, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionGetWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionGetWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionPutWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionPutWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Version
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Relationship
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Relationship
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(param.binderId, param.majorVersion, param.minorVersion, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Relationship
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Relationship
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(param.binderId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Relationship
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Relationship
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(param.binderId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Version Section
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetWithHttpInfo(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetWithHttpInfo(param.binderId, param.majorVersion, param.minorVersion, param.sectionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Version Section
     * @param param the request object
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(param: DefaultApiObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(param.binderId, param.majorVersion, param.minorVersion, param.sectionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Binder Roles
     * @param param the request object
     */
    public objectsBindersIdRolesGetWithHttpInfo(param: DefaultApiObjectsBindersIdRolesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersIdRolesGetWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Binder Roles
     * @param param the request object
     */
    public objectsBindersIdRolesGet(param: DefaultApiObjectsBindersIdRolesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersIdRolesGet(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param param the request object
     */
    public objectsBindersIdRolesPostWithHttpInfo(param: DefaultApiObjectsBindersIdRolesPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersIdRolesPostWithHttpInfo(param.id, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param param the request object
     */
    public objectsBindersIdRolesPost(param: DefaultApiObjectsBindersIdRolesPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersIdRolesPost(param.id, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Role
     * @param param the request object
     */
    public objectsBindersIdRolesRoleNameGetWithHttpInfo(param: DefaultApiObjectsBindersIdRolesRoleNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersIdRolesRoleNameGetWithHttpInfo(param.id, param.roleName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Role
     * @param param the request object
     */
    public objectsBindersIdRolesRoleNameGet(param: DefaultApiObjectsBindersIdRolesRoleNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersIdRolesRoleNameGet(param.id, param.roleName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder User Actions
     * @param param the request object
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(param: DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(param.id, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder User Actions
     * @param param the request object
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(param: DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(param.id, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Entry Criteria
     * @param param the request object
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(param: DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Entry Criteria
     * @param param the request object
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(param: DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Binder User Action
     * @param param the request object
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(param: DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Binder User Action
     * @param param the request object
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(param: DefaultApiObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Binders
     * @param param the request object
     */
    public objectsBindersLifecycleActionsPostWithHttpInfo(param: DefaultApiObjectsBindersLifecycleActionsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersLifecycleActionsPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Binders
     * @param param the request object
     */
    public objectsBindersLifecycleActionsPost(param: DefaultApiObjectsBindersLifecycleActionsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersLifecycleActionsPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Bulk Binder User Actions
     * @param param the request object
     */
    public objectsBindersLifecycleActionsUserActionNamePutWithHttpInfo(param: DefaultApiObjectsBindersLifecycleActionsUserActionNamePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersLifecycleActionsUserActionNamePutWithHttpInfo(param.userActionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Bulk Binder User Actions
     * @param param the request object
     */
    public objectsBindersLifecycleActionsUserActionNamePut(param: DefaultApiObjectsBindersLifecycleActionsUserActionNamePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersLifecycleActionsUserActionNamePut(param.userActionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder
     * @param param the request object
     */
    public objectsBindersPostWithHttpInfo(param: DefaultApiObjectsBindersPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersPostWithHttpInfo(param.async, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder
     * @param param the request object
     */
    public objectsBindersPost(param: DefaultApiObjectsBindersPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersPost(param.async, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Collection
     * @param param the request object
     */
    public objectsBindersTemplatesGetWithHttpInfo(param: DefaultApiObjectsBindersTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Collection
     * @param param the request object
     */
    public objectsBindersTemplatesGet(param: DefaultApiObjectsBindersTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Template
     * @param param the request object
     */
    public objectsBindersTemplatesPostWithHttpInfo(param: DefaultApiObjectsBindersTemplatesPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Template
     * @param param the request object
     */
    public objectsBindersTemplatesPost(param: DefaultApiObjectsBindersTemplatesPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Template
     * @param param the request object
     */
    public objectsBindersTemplatesPutWithHttpInfo(param: DefaultApiObjectsBindersTemplatesPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesPutWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Binder Template
     * @param param the request object
     */
    public objectsBindersTemplatesPut(param: DefaultApiObjectsBindersTemplatesPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesPut(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Node Attributes
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameBindernodesGetWithHttpInfo(param: DefaultApiObjectsBindersTemplatesTemplateNameBindernodesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesTemplateNameBindernodesGetWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Node Attributes
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameBindernodesGet(param: DefaultApiObjectsBindersTemplatesTemplateNameBindernodesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesTemplateNameBindernodesGet(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Template Node
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameBindernodesPostWithHttpInfo(param: DefaultApiObjectsBindersTemplatesTemplateNameBindernodesPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesTemplateNameBindernodesPostWithHttpInfo(param.templateName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Binder Template Node
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameBindernodesPost(param: DefaultApiObjectsBindersTemplatesTemplateNameBindernodesPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesTemplateNameBindernodesPost(param.templateName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Binder Template Nodes
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameBindernodesPutWithHttpInfo(param: DefaultApiObjectsBindersTemplatesTemplateNameBindernodesPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesTemplateNameBindernodesPutWithHttpInfo(param.templateName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Binder Template Nodes
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameBindernodesPut(param: DefaultApiObjectsBindersTemplatesTemplateNameBindernodesPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesTemplateNameBindernodesPut(param.templateName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Template
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameDeleteWithHttpInfo(param: DefaultApiObjectsBindersTemplatesTemplateNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesTemplateNameDeleteWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Binder Template
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameDelete(param: DefaultApiObjectsBindersTemplatesTemplateNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesTemplateNameDelete(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Attributes
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameGetWithHttpInfo(param: DefaultApiObjectsBindersTemplatesTemplateNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsBindersTemplatesTemplateNameGetWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Binder Template Attributes
     * @param param the request object
     */
    public objectsBindersTemplatesTemplateNameGet(param: DefaultApiObjectsBindersTemplatesTemplateNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsBindersTemplatesTemplateNameGet(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Deleted Document IDs
     * @param param the request object
     */
    public objectsDeletionsDocumentsGetWithHttpInfo(param: DefaultApiObjectsDeletionsDocumentsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDeletionsDocumentsGetWithHttpInfo(param.startDate, param.endDate, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Deleted Document IDs
     * @param param the request object
     */
    public objectsDeletionsDocumentsGet(param: DefaultApiObjectsDeletionsDocumentsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDeletionsDocumentsGet(param.startDate, param.endDate, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Deleted Object Record ID
     * @param param the request object
     */
    public objectsDeletionsVobjectsObjectNameGetWithHttpInfo(param: DefaultApiObjectsDeletionsVobjectsObjectNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDeletionsVobjectsObjectNameGetWithHttpInfo(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Deleted Object Record ID
     * @param param the request object
     */
    public objectsDeletionsVobjectsObjectNameGet(param: DefaultApiObjectsDeletionsVobjectsObjectNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDeletionsVobjectsObjectNameGet(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Workflows
     * @param param the request object
     */
    public objectsDocumentsActionsGetWithHttpInfo(param: DefaultApiObjectsDocumentsActionsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsActionsGetWithHttpInfo(param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Workflows
     * @param param the request object
     */
    public objectsDocumentsActionsGet(param: DefaultApiObjectsDocumentsActionsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsActionsGet(param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Controlled Copy Job Results
     * @param param the request object
     */
    public objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetWithHttpInfo(param: DefaultApiObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetWithHttpInfo(param.lifecycleAndStateAndAction, param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Controlled Copy Job Results
     * @param param the request object
     */
    public objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(param: DefaultApiObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(param.lifecycleAndStateAndAction, param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Workflow Details
     * @param param the request object
     */
    public objectsDocumentsActionsWorkflowNameGetWithHttpInfo(param: DefaultApiObjectsDocumentsActionsWorkflowNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsActionsWorkflowNameGetWithHttpInfo(param.workflowName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Workflow Details
     * @param param the request object
     */
    public objectsDocumentsActionsWorkflowNameGet(param: DefaultApiObjectsDocumentsActionsWorkflowNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsActionsWorkflowNameGet(param.workflowName, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Document Workflow
     * @param param the request object
     */
    public objectsDocumentsActionsWorkflowNamePostWithHttpInfo(param: DefaultApiObjectsDocumentsActionsWorkflowNamePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsActionsWorkflowNamePostWithHttpInfo(param.workflowName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Document Workflow
     * @param param the request object
     */
    public objectsDocumentsActionsWorkflowNamePost(param: DefaultApiObjectsDocumentsActionsWorkflowNamePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsActionsWorkflowNamePost(param.workflowName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Annotations
     * @param param the request object
     */
    public objectsDocumentsAnnotationsBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsAnnotationsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAnnotationsBatchDeleteWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Annotations
     * @param param the request object
     */
    public objectsDocumentsAnnotationsBatchDelete(param: DefaultApiObjectsDocumentsAnnotationsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAnnotationsBatchDelete(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Annotations
     * @param param the request object
     */
    public objectsDocumentsAnnotationsBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsAnnotationsBatchPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAnnotationsBatchPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Annotations
     * @param param the request object
     */
    public objectsDocumentsAnnotationsBatchPost(param: DefaultApiObjectsDocumentsAnnotationsBatchPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAnnotationsBatchPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Annotations
     * @param param the request object
     */
    public objectsDocumentsAnnotationsBatchPutWithHttpInfo(param: DefaultApiObjectsDocumentsAnnotationsBatchPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAnnotationsBatchPutWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Annotations
     * @param param the request object
     */
    public objectsDocumentsAnnotationsBatchPut(param: DefaultApiObjectsDocumentsAnnotationsBatchPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAnnotationsBatchPut(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Annotation Replies
     * @param param the request object
     */
    public objectsDocumentsAnnotationsRepliesBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsAnnotationsRepliesBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAnnotationsRepliesBatchPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Annotation Replies
     * @param param the request object
     */
    public objectsDocumentsAnnotationsRepliesBatchPost(param: DefaultApiObjectsDocumentsAnnotationsRepliesBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAnnotationsRepliesBatchPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Attachments
     * @param param the request object
     */
    public objectsDocumentsAttachmentsBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsAttachmentsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAttachmentsBatchDeleteWithHttpInfo(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Attachments
     * @param param the request object
     */
    public objectsDocumentsAttachmentsBatchDelete(param: DefaultApiObjectsDocumentsAttachmentsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAttachmentsBatchDelete(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Document Attachments
     * @param param the request object
     */
    public objectsDocumentsAttachmentsBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsAttachmentsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAttachmentsBatchPostWithHttpInfo(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Document Attachments
     * @param param the request object
     */
    public objectsDocumentsAttachmentsBatchPost(param: DefaultApiObjectsDocumentsAttachmentsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAttachmentsBatchPost(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Document Attachment Descriptions
     * @param param the request object
     */
    public objectsDocumentsAttachmentsBatchPutWithHttpInfo(param: DefaultApiObjectsDocumentsAttachmentsBatchPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsAttachmentsBatchPutWithHttpInfo(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Document Attachment Descriptions
     * @param param the request object
     */
    public objectsDocumentsAttachmentsBatchPut(param: DefaultApiObjectsDocumentsAttachmentsBatchPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsAttachmentsBatchPut(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Export Results
     * @param param the request object
     */
    public objectsDocumentsBatchActionsFileextractJobIdResultsGetWithHttpInfo(param: DefaultApiObjectsDocumentsBatchActionsFileextractJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchActionsFileextractJobIdResultsGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Export Results
     * @param param the request object
     */
    public objectsDocumentsBatchActionsFileextractJobIdResultsGet(param: DefaultApiObjectsDocumentsBatchActionsFileextractJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchActionsFileextractJobIdResultsGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Documents
     * @param param the request object
     */
    public objectsDocumentsBatchActionsFileextractPostWithHttpInfo(param: DefaultApiObjectsDocumentsBatchActionsFileextractPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchActionsFileextractPostWithHttpInfo(param.source, param.renditions, param.allversions, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Documents
     * @param param the request object
     */
    public objectsDocumentsBatchActionsFileextractPost(param: DefaultApiObjectsDocumentsBatchActionsFileextractPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchActionsFileextractPost(param.source, param.renditions, param.allversions, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reclassify Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchActionsReclassifyPutWithHttpInfo(param: DefaultApiObjectsDocumentsBatchActionsReclassifyPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchActionsReclassifyPutWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reclassify Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchActionsReclassifyPut(param: DefaultApiObjectsDocumentsBatchActionsReclassifyPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchActionsReclassifyPut(param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Document Renditions
     * @param param the request object
     */
    public objectsDocumentsBatchActionsRerenderPostWithHttpInfo(param: DefaultApiObjectsDocumentsBatchActionsRerenderPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchActionsRerenderPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Document Renditions
     * @param param the request object
     */
    public objectsDocumentsBatchActionsRerenderPost(param: DefaultApiObjectsDocumentsBatchActionsRerenderPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchActionsRerenderPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchDeleteWithHttpInfo(param.idParam, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchDelete(param: DefaultApiObjectsDocumentsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchDelete(param.idParam, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Undo Collaborative Authoring Checkout
     * @param param the request object
     */
    public objectsDocumentsBatchLockDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsBatchLockDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchLockDeleteWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Undo Collaborative Authoring Checkout
     * @param param the request object
     */
    public objectsDocumentsBatchLockDelete(param: DefaultApiObjectsDocumentsBatchLockDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchLockDelete(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchPost(param: DefaultApiObjectsDocumentsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchPost(param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchPutWithHttpInfo(param: DefaultApiObjectsDocumentsBatchPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsBatchPutWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsBatchPut(param: DefaultApiObjectsDocumentsBatchPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsBatchPut(param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Anchor IDs
     * @param param the request object
     */
    public objectsDocumentsDocIdAnchorsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAnchorsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAnchorsGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Anchor IDs
     * @param param the request object
     */
    public objectsDocumentsDocIdAnchorsGet(param: DefaultApiObjectsDocumentsDocIdAnchorsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAnchorsGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Document Annotations to PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdAnnotationsFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAnnotationsFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAnnotationsFileGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Document Annotations to PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdAnnotationsFileGet(param: DefaultApiObjectsDocumentsDocIdAnnotationsFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAnnotationsFileGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Document Annotations from PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdAnnotationsFilePostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAnnotationsFilePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAnnotationsFilePostWithHttpInfo(param.docId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Document Annotations from PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdAnnotationsFilePost(param: DefaultApiObjectsDocumentsDocIdAnnotationsFilePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAnnotationsFilePost(param.docId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Attachment
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdDeleteWithHttpInfo(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Attachment
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdDelete(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdDelete(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Attachment
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdFileGetWithHttpInfo(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Attachment
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachment Metadata
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdGetWithHttpInfo(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachment Metadata
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdGet(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Document Attachment Description
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdPutWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdPutWithHttpInfo(param.docId, param.attachmentId, param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Document Attachment Description
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdPut(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdPut(param.docId, param.attachmentId, param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(param.docId, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(param.docId, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(param.docId, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(param.docId, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachment Version Metadata
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(param.docId, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachment Version Metadata
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(param.docId, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Restore Document Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(param.docId, param.attachmentId, param.attachmentVersion, param.restore, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Restore Document Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(param.docId, param.attachmentId, param.attachmentVersion, param.restore, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachment Versions
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachment Versions
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(param.docId, param.attachmentId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Document Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsFileGetWithHttpInfo(param.docId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Document Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsFileGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsFileGet(param.docId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsGetWithHttpInfo(param.docId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsGet(param: DefaultApiObjectsDocumentsDocIdAttachmentsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsGet(param.docId, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Document Attachment
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsPostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAttachmentsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAttachmentsPostWithHttpInfo(param.docId, param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Document Attachment
     * @param param the request object
     */
    public objectsDocumentsDocIdAttachmentsPost(param: DefaultApiObjectsDocumentsDocIdAttachmentsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAttachmentsPost(param.docId, param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdAudittrailGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdAudittrailGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdAudittrailGetWithHttpInfo(param.docId, param.startDate, param.endDate, param.formatResult, param.limit, param.offset, param.events, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdAudittrailGet(param: DefaultApiObjectsDocumentsDocIdAudittrailGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdAudittrailGet(param.docId, param.startDate, param.endDate, param.formatResult, param.limit, param.offset, param.events, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdDeleteWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdDelete(param: DefaultApiObjectsDocumentsDocIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdDelete(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Events
     * @param param the request object
     */
    public objectsDocumentsDocIdEventsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdEventsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdEventsGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Events
     * @param param the request object
     */
    public objectsDocumentsDocIdEventsGet(param: DefaultApiObjectsDocumentsDocIdEventsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdEventsGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document File
     * @param param the request object
     */
    public objectsDocumentsDocIdFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdFileGetWithHttpInfo(param.docId, param.lockDocument, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document File
     * @param param the request object
     */
    public objectsDocumentsDocIdFileGet(param: DefaultApiObjectsDocumentsDocIdFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdFileGet(param.docId, param.lockDocument, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document
     * @param param the request object
     */
    public objectsDocumentsDocIdGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document
     * @param param the request object
     */
    public objectsDocumentsDocIdGet(param: DefaultApiObjectsDocumentsDocIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Document Lock
     * @param param the request object
     */
    public objectsDocumentsDocIdLockDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdLockDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdLockDeleteWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Document Lock
     * @param param the request object
     */
    public objectsDocumentsDocIdLockDelete(param: DefaultApiObjectsDocumentsDocIdLockDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdLockDelete(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Lock
     * @param param the request object
     */
    public objectsDocumentsDocIdLockGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdLockGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdLockGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Lock
     * @param param the request object
     */
    public objectsDocumentsDocIdLockGet(param: DefaultApiObjectsDocumentsDocIdLockGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdLockGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Document Lock
     * @param param the request object
     */
    public objectsDocumentsDocIdLockPostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdLockPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdLockPostWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Document Lock
     * @param param the request object
     */
    public objectsDocumentsDocIdLockPost(param: DefaultApiObjectsDocumentsDocIdLockPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdLockPost(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Document Version Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Document Version Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(param: DefaultApiObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdPostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdPostWithHttpInfo(param.docId, param.suppressRendition, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdPost(param: DefaultApiObjectsDocumentsDocIdPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdPost(param.docId, param.suppressRendition, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdPutWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdPutWithHttpInfo(param.docId, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdPut(param: DefaultApiObjectsDocumentsDocIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdPut(param.docId, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Renditions
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdRenditionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdRenditionsGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Renditions
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsGet(param: DefaultApiObjectsDocumentsDocIdRenditionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdRenditionsGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypeDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypeDeleteWithHttpInfo(param.docId, param.renditionType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeDelete(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypeDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypeDelete(param.docId, param.renditionType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Rendition File
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypeGetWithHttpInfo(param.docId, param.renditionType, param.steadyState, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Rendition File
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeGet(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypeGet(param.docId, param.renditionType, param.steadyState, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Single Document Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypePostWithHttpInfo(param.docId, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Single Document Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePost(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypePost(param.docId, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Document Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePutWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypePutWithHttpInfo(param.docId, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Document Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePut(param: DefaultApiObjectsDocumentsDocIdRenditionsRenditionTypePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdRenditionsRenditionTypePut(param.docId, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(param.docId, param.roleNameAndUserOrGroup, param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param param the request object
     */
    public objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(param: DefaultApiObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(param.docId, param.roleNameAndUserOrGroup, param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Attachments
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(param: DefaultApiObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Versions
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsGetWithHttpInfo(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Versions
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsGet(param: DefaultApiObjectsDocumentsDocIdVersionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsGet(param.docId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Read Annotations by ID
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.annotationId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Read Annotations by ID
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(param.docId, param.majorVersion, param.minorVersion, param.annotationId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Read Replies of Parent Annotation
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.annotationId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Read Replies of Parent Annotation
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(param.docId, param.majorVersion, param.minorVersion, param.annotationId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Document Version Annotations to PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Document Version Annotations to PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Document Version Annotations from PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Document Version Annotations from PDF
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Read Annotations by Document Version and Type
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.limit, param.offset, param.annotationTypes, param.paginationId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Read Annotations by Document Version and Type
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(param.docId, param.majorVersion, param.minorVersion, param.limit, param.offset, param.annotationTypes, param.paginationId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version Attachment Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(param.docId, param.majorVersion, param.minorVersion, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Attachment Versions
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Attachment Versions
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(param.docId, param.majorVersion, param.minorVersion, param.attachmentId, param.attachmentVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Notes as CSV
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Notes as CSV
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Document Event
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Document Event
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Video Annotations
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Video Annotations
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version File
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version File
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Document Version
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Relationships
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Relationships
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document Relationship
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document Relationship
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Relationship
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Document Relationship
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(param.docId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Relationship
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Relationship
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(param.docId, param.majorVersion, param.minorVersion, param.relationshipId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Renditions
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Version Renditions
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(param.docId, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Document Version Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Document Version Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version Rendition File
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version Rendition File
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upload Document Version Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upload Document Version Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Document Version Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Replace Document Version Rendition
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(param.docId, param.majorVersion, param.minorVersion, param.renditionType, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version Thumbnail File
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetWithHttpInfo(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetWithHttpInfo(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Version Thumbnail File
     * @param param the request object
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(param: DefaultApiObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(param.docId, param.majorVersion, param.minorVersion, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Documents
     * @param param the request object
     */
    public objectsDocumentsGetWithHttpInfo(param: DefaultApiObjectsDocumentsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsGetWithHttpInfo(param.namedFilter, param.scope, param.versionscope, param.search, param.limit, param.sort, param.start, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Documents
     * @param param the request object
     */
    public objectsDocumentsGet(param: DefaultApiObjectsDocumentsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsGet(param.namedFilter, param.scope, param.versionscope, param.search, param.limit, param.sort, param.start, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Roles
     * @param param the request object
     */
    public objectsDocumentsIdRolesGetWithHttpInfo(param: DefaultApiObjectsDocumentsIdRolesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsIdRolesGetWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Document Roles
     * @param param the request object
     */
    public objectsDocumentsIdRolesGet(param: DefaultApiObjectsDocumentsIdRolesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsIdRolesGet(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param param the request object
     */
    public objectsDocumentsIdRolesPostWithHttpInfo(param: DefaultApiObjectsDocumentsIdRolesPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsIdRolesPostWithHttpInfo(param.id, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param param the request object
     */
    public objectsDocumentsIdRolesPost(param: DefaultApiObjectsDocumentsIdRolesPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsIdRolesPost(param.id, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Role
     * @param param the request object
     */
    public objectsDocumentsIdRolesRoleNameGetWithHttpInfo(param: DefaultApiObjectsDocumentsIdRolesRoleNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsIdRolesRoleNameGetWithHttpInfo(param.id, param.roleName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Role
     * @param param the request object
     */
    public objectsDocumentsIdRolesRoleNameGet(param: DefaultApiObjectsDocumentsIdRolesRoleNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsIdRolesRoleNameGet(param.id, param.roleName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document User Actions
     * @param param the request object
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(param: DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(param.id, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document User Actions
     * @param param the request object
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(param: DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(param.id, param.majorVersion, param.minorVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Entry Criteria
     * @param param the request object
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(param: DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Entry Criteria
     * @param param the request object
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(param: DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Document User Action
     * @param param the request object
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(param: DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Document User Action
     * @param param the request object
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(param: DefaultApiObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(param.id, param.majorVersion, param.minorVersion, param.nameV, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsLifecycleActionsPostWithHttpInfo(param: DefaultApiObjectsDocumentsLifecycleActionsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsLifecycleActionsPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Documents
     * @param param the request object
     */
    public objectsDocumentsLifecycleActionsPost(param: DefaultApiObjectsDocumentsLifecycleActionsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsLifecycleActionsPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Bulk Document User Actions
     * @param param the request object
     */
    public objectsDocumentsLifecycleActionsUserActionNamePutWithHttpInfo(param: DefaultApiObjectsDocumentsLifecycleActionsUserActionNamePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsLifecycleActionsUserActionNamePutWithHttpInfo(param.userActionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Bulk Document User Actions
     * @param param the request object
     */
    public objectsDocumentsLifecycleActionsUserActionNamePut(param: DefaultApiObjectsDocumentsLifecycleActionsUserActionNamePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsLifecycleActionsUserActionNamePut(param.userActionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document
     * @param param the request object
     */
    public objectsDocumentsPostWithHttpInfo(param: DefaultApiObjectsDocumentsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsPostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document
     * @param param the request object
     */
    public objectsDocumentsPost(param: DefaultApiObjectsDocumentsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsPost(param.authorization, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Relationships
     * @param param the request object
     */
    public objectsDocumentsRelationshipsBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsRelationshipsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsRelationshipsBatchDeleteWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Relationships
     * @param param the request object
     */
    public objectsDocumentsRelationshipsBatchDelete(param: DefaultApiObjectsDocumentsRelationshipsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsRelationshipsBatchDelete(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Document Relationships
     * @param param the request object
     */
    public objectsDocumentsRelationshipsBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsRelationshipsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsRelationshipsBatchPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Document Relationships
     * @param param the request object
     */
    public objectsDocumentsRelationshipsBatchPost(param: DefaultApiObjectsDocumentsRelationshipsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsRelationshipsBatchPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Renditions
     * @param param the request object
     */
    public objectsDocumentsRenditionsBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsRenditionsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsRenditionsBatchDeleteWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Renditions
     * @param param the request object
     */
    public objectsDocumentsRenditionsBatchDelete(param: DefaultApiObjectsDocumentsRenditionsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsRenditionsBatchDelete(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Multiple Document Renditions
     * @param param the request object
     */
    public objectsDocumentsRenditionsBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsRenditionsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsRenditionsBatchPostWithHttpInfo(param.idParam, param.largeSizeAsset, param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add Multiple Document Renditions
     * @param param the request object
     */
    public objectsDocumentsRenditionsBatchPost(param: DefaultApiObjectsDocumentsRenditionsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsRenditionsBatchPost(param.idParam, param.largeSizeAsset, param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param param the request object
     */
    public objectsDocumentsRolesBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsRolesBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsRolesBatchDeleteWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param param the request object
     */
    public objectsDocumentsRolesBatchDelete(param: DefaultApiObjectsDocumentsRolesBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsRolesBatchDelete(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param param the request object
     */
    public objectsDocumentsRolesBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsRolesBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsRolesBatchPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param param the request object
     */
    public objectsDocumentsRolesBatchPost(param: DefaultApiObjectsDocumentsRolesBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsRolesBatchPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Template Collection
     * @param param the request object
     */
    public objectsDocumentsTemplatesGetWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Template Collection
     * @param param the request object
     */
    public objectsDocumentsTemplatesGet(param: DefaultApiObjectsDocumentsTemplatesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document Template
     * @param param the request object
     */
    public objectsDocumentsTemplatesPostWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single Document Template
     * @param param the request object
     */
    public objectsDocumentsTemplatesPost(param: DefaultApiObjectsDocumentsTemplatesPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Document Templates
     * @param param the request object
     */
    public objectsDocumentsTemplatesPutWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesPutWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Document Templates
     * @param param the request object
     */
    public objectsDocumentsTemplatesPut(param: DefaultApiObjectsDocumentsTemplatesPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesPut(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Basic Document Template
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNameDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesTemplateNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesTemplateNameDeleteWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Basic Document Template
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNameDelete(param: DefaultApiObjectsDocumentsTemplatesTemplateNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesTemplateNameDelete(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Template File
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNameFileGetWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesTemplateNameFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesTemplateNameFileGetWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Document Template File
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNameFileGet(param: DefaultApiObjectsDocumentsTemplatesTemplateNameFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesTemplateNameFileGet(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Template Attributes
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNameGetWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesTemplateNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesTemplateNameGetWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Document Template Attributes
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNameGet(param: DefaultApiObjectsDocumentsTemplatesTemplateNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesTemplateNameGet(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Single Document Template
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNamePutWithHttpInfo(param: DefaultApiObjectsDocumentsTemplatesTemplateNamePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTemplatesTemplateNamePutWithHttpInfo(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Single Document Template
     * @param param the request object
     */
    public objectsDocumentsTemplatesTemplateNamePut(param: DefaultApiObjectsDocumentsTemplatesTemplateNamePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTemplatesTemplateNamePut(param.templateName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Document Tokens
     * @param param the request object
     */
    public objectsDocumentsTokensPostWithHttpInfo(param: DefaultApiObjectsDocumentsTokensPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsTokensPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Document Tokens
     * @param param the request object
     */
    public objectsDocumentsTokensPost(param: DefaultApiObjectsDocumentsTokensPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsTokensPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Document Versions
     * @param param the request object
     */
    public objectsDocumentsVersionsBatchActionsFileextractPostWithHttpInfo(param: DefaultApiObjectsDocumentsVersionsBatchActionsFileextractPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsVersionsBatchActionsFileextractPostWithHttpInfo(param.source, param.renditions, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Document Versions
     * @param param the request object
     */
    public objectsDocumentsVersionsBatchActionsFileextractPost(param: DefaultApiObjectsDocumentsVersionsBatchActionsFileextractPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsVersionsBatchActionsFileextractPost(param.source, param.renditions, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Versions
     * @param param the request object
     */
    public objectsDocumentsVersionsBatchDeleteWithHttpInfo(param: DefaultApiObjectsDocumentsVersionsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsVersionsBatchDeleteWithHttpInfo(param.idParam, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Document Versions
     * @param param the request object
     */
    public objectsDocumentsVersionsBatchDelete(param: DefaultApiObjectsDocumentsVersionsBatchDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsVersionsBatchDelete(param.idParam, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Document Versions
     * @param param the request object
     */
    public objectsDocumentsVersionsBatchPostWithHttpInfo(param: DefaultApiObjectsDocumentsVersionsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDocumentsVersionsBatchPostWithHttpInfo(param.idParam, param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Document Versions
     * @param param the request object
     */
    public objectsDocumentsVersionsBatchPost(param: DefaultApiObjectsDocumentsVersionsBatchPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDocumentsVersionsBatchPost(param.idParam, param.authorization, param.accept, param.contentType, param.xVaultAPIMigrationMode, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Domain Information
     * @param param the request object
     */
    public objectsDomainGetWithHttpInfo(param: DefaultApiObjectsDomainGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDomainGetWithHttpInfo(param.includeApplication, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Domain Information
     * @param param the request object
     */
    public objectsDomainGet(param: DefaultApiObjectsDomainGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDomainGet(param.includeApplication, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Domains
     * @param param the request object
     */
    public objectsDomainsGetWithHttpInfo(param: DefaultApiObjectsDomainsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsDomainsGetWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Domains
     * @param param the request object
     */
    public objectsDomainsGet(param: DefaultApiObjectsDomainsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsDomainsGet(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add EDL Matched Documents
     * @param param the request object
     */
    public objectsEdlMatchedDocumentsBatchActionsAddPostWithHttpInfo(param: DefaultApiObjectsEdlMatchedDocumentsBatchActionsAddPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsEdlMatchedDocumentsBatchActionsAddPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add EDL Matched Documents
     * @param param the request object
     */
    public objectsEdlMatchedDocumentsBatchActionsAddPost(param: DefaultApiObjectsEdlMatchedDocumentsBatchActionsAddPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsEdlMatchedDocumentsBatchActionsAddPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove EDL Matched Documents
     * @param param the request object
     */
    public objectsEdlMatchedDocumentsBatchActionsRemovePostWithHttpInfo(param: DefaultApiObjectsEdlMatchedDocumentsBatchActionsRemovePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsEdlMatchedDocumentsBatchActionsRemovePostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove EDL Matched Documents
     * @param param the request object
     */
    public objectsEdlMatchedDocumentsBatchActionsRemovePost(param: DefaultApiObjectsEdlMatchedDocumentsBatchActionsRemovePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsEdlMatchedDocumentsBatchActionsRemovePost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Auto Managed Groups
     * @param param the request object
     */
    public objectsGroupsAutoGetWithHttpInfo(param: DefaultApiObjectsGroupsAutoGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsGroupsAutoGetWithHttpInfo(param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Auto Managed Groups
     * @param param the request object
     */
    public objectsGroupsAutoGet(param: DefaultApiObjectsGroupsAutoGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsGroupsAutoGet(param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Groups
     * @param param the request object
     */
    public objectsGroupsGetWithHttpInfo(param: DefaultApiObjectsGroupsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsGroupsGetWithHttpInfo(param.includeImplied, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Groups
     * @param param the request object
     */
    public objectsGroupsGet(param: DefaultApiObjectsGroupsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsGroupsGet(param.includeImplied, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Group
     * @param param the request object
     */
    public objectsGroupsGroupIdDeleteWithHttpInfo(param: DefaultApiObjectsGroupsGroupIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsGroupsGroupIdDeleteWithHttpInfo(param.groupId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Group
     * @param param the request object
     */
    public objectsGroupsGroupIdDelete(param: DefaultApiObjectsGroupsGroupIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsGroupsGroupIdDelete(param.groupId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Group
     * @param param the request object
     */
    public objectsGroupsGroupIdGetWithHttpInfo(param: DefaultApiObjectsGroupsGroupIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsGroupsGroupIdGetWithHttpInfo(param.groupId, param.includeImplied, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Group
     * @param param the request object
     */
    public objectsGroupsGroupIdGet(param: DefaultApiObjectsGroupsGroupIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsGroupsGroupIdGet(param.groupId, param.includeImplied, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Group
     * @param param the request object
     */
    public objectsGroupsGroupIdPutWithHttpInfo(param: DefaultApiObjectsGroupsGroupIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsGroupsGroupIdPutWithHttpInfo(param.groupId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Group
     * @param param the request object
     */
    public objectsGroupsGroupIdPut(param: DefaultApiObjectsGroupsGroupIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsGroupsGroupIdPut(param.groupId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Group 
     * @param param the request object
     */
    public objectsGroupsPostWithHttpInfo(param: DefaultApiObjectsGroupsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsGroupsPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Group 
     * @param param the request object
     */
    public objectsGroupsPost(param: DefaultApiObjectsGroupsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsGroupsPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Application License Usage
     * @param param the request object
     */
    public objectsLicensesGetWithHttpInfo(param: DefaultApiObjectsLicensesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsLicensesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Application License Usage
     * @param param the request object
     */
    public objectsLicensesGet(param: DefaultApiObjectsLicensesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsLicensesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Multi-Record Workflows
     * @param param the request object
     */
    public objectsObjectworkflowsActionsGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsActionsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsActionsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Multi-Record Workflows
     * @param param the request object
     */
    public objectsObjectworkflowsActionsGet(param: DefaultApiObjectsObjectworkflowsActionsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsActionsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Multi-Record Workflow Details
     * @param param the request object
     */
    public objectsObjectworkflowsActionsWorkflowNameGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsActionsWorkflowNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsActionsWorkflowNameGetWithHttpInfo(param.workflowName, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Multi-Record Workflow Details
     * @param param the request object
     */
    public objectsObjectworkflowsActionsWorkflowNameGet(param: DefaultApiObjectsObjectworkflowsActionsWorkflowNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsActionsWorkflowNameGet(param.workflowName, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Multi-Record Workflow
     * @param param the request object
     */
    public objectsObjectworkflowsActionsWorkflowNamePostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsActionsWorkflowNamePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsActionsWorkflowNamePostWithHttpInfo(param.workflowName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Multi-Record Workflow
     * @param param the request object
     */
    public objectsObjectworkflowsActionsWorkflowNamePost(param: DefaultApiObjectsObjectworkflowsActionsWorkflowNamePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsActionsWorkflowNamePost(param.workflowName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflows
     * @param param the request object
     */
    public objectsObjectworkflowsGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsGetWithHttpInfo(param.objectV, param.recordIdV, param.participant, param.statusV, param.offset, param.pageSize, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflows
     * @param param the request object
     */
    public objectsObjectworkflowsGet(param: DefaultApiObjectsObjectworkflowsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsGet(param.objectV, param.recordIdV, param.participant, param.statusV, param.offset, param.pageSize, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Tasks
     * @param param the request object
     */
    public objectsObjectworkflowsTasksGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksGetWithHttpInfo(param.objectV, param.recordIdV, param.assigneeV, param.statusV, param.offset, param.pageSize, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Tasks
     * @param param the request object
     */
    public objectsObjectworkflowsTasksGet(param: DefaultApiObjectsObjectworkflowsTasksGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksGet(param.objectV, param.recordIdV, param.assigneeV, param.statusV, param.offset, param.pageSize, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Accept Single Record Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsAcceptPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsAcceptPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsAcceptPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Accept Single Record Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsAcceptPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsAcceptPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsAcceptPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsCancelPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsCancelPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsCancelPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cancel Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsCancelPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsCancelPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsCancelPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Complete Single Record Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsCompletePostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsCompletePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsCompletePostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Complete Single Record Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsCompletePost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsCompletePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsCompletePost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Task Actions
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsGetWithHttpInfo(param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Task Actions
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsGet(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsGet(param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Accept Multi-item Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Accept Multi-item Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Complete Multi-item Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Complete Multi-item Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Manage Multi-Item Workflow Content
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Manage Multi-Item Workflow Content
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reassign Multi-item Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reassign Multi-item Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reassign Single Record Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsReassignPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsReassignPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsReassignPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reassign Single Record Workflow Task
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsReassignPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsReassignPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsReassignPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Task Action Details
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsTaskActionGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsTaskActionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsTaskActionGetWithHttpInfo(param.taskId, param.taskAction, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Task Action Details
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsTaskActionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(param.taskId, param.taskAction, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Undo Workflow Task Acceptance
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Undo Workflow Task Acceptance
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Workflow Task Due Date
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostWithHttpInfo(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Workflow Task Due Date
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(param: DefaultApiObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(param.taskId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Task Details
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsTasksTaskIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsTasksTaskIdGetWithHttpInfo(param.taskId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Task Details
     * @param param the request object
     */
    public objectsObjectworkflowsTasksTaskIdGet(param: DefaultApiObjectsObjectworkflowsTasksTaskIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsTasksTaskIdGet(param.taskId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Actions
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdActionsGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsWorkflowIdActionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsWorkflowIdActionsGetWithHttpInfo(param.workflowId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Actions
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdActionsGet(param: DefaultApiObjectsObjectworkflowsWorkflowIdActionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsWorkflowIdActionsGet(param.workflowId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Action Details
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetWithHttpInfo(param.workflowId, param.workflowAction, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Action Details
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(param: DefaultApiObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(param.workflowId, param.workflowAction, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Workflow Action
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostWithHttpInfo(param: DefaultApiObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostWithHttpInfo(param.workflowId, param.workflowAction, param.documentsSys, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Workflow Action
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(param: DefaultApiObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(param.workflowId, param.workflowAction, param.documentsSys, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Details
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdGetWithHttpInfo(param: DefaultApiObjectsObjectworkflowsWorkflowIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsObjectworkflowsWorkflowIdGetWithHttpInfo(param.workflowId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Workflow Details
     * @param param the request object
     */
    public objectsObjectworkflowsWorkflowIdGet(param: DefaultApiObjectsObjectworkflowsWorkflowIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsObjectworkflowsWorkflowIdGet(param.workflowId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Picklists
     * @param param the request object
     */
    public objectsPicklistsGetWithHttpInfo(param: DefaultApiObjectsPicklistsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsPicklistsGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Picklists
     * @param param the request object
     */
    public objectsPicklistsGet(param: DefaultApiObjectsPicklistsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsPicklistsGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Picklist Values
     * @param param the request object
     */
    public objectsPicklistsPicklistNameGetWithHttpInfo(param: DefaultApiObjectsPicklistsPicklistNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsPicklistsPicklistNameGetWithHttpInfo(param.picklistName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Picklist Values
     * @param param the request object
     */
    public objectsPicklistsPicklistNameGet(param: DefaultApiObjectsPicklistsPicklistNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsPicklistsPicklistNameGet(param.picklistName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Inactivate Picklist Value
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePicklistValueNameDeleteWithHttpInfo(param: DefaultApiObjectsPicklistsPicklistNamePicklistValueNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsPicklistsPicklistNamePicklistValueNameDeleteWithHttpInfo(param.picklistName, param.picklistValueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Inactivate Picklist Value
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePicklistValueNameDelete(param: DefaultApiObjectsPicklistsPicklistNamePicklistValueNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsPicklistsPicklistNamePicklistValueNameDelete(param.picklistName, param.picklistValueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Picklist Value
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePicklistValueNamePutWithHttpInfo(param: DefaultApiObjectsPicklistsPicklistNamePicklistValueNamePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsPicklistsPicklistNamePicklistValueNamePutWithHttpInfo(param.picklistName, param.picklistValueName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Picklist Value
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePicklistValueNamePut(param: DefaultApiObjectsPicklistsPicklistNamePicklistValueNamePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsPicklistsPicklistNamePicklistValueNamePut(param.picklistName, param.picklistValueName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Picklist Values
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePostWithHttpInfo(param: DefaultApiObjectsPicklistsPicklistNamePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsPicklistsPicklistNamePostWithHttpInfo(param.picklistName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Picklist Values
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePost(param: DefaultApiObjectsPicklistsPicklistNamePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsPicklistsPicklistNamePost(param.picklistName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Picklist Value Label
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePutWithHttpInfo(param: DefaultApiObjectsPicklistsPicklistNamePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsPicklistsPicklistNamePutWithHttpInfo(param.picklistName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Picklist Value Label
     * @param param the request object
     */
    public objectsPicklistsPicklistNamePut(param: DefaultApiObjectsPicklistsPicklistNamePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsPicklistsPicklistNamePut(param.picklistName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Build Production Vault
     * @param param the request object
     */
    public objectsSandboxActionsBuildproductionPostWithHttpInfo(param: DefaultApiObjectsSandboxActionsBuildproductionPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxActionsBuildproductionPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Build Production Vault
     * @param param the request object
     */
    public objectsSandboxActionsBuildproductionPost(param: DefaultApiObjectsSandboxActionsBuildproductionPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxActionsBuildproductionPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Promote to Production
     * @param param the request object
     */
    public objectsSandboxActionsPromoteproductionPostWithHttpInfo(param: DefaultApiObjectsSandboxActionsPromoteproductionPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxActionsPromoteproductionPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Promote to Production
     * @param param the request object
     */
    public objectsSandboxActionsPromoteproductionPost(param: DefaultApiObjectsSandboxActionsPromoteproductionPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxActionsPromoteproductionPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Recheck Sandbox Usage Limit
     * @param param the request object
     */
    public objectsSandboxActionsRecheckusagePostWithHttpInfo(param: DefaultApiObjectsSandboxActionsRecheckusagePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxActionsRecheckusagePostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Recheck Sandbox Usage Limit
     * @param param the request object
     */
    public objectsSandboxActionsRecheckusagePost(param: DefaultApiObjectsSandboxActionsRecheckusagePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxActionsRecheckusagePost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Change Sandbox Size
     * @param param the request object
     */
    public objectsSandboxBatchChangesizePostWithHttpInfo(param: DefaultApiObjectsSandboxBatchChangesizePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxBatchChangesizePostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Change Sandbox Size
     * @param param the request object
     */
    public objectsSandboxBatchChangesizePost(param: DefaultApiObjectsSandboxBatchChangesizePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxBatchChangesizePost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Set Sandbox Entitlements
     * @param param the request object
     */
    public objectsSandboxEntitlementsSetPostWithHttpInfo(param: DefaultApiObjectsSandboxEntitlementsSetPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxEntitlementsSetPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Set Sandbox Entitlements
     * @param param the request object
     */
    public objectsSandboxEntitlementsSetPost(param: DefaultApiObjectsSandboxEntitlementsSetPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxEntitlementsSetPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Sandboxes
     * @param param the request object
     */
    public objectsSandboxGetWithHttpInfo(param: DefaultApiObjectsSandboxGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Sandboxes
     * @param param the request object
     */
    public objectsSandboxGet(param: DefaultApiObjectsSandboxGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Sandbox
     * @param param the request object
     */
    public objectsSandboxNameDeleteWithHttpInfo(param: DefaultApiObjectsSandboxNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxNameDeleteWithHttpInfo(param.name, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Sandbox
     * @param param the request object
     */
    public objectsSandboxNameDelete(param: DefaultApiObjectsSandboxNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxNameDelete(param.name, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create or Refresh Sandbox
     * @param param the request object
     */
    public objectsSandboxPostWithHttpInfo(param: DefaultApiObjectsSandboxPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create or Refresh Sandbox
     * @param param the request object
     */
    public objectsSandboxPost(param: DefaultApiObjectsSandboxPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotApiNameActionsUpdatePostWithHttpInfo(param: DefaultApiObjectsSandboxSnapshotApiNameActionsUpdatePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxSnapshotApiNameActionsUpdatePostWithHttpInfo(param.apiName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotApiNameActionsUpdatePost(param: DefaultApiObjectsSandboxSnapshotApiNameActionsUpdatePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxSnapshotApiNameActionsUpdatePost(param.apiName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upgrade Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotApiNameActionsUpgradePostWithHttpInfo(param: DefaultApiObjectsSandboxSnapshotApiNameActionsUpgradePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxSnapshotApiNameActionsUpgradePostWithHttpInfo(param.apiName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upgrade Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotApiNameActionsUpgradePost(param: DefaultApiObjectsSandboxSnapshotApiNameActionsUpgradePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxSnapshotApiNameActionsUpgradePost(param.apiName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotApiNameDeleteWithHttpInfo(param: DefaultApiObjectsSandboxSnapshotApiNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxSnapshotApiNameDeleteWithHttpInfo(param.apiName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotApiNameDelete(param: DefaultApiObjectsSandboxSnapshotApiNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxSnapshotApiNameDelete(param.apiName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Sandbox Snapshots
     * @param param the request object
     */
    public objectsSandboxSnapshotGetWithHttpInfo(param: DefaultApiObjectsSandboxSnapshotGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxSnapshotGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Sandbox Snapshots
     * @param param the request object
     */
    public objectsSandboxSnapshotGet(param: DefaultApiObjectsSandboxSnapshotGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxSnapshotGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotPostWithHttpInfo(param: DefaultApiObjectsSandboxSnapshotPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxSnapshotPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Sandbox Snapshot
     * @param param the request object
     */
    public objectsSandboxSnapshotPost(param: DefaultApiObjectsSandboxSnapshotPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxSnapshotPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Refresh Sandbox from Snapshot
     * @param param the request object
     */
    public objectsSandboxVaultIdActionsRefreshPostWithHttpInfo(param: DefaultApiObjectsSandboxVaultIdActionsRefreshPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxVaultIdActionsRefreshPostWithHttpInfo(param.vaultId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Refresh Sandbox from Snapshot
     * @param param the request object
     */
    public objectsSandboxVaultIdActionsRefreshPost(param: DefaultApiObjectsSandboxVaultIdActionsRefreshPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxVaultIdActionsRefreshPost(param.vaultId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Sandbox Details by ID
     * @param param the request object
     */
    public objectsSandboxVaultIdGetWithHttpInfo(param: DefaultApiObjectsSandboxVaultIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSandboxVaultIdGetWithHttpInfo(param.vaultId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Sandbox Details by ID
     * @param param the request object
     */
    public objectsSandboxVaultIdGet(param: DefaultApiObjectsSandboxVaultIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSandboxVaultIdGet(param.vaultId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Security Policies
     * @param param the request object
     */
    public objectsSecuritypoliciesGetWithHttpInfo(param: DefaultApiObjectsSecuritypoliciesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSecuritypoliciesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Security Policies
     * @param param the request object
     */
    public objectsSecuritypoliciesGet(param: DefaultApiObjectsSecuritypoliciesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSecuritypoliciesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Security Policy
     * @param param the request object
     */
    public objectsSecuritypoliciesSecurityPolicyNameGetWithHttpInfo(param: DefaultApiObjectsSecuritypoliciesSecurityPolicyNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsSecuritypoliciesSecurityPolicyNameGetWithHttpInfo(param.securityPolicyName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Security Policy
     * @param param the request object
     */
    public objectsSecuritypoliciesSecurityPolicyNameGet(param: DefaultApiObjectsSecuritypoliciesSecurityPolicyNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsSecuritypoliciesSecurityPolicyNameGet(param.securityPolicyName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Users
     * @param param the request object
     */
    public objectsUsersGetWithHttpInfo(param: DefaultApiObjectsUsersGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersGetWithHttpInfo(param.vaults, param.excludeVaultMembership, param.excludeAppLicensing, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Users
     * @param param the request object
     */
    public objectsUsersGet(param: DefaultApiObjectsUsersGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersGet(param.vaults, param.excludeVaultMembership, param.excludeAppLicensing, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User
     * @param param the request object
     */
    public objectsUsersIdGetWithHttpInfo(param: DefaultApiObjectsUsersIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersIdGetWithHttpInfo(param.id, param.excludeVaultMembership, param.excludeAppLicensing, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User
     * @param param the request object
     */
    public objectsUsersIdGet(param: DefaultApiObjectsUsersIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersIdGet(param.id, param.excludeVaultMembership, param.excludeAppLicensing, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Permissions
     * @param param the request object
     */
    public objectsUsersIdPermissionsGetWithHttpInfo(param: DefaultApiObjectsUsersIdPermissionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersIdPermissionsGetWithHttpInfo(param.id, param.filter, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve User Permissions
     * @param param the request object
     */
    public objectsUsersIdPermissionsGet(param: DefaultApiObjectsUsersIdPermissionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersIdPermissionsGet(param.id, param.filter, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Single User
     * @param param the request object
     */
    public objectsUsersIdPutWithHttpInfo(param: DefaultApiObjectsUsersIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersIdPutWithHttpInfo(param.id, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Single User
     * @param param the request object
     */
    public objectsUsersIdPut(param: DefaultApiObjectsUsersIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersIdPut(param.id, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Validate Session User
     * @param param the request object
     */
    public objectsUsersMeGetWithHttpInfo(param: DefaultApiObjectsUsersMeGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersMeGetWithHttpInfo(param.excludeVaultMembership, param.excludeAppLicensing, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Validate Session User
     * @param param the request object
     */
    public objectsUsersMeGet(param: DefaultApiObjectsUsersMeGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersMeGet(param.excludeVaultMembership, param.excludeAppLicensing, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Change My Password
     * @param param the request object
     */
    public objectsUsersMePasswordPostWithHttpInfo(param: DefaultApiObjectsUsersMePasswordPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersMePasswordPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Change My Password
     * @param param the request object
     */
    public objectsUsersMePasswordPost(param: DefaultApiObjectsUsersMePasswordPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersMePasswordPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve My User Permissions
     * @param param the request object
     */
    public objectsUsersMePermissionsGetWithHttpInfo(param: DefaultApiObjectsUsersMePermissionsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersMePermissionsGetWithHttpInfo(param.filter, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve My User Permissions
     * @param param the request object
     */
    public objectsUsersMePermissionsGet(param: DefaultApiObjectsUsersMePermissionsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersMePermissionsGet(param.filter, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update My User
     * @param param the request object
     */
    public objectsUsersMePutWithHttpInfo(param: DefaultApiObjectsUsersMePutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersMePutWithHttpInfo(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update My User
     * @param param the request object
     */
    public objectsUsersMePut(param: DefaultApiObjectsUsersMePutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersMePut(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single User
     * @param param the request object
     */
    public objectsUsersPostWithHttpInfo(param: DefaultApiObjectsUsersPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Single User
     * @param param the request object
     */
    public objectsUsersPost(param: DefaultApiObjectsUsersPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Users
     * @param param the request object
     */
    public objectsUsersPutWithHttpInfo(param: DefaultApiObjectsUsersPutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersPutWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Users
     * @param param the request object
     */
    public objectsUsersPut(param: DefaultApiObjectsUsersPutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersPut(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable User
     * @param param the request object
     */
    public objectsUsersUserIdDeleteWithHttpInfo(param: DefaultApiObjectsUsersUserIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersUserIdDeleteWithHttpInfo(param.userId, param.domain, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable User
     * @param param the request object
     */
    public objectsUsersUserIdDelete(param: DefaultApiObjectsUsersUserIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersUserIdDelete(param.userId, param.domain, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Vault Membership
     * @param param the request object
     */
    public objectsUsersUserIdVaultMembershipVaultIdPutWithHttpInfo(param: DefaultApiObjectsUsersUserIdVaultMembershipVaultIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsUsersUserIdVaultMembershipVaultIdPutWithHttpInfo(param.userId, param.vaultId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Vault Membership
     * @param param the request object
     */
    public objectsUsersUserIdVaultMembershipVaultIdPut(param: DefaultApiObjectsUsersUserIdVaultMembershipVaultIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsUsersUserIdVaultMembershipVaultIdPut(param.userId, param.vaultId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Vault Compare
     * @param param the request object
     */
    public objectsVaultActionsComparePostWithHttpInfo(param: DefaultApiObjectsVaultActionsComparePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsVaultActionsComparePostWithHttpInfo(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Vault Compare
     * @param param the request object
     */
    public objectsVaultActionsComparePost(param: DefaultApiObjectsVaultActionsComparePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsVaultActionsComparePost(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Vault Configuration Report
     * @param param the request object
     */
    public objectsVaultActionsConfigreportPostWithHttpInfo(param: DefaultApiObjectsVaultActionsConfigreportPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.objectsVaultActionsConfigreportPostWithHttpInfo(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Vault Configuration Report
     * @param param the request object
     */
    public objectsVaultActionsConfigreportPost(param: DefaultApiObjectsVaultActionsConfigreportPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.objectsVaultActionsConfigreportPost(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Component Definition Query
     * @param param the request object
     */
    public queryComponentsPostWithHttpInfo(param: DefaultApiQueryComponentsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.queryComponentsPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Component Definition Query
     * @param param the request object
     */
    public queryComponentsPost(param: DefaultApiQueryComponentsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.queryComponentsPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Next Page URL
     * @param param the request object
     */
    public queryNextPagePostWithHttpInfo(param: DefaultApiQueryNextPagePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.queryNextPagePostWithHttpInfo(param.nextPage, param.authorization, param.accept, param.xVaultAPIDescribeQuery, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Next Page URL
     * @param param the request object
     */
    public queryNextPagePost(param: DefaultApiQueryNextPagePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.queryNextPagePost(param.nextPage, param.authorization, param.accept, param.xVaultAPIDescribeQuery, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Submitting a Query
     * @param param the request object
     */
    public queryPostWithHttpInfo(param: DefaultApiQueryPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.queryPostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIDescribeQuery, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Submitting a Query
     * @param param the request object
     */
    public queryPost(param: DefaultApiQueryPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.queryPost(param.authorization, param.accept, param.xVaultAPIDescribeQuery, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Previous Page URL
     * @param param the request object
     */
    public queryPreviousPagePostWithHttpInfo(param: DefaultApiQueryPreviousPagePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.queryPreviousPagePostWithHttpInfo(param.previousPage, param.authorization, param.accept, param.xVaultAPIDescribeQuery, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Previous Page URL
     * @param param the request object
     */
    public queryPreviousPagePost(param: DefaultApiQueryPreviousPagePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.queryPreviousPagePost(param.previousPage, param.authorization, param.accept, param.xVaultAPIDescribeQuery, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Current User with SCIM
     * @param param the request object
     */
    public scimV2MeGetWithHttpInfo(param: DefaultApiScimV2MeGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2MeGetWithHttpInfo(param.attributes, param.excludedAttributes, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Current User with SCIM
     * @param param the request object
     */
    public scimV2MeGet(param: DefaultApiScimV2MeGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2MeGet(param.attributes, param.excludedAttributes, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Current User with SCIM
     * @param param the request object
     */
    public scimV2MePutWithHttpInfo(param: DefaultApiScimV2MePutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2MePutWithHttpInfo(param.attributes, param.excludedAttributes, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Current User with SCIM
     * @param param the request object
     */
    public scimV2MePut(param: DefaultApiScimV2MePutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2MePut(param.attributes, param.excludedAttributes, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All SCIM Resource Types
     * @param param the request object
     */
    public scimV2ResourceTypesGetWithHttpInfo(param: DefaultApiScimV2ResourceTypesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2ResourceTypesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All SCIM Resource Types
     * @param param the request object
     */
    public scimV2ResourceTypesGet(param: DefaultApiScimV2ResourceTypesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2ResourceTypesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single SCIM Resource Type
     * @param param the request object
     */
    public scimV2ResourceTypesTypeGetWithHttpInfo(param: DefaultApiScimV2ResourceTypesTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2ResourceTypesTypeGetWithHttpInfo(param.type, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single SCIM Resource Type
     * @param param the request object
     */
    public scimV2ResourceTypesTypeGet(param: DefaultApiScimV2ResourceTypesTypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2ResourceTypesTypeGet(param.type, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All SCIM Schema Information
     * @param param the request object
     */
    public scimV2SchemasGetWithHttpInfo(param: DefaultApiScimV2SchemasGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2SchemasGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All SCIM Schema Information
     * @param param the request object
     */
    public scimV2SchemasGet(param: DefaultApiScimV2SchemasGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2SchemasGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single SCIM Schema Information
     * @param param the request object
     */
    public scimV2SchemasIdGetWithHttpInfo(param: DefaultApiScimV2SchemasIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2SchemasIdGetWithHttpInfo(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single SCIM Schema Information
     * @param param the request object
     */
    public scimV2SchemasIdGet(param: DefaultApiScimV2SchemasIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2SchemasIdGet(param.id, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve SCIM Provider
     * @param param the request object
     */
    public scimV2ServiceProviderConfigGetWithHttpInfo(param: DefaultApiScimV2ServiceProviderConfigGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2ServiceProviderConfigGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve SCIM Provider
     * @param param the request object
     */
    public scimV2ServiceProviderConfigGet(param: DefaultApiScimV2ServiceProviderConfigGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2ServiceProviderConfigGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve SCIM Resources
     * @param param the request object
     */
    public scimV2TypeGetWithHttpInfo(param: DefaultApiScimV2TypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2TypeGetWithHttpInfo(param.type, param.filter, param.attributes, param.excludedAttributes, param.sortBy, param.sortOrder, param.startIndex, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve SCIM Resources
     * @param param the request object
     */
    public scimV2TypeGet(param: DefaultApiScimV2TypeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2TypeGet(param.type, param.filter, param.attributes, param.excludedAttributes, param.sortBy, param.sortOrder, param.startIndex, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single SCIM Resource
     * @param param the request object
     */
    public scimV2TypeIdGetWithHttpInfo(param: DefaultApiScimV2TypeIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2TypeIdGetWithHttpInfo(param.type, param.id, param.attributes, param.excludedAttributes, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single SCIM Resource
     * @param param the request object
     */
    public scimV2TypeIdGet(param: DefaultApiScimV2TypeIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2TypeIdGet(param.type, param.id, param.attributes, param.excludedAttributes, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Users with SCIM
     * @param param the request object
     */
    public scimV2UsersGetWithHttpInfo(param: DefaultApiScimV2UsersGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2UsersGetWithHttpInfo(param.filter, param.attributes, param.excludedAttributes, param.sortBy, param.sortOrder, param.count, param.startIndex, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Users with SCIM
     * @param param the request object
     */
    public scimV2UsersGet(param: DefaultApiScimV2UsersGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2UsersGet(param.filter, param.attributes, param.excludedAttributes, param.sortBy, param.sortOrder, param.count, param.startIndex, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single User with SCIM
     * @param param the request object
     */
    public scimV2UsersIdGetWithHttpInfo(param: DefaultApiScimV2UsersIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2UsersIdGetWithHttpInfo(param.id, param.filter, param.attributes, param.excludedAttributes, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single User with SCIM
     * @param param the request object
     */
    public scimV2UsersIdGet(param: DefaultApiScimV2UsersIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2UsersIdGet(param.id, param.filter, param.attributes, param.excludedAttributes, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update User with SCIM
     * @param param the request object
     */
    public scimV2UsersIdPutWithHttpInfo(param: DefaultApiScimV2UsersIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2UsersIdPutWithHttpInfo(param.id, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update User with SCIM
     * @param param the request object
     */
    public scimV2UsersIdPut(param: DefaultApiScimV2UsersIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2UsersIdPut(param.id, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create User with SCIM
     * @param param the request object
     */
    public scimV2UsersPostWithHttpInfo(param: DefaultApiScimV2UsersPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.scimV2UsersPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create User with SCIM
     * @param param the request object
     */
    public scimV2UsersPost(param: DefaultApiScimV2UsersPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.scimV2UsersPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Signing Certificate
     * @param param the request object
     */
    public servicesCertificateCertIdGetWithHttpInfo(param: DefaultApiServicesCertificateCertIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesCertificateCertIdGetWithHttpInfo(param.certId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Signing Certificate
     * @param param the request object
     */
    public servicesCertificateCertIdGet(param: DefaultApiServicesCertificateCertIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesCertificateCertIdGet(param.certId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable Configuration Mode
     * @param param the request object
     */
    public servicesConfigurationModeActionsDisablePostWithHttpInfo(param: DefaultApiServicesConfigurationModeActionsDisablePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesConfigurationModeActionsDisablePostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable Configuration Mode
     * @param param the request object
     */
    public servicesConfigurationModeActionsDisablePost(param: DefaultApiServicesConfigurationModeActionsDisablePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesConfigurationModeActionsDisablePost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Enable Configuration Mode
     * @param param the request object
     */
    public servicesConfigurationModeActionsEnablePostWithHttpInfo(param: DefaultApiServicesConfigurationModeActionsEnablePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesConfigurationModeActionsEnablePostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Enable Configuration Mode
     * @param param the request object
     */
    public servicesConfigurationModeActionsEnablePost(param: DefaultApiServicesConfigurationModeActionsEnablePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesConfigurationModeActionsEnablePost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Available Direct Data Files
     * @param param the request object
     */
    public servicesDirectdataFilesGetWithHttpInfo(param: DefaultApiServicesDirectdataFilesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesDirectdataFilesGetWithHttpInfo(param.extractType, param.startTime, param.stopTime, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Available Direct Data Files
     * @param param the request object
     */
    public servicesDirectdataFilesGet(param: DefaultApiServicesDirectdataFilesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesDirectdataFilesGet(param.extractType, param.startTime, param.stopTime, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Direct Data File
     * @param param the request object
     */
    public servicesDirectdataFilesNameGetWithHttpInfo(param: DefaultApiServicesDirectdataFilesNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesDirectdataFilesNameGetWithHttpInfo(param.name, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Direct Data File
     * @param param the request object
     */
    public servicesDirectdataFilesNameGet(param: DefaultApiServicesDirectdataFilesNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesDirectdataFilesNameGet(param.name, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Item Content
     * @param param the request object
     */
    public servicesFileStagingItemsContentItemGetWithHttpInfo(param: DefaultApiServicesFileStagingItemsContentItemGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingItemsContentItemGetWithHttpInfo(param.item, param.authorization, param.accept, param.range, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Item Content
     * @param param the request object
     */
    public servicesFileStagingItemsContentItemGet(param: DefaultApiServicesFileStagingItemsContentItemGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingItemsContentItemGet(param.item, param.authorization, param.accept, param.range, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete File or Folder
     * @param param the request object
     */
    public servicesFileStagingItemsItemDeleteWithHttpInfo(param: DefaultApiServicesFileStagingItemsItemDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingItemsItemDeleteWithHttpInfo(param.item, param.recursive, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete File or Folder
     * @param param the request object
     */
    public servicesFileStagingItemsItemDelete(param: DefaultApiServicesFileStagingItemsItemDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingItemsItemDelete(param.item, param.recursive, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * List Items at a Path
     * @param param the request object
     */
    public servicesFileStagingItemsItemGetWithHttpInfo(param: DefaultApiServicesFileStagingItemsItemGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingItemsItemGetWithHttpInfo(param.item, param.recursive, param.limit, param.formatResult, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * List Items at a Path
     * @param param the request object
     */
    public servicesFileStagingItemsItemGet(param: DefaultApiServicesFileStagingItemsItemGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingItemsItemGet(param.item, param.recursive, param.limit, param.formatResult, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Folder or File
     * @param param the request object
     */
    public servicesFileStagingItemsItemPutWithHttpInfo(param: DefaultApiServicesFileStagingItemsItemPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingItemsItemPutWithHttpInfo(param.item, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Folder or File
     * @param param the request object
     */
    public servicesFileStagingItemsItemPut(param: DefaultApiServicesFileStagingItemsItemPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingItemsItemPut(param.item, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Folder or File
     * @param param the request object
     */
    public servicesFileStagingItemsPostWithHttpInfo(param: DefaultApiServicesFileStagingItemsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingItemsPostWithHttpInfo(param.authorization, param.accept, param.contentMD5, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Folder or File
     * @param param the request object
     */
    public servicesFileStagingItemsPost(param: DefaultApiServicesFileStagingItemsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingItemsPost(param.authorization, param.accept, param.contentMD5, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * List Upload Sessions
     * @param param the request object
     */
    public servicesFileStagingUploadGetWithHttpInfo(param: DefaultApiServicesFileStagingUploadGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * List Upload Sessions
     * @param param the request object
     */
    public servicesFileStagingUploadGet(param: DefaultApiServicesFileStagingUploadGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Resumable Upload Session
     * @param param the request object
     */
    public servicesFileStagingUploadPostWithHttpInfo(param: DefaultApiServicesFileStagingUploadPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadPostWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Resumable Upload Session
     * @param param the request object
     */
    public servicesFileStagingUploadPost(param: DefaultApiServicesFileStagingUploadPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadPost(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Abort Upload Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdDeleteWithHttpInfo(param: DefaultApiServicesFileStagingUploadUploadSessionIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadUploadSessionIdDeleteWithHttpInfo(param.uploadSessionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Abort Upload Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdDelete(param: DefaultApiServicesFileStagingUploadUploadSessionIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadUploadSessionIdDelete(param.uploadSessionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Get Upload Session Details
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdGetWithHttpInfo(param: DefaultApiServicesFileStagingUploadUploadSessionIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadUploadSessionIdGetWithHttpInfo(param.uploadSessionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Get Upload Session Details
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdGet(param: DefaultApiServicesFileStagingUploadUploadSessionIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadUploadSessionIdGet(param.uploadSessionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * List File Parts Uploaded to Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdPartsGetWithHttpInfo(param: DefaultApiServicesFileStagingUploadUploadSessionIdPartsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadUploadSessionIdPartsGetWithHttpInfo(param.uploadSessionId, param.limit, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * List File Parts Uploaded to Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdPartsGet(param: DefaultApiServicesFileStagingUploadUploadSessionIdPartsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadUploadSessionIdPartsGet(param.uploadSessionId, param.limit, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Commit Upload Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdPostWithHttpInfo(param: DefaultApiServicesFileStagingUploadUploadSessionIdPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadUploadSessionIdPostWithHttpInfo(param.uploadSessionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Commit Upload Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdPost(param: DefaultApiServicesFileStagingUploadUploadSessionIdPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadUploadSessionIdPost(param.uploadSessionId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upload to a Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdPutWithHttpInfo(param: DefaultApiServicesFileStagingUploadUploadSessionIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesFileStagingUploadUploadSessionIdPutWithHttpInfo(param.uploadSessionId, param.authorization, param.accept, param.contentType, param.xVaultAPIFilePartNumber, param.contentMD5, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Upload to a Session
     * @param param the request object
     */
    public servicesFileStagingUploadUploadSessionIdPut(param: DefaultApiServicesFileStagingUploadUploadSessionIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesFileStagingUploadUploadSessionIdPut(param.uploadSessionId, param.authorization, param.accept, param.contentType, param.xVaultAPIFilePartNumber, param.contentMD5, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Job Histories
     * @param param the request object
     */
    public servicesJobsHistoriesGetWithHttpInfo(param: DefaultApiServicesJobsHistoriesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsHistoriesGetWithHttpInfo(param.startDate, param.endDate, param.status, param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Job Histories
     * @param param the request object
     */
    public servicesJobsHistoriesGet(param: DefaultApiServicesJobsHistoriesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsHistoriesGet(param.startDate, param.endDate, param.status, param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param param the request object
     */
    public servicesJobsJobIdErrorsGetWithHttpInfo(param: DefaultApiServicesJobsJobIdErrorsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsJobIdErrorsGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param param the request object
     */
    public servicesJobsJobIdErrorsGet(param: DefaultApiServicesJobsJobIdErrorsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsJobIdErrorsGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Job Status
     * @param param the request object
     */
    public servicesJobsJobIdGetWithHttpInfo(param: DefaultApiServicesJobsJobIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsJobIdGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Job Status
     * @param param the request object
     */
    public servicesJobsJobIdGet(param: DefaultApiServicesJobsJobIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsJobIdGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param param the request object
     */
    public servicesJobsJobIdSummaryGetWithHttpInfo(param: DefaultApiServicesJobsJobIdSummaryGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsJobIdSummaryGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param param the request object
     */
    public servicesJobsJobIdSummaryGet(param: DefaultApiServicesJobsJobIdSummaryGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsJobIdSummaryGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve SDK Job Tasks
     * @param param the request object
     */
    public servicesJobsJobIdTasksGetWithHttpInfo(param: DefaultApiServicesJobsJobIdTasksGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsJobIdTasksGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve SDK Job Tasks
     * @param param the request object
     */
    public servicesJobsJobIdTasksGet(param: DefaultApiServicesJobsJobIdTasksGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsJobIdTasksGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Job Monitors
     * @param param the request object
     */
    public servicesJobsMonitorsGetWithHttpInfo(param: DefaultApiServicesJobsMonitorsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsMonitorsGetWithHttpInfo(param.startDate, param.endDate, param.status, param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Job Monitors
     * @param param the request object
     */
    public servicesJobsMonitorsGet(param: DefaultApiServicesJobsMonitorsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsMonitorsGet(param.startDate, param.endDate, param.status, param.limit, param.offset, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Start Job
     * @param param the request object
     */
    public servicesJobsStartNowJobIdPostWithHttpInfo(param: DefaultApiServicesJobsStartNowJobIdPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesJobsStartNowJobIdPostWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Start Job
     * @param param the request object
     */
    public servicesJobsStartNowJobIdPost(param: DefaultApiServicesJobsStartNowJobIdPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesJobsStartNowJobIdPost(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Extract Data Files
     * @param param the request object
     */
    public servicesLoaderExtractPostWithHttpInfo(param: DefaultApiServicesLoaderExtractPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesLoaderExtractPostWithHttpInfo(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Extract Data Files
     * @param param the request object
     */
    public servicesLoaderExtractPost(param: DefaultApiServicesLoaderExtractPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesLoaderExtractPost(param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Load Failure Log Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdFailurelogGetWithHttpInfo(param: DefaultApiServicesLoaderJobIdTasksTaskIdFailurelogGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesLoaderJobIdTasksTaskIdFailurelogGetWithHttpInfo(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Load Failure Log Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdFailurelogGet(param: DefaultApiServicesLoaderJobIdTasksTaskIdFailurelogGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesLoaderJobIdTasksTaskIdFailurelogGet(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Loader Extract Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdResultsGetWithHttpInfo(param: DefaultApiServicesLoaderJobIdTasksTaskIdResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesLoaderJobIdTasksTaskIdResultsGetWithHttpInfo(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Loader Extract Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdResultsGet(param: DefaultApiServicesLoaderJobIdTasksTaskIdResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesLoaderJobIdTasksTaskIdResultsGet(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Loader Extract Renditions Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdResultsRenditionsGetWithHttpInfo(param: DefaultApiServicesLoaderJobIdTasksTaskIdResultsRenditionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesLoaderJobIdTasksTaskIdResultsRenditionsGetWithHttpInfo(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Loader Extract Renditions Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(param: DefaultApiServicesLoaderJobIdTasksTaskIdResultsRenditionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Load Success Log Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdSuccesslogGetWithHttpInfo(param: DefaultApiServicesLoaderJobIdTasksTaskIdSuccesslogGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesLoaderJobIdTasksTaskIdSuccesslogGetWithHttpInfo(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Load Success Log Results
     * @param param the request object
     */
    public servicesLoaderJobIdTasksTaskIdSuccesslogGet(param: DefaultApiServicesLoaderJobIdTasksTaskIdSuccesslogGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesLoaderJobIdTasksTaskIdSuccesslogGet(param.jobId, param.taskId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Load Data Objects
     * @param param the request object
     */
    public servicesLoaderLoadPostWithHttpInfo(param: DefaultApiServicesLoaderLoadPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesLoaderLoadPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Load Data Objects
     * @param param the request object
     */
    public servicesLoaderLoadPost(param: DefaultApiServicesLoaderLoadPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesLoaderLoadPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Validate Package
     * @param param the request object
     */
    public servicesPackageActionsValidatePostWithHttpInfo(param: DefaultApiServicesPackageActionsValidatePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesPackageActionsValidatePostWithHttpInfo(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Validate Package
     * @param param the request object
     */
    public servicesPackageActionsValidatePost(param: DefaultApiServicesPackageActionsValidatePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesPackageActionsValidatePost(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Package
     * @param param the request object
     */
    public servicesPackagePostWithHttpInfo(param: DefaultApiServicesPackagePostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesPackagePostWithHttpInfo(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Export Package
     * @param param the request object
     */
    public servicesPackagePost(param: DefaultApiServicesPackagePostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesPackagePost(param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Package
     * @param param the request object
     */
    public servicesPackagePutWithHttpInfo(param: DefaultApiServicesPackagePutRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesPackagePutWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Import Package
     * @param param the request object
     */
    public servicesPackagePut(param: DefaultApiServicesPackagePutRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesPackagePut(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Queues
     * @param param the request object
     */
    public servicesQueuesGetWithHttpInfo(param: DefaultApiServicesQueuesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesQueuesGetWithHttpInfo(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Queues
     * @param param the request object
     */
    public servicesQueuesGet(param: DefaultApiServicesQueuesGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesQueuesGet(param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable Delivery
     * @param param the request object
     */
    public servicesQueuesQueueNameActionsDisableDeliveryPutWithHttpInfo(param: DefaultApiServicesQueuesQueueNameActionsDisableDeliveryPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesQueuesQueueNameActionsDisableDeliveryPutWithHttpInfo(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Disable Delivery
     * @param param the request object
     */
    public servicesQueuesQueueNameActionsDisableDeliveryPut(param: DefaultApiServicesQueuesQueueNameActionsDisableDeliveryPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesQueuesQueueNameActionsDisableDeliveryPut(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Enable Delivery
     * @param param the request object
     */
    public servicesQueuesQueueNameActionsEnableDeliveryPutWithHttpInfo(param: DefaultApiServicesQueuesQueueNameActionsEnableDeliveryPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesQueuesQueueNameActionsEnableDeliveryPutWithHttpInfo(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Enable Delivery
     * @param param the request object
     */
    public servicesQueuesQueueNameActionsEnableDeliveryPut(param: DefaultApiServicesQueuesQueueNameActionsEnableDeliveryPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesQueuesQueueNameActionsEnableDeliveryPut(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reset Queue
     * @param param the request object
     */
    public servicesQueuesQueueNameActionsResetPutWithHttpInfo(param: DefaultApiServicesQueuesQueueNameActionsResetPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesQueuesQueueNameActionsResetPutWithHttpInfo(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Reset Queue
     * @param param the request object
     */
    public servicesQueuesQueueNameActionsResetPut(param: DefaultApiServicesQueuesQueueNameActionsResetPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesQueuesQueueNameActionsResetPut(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Queue Status
     * @param param the request object
     */
    public servicesQueuesQueueNameGetWithHttpInfo(param: DefaultApiServicesQueuesQueueNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesQueuesQueueNameGetWithHttpInfo(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Queue Status
     * @param param the request object
     */
    public servicesQueuesQueueNameGet(param: DefaultApiServicesQueuesQueueNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesQueuesQueueNameGet(param.queueName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Validate Imported Package
     * @param param the request object
     */
    public servicesVobjectVaultPackageVPackageIdActionsValidatePostWithHttpInfo(param: DefaultApiServicesVobjectVaultPackageVPackageIdActionsValidatePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.servicesVobjectVaultPackageVPackageIdActionsValidatePostWithHttpInfo(param.packageId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Validate Imported Package
     * @param param the request object
     */
    public servicesVobjectVaultPackageVPackageIdActionsValidatePost(param: DefaultApiServicesVobjectVaultPackageVPackageIdActionsValidatePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.servicesVobjectVaultPackageVPackageIdActionsValidatePost(param.packageId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * End Session
     * @param param the request object
     */
    public sessionDeleteWithHttpInfo(param: DefaultApiSessionDeleteRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.sessionDeleteWithHttpInfo(param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * End Session
     * @param param the request object
     */
    public sessionDelete(param: DefaultApiSessionDeleteRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.sessionDelete(param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Single Client Code Distribution
     * @param param the request object
     */
    public uicodeDistributionsDistributionNameCodeGetWithHttpInfo(param: DefaultApiUicodeDistributionsDistributionNameCodeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.uicodeDistributionsDistributionNameCodeGetWithHttpInfo(param.distributionName, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Single Client Code Distribution
     * @param param the request object
     */
    public uicodeDistributionsDistributionNameCodeGet(param: DefaultApiUicodeDistributionsDistributionNameCodeGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.uicodeDistributionsDistributionNameCodeGet(param.distributionName, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Client Code Distribution
     * @param param the request object
     */
    public uicodeDistributionsDistributionNameDeleteWithHttpInfo(param: DefaultApiUicodeDistributionsDistributionNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.uicodeDistributionsDistributionNameDeleteWithHttpInfo(param.distributionName, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Single Client Code Distribution
     * @param param the request object
     */
    public uicodeDistributionsDistributionNameDelete(param: DefaultApiUicodeDistributionsDistributionNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.uicodeDistributionsDistributionNameDelete(param.distributionName, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param param the request object
     */
    public uicodeDistributionsDistributionNameGetWithHttpInfo(param: DefaultApiUicodeDistributionsDistributionNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.uicodeDistributionsDistributionNameGetWithHttpInfo(param.distributionName, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param param the request object
     */
    public uicodeDistributionsDistributionNameGet(param: DefaultApiUicodeDistributionsDistributionNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.uicodeDistributionsDistributionNameGet(param.distributionName, param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     * @param param the request object
     */
    public uicodeDistributionsGetWithHttpInfo(param: DefaultApiUicodeDistributionsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.uicodeDistributionsGetWithHttpInfo(param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     * @param param the request object
     */
    public uicodeDistributionsGet(param: DefaultApiUicodeDistributionsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.uicodeDistributionsGet(param.accept, param.authorization, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add or Replace Single Client Code Distribution
     * @param param the request object
     */
    public uicodeDistributionsPostWithHttpInfo(param: DefaultApiUicodeDistributionsPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.uicodeDistributionsPostWithHttpInfo(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Add or Replace Single Client Code Distribution
     * @param param the request object
     */
    public uicodeDistributionsPost(param: DefaultApiUicodeDistributionsPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.uicodeDistributionsPost(param.accept, param.authorization, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Deploy Package
     * @param param the request object
     */
    public vobjectVaultPackageVPackageIdActionsDeployPostWithHttpInfo(param: DefaultApiVobjectVaultPackageVPackageIdActionsDeployPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectVaultPackageVPackageIdActionsDeployPostWithHttpInfo(param.packageId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Deploy Package
     * @param param the request object
     */
    public vobjectVaultPackageVPackageIdActionsDeployPost(param: DefaultApiVobjectVaultPackageVPackageIdActionsDeployPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectVaultPackageVPackageIdActionsDeployPost(param.packageId, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Package Deploy Results
     * @param param the request object
     */
    public vobjectVaultPackageVPackageIdActionsDeployResultsGetWithHttpInfo(param: DefaultApiVobjectVaultPackageVPackageIdActionsDeployResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectVaultPackageVPackageIdActionsDeployResultsGetWithHttpInfo(param.packageId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Package Deploy Results
     * @param param the request object
     */
    public vobjectVaultPackageVPackageIdActionsDeployResultsGet(param: DefaultApiVobjectVaultPackageVPackageIdActionsDeployResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectVaultPackageVPackageIdActionsDeployResultsGet(param.packageId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Results of Cascade Delete Job
     * @param param the request object
     */
    public vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetWithHttpInfo(param: DefaultApiVobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetWithHttpInfo(param.objectName, param.jobStatus, param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Results of Cascade Delete Job
     * @param param the request object
     */
    public vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(param: DefaultApiVobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(param.objectName, param.jobStatus, param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Results of Deep Copy Job
     * @param param the request object
     */
    public vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetWithHttpInfo(param: DefaultApiVobjectsDeepcopyResultsObjectNameJobStatusJobIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetWithHttpInfo(param.objectName, param.jobStatus, param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Results of Deep Copy Job
     * @param param the request object
     */
    public vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(param: DefaultApiVobjectsDeepcopyResultsObjectNameJobStatusJobIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(param.objectName, param.jobStatus, param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create a Placeholder from an EDL Item
     * @param param the request object
     */
    public vobjectsEdlItemVActionsCreateplaceholderPostWithHttpInfo(param: DefaultApiVobjectsEdlItemVActionsCreateplaceholderPostRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsEdlItemVActionsCreateplaceholderPostWithHttpInfo(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create a Placeholder from an EDL Item
     * @param param the request object
     */
    public vobjectsEdlItemVActionsCreateplaceholderPost(param: DefaultApiVobjectsEdlItemVActionsCreateplaceholderPostRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsEdlItemVActionsCreateplaceholderPost(param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Merge Records Job Log
     * @param param the request object
     */
    public vobjectsMergesJobIdLogGetWithHttpInfo(param: DefaultApiVobjectsMergesJobIdLogGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsMergesJobIdLogGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Merge Records Job Log
     * @param param the request object
     */
    public vobjectsMergesJobIdLogGet(param: DefaultApiVobjectsMergesJobIdLogGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsMergesJobIdLogGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Record Merge Results
     * @param param the request object
     */
    public vobjectsMergesJobIdResultsGetWithHttpInfo(param: DefaultApiVobjectsMergesJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsMergesJobIdResultsGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Record Merge Results
     * @param param the request object
     */
    public vobjectsMergesJobIdResultsGet(param: DefaultApiVobjectsMergesJobIdResultsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsMergesJobIdResultsGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Record Merge Status
     * @param param the request object
     */
    public vobjectsMergesJobIdStatusGetWithHttpInfo(param: DefaultApiVobjectsMergesJobIdStatusGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsMergesJobIdStatusGetWithHttpInfo(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Record Merge Status
     * @param param the request object
     */
    public vobjectsMergesJobIdStatusGet(param: DefaultApiVobjectsMergesJobIdStatusGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsMergesJobIdStatusGet(param.jobId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Object Action on Multiple Records
     * @param param the request object
     */
    public vobjectsObjectNameActionsActionNamePostWithHttpInfo(param: DefaultApiVobjectsObjectNameActionsActionNamePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameActionsActionNamePostWithHttpInfo(param.objectName, param.actionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Object Action on Multiple Records
     * @param param the request object
     */
    public vobjectsObjectNameActionsActionNamePost(param: DefaultApiVobjectsObjectNameActionsActionNamePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameActionsActionNamePost(param.objectName, param.actionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Change Object Type
     * @param param the request object
     */
    public vobjectsObjectNameActionsChangetypePostWithHttpInfo(param: DefaultApiVobjectsObjectNameActionsChangetypePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameActionsChangetypePostWithHttpInfo(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Change Object Type
     * @param param the request object
     */
    public vobjectsObjectNameActionsChangetypePost(param: DefaultApiVobjectsObjectNameActionsChangetypePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameActionsChangetypePost(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Record Merge
     * @param param the request object
     */
    public vobjectsObjectNameActionsMergePostWithHttpInfo(param: DefaultApiVobjectsObjectNameActionsMergePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameActionsMergePostWithHttpInfo(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID, param.vobjectsObjectNameActionsMergePostRequestInner,  options).toPromise();
    }

    /**
     * Initiate Record Merge
     * @param param the request object
     */
    public vobjectsObjectNameActionsMergePost(param: DefaultApiVobjectsObjectNameActionsMergePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameActionsMergePost(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID, param.vobjectsObjectNameActionsMergePostRequestInner,  options).toPromise();
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param param the request object
     */
    public vobjectsObjectNameActionsRecalculaterollupsGetWithHttpInfo(param: DefaultApiVobjectsObjectNameActionsRecalculaterollupsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameActionsRecalculaterollupsGetWithHttpInfo(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param param the request object
     */
    public vobjectsObjectNameActionsRecalculaterollupsGet(param: DefaultApiVobjectsObjectNameActionsRecalculaterollupsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameActionsRecalculaterollupsGet(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Recalculate Roll-up Fields
     * @param param the request object
     */
    public vobjectsObjectNameActionsRecalculaterollupsPostWithHttpInfo(param: DefaultApiVobjectsObjectNameActionsRecalculaterollupsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameActionsRecalculaterollupsPostWithHttpInfo(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Recalculate Roll-up Fields
     * @param param the request object
     */
    public vobjectsObjectNameActionsRecalculaterollupsPost(param: DefaultApiVobjectsObjectNameActionsRecalculaterollupsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameActionsRecalculaterollupsPost(param.objectName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Corporate Currency Fields
     * @param param the request object
     */
    public vobjectsObjectNameActionsUpdatecorporatecurrencyPutWithHttpInfo(param: DefaultApiVobjectsObjectNameActionsUpdatecorporatecurrencyPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameActionsUpdatecorporatecurrencyPutWithHttpInfo(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Corporate Currency Fields
     * @param param the request object
     */
    public vobjectsObjectNameActionsUpdatecorporatecurrencyPut(param: DefaultApiVobjectsObjectNameActionsUpdatecorporatecurrencyPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameActionsUpdatecorporatecurrencyPut(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Object Record Attachments
     * @param param the request object
     */
    public vobjectsObjectNameAttachmentsBatchDeleteWithHttpInfo(param: DefaultApiVobjectsObjectNameAttachmentsBatchDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameAttachmentsBatchDeleteWithHttpInfo(param.objectName, param.idParam, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Multiple Object Record Attachments
     * @param param the request object
     */
    public vobjectsObjectNameAttachmentsBatchDelete(param: DefaultApiVobjectsObjectNameAttachmentsBatchDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameAttachmentsBatchDelete(param.objectName, param.idParam, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Object Record Attachments
     * @param param the request object
     */
    public vobjectsObjectNameAttachmentsBatchPostWithHttpInfo(param: DefaultApiVobjectsObjectNameAttachmentsBatchPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameAttachmentsBatchPostWithHttpInfo(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Multiple Object Record Attachments
     * @param param the request object
     */
    public vobjectsObjectNameAttachmentsBatchPost(param: DefaultApiVobjectsObjectNameAttachmentsBatchPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameAttachmentsBatchPost(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param param the request object
     */
    public vobjectsObjectNameAttachmentsBatchPutWithHttpInfo(param: DefaultApiVobjectsObjectNameAttachmentsBatchPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameAttachmentsBatchPutWithHttpInfo(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param param the request object
     */
    public vobjectsObjectNameAttachmentsBatchPut(param: DefaultApiVobjectsObjectNameAttachmentsBatchPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameAttachmentsBatchPut(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Object Records
     * @param param the request object
     */
    public vobjectsObjectNameDeleteWithHttpInfo(param: DefaultApiVobjectsObjectNameDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameDeleteWithHttpInfo(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Object Records
     * @param param the request object
     */
    public vobjectsObjectNameDelete(param: DefaultApiVobjectsObjectNameDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameDelete(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Roles
     * @param param the request object
     */
    public vobjectsObjectNameIdRolesRoleNameGetWithHttpInfo(param: DefaultApiVobjectsObjectNameIdRolesRoleNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameIdRolesRoleNameGetWithHttpInfo(param.objectName, param.id, param.roleName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Roles
     * @param param the request object
     */
    public vobjectsObjectNameIdRolesRoleNameGet(param: DefaultApiVobjectsObjectNameIdRolesRoleNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameIdRolesRoleNameGet(param.objectName, param.id, param.roleName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object User Actions Details
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNameGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsActionNameGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsActionNameGetWithHttpInfo(param.objectName, param.objectRecordId, param.actionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object User Actions Details
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNameGet(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsActionNameGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsActionNameGet(param.objectName, param.objectRecordId, param.actionName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Object Action on a Single Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNamePostWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsActionNamePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsActionNamePostWithHttpInfo(param.objectName, param.objectRecordId, param.actionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Initiate Object Action on a Single Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNamePost(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsActionNamePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsActionNamePost(param.objectName, param.objectRecordId, param.actionName, param.authorization, param.contentType, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cascade Delete Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsCascadedeletePostWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsCascadedeletePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsCascadedeletePostWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Cascade Delete Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsCascadedeletePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Deep Copy Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsDeepcopyPostWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsDeepcopyPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsDeepcopyPostWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Deep Copy Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsDeepcopyPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(param.objectName, param.objectRecordId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record User Actions
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsGetWithHttpInfo(param.objectName, param.objectRecordId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record User Actions
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdActionsGet(param: DefaultApiVobjectsObjectNameObjectRecordIdActionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdActionsGet(param.objectName, param.objectRecordId, param.loc, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Attachment Field File
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentFieldName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Attachment Field File
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(param.objectName, param.objectRecordId, param.attachmentFieldName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Attachment Field File
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentFieldName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Attachment Field File
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(param.objectName, param.objectRecordId, param.attachmentFieldName, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Attachment Field Files
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Attachment Field Files
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Object Record Attachment
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Object Record Attachment
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachment Metadata
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachment Metadata
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Object Record Attachment Description
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Object Record Attachment Description
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Object Record Attachment Version
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Delete Object Record Attachment Version
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Object Record Attachment File
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download Object Record Attachment File
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Restore Object Record Attachment Version
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.restore, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Restore Object Record Attachment Version
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(param.objectName, param.objectRecordId, param.attachmentId, param.attachmentVersion, param.restore, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachment Versions
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachment Versions
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(param.objectName, param.objectRecordId, param.attachmentId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Object Record Attachment Files
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsFileGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsFileGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsFileGetWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Download All Object Record Attachment Files
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsFileGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsFileGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsFileGet(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachments
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsGetWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record Attachments
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsGet(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Object Record Attachment
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsPostWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsPostWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create Object Record Attachment
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsPost(param: DefaultApiVobjectsObjectNameObjectRecordIdAttachmentsPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAttachmentsPost(param.objectName, param.objectRecordId, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAudittrailGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdAudittrailGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdAudittrailGetWithHttpInfo(param.objectName, param.objectRecordId, param.startDate, param.endDate, param.formatResult, param.limit, param.offset, param.events, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdAudittrailGet(param: DefaultApiVobjectsObjectNameObjectRecordIdAudittrailGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdAudittrailGet(param.objectName, param.objectRecordId, param.startDate, param.endDate, param.formatResult, param.limit, param.offset, param.events, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdGetWithHttpInfo(param: DefaultApiVobjectsObjectNameObjectRecordIdGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameObjectRecordIdGetWithHttpInfo(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Object Record
     * @param param the request object
     */
    public vobjectsObjectNameObjectRecordIdGet(param: DefaultApiVobjectsObjectNameObjectRecordIdGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameObjectRecordIdGet(param.objectName, param.objectRecordId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create & Upsert Object Records
     * @param param the request object
     */
    public vobjectsObjectNamePostWithHttpInfo(param: DefaultApiVobjectsObjectNamePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNamePostWithHttpInfo(param.objectName, param.idParam, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPINoTriggers, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Create & Upsert Object Records
     * @param param the request object
     */
    public vobjectsObjectNamePost(param: DefaultApiVobjectsObjectNamePostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNamePost(param.objectName, param.idParam, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPINoTriggers, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Object Records
     * @param param the request object
     */
    public vobjectsObjectNamePutWithHttpInfo(param: DefaultApiVobjectsObjectNamePutRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNamePutWithHttpInfo(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPINoTriggers, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Update Object Records
     * @param param the request object
     */
    public vobjectsObjectNamePut(param: DefaultApiVobjectsObjectNamePutRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNamePut(param.objectName, param.authorization, param.contentType, param.accept, param.xVaultAPIMigrationMode, param.xVaultAPINoTriggers, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users & Groups from Roles on Object Records
     * @param param the request object
     */
    public vobjectsObjectNameRolesDeleteWithHttpInfo(param: DefaultApiVobjectsObjectNameRolesDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameRolesDeleteWithHttpInfo(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Remove Users & Groups from Roles on Object Records
     * @param param the request object
     */
    public vobjectsObjectNameRolesDelete(param: DefaultApiVobjectsObjectNameRolesDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameRolesDelete(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Object Records
     * @param param the request object
     */
    public vobjectsObjectNameRolesPostWithHttpInfo(param: DefaultApiVobjectsObjectNameRolesPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsObjectNameRolesPostWithHttpInfo(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Object Records
     * @param param the request object
     */
    public vobjectsObjectNameRolesPost(param: DefaultApiVobjectsObjectNameRolesPostRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsObjectNameRolesPost(param.objectName, param.authorization, param.accept, param.contentType, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Outbound Package Dependencies
     * @param param the request object
     */
    public vobjectsOutboundPackageVPackageIdDependenciesGetWithHttpInfo(param: DefaultApiVobjectsOutboundPackageVPackageIdDependenciesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.vobjectsOutboundPackageVPackageIdDependenciesGetWithHttpInfo(param.packageId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

    /**
     * Retrieve Outbound Package Dependencies
     * @param param the request object
     */
    public vobjectsOutboundPackageVPackageIdDependenciesGet(param: DefaultApiVobjectsOutboundPackageVPackageIdDependenciesGetRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.vobjectsOutboundPackageVPackageIdDependenciesGet(param.packageId, param.authorization, param.accept, param.xVaultAPIClientID,  options).toPromise();
    }

}
