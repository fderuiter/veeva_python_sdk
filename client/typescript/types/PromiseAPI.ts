import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, PromiseConfigurationOptions, wrapOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

import { VobjectsObjectNameActionsMergePostRequestInner } from '../models/VobjectsObjectNameActionsMergePostRequestInner';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve API Versions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve API Versions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Content File
     * @param componentTypeAndRecordName The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlComponentsComponentTypeAndRecordNameFilesGetWithHttpInfo(componentTypeAndRecordName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlComponentsComponentTypeAndRecordNameFilesGetWithHttpInfo(componentTypeAndRecordName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Content File
     * @param componentTypeAndRecordName The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Record (MDL)
     * @param componentTypeAndRecordName The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlComponentsComponentTypeAndRecordNameGetWithHttpInfo(componentTypeAndRecordName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlComponentsComponentTypeAndRecordNameGetWithHttpInfo(componentTypeAndRecordName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Record (MDL)
     * @param componentTypeAndRecordName The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     * @param jobId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlExecuteAsyncJobIdResultsGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlExecuteAsyncJobIdResultsGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     * @param jobId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlExecuteAsyncJobIdResultsGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlExecuteAsyncJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Execute MDL Script Asynchronously
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlExecuteAsyncPostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlExecuteAsyncPostWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Execute MDL Script Asynchronously
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlExecuteAsyncPost(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlExecuteAsyncPost(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Execute MDL Script
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlExecutePostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlExecutePostWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Execute MDL Script
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlExecutePost(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlExecutePost(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upload Content File
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlFilesPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlFilesPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upload Content File
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public apiMdlFilesPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.apiMdlFilesPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Audit Details
     * @param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time.
     * @param [startDate] Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
     * @param [endDate] Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
     * @param [allDates] Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail.
     * @param [formatResult] To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required.
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [objects] This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects.
     * @param [events] This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public audittrailAuditTrailTypeGetWithHttpInfo(auditTrailType: string, startDate?: string, endDate?: string, allDates?: string, formatResult?: string, limit?: string, offset?: string, objects?: string, events?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.audittrailAuditTrailTypeGetWithHttpInfo(auditTrailType, startDate, endDate, allDates, formatResult, limit, offset, objects, events, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Audit Details
     * @param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time.
     * @param [startDate] Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
     * @param [endDate] Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days.
     * @param [allDates] Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail.
     * @param [formatResult] To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required.
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [objects] This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects.
     * @param [events] This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public audittrailAuditTrailTypeGet(auditTrailType: string, startDate?: string, endDate?: string, allDates?: string, formatResult?: string, limit?: string, offset?: string, objects?: string, events?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.audittrailAuditTrailTypeGet(auditTrailType, startDate, endDate, allDates, formatResult, limit, offset, objects, events, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Authentication Type Discovery
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public authDiscoveryPostWithHttpInfo(accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.authDiscoveryPostWithHttpInfo(accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Authentication Type Discovery
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public authDiscoveryPost(accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.authDiscoveryPost(accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * OAuth 2.0 / OpenID Connect
     * @param oathOidcProfileId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public authOauthSessionOathOidcProfileIdPostWithHttpInfo(oathOidcProfileId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.authOauthSessionOathOidcProfileIdPostWithHttpInfo(oathOidcProfileId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * OAuth 2.0 / OpenID Connect
     * @param oathOidcProfileId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public authOauthSessionOathOidcProfileIdPost(oathOidcProfileId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.authOauthSessionOathOidcProfileIdPost(oathOidcProfileId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * User Name and Password
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public authPostWithHttpInfo(contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.authPostWithHttpInfo(contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * User Name and Password
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public authPost(contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.authPost(contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Source Code File
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameDeleteWithHttpInfo(className: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameDeleteWithHttpInfo(className, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Source Code File
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameDelete(className: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameDelete(className, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable Vault Extension
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameDisablePutWithHttpInfo(className: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameDisablePutWithHttpInfo(className, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable Vault Extension
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameDisablePut(className: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameDisablePut(className, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Enable Vault Extension
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameEnablePutWithHttpInfo(className: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameEnablePutWithHttpInfo(className, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Enable Vault Extension
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameEnablePut(className: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameEnablePut(className, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single Source Code File
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameGetWithHttpInfo(className: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameGetWithHttpInfo(className, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single Source Code File
     * @param className The fully qualified class name of your file.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeClassNameGet(className: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeClassNameGet(className, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Profiling Sessions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Profiling Sessions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Profiling Session
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Profiling Session
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * End Profiling Session
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameActionsEndPostWithHttpInfo(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameActionsEndPostWithHttpInfo(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * End Profiling Session
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameActionsEndPost(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameActionsEndPost(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Profiling Session
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameDeleteWithHttpInfo(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameDeleteWithHttpInfo(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Profiling Session
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameDelete(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameDelete(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Profiling Session
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameGetWithHttpInfo(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameGetWithHttpInfo(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Profiling Session
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameGet(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameGet(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Profiling Session Results
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameResultsGetWithHttpInfo(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameResultsGetWithHttpInfo(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Profiling Session Results
     * @param sessionName The name of the session, for example,  baseline__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codeProfilerSessionNameResultsGet(sessionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codeProfilerSessionNameResultsGet(sessionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add or Replace Single Source Code File
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codePutWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codePutWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add or Replace Single Source Code File
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public codePut(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.codePut(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Specific Root Nodes
     * @param edlHierarchyOrTemplate Choose to retrieve either edl_hierarchy__v or edl_template__v
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyOrTemplateActionsListnodesPostWithHttpInfo(edlHierarchyOrTemplate: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyOrTemplateActionsListnodesPostWithHttpInfo(edlHierarchyOrTemplate, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Specific Root Nodes
     * @param edlHierarchyOrTemplate Choose to retrieve either edl_hierarchy__v or edl_template__v
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Root Nodes
     * @param edlHierarchyOrTemplate
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyOrTemplateGetWithHttpInfo(edlHierarchyOrTemplate: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyOrTemplateGetWithHttpInfo(edlHierarchyOrTemplate, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Root Nodes
     * @param edlHierarchyOrTemplate
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve a Node\'s Children
     * @param parentNodeId The ID of a parent node in the hierarchy.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenGetWithHttpInfo(parentNodeId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenGetWithHttpInfo(parentNodeId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve a Node\'s Children
     * @param parentNodeId The ID of a parent node in the hierarchy.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Node Order
     * @param parentNodeId The ID of a parent node in the hierarchy.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenPutWithHttpInfo(parentNodeId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenPutWithHttpInfo(parentNodeId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Node Order
     * @param parentNodeId The ID of a parent node in the hierarchy.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Record (XML/JSON)
     * @param componentTypeAndRecordName The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationComponentTypeAndRecordNameGetWithHttpInfo(componentTypeAndRecordName: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationComponentTypeAndRecordNameGetWithHttpInfo(componentTypeAndRecordName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Record (XML/JSON)
     * @param componentTypeAndRecordName The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint.
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Record Collection
     * @param componentType
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationComponentTypeGetWithHttpInfo(componentType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationComponentTypeGetWithHttpInfo(componentType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Record Collection
     * @param componentType
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationComponentTypeGet(componentType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationComponentTypeGet(componentType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Details from a Specific Object
     * @param objectNameAndObjectType The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;.
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationObjectNameAndObjectTypeGetWithHttpInfo(objectNameAndObjectType: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationObjectNameAndObjectTypeGetWithHttpInfo(objectNameAndObjectType, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Details from a Specific Object
     * @param objectNameAndObjectType The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;.
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationObjectNameAndObjectTypeGet(objectNameAndObjectType: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationObjectNameAndObjectTypeGet(objectNameAndObjectType, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Details from All Object Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationObjecttypeGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationObjecttypeGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Details from All Object Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationObjecttypeGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationObjecttypeGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRuleDeleteWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRuleDeleteWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRuleDelete(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRuleDelete(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param [lifecycleV] Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c
     * @param [roleV] Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c
     * @param [productV] Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap
     * @param [countryV] Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States
     * @param [studyV] In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study
     * @param [studyCountryV] In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRuleGetWithHttpInfo(lifecycleV?: string, roleV?: string, productV?: string, countryV?: string, studyV?: string, studyCountryV?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRuleGetWithHttpInfo(lifecycleV, roleV, productV, countryV, studyV, studyCountryV, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default & Override)
     * @param [lifecycleV] Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c
     * @param [roleV] Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c
     * @param [productV] Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap
     * @param [countryV] Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States
     * @param [studyV] In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study
     * @param [studyCountryV] In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRuleGet(lifecycleV?: string, roleV?: string, productV?: string, countryV?: string, studyV?: string, studyCountryV?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRuleGet(lifecycleV, roleV, productV, countryV, studyV, studyCountryV, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRulePostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRulePostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRulePost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRulePost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRulePutWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRulePutWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default & Override)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public configurationRoleAssignmentRulePut(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.configurationRoleAssignmentRulePut(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Delegated Session
     * @param [authorization] The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public delegationLoginPostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.delegationLoginPostWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Delegated Session
     * @param [authorization] The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public delegationLoginPost(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.delegationLoginPost(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Delegations
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public delegationVaultsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.delegationVaultsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Delegations
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public delegationVaultsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.delegationVaultsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Session Keep Alive
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public keepAlivePostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.keepAlivePostWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Session Keep Alive
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public keepAlivePost(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.keepAlivePost(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Limits on Objects
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public limitsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.limitsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Limits on Objects
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public limitsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.limitsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Daily API Usage
     * @param [date] The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
     * @param [logFormat] Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsApiUsageGetWithHttpInfo(date?: string, logFormat?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsApiUsageGetWithHttpInfo(date, logFormat, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Daily API Usage
     * @param [date] The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
     * @param [logFormat] Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsApiUsageGet(date?: string, logFormat?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsApiUsageGet(date, logFormat, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Debug Logs
     * @param [userId] Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
     * @param [includeInactive] Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugGetWithHttpInfo(userId?: string, includeInactive?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugGetWithHttpInfo(userId, includeInactive, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Debug Logs
     * @param [userId] Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
     * @param [includeInactive] Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugGet(userId?: string, includeInactive?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugGet(userId, includeInactive, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Debug Log
     * @param id The ID of the debug log to delete.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdActionsResetDeleteWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdActionsResetDeleteWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Debug Log
     * @param id The ID of the debug log to delete.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdActionsResetDelete(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdActionsResetDelete(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reset Debug Log
     * @param id The ID of the debug log to delete.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdActionsResetPostWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdActionsResetPostWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reset Debug Log
     * @param id The ID of the debug log to delete.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdActionsResetPost(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdActionsResetPost(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Debug Log Files
     * @param id The ID of the debug log to download.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdFilesGetWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdFilesGetWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Debug Log Files
     * @param id The ID of the debug log to download.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdFilesGet(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdFilesGet(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single Debug Log
     * @param id The ID of the debug log to retrieve.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdGetWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdGetWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single Debug Log
     * @param id The ID of the debug log to retrieve.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugIdGet(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugIdGet(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Debug Log
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Debug Log
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeDebugPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeDebugPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download SDK Runtime Log
     * @param [date]
     * @param [logFormat] Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeRuntimeGetWithHttpInfo(date?: string, logFormat?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeRuntimeGetWithHttpInfo(date, logFormat, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download SDK Runtime Log
     * @param [date]
     * @param [logFormat] Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public logsCodeRuntimeGet(date?: string, logFormat?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.logsCodeRuntimeGet(date, logFormat, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Bulk Translation File
     * @param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public messagesMessageTypeActionsImportPostWithHttpInfo(messageType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.messagesMessageTypeActionsImportPostWithHttpInfo(messageType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Bulk Translation File
     * @param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public messagesMessageTypeActionsImportPost(messageType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.messagesMessageTypeActionsImportPost(messageType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Bulk Translation File
     * @param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
     * @param lang A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public messagesMessageTypeLanguageLangActionsExportPostWithHttpInfo(messageType: string, lang: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.messagesMessageTypeLanguageLangActionsExportPostWithHttpInfo(messageType, lang, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Bulk Translation File
     * @param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys.
     * @param lang A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public messagesMessageTypeLanguageLangActionsExportPost(messageType: string, lang: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.messagesMessageTypeLanguageLangActionsExportPost(messageType, lang, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Audit Metadata
     * @param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc).
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataAudittrailAuditTrailTypeGetWithHttpInfo(auditTrailType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataAudittrailAuditTrailTypeGetWithHttpInfo(auditTrailType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Audit Metadata
     * @param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc).
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataAudittrailAuditTrailTypeGet(auditTrailType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataAudittrailAuditTrailTypeGet(auditTrailType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Audit Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataAudittrailGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataAudittrailGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Audit Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataAudittrailGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataAudittrailGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Type Metadata
     * @param componentType The component type name (Picklist, Docfield, Doctype, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataComponentsComponentTypeGetWithHttpInfo(componentType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataComponentsComponentTypeGetWithHttpInfo(componentType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Component Type Metadata
     * @param componentType The component type name (Picklist, Docfield, Doctype, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataComponentsComponentTypeGet(componentType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataComponentsComponentTypeGet(componentType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Component Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataComponentsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataComponentsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Component Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataComponentsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataComponentsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Node Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsBindersTemplatesBindernodesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsBindersTemplatesBindernodesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Node Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsBindersTemplatesBindernodesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsBindersTemplatesBindernodesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsBindersTemplatesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsBindersTemplatesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsBindersTemplatesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsBindersTemplatesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param placemarkType The name of the placemark type. For example, sticky__sys.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetWithHttpInfo(placemarkType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetWithHttpInfo(placemarkType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     * @param placemarkType The name of the placemark type. For example, sticky__sys.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     * @param referenceType
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetWithHttpInfo(referenceType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetWithHttpInfo(referenceType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     * @param referenceType
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Annotation Type Metadata
     * @param annotationType The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetWithHttpInfo(annotationType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetWithHttpInfo(annotationType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Annotation Type Metadata
     * @param annotationType The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Event SubType Metadata
     * @param eventType The event type. For example, distribution__v.
     * @param eventSubtype The event subtype. For example, approved_email__v.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetWithHttpInfo(eventType: string, eventSubtype: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetWithHttpInfo(eventType, eventSubtype, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Event SubType Metadata
     * @param eventType The event type. For example, distribution__v.
     * @param eventSubtype The event subtype. For example, approved_email__v.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType: string, eventSubtype: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType, eventSubtype, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Event Types and Subtypes
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsEventsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsEventsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Event Types and Subtypes
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsEventsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsEventsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Lock Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsLockGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsLockGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Lock Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsLockGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsLockGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Common Document Fields
     * @param [contentType]
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsPropertiesFindCommonPostWithHttpInfo(contentType?: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsPropertiesFindCommonPostWithHttpInfo(contentType, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Common Document Fields
     * @param [contentType]
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsPropertiesFindCommonPost(contentType?: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsPropertiesFindCommonPost(contentType, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Fields
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsPropertiesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsPropertiesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Fields
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsPropertiesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsPropertiesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Template Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTemplatesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTemplatesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Template Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTemplatesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTemplatesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Type
     * @param type The document type. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeGetWithHttpInfo(type: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeGetWithHttpInfo(type, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Type
     * @param type The document type. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeGet(type: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeGet(type, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Type Relationships
     * @param type The document type. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeRelationshipsGetWithHttpInfo(type: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeRelationshipsGetWithHttpInfo(type, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Type Relationships
     * @param type The document type. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeRelationshipsGet(type: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeRelationshipsGet(type, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Classification
     * @param type The document type. See Retrieve Document Types.
     * @param subtype The document subtype. See Retrieve Document Types.
     * @param classification The document classification. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetWithHttpInfo(type: string, subtype: string, classification: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetWithHttpInfo(type, subtype, classification, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Classification
     * @param type The document type. See Retrieve Document Types.
     * @param subtype The document subtype. See Retrieve Document Types.
     * @param classification The document classification. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(type: string, subtype: string, classification: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(type, subtype, classification, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Subtype
     * @param type The document type. See Retrieve Document Types.
     * @param subtype The document subtype. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetWithHttpInfo(type: string, subtype: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetWithHttpInfo(type, subtype, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Subtype
     * @param type The document type. See Retrieve Document Types.
     * @param subtype The document subtype. See Retrieve Document Types.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(type: string, subtype: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(type, subtype, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Group Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsGroupsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsGroupsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Group Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsGroupsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsGroupsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Security Policy Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsSecuritypoliciesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsSecuritypoliciesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Security Policy Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsSecuritypoliciesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsSecuritypoliciesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsUsersGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsUsersGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataObjectsUsersGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataObjectsUsersGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Archived Document Signature Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Archived Document Signature Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Signature Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Signature Metadata
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Collection
     * @param [loc] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsGetWithHttpInfo(loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsGetWithHttpInfo(loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Collection
     * @param [loc] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsGet(loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsGet(loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Raw Object Deployment
     * @param objectName
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNameActionsCanceldeploymentPostWithHttpInfo(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNameActionsCanceldeploymentPostWithHttpInfo(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Raw Object Deployment
     * @param objectName
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Field Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectFieldName The object field name value (id, name__v, external_id__v, etc.).
     * @param [loc] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNameFieldsObjectFieldNameGetWithHttpInfo(objectName: string, objectFieldName: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNameFieldsObjectFieldNameGetWithHttpInfo(objectName, objectFieldName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Field Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectFieldName The object field name value (id, name__v, external_id__v, etc.).
     * @param [loc] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName: string, objectFieldName: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName, objectFieldName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [loc] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNameGetWithHttpInfo(objectName: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNameGetWithHttpInfo(objectName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [loc] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNameGet(objectName: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNameGet(objectName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Page Layouts
     * @param objectName
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNamePageLayoutsGetWithHttpInfo(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNamePageLayoutsGetWithHttpInfo(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Page Layouts
     * @param objectName
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNamePageLayoutsGet(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNamePageLayoutsGet(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Page Layout Metadata
     * @param objectName The name of the object from which to retrieve page layout metadata.
     * @param layoutName The name of the page layout from which to retrieve metadata.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNamePageLayoutsLayoutNameGetWithHttpInfo(objectName: string, layoutName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNamePageLayoutsLayoutNameGetWithHttpInfo(objectName, layoutName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Page Layout Metadata
     * @param objectName The name of the object from which to retrieve page layout metadata.
     * @param layoutName The name of the page layout from which to retrieve metadata.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName: string, layoutName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName, layoutName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Email Notification Histories
     * @param [startDate] Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date.
     * @param [endDate] Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date.
     * @param [allDates] Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours.
     * @param [formatResult] To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv.
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public notificationsHistoriesGetWithHttpInfo(startDate?: string, endDate?: string, allDates?: boolean, formatResult?: string, limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.notificationsHistoriesGetWithHttpInfo(startDate, endDate, allDates, formatResult, limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Email Notification Histories
     * @param [startDate] Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date.
     * @param [endDate] Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date.
     * @param [allDates] Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours.
     * @param [formatResult] To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv.
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public notificationsHistoriesGet(startDate?: string, endDate?: string, allDates?: boolean, formatResult?: string, limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.notificationsHistoriesGet(startDate, endDate, allDates, formatResult, limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Bulk Workflow Action Details
     * @param action
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsActionGetWithHttpInfo(action: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsActionGetWithHttpInfo(action, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Bulk Workflow Action Details
     * @param action
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsActionGet(action: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsActionGet(action, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param action
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsActionPostWithHttpInfo(action: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsActionPostWithHttpInfo(action, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     * @param action
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsActionPost(action: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsActionPost(action, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Workflow Tasks
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsCanceltasksPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsCanceltasksPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Workflow Tasks
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsCanceltasksPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsCanceltasksPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Workflows
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsCancelworkflowsPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsCancelworkflowsPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Workflows
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsCancelworkflowsPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsCancelworkflowsPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Bulk Workflow Actions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Bulk Workflow Actions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reassign Workflow Tasks
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsReassigntasksPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsReassigntasksPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reassign Workflow Tasks
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsReassigntasksPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsReassigntasksPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Workflow Owner
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsReplaceworkflowownerPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsReplaceworkflowownerPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Workflow Owner
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectWorkflowActionsReplaceworkflowownerPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectWorkflowActionsReplaceworkflowownerPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Export Results
     * @param jobId The id value of the requested export job. This is returned with the export binder requests above.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersActionsExportJobIdResultsGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersActionsExportJobIdResultsGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Export Results
     * @param jobId The id value of the requested export job. This is returned with the export binder requests above.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersActionsExportJobIdResultsGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersActionsExportJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Binder (Latest Version)
     * @param binderId The binder id field value.
     * @param [source] to include source content or not
     * @param [renditiontype] to include viewable renditions
     * @param [docversion] to include all major versions
     * @param [attachments] to include all versions of attachments
     * @param [_export] configurable filename metadata
     * @param [docfield] to exclude document metadata csv
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdActionsExportPostWithHttpInfo(binderId: string, source?: boolean, renditiontype?: string, docversion?: string, attachments?: string, _export?: string, docfield?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdActionsExportPostWithHttpInfo(binderId, source, renditiontype, docversion, attachments, _export, docfield, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Binder (Latest Version)
     * @param binderId The binder id field value.
     * @param [source] to include source content or not
     * @param [renditiontype] to include viewable renditions
     * @param [docversion] to include all major versions
     * @param [attachments] to include all versions of attachments
     * @param [_export] configurable filename metadata
     * @param [docfield] to exclude document metadata csv
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdActionsExportPost(binderId: string, source?: boolean, renditiontype?: string, docversion?: string, attachments?: string, _export?: string, docfield?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdActionsExportPost(binderId, source, renditiontype, docversion, attachments, _export, docfield, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Refresh Binder Auto-Filing
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdActionsPostWithHttpInfo(binderId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdActionsPostWithHttpInfo(binderId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Refresh Binder Auto-Filing
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdActionsPost(binderId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdActionsPost(binderId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binding Rule
     * @param binderId The binder id field value.
     * @param [contentType]
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdBindingRulePutWithHttpInfo(binderId: string, contentType?: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdBindingRulePutWithHttpInfo(binderId, contentType, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binding Rule
     * @param binderId The binder id field value.
     * @param [contentType]
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdBindingRulePut(binderId: string, contentType?: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdBindingRulePut(binderId, contentType, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDeleteWithHttpInfo(binderId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDeleteWithHttpInfo(binderId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDelete(binderId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDelete(binderId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Document Binding Rule
     * @param binderId The binder id field value.
     * @param nodeId The binder node id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsNodeIdBindingRulePutWithHttpInfo(binderId: string, nodeId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsNodeIdBindingRulePutWithHttpInfo(binderId, nodeId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Document Binding Rule
     * @param binderId The binder id field value.
     * @param nodeId The binder node id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId: string, nodeId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId, nodeId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Document to Binder
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsPostWithHttpInfo(binderId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsPostWithHttpInfo(binderId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Document to Binder
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsPost(binderId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsPost(binderId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Document from Binder
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsSectionIdDeleteWithHttpInfo(binderId: string, sectionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsSectionIdDeleteWithHttpInfo(binderId, sectionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Document from Binder
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsSectionIdDelete(binderId: string, sectionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsSectionIdDelete(binderId, sectionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Move Document in Binder
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsSectionIdPutWithHttpInfo(binderId: string, sectionId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsSectionIdPutWithHttpInfo(binderId, sectionId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Move Document in Binder
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdDocumentsSectionIdPut(binderId: string, sectionId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdDocumentsSectionIdPut(binderId, sectionId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder
     * @param binderId The binder id field value.
     * @param [depth] To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdGetWithHttpInfo(binderId: string, depth?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdGetWithHttpInfo(binderId, depth, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder
     * @param binderId The binder id field value.
     * @param [depth] To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdGet(binderId: string, depth?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdGet(binderId, depth, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Version
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdPostWithHttpInfo(binderId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdPostWithHttpInfo(binderId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Version
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdPost(binderId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdPost(binderId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdPutWithHttpInfo(binderId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdPutWithHttpInfo(binderId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdPut(binderId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdPut(binderId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param binderId The id value of the binder from which to remove roles.
     * @param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * @param id The id value of the user or group to remove from the role.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(binderId: string, roleNameAndUserOrGroup: string, id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(binderId, roleNameAndUserOrGroup, id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Binder
     * @param binderId The id value of the binder from which to remove roles.
     * @param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * @param id The id value of the user or group to remove from the role.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId: string, roleNameAndUserOrGroup: string, id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId, roleNameAndUserOrGroup, id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Section Binding Rule
     * @param binderId The binder id field value.
     * @param nodeId The binder node id field value.
     * @param [contentType]
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsNodeIdBindingRulePutWithHttpInfo(binderId: string, nodeId: string, contentType?: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsNodeIdBindingRulePutWithHttpInfo(binderId, nodeId, contentType, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Section Binding Rule
     * @param binderId The binder id field value.
     * @param nodeId The binder node id field value.
     * @param [contentType]
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId: string, nodeId: string, contentType?: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId, nodeId, contentType, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Section
     * @param binderId The binder id field value.
     * @param nodeId The binder node id of the section.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsNodeIdPutWithHttpInfo(binderId: string, nodeId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsNodeIdPutWithHttpInfo(binderId, nodeId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Section
     * @param binderId The binder id field value.
     * @param nodeId The binder node id of the section.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsNodeIdPut(binderId: string, nodeId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsNodeIdPut(binderId, nodeId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Section
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsPostWithHttpInfo(binderId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsPostWithHttpInfo(binderId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Section
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsPost(binderId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsPost(binderId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Section
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsSectionIdDeleteWithHttpInfo(binderId: string, sectionId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsSectionIdDeleteWithHttpInfo(binderId, sectionId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Section
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsSectionIdDelete(binderId: string, sectionId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsSectionIdDelete(binderId, sectionId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Sections
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsSectionIdGetWithHttpInfo(binderId: string, sectionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsSectionIdGetWithHttpInfo(binderId, sectionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Sections
     * @param binderId The binder id field value.
     * @param sectionId The binder node id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdSectionsSectionIdGet(binderId: string, sectionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdSectionsSectionIdGet(binderId, sectionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Binder Versions
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsGetWithHttpInfo(binderId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsGetWithHttpInfo(binderId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Binder Versions
     * @param binderId The binder id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsGet(binderId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsGet(binderId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Binder (Specific Version)
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [source] to include source content or not
     * @param [renditiontype] to include viewable renditions
     * @param [docversion] to include all major versions
     * @param [attachments] to include all versions of attachments
     * @param [_export] configurable filename metadata
     * @param [docfield] to exclude document metadata csv
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, source?: boolean, renditiontype?: string, docversion?: string, attachments?: string, _export?: string, docfield?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostWithHttpInfo(binderId, majorVersion, minorVersion, source, renditiontype, docversion, attachments, _export, docfield, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Binder (Specific Version)
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [source] to include source content or not
     * @param [renditiontype] to include viewable renditions
     * @param [docversion] to include all major versions
     * @param [attachments] to include all versions of attachments
     * @param [_export] configurable filename metadata
     * @param [docfield] to exclude document metadata csv
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId: string, majorVersion: string, minorVersion: string, source?: boolean, renditiontype?: string, docversion?: string, attachments?: string, _export?: string, docfield?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId, majorVersion, minorVersion, source, renditiontype, docversion, attachments, _export, docfield, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Version
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(binderId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Version
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Version
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionGetWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionGetWithHttpInfo(binderId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Version
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Version
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionPutWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionPutWithHttpInfo(binderId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Version
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Relationship
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(binderId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Relationship
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId: string, majorVersion: string, minorVersion: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Relationship
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param relationshipId The binder relationship id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(binderId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Relationship
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param relationshipId The binder relationship id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Relationship
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param relationshipId The binder relationship id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(binderId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Relationship
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param relationshipId The binder relationship id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Version Section
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param sectionId Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetWithHttpInfo(binderId: string, majorVersion: string, minorVersion: string, sectionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetWithHttpInfo(binderId, majorVersion, minorVersion, sectionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Version Section
     * @param binderId The binder id field value.
     * @param majorVersion The binder major_version_number__v field value.
     * @param minorVersion The binder minor_version_number__v field value.
     * @param sectionId Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId: string, majorVersion: string, minorVersion: string, sectionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId, majorVersion, minorVersion, sectionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Binder Roles
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdRolesGetWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdRolesGetWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Binder Roles
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdRolesGet(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdRolesGet(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdRolesPostWithHttpInfo(id: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdRolesPostWithHttpInfo(id, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Binder
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdRolesPost(id: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdRolesPost(id, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Role
     * @param id The binder &#x60;id&#x60;.
     * @param roleName The name of the role to retrieve. For example, &#x60;owner__v&#x60;.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdRolesRoleNameGetWithHttpInfo(id: string, roleName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdRolesRoleNameGetWithHttpInfo(id, roleName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Role
     * @param id The binder &#x60;id&#x60;.
     * @param roleName The name of the role to retrieve. For example, &#x60;owner__v&#x60;.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdRolesRoleNameGet(id: string, roleName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdRolesRoleNameGet(id, roleName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder User Actions
     * @param id The binder id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the binder.
     * @param minorVersion The minor version number of the binder.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(id: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(id, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder User Actions
     * @param id The binder id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the binder.
     * @param minorVersion The minor version number of the binder.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Entry Criteria
     * @param id The binder id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the binder.
     * @param minorVersion The minor version number of the binder.
     * @param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(id, majorVersion, minorVersion, nameV, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Entry Criteria
     * @param id The binder id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the binder.
     * @param minorVersion The minor version number of the binder.
     * @param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Binder User Action
     * @param id The binder id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the binder.
     * @param minorVersion The minor version number of the binder.
     * @param nameV The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(id, majorVersion, minorVersion, nameV, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Binder User Action
     * @param id The binder id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the binder.
     * @param minorVersion The minor version number of the binder.
     * @param nameV The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Binders
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersLifecycleActionsPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersLifecycleActionsPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Binders
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersLifecycleActionsPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersLifecycleActionsPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Bulk Binder User Actions
     * @param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersLifecycleActionsUserActionNamePutWithHttpInfo(userActionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersLifecycleActionsUserActionNamePutWithHttpInfo(userActionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Bulk Binder User Actions
     * @param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersLifecycleActionsUserActionNamePut(userActionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersLifecycleActionsUserActionNamePut(userActionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder
     * @param [async] When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data. 
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersPostWithHttpInfo(async?: boolean, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersPostWithHttpInfo(async, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder
     * @param [async] When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data. 
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersPost(async?: boolean, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersPost(async, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Collection
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Collection
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Template
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Template
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Template
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesPutWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesPutWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Binder Template
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesPut(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesPut(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Node Attributes
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameBindernodesGetWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameBindernodesGetWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Node Attributes
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameBindernodesGet(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameBindernodesGet(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Template Node
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameBindernodesPostWithHttpInfo(templateName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameBindernodesPostWithHttpInfo(templateName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Binder Template Node
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameBindernodesPost(templateName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameBindernodesPost(templateName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Binder Template Nodes
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameBindernodesPutWithHttpInfo(templateName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameBindernodesPutWithHttpInfo(templateName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Binder Template Nodes
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameBindernodesPut(templateName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameBindernodesPut(templateName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Template
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameDeleteWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameDeleteWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Binder Template
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameDelete(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameDelete(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Attributes
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameGetWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameGetWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Binder Template Attributes
     * @param templateName The binder template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsBindersTemplatesTemplateNameGet(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsBindersTemplatesTemplateNameGet(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Deleted Document IDs
     * @param [startDate] Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
     * @param [endDate] Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDeletionsDocumentsGetWithHttpInfo(startDate?: string, endDate?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDeletionsDocumentsGetWithHttpInfo(startDate, endDate, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Deleted Document IDs
     * @param [startDate] Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
     * @param [endDate] Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDeletionsDocumentsGet(startDate?: string, endDate?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDeletionsDocumentsGet(startDate, endDate, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Deleted Object Record ID
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDeletionsVobjectsObjectNameGetWithHttpInfo(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDeletionsVobjectsObjectNameGetWithHttpInfo(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Deleted Object Record ID
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDeletionsVobjectsObjectNameGet(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDeletionsVobjectsObjectNameGet(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Workflows
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsGetWithHttpInfo(loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsGetWithHttpInfo(loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Workflows
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsGet(loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsGet(loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Controlled Copy Job Results
     * @param lifecycleAndStateAndAction The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link.
     * @param jobId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetWithHttpInfo(lifecycleAndStateAndAction: string, jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetWithHttpInfo(lifecycleAndStateAndAction, jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Controlled Copy Job Results
     * @param lifecycleAndStateAndAction The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link.
     * @param jobId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction: string, jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction, jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Workflow Details
     * @param workflowName The document workflow name value.
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsWorkflowNameGetWithHttpInfo(workflowName: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsWorkflowNameGetWithHttpInfo(workflowName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Workflow Details
     * @param workflowName The document workflow name value.
     * @param [loc] When localized (translated) strings are available, retrieve them by setting loc to true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsWorkflowNameGet(workflowName: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsWorkflowNameGet(workflowName, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Document Workflow
     * @param workflowName The document workflow name value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsWorkflowNamePostWithHttpInfo(workflowName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsWorkflowNamePostWithHttpInfo(workflowName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Document Workflow
     * @param workflowName The document workflow name value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsActionsWorkflowNamePost(workflowName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsActionsWorkflowNamePost(workflowName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Annotations
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsBatchDeleteWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsBatchDeleteWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Annotations
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsBatchDelete(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsBatchDelete(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Annotations
     * @param authorization
     * @param contentType
     * @param accept
     * @param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsBatchPostWithHttpInfo(authorization: string, contentType: string, accept: string, xVaultAPIClientID: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsBatchPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Annotations
     * @param authorization
     * @param contentType
     * @param accept
     * @param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsBatchPost(authorization: string, contentType: string, accept: string, xVaultAPIClientID: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsBatchPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Annotations
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsBatchPutWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsBatchPutWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Annotations
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsBatchPut(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsBatchPut(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Annotation Replies
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsRepliesBatchPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsRepliesBatchPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Annotation Replies
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAnnotationsRepliesBatchPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAnnotationsRepliesBatchPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Attachments
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAttachmentsBatchDeleteWithHttpInfo(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAttachmentsBatchDeleteWithHttpInfo(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Attachments
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAttachmentsBatchDelete(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAttachmentsBatchDelete(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Document Attachments
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAttachmentsBatchPostWithHttpInfo(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAttachmentsBatchPostWithHttpInfo(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Document Attachments
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAttachmentsBatchPost(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAttachmentsBatchPost(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Document Attachment Descriptions
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAttachmentsBatchPutWithHttpInfo(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAttachmentsBatchPutWithHttpInfo(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Document Attachment Descriptions
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsAttachmentsBatchPut(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsAttachmentsBatchPut(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Export Results
     * @param jobId The id value of the requested export job. This is returned with the export document requests.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsFileextractJobIdResultsGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsFileextractJobIdResultsGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Export Results
     * @param jobId The id value of the requested export job. This is returned with the export document requests.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Documents
     * @param [source] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true.
     * @param [renditions] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false.
     * @param [allversions] Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsFileextractPostWithHttpInfo(source?: boolean, renditions?: boolean, allversions?: boolean, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsFileextractPostWithHttpInfo(source, renditions, allversions, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Documents
     * @param [source] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true.
     * @param [renditions] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false.
     * @param [allversions] Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsFileextractPost(source?: boolean, renditions?: boolean, allversions?: boolean, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsFileextractPost(source, renditions, allversions, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reclassify Multiple Documents
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsReclassifyPutWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsReclassifyPutWithHttpInfo(authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reclassify Multiple Documents
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsReclassifyPut(authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsReclassifyPut(authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Document Renditions
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsRerenderPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsRerenderPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Document Renditions
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchActionsRerenderPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchActionsRerenderPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Documents
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchDeleteWithHttpInfo(idParam?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchDeleteWithHttpInfo(idParam, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Documents
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchDelete(idParam?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchDelete(idParam, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Undo Collaborative Authoring Checkout
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchLockDeleteWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchLockDeleteWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Undo Collaborative Authoring Checkout
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchLockDelete(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchLockDelete(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Documents
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchPostWithHttpInfo(authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Documents
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchPost(authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Documents
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchPutWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchPutWithHttpInfo(authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Documents
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsBatchPut(authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsBatchPut(authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Anchor IDs
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAnchorsGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAnchorsGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Anchor IDs
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAnchorsGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAnchorsGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Document Annotations to PDF
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAnnotationsFileGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAnnotationsFileGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Document Annotations to PDF
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAnnotationsFileGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAnnotationsFileGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Document Annotations from PDF
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAnnotationsFilePostWithHttpInfo(docId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAnnotationsFilePostWithHttpInfo(docId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Document Annotations from PDF
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAnnotationsFilePost(docId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAnnotationsFilePost(docId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Attachment
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdDeleteWithHttpInfo(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdDeleteWithHttpInfo(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Attachment
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Attachment
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdFileGetWithHttpInfo(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdFileGetWithHttpInfo(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Attachment
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachment Metadata
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdGetWithHttpInfo(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdGetWithHttpInfo(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachment Metadata
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Document Attachment Description
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdPutWithHttpInfo(docId: string, attachmentId: string, accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdPutWithHttpInfo(docId, attachmentId, accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Document Attachment Description
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId: string, attachmentId: string, accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId, attachmentId, accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Attachment Version
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(docId: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Attachment Version
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Attachment Version
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(docId: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Attachment Version
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachment Version Metadata
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(docId: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachment Version Metadata
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Restore Document Attachment Version
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [restore] The parameter restore must be set to true. 
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(docId: string, attachmentId: string, attachmentVersion: string, restore?: boolean, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(docId, attachmentId, attachmentVersion, restore, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Restore Document Attachment Version
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [restore] The parameter restore must be set to true. 
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId: string, attachmentId: string, attachmentVersion: string, restore?: boolean, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId, attachmentId, attachmentVersion, restore, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachment Versions
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachment Versions
     * @param docId The document id field value.
     * @param attachmentId The attachment id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId: string, attachmentId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId, attachmentId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Document Attachments
     * @param docId The document id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsFileGetWithHttpInfo(docId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsFileGetWithHttpInfo(docId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Document Attachments
     * @param docId The document id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsFileGet(docId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsFileGet(docId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachments
     * @param docId The document id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsGetWithHttpInfo(docId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsGetWithHttpInfo(docId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Attachments
     * @param docId The document id field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsGet(docId: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsGet(docId, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Document Attachment
     * @param docId The document id field value.
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsPostWithHttpInfo(docId: string, accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsPostWithHttpInfo(docId, accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Document Attachment
     * @param docId The document id field value.
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAttachmentsPost(docId: string, accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAttachmentsPost(docId, accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     * @param docId The document ID for which to retrieve audit history.
     * @param [startDate] Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. 
     * @param [endDate] Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
     * @param [formatResult] To request a CSV file of your audit history, use csv. 
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [events] Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAudittrailGetWithHttpInfo(docId: string, startDate?: string, endDate?: string, formatResult?: string, limit?: string, offset?: string, events?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAudittrailGetWithHttpInfo(docId, startDate, endDate, formatResult, limit, offset, events, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     * @param docId The document ID for which to retrieve audit history.
     * @param [startDate] Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date. 
     * @param [endDate] Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
     * @param [formatResult] To request a CSV file of your audit history, use csv. 
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [events] Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdAudittrailGet(docId: string, startDate?: string, endDate?: string, formatResult?: string, limit?: string, offset?: string, events?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdAudittrailGet(docId, startDate, endDate, formatResult, limit, offset, events, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdDeleteWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdDeleteWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdDelete(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdDelete(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Events
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdEventsGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdEventsGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Events
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdEventsGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdEventsGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document File
     * @param docId The document id field value.
     * @param [lockDocument] Set to true to Check Out this document before retrieval. If omitted, defaults to false.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdFileGetWithHttpInfo(docId: string, lockDocument?: boolean, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdFileGetWithHttpInfo(docId, lockDocument, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document File
     * @param docId The document id field value.
     * @param [lockDocument] Set to true to Check Out this document before retrieval. If omitted, defaults to false.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdFileGet(docId: string, lockDocument?: boolean, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdFileGet(docId, lockDocument, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Document Lock
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdLockDeleteWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdLockDeleteWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Document Lock
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdLockDelete(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdLockDelete(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Lock
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdLockGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdLockGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Lock
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdLockGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdLockGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Document Lock
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdLockPostWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdLockPostWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Document Lock
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdLockPost(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdLockPost(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Document Version Attachments
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetWithHttpInfo(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Document Version Attachments
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document Version
     * @param docId The document id field value.
     * @param [suppressRendition] Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdPostWithHttpInfo(docId: string, suppressRendition?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdPostWithHttpInfo(docId, suppressRendition, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document Version
     * @param docId The document id field value.
     * @param [suppressRendition] Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdPost(docId: string, suppressRendition?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdPost(docId, suppressRendition, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Single Document
     * @param docId The document id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdPutWithHttpInfo(docId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdPutWithHttpInfo(docId, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Single Document
     * @param docId The document id field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdPut(docId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdPut(docId, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Renditions
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Renditions
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Rendition
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeDeleteWithHttpInfo(docId: string, renditionType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypeDeleteWithHttpInfo(docId, renditionType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Rendition
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId: string, renditionType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId, renditionType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Rendition File
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [steadyState] Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeGetWithHttpInfo(docId: string, renditionType: string, steadyState?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypeGetWithHttpInfo(docId, renditionType, steadyState, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Rendition File
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [steadyState] Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypeGet(docId: string, renditionType: string, steadyState?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypeGet(docId, renditionType, steadyState, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Single Document Rendition
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePostWithHttpInfo(docId: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypePostWithHttpInfo(docId, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Single Document Rendition
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePost(docId: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypePost(docId, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Document Rendition
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePutWithHttpInfo(docId: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypePutWithHttpInfo(docId, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Document Rendition
     * @param docId The document id field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRenditionsRenditionTypePut(docId: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRenditionsRenditionTypePut(docId, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param docId The id value of the document from which to remove roles.
     * @param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * @param id The id value of the user or group to remove from the role.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(docId: string, roleNameAndUserOrGroup: string, id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteWithHttpInfo(docId, roleNameAndUserOrGroup, id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users & Groups from Roles on a Single Document
     * @param docId The id value of the document from which to remove roles.
     * @param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * @param id The id value of the user or group to remove from the role.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId: string, roleNameAndUserOrGroup: string, id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId, roleNameAndUserOrGroup, id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Attachments
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetWithHttpInfo(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Attachments
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Versions
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsGetWithHttpInfo(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsGetWithHttpInfo(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Versions
     * @param docId The document id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsGet(docId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsGet(docId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Read Annotations by ID
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param annotationId The annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, annotationId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetWithHttpInfo(docId, majorVersion, minorVersion, annotationId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Read Annotations by ID
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param annotationId The annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId: string, majorVersion: string, minorVersion: string, annotationId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId, majorVersion, minorVersion, annotationId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Read Replies of Parent Annotation
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param annotationId The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, annotationId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetWithHttpInfo(docId, majorVersion, minorVersion, annotationId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Read Replies of Parent Annotation
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param annotationId The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId: string, majorVersion: string, minorVersion: string, annotationId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId, majorVersion, minorVersion, annotationId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Document Version Annotations to PDF
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Document Version Annotations to PDF
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Document Version Annotations from PDF
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Document Version Annotations from PDF
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Read Annotations by Document Version and Type
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [limit] Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored.
     * @param [offset] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201.
     * @param [annotationTypes] The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; 
     * @param [paginationId] A unique identifier used to load requests with paginated results.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, limit?: string, offset?: string, annotationTypes?: string, paginationId?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetWithHttpInfo(docId, majorVersion, minorVersion, limit, offset, annotationTypes, paginationId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Read Annotations by Document Version and Type
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [limit] Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored.
     * @param [offset] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201.
     * @param [annotationTypes] The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; 
     * @param [paginationId] A unique identifier used to load requests with paginated results.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId: string, majorVersion: string, minorVersion: string, limit?: string, offset?: string, annotationTypes?: string, paginationId?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId, majorVersion, minorVersion, limit, offset, annotationTypes, paginationId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version Attachment Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param attachmentId The id field value of the attachment.
     * @param attachmentVersion The version of the attachment.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version Attachment Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param attachmentId The id field value of the attachment.
     * @param attachmentVersion The version of the attachment.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId: string, majorVersion: string, minorVersion: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Attachment Versions
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param attachmentId The id of the document attachment to retrieve.
     * @param attachmentVersion Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Attachment Versions
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param attachmentId The id of the document attachment to retrieve.
     * @param attachmentVersion Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId: string, majorVersion: string, minorVersion: string, attachmentId: string, attachmentVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId, majorVersion, minorVersion, attachmentId, attachmentVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Notes as CSV
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Notes as CSV
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Document Event
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Document Event
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Video Annotations
     * @param docId The video document id field value.
     * @param majorVersion The video document major_version_number__v field value.
     * @param minorVersion The video document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept] This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Video Annotations
     * @param docId The video document id field value.
     * @param majorVersion The video document major_version_number__v field value.
     * @param minorVersion The video document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept] This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version File
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetWithHttpInfo(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version File
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Document Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutWithHttpInfo(docId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Document Version
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId: string, majorVersion: string, minorVersion: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId, majorVersion, minorVersion, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Relationships
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Relationships
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document Relationship
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document Relationship
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId, majorVersion, minorVersion, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Relationship
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param relationshipId The relationship id field value. See Retrieve Document Relationships.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteWithHttpInfo(docId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Document Relationship
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param relationshipId The relationship id field value. See Retrieve Document Relationships.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Relationship
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param relationshipId The relationship id field value. See Retrieve Document Relationships.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetWithHttpInfo(docId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Relationship
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param relationshipId The relationship id field value. See Retrieve Document Relationships.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId: string, majorVersion: string, minorVersion: string, relationshipId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId, majorVersion, minorVersion, relationshipId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Renditions
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetWithHttpInfo(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Version Renditions
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Document Version Rendition
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteWithHttpInfo(docId, majorVersion, minorVersion, renditionType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Document Version Rendition
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId, majorVersion, minorVersion, renditionType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version Rendition File
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetWithHttpInfo(docId, majorVersion, minorVersion, renditionType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version Rendition File
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId, majorVersion, minorVersion, renditionType, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upload Document Version Rendition
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostWithHttpInfo(docId, majorVersion, minorVersion, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upload Document Version Rendition
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId, majorVersion, minorVersion, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Document Version Rendition
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutWithHttpInfo(docId, majorVersion, minorVersion, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Replace Document Version Rendition
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param renditionType The document rendition type.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId: string, majorVersion: string, minorVersion: string, renditionType: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId, majorVersion, minorVersion, renditionType, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version Thumbnail File
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetWithHttpInfo(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetWithHttpInfo(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Version Thumbnail File
     * @param docId The document id field value.
     * @param majorVersion The document major_version_number__v field value.
     * @param minorVersion The document minor_version_number__v field value.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId: string, majorVersion: string, minorVersion: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId, majorVersion, minorVersion, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Documents
     * @param [namedFilter] Retrieves only documents which you have created.
     * @param [scope] Searches only within the document content.
     * @param [versionscope] Retrieves all document versions, rather than only the latest version.
     * @param [search] Search for documents based on a {keyword} in searchable document fields.
     * @param [limit] See VQL documentation for more information.
     * @param [sort] See VQL documentation for more information.
     * @param [start] See VQL documentation for more information.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsGetWithHttpInfo(namedFilter?: string, scope?: string, versionscope?: string, search?: string, limit?: string, sort?: string, start?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsGetWithHttpInfo(namedFilter, scope, versionscope, search, limit, sort, start, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Documents
     * @param [namedFilter] Retrieves only documents which you have created.
     * @param [scope] Searches only within the document content.
     * @param [versionscope] Retrieves all document versions, rather than only the latest version.
     * @param [search] Search for documents based on a {keyword} in searchable document fields.
     * @param [limit] See VQL documentation for more information.
     * @param [sort] See VQL documentation for more information.
     * @param [start] See VQL documentation for more information.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsGet(namedFilter?: string, scope?: string, versionscope?: string, search?: string, limit?: string, sort?: string, start?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsGet(namedFilter, scope, versionscope, search, limit, sort, start, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Roles
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdRolesGetWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdRolesGetWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Document Roles
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdRolesGet(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdRolesGet(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdRolesPostWithHttpInfo(id: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdRolesPostWithHttpInfo(id, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on a Single Document
     * @param id
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdRolesPost(id: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdRolesPost(id, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Role
     * @param id The document &#x60;id&#x60;.
     * @param roleName The name of the role to retrieve. For example, &#x60;owner__v&#x60;.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdRolesRoleNameGetWithHttpInfo(id: string, roleName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdRolesRoleNameGetWithHttpInfo(id, roleName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Role
     * @param id The document &#x60;id&#x60;.
     * @param roleName The name of the role to retrieve. For example, &#x60;owner__v&#x60;.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdRolesRoleNameGet(id: string, roleName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdRolesRoleNameGet(id, roleName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document User Actions
     * @param id The document id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the document.
     * @param minorVersion The minor version number of the document.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(id: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetWithHttpInfo(id, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document User Actions
     * @param id The document id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the document.
     * @param minorVersion The minor version number of the document.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id: string, majorVersion: string, minorVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id, majorVersion, minorVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Entry Criteria
     * @param id The document id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the document.
     * @param minorVersion The minor version number of the document.
     * @param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetWithHttpInfo(id, majorVersion, minorVersion, nameV, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Entry Criteria
     * @param id The document id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the document.
     * @param minorVersion The minor version number of the document.
     * @param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id, majorVersion, minorVersion, nameV, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Document User Action
     * @param id The document id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the document.
     * @param minorVersion The minor version number of the document.
     * @param nameV The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutWithHttpInfo(id, majorVersion, minorVersion, nameV, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Document User Action
     * @param id The document id field value from which to retrieve available user actions.
     * @param majorVersion The major version number of the document.
     * @param minorVersion The minor version number of the document.
     * @param nameV The action name__v field value to initiate. This is retrieved from the Retrieve User Action request.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id: string, majorVersion: string, minorVersion: string, nameV: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id, majorVersion, minorVersion, nameV, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Documents
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsLifecycleActionsPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsLifecycleActionsPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Actions on Multiple Documents
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsLifecycleActionsPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsLifecycleActionsPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Bulk Document User Actions
     * @param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsLifecycleActionsUserActionNamePutWithHttpInfo(userActionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsLifecycleActionsUserActionNamePutWithHttpInfo(userActionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Bulk Document User Actions
     * @param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsLifecycleActionsUserActionNamePut(userActionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsLifecycleActionsUserActionNamePut(userActionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsPostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsPostWithHttpInfo(authorization, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIMigrationMode] When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsPost(authorization?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsPost(authorization, accept, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Relationships
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRelationshipsBatchDeleteWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRelationshipsBatchDeleteWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Relationships
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRelationshipsBatchDelete(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRelationshipsBatchDelete(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Document Relationships
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRelationshipsBatchPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRelationshipsBatchPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Document Relationships
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRelationshipsBatchPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRelationshipsBatchPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Renditions
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRenditionsBatchDeleteWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRenditionsBatchDeleteWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Renditions
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRenditionsBatchDelete(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRenditionsBatchDelete(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Multiple Document Renditions
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [largeSizeAsset] If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRenditionsBatchPostWithHttpInfo(idParam?: string, largeSizeAsset?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRenditionsBatchPostWithHttpInfo(idParam, largeSizeAsset, authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add Multiple Document Renditions
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [largeSizeAsset] If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRenditionsBatchPost(idParam?: string, largeSizeAsset?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRenditionsBatchPost(idParam, largeSizeAsset, authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRolesBatchDeleteWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRolesBatchDeleteWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents & Binders
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRolesBatchDelete(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRolesBatchDelete(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRolesBatchPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRolesBatchPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Multiple Documents & Binders
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsRolesBatchPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsRolesBatchPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Template Collection
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Template Collection
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document Template
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single Document Template
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Document Templates
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesPutWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesPutWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Document Templates
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesPut(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesPut(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Basic Document Template
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNameDeleteWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNameDeleteWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Basic Document Template
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNameDelete(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNameDelete(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Template File
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNameFileGetWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNameFileGetWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Document Template File
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNameFileGet(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNameFileGet(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Template Attributes
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNameGetWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNameGetWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Document Template Attributes
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNameGet(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNameGet(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Single Document Template
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNamePutWithHttpInfo(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNamePutWithHttpInfo(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Single Document Template
     * @param templateName The document template name__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTemplatesTemplateNamePut(templateName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTemplatesTemplateNamePut(templateName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Document Tokens
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTokensPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTokensPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Document Tokens
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsTokensPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsTokensPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Document Versions
     * @param [source] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true.
     * @param [renditions] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsVersionsBatchActionsFileextractPostWithHttpInfo(source?: boolean, renditions?: boolean, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsVersionsBatchActionsFileextractPostWithHttpInfo(source, renditions, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Document Versions
     * @param [source] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true.
     * @param [renditions] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsVersionsBatchActionsFileextractPost(source?: boolean, renditions?: boolean, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsVersionsBatchActionsFileextractPost(source, renditions, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Versions
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsVersionsBatchDeleteWithHttpInfo(idParam?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsVersionsBatchDeleteWithHttpInfo(idParam, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Document Versions
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsVersionsBatchDelete(idParam?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsVersionsBatchDelete(idParam, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Document Versions
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsVersionsBatchPostWithHttpInfo(idParam?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsVersionsBatchPostWithHttpInfo(idParam, authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Document Versions
     * @param [idParam] If you’re identifying documents in your input by their external ID
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIMigrationMode] Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDocumentsVersionsBatchPost(idParam?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIMigrationMode?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDocumentsVersionsBatchPost(idParam, authorization, accept, contentType, xVaultAPIMigrationMode, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Domain Information
     * @param [includeApplication] To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDomainGetWithHttpInfo(includeApplication?: boolean, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDomainGetWithHttpInfo(includeApplication, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Domain Information
     * @param [includeApplication] To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDomainGet(includeApplication?: boolean, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDomainGet(includeApplication, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Domains
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDomainsGetWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDomainsGetWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Domains
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsDomainsGet(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsDomainsGet(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add EDL Matched Documents
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsEdlMatchedDocumentsBatchActionsAddPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsEdlMatchedDocumentsBatchActionsAddPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add EDL Matched Documents
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsEdlMatchedDocumentsBatchActionsAddPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsEdlMatchedDocumentsBatchActionsAddPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove EDL Matched Documents
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsEdlMatchedDocumentsBatchActionsRemovePostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsEdlMatchedDocumentsBatchActionsRemovePostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove EDL Matched Documents
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsEdlMatchedDocumentsBatchActionsRemovePost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsEdlMatchedDocumentsBatchActionsRemovePost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Auto Managed Groups
     * @param [limit] Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsAutoGetWithHttpInfo(limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsAutoGetWithHttpInfo(limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Auto Managed Groups
     * @param [limit] Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsAutoGet(limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsAutoGet(limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Groups
     * @param [includeImplied] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGetWithHttpInfo(includeImplied?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGetWithHttpInfo(includeImplied, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Groups
     * @param [includeImplied] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGet(includeImplied?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGet(includeImplied, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Group
     * @param groupId The group id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGroupIdDeleteWithHttpInfo(groupId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGroupIdDeleteWithHttpInfo(groupId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Group
     * @param groupId The group id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGroupIdDelete(groupId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGroupIdDelete(groupId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Group
     * @param groupId The group id field value.
     * @param [includeImplied] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGroupIdGetWithHttpInfo(groupId: string, includeImplied?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGroupIdGetWithHttpInfo(groupId, includeImplied, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Group
     * @param groupId The group id field value.
     * @param [includeImplied] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGroupIdGet(groupId: string, includeImplied?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGroupIdGet(groupId, includeImplied, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Group
     * @param groupId The group id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGroupIdPutWithHttpInfo(groupId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGroupIdPutWithHttpInfo(groupId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Group
     * @param groupId The group id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsGroupIdPut(groupId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsGroupIdPut(groupId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Group 
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Group 
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsGroupsPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsGroupsPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Application License Usage
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsLicensesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsLicensesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Application License Usage
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsLicensesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsLicensesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Multi-Record Workflows
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsActionsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsActionsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Multi-Record Workflows
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsActionsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsActionsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Multi-Record Workflow Details
     * @param workflowName
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsActionsWorkflowNameGetWithHttpInfo(workflowName: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsActionsWorkflowNameGetWithHttpInfo(workflowName, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Multi-Record Workflow Details
     * @param workflowName
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsActionsWorkflowNameGet(workflowName: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsActionsWorkflowNameGet(workflowName, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Multi-Record Workflow
     * @param workflowName
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsActionsWorkflowNamePostWithHttpInfo(workflowName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsActionsWorkflowNamePostWithHttpInfo(workflowName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Multi-Record Workflow
     * @param workflowName
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsActionsWorkflowNamePost(workflowName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsActionsWorkflowNamePost(workflowName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflows
     * @param [objectV] To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used. 
     * @param [recordIdV] To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used. 
     * @param [participant] To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used. 
     * @param [statusV] To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v
     * @param [offset] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201. 
     * @param [pageSize] This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000. 
     * @param [loc] When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsGetWithHttpInfo(objectV?: string, recordIdV?: string, participant?: string, statusV?: string, offset?: string, pageSize?: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsGetWithHttpInfo(objectV, recordIdV, participant, statusV, offset, pageSize, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflows
     * @param [objectV] To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used. 
     * @param [recordIdV] To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used. 
     * @param [participant] To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used. 
     * @param [statusV] To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v
     * @param [offset] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201. 
     * @param [pageSize] This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000. 
     * @param [loc] When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsGet(objectV?: string, recordIdV?: string, participant?: string, statusV?: string, offset?: string, pageSize?: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsGet(objectV, recordIdV, participant, statusV, offset, pageSize, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Tasks
     * @param [objectV] To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * @param [recordIdV] To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * @param [assigneeV] To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used. 
     * @param [statusV] To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v. 
     * @param [offset] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201. 
     * @param [pageSize] This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000. 
     * @param [loc] When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksGetWithHttpInfo(objectV?: string, recordIdV?: string, assigneeV?: string, statusV?: string, offset?: string, pageSize?: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksGetWithHttpInfo(objectV, recordIdV, assigneeV, statusV, offset, pageSize, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Tasks
     * @param [objectV] To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * @param [recordIdV] To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * @param [assigneeV] To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used. 
     * @param [statusV] To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v. 
     * @param [offset] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201. 
     * @param [pageSize] This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000. 
     * @param [loc] When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksGet(objectV?: string, recordIdV?: string, assigneeV?: string, statusV?: string, offset?: string, pageSize?: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksGet(objectV, recordIdV, assigneeV, statusV, offset, pageSize, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Accept Single Record Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsAcceptPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsAcceptPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Accept Single Record Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsCancelPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsCancelPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cancel Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Complete Single Record Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsCompletePostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsCompletePostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Complete Single Record Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Task Actions
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsGetWithHttpInfo(taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsGetWithHttpInfo(taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Task Actions
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsGet(taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsGet(taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Accept Multi-item Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Accept Multi-item Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Complete Multi-item Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Complete Multi-item Workflow Task
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Manage Multi-Item Workflow Content
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Manage Multi-Item Workflow Content
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reassign Multi-item Workflow Task
     * @param taskId The id of the task to reassign.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reassign Multi-item Workflow Task
     * @param taskId The id of the task to reassign.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reassign Single Record Workflow Task
     * @param taskId The id of the task to reassign.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsReassignPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsReassignPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reassign Single Record Workflow Task
     * @param taskId The id of the task to reassign.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Task Action Details
     * @param taskId The task id field value.
     * @param taskAction The name of the task action retrieved from Retrieve Workflow Task Actions.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsTaskActionGetWithHttpInfo(taskId: string, taskAction: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsTaskActionGetWithHttpInfo(taskId, taskAction, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Task Action Details
     * @param taskId The task id field value.
     * @param taskAction The name of the task action retrieved from Retrieve Workflow Task Actions.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId: string, taskAction: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId, taskAction, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Undo Workflow Task Acceptance
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Undo Workflow Task Acceptance
     * @param taskId The task id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Workflow Task Due Date
     * @param taskId The id of the task.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostWithHttpInfo(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostWithHttpInfo(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Workflow Task Due Date
     * @param taskId The id of the task.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Task Details
     * @param taskId The task id field value.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdGetWithHttpInfo(taskId: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdGetWithHttpInfo(taskId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Task Details
     * @param taskId The task id field value.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsTasksTaskIdGet(taskId: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsTasksTaskIdGet(taskId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Actions
     * @param workflowId The workflow id field value.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdActionsGetWithHttpInfo(workflowId: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdActionsGetWithHttpInfo(workflowId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Actions
     * @param workflowId The workflow id field value.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdActionsGet(workflowId: string, loc?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdActionsGet(workflowId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Action Details
     * @param workflowId The workflow id field value.
     * @param workflowAction The workflow action name retrieved from Retrieve Workflow Actions.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetWithHttpInfo(workflowId: string, workflowAction: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetWithHttpInfo(workflowId, workflowAction, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Action Details
     * @param workflowId The workflow id field value.
     * @param workflowAction The workflow action name retrieved from Retrieve Workflow Actions.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId: string, workflowAction: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId, workflowAction, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Workflow Action
     * @param workflowId The workflow id field value.
     * @param workflowAction The workflow action name retrieved from Retrieve Workflow Actions.
     * @param [documentsSys] Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostWithHttpInfo(workflowId: string, workflowAction: string, documentsSys?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostWithHttpInfo(workflowId, workflowAction, documentsSys, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Workflow Action
     * @param workflowId The workflow id field value.
     * @param workflowAction The workflow action name retrieved from Retrieve Workflow Actions.
     * @param [documentsSys] Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId: string, workflowAction: string, documentsSys?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId, workflowAction, documentsSys, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Details
     * @param workflowId The workflow id field value.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdGetWithHttpInfo(workflowId: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdGetWithHttpInfo(workflowId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Workflow Details
     * @param workflowId The workflow id field value.
     * @param [loc] When localized (translated) strings are available, retrieve them by including loc&#x3D;true.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsObjectworkflowsWorkflowIdGet(workflowId: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsObjectworkflowsWorkflowIdGet(workflowId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Picklists
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Picklists
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Picklist Values
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNameGetWithHttpInfo(picklistName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNameGetWithHttpInfo(picklistName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Picklist Values
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNameGet(picklistName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNameGet(picklistName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Inactivate Picklist Value
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePicklistValueNameDeleteWithHttpInfo(picklistName: string, picklistValueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePicklistValueNameDeleteWithHttpInfo(picklistName, picklistValueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Inactivate Picklist Value
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName: string, picklistValueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName, picklistValueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Picklist Value
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePicklistValueNamePutWithHttpInfo(picklistName: string, picklistValueName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePicklistValueNamePutWithHttpInfo(picklistName, picklistValueName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Picklist Value
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePicklistValueNamePut(picklistName: string, picklistValueName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePicklistValueNamePut(picklistName, picklistValueName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Picklist Values
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePostWithHttpInfo(picklistName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePostWithHttpInfo(picklistName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Picklist Values
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePost(picklistName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePost(picklistName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Picklist Value Label
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePutWithHttpInfo(picklistName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePutWithHttpInfo(picklistName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Picklist Value Label
     * @param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.)
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsPicklistsPicklistNamePut(picklistName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsPicklistsPicklistNamePut(picklistName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Build Production Vault
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxActionsBuildproductionPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxActionsBuildproductionPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Build Production Vault
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxActionsBuildproductionPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxActionsBuildproductionPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Promote to Production
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxActionsPromoteproductionPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxActionsPromoteproductionPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Promote to Production
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxActionsPromoteproductionPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxActionsPromoteproductionPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Recheck Sandbox Usage Limit
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxActionsRecheckusagePostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxActionsRecheckusagePostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Recheck Sandbox Usage Limit
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxActionsRecheckusagePost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxActionsRecheckusagePost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Change Sandbox Size
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxBatchChangesizePostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxBatchChangesizePostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Change Sandbox Size
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxBatchChangesizePost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxBatchChangesizePost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Set Sandbox Entitlements
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxEntitlementsSetPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxEntitlementsSetPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Set Sandbox Entitlements
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxEntitlementsSetPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxEntitlementsSetPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Sandboxes
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Sandboxes
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Sandbox
     * @param name The name of the sandbox vault to delete. This is the name which appears on the My Vaults page.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxNameDeleteWithHttpInfo(name: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxNameDeleteWithHttpInfo(name, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Sandbox
     * @param name The name of the sandbox vault to delete. This is the name which appears on the My Vaults page.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxNameDelete(name: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxNameDelete(name, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create or Refresh Sandbox
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create or Refresh Sandbox
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Sandbox Snapshot
     * @param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotApiNameActionsUpdatePostWithHttpInfo(apiName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotApiNameActionsUpdatePostWithHttpInfo(apiName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Sandbox Snapshot
     * @param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotApiNameActionsUpdatePost(apiName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotApiNameActionsUpdatePost(apiName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upgrade Sandbox Snapshot
     * @param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotApiNameActionsUpgradePostWithHttpInfo(apiName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotApiNameActionsUpgradePostWithHttpInfo(apiName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upgrade Sandbox Snapshot
     * @param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotApiNameActionsUpgradePost(apiName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotApiNameActionsUpgradePost(apiName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Sandbox Snapshot
     * @param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotApiNameDeleteWithHttpInfo(apiName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotApiNameDeleteWithHttpInfo(apiName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Sandbox Snapshot
     * @param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotApiNameDelete(apiName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotApiNameDelete(apiName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Sandbox Snapshots
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Sandbox Snapshots
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Sandbox Snapshot
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Sandbox Snapshot
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxSnapshotPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxSnapshotPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Refresh Sandbox from Snapshot
     * @param vaultId The Vault ID of the sandbox to be refreshed.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxVaultIdActionsRefreshPostWithHttpInfo(vaultId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxVaultIdActionsRefreshPostWithHttpInfo(vaultId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Refresh Sandbox from Snapshot
     * @param vaultId The Vault ID of the sandbox to be refreshed.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxVaultIdActionsRefreshPost(vaultId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxVaultIdActionsRefreshPost(vaultId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Sandbox Details by ID
     * @param vaultId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxVaultIdGetWithHttpInfo(vaultId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxVaultIdGetWithHttpInfo(vaultId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Sandbox Details by ID
     * @param vaultId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSandboxVaultIdGet(vaultId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSandboxVaultIdGet(vaultId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Security Policies
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSecuritypoliciesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSecuritypoliciesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Security Policies
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSecuritypoliciesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSecuritypoliciesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Security Policy
     * @param securityPolicyName Security policy name__v field value (retrieved from previous request). This is typically a numeric value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSecuritypoliciesSecurityPolicyNameGetWithHttpInfo(securityPolicyName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSecuritypoliciesSecurityPolicyNameGetWithHttpInfo(securityPolicyName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Security Policy
     * @param securityPolicyName Security policy name__v field value (retrieved from previous request). This is typically a numeric value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Users
     * @param [vaults] Retrieve all users assigned to all Vaults in your domain.
     * @param [excludeVaultMembership] Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
     * @param [excludeAppLicensing] Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersGetWithHttpInfo(vaults?: string, excludeVaultMembership?: string, excludeAppLicensing?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersGetWithHttpInfo(vaults, excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Users
     * @param [vaults] Retrieve all users assigned to all Vaults in your domain.
     * @param [excludeVaultMembership] Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
     * @param [excludeAppLicensing] Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersGet(vaults?: string, excludeVaultMembership?: string, excludeAppLicensing?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersGet(vaults, excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User
     * @param id The user id field value. Use the value me to get information for the currently authenticated user.
     * @param [excludeVaultMembership] Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
     * @param [excludeAppLicensing] Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersIdGetWithHttpInfo(id: string, excludeVaultMembership?: string, excludeAppLicensing?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersIdGetWithHttpInfo(id, excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User
     * @param id The user id field value. Use the value me to get information for the currently authenticated user.
     * @param [excludeVaultMembership] Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
     * @param [excludeAppLicensing] Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersIdGet(id: string, excludeVaultMembership?: string, excludeAppLicensing?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersIdGet(id, excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Permissions
     * @param id The ID of the user. Use the value me to retrieve information for the currently authenticated user.
     * @param [filter] Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersIdPermissionsGetWithHttpInfo(id: string, filter?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersIdPermissionsGetWithHttpInfo(id, filter, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve User Permissions
     * @param id The ID of the user. Use the value me to retrieve information for the currently authenticated user.
     * @param [filter] Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersIdPermissionsGet(id: string, filter?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersIdPermissionsGet(id, filter, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Single User
     * @param id The user id field value. Use the value me to get information for the currently authenticated user.
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersIdPutWithHttpInfo(id: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersIdPutWithHttpInfo(id, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Single User
     * @param id The user id field value. Use the value me to get information for the currently authenticated user.
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersIdPut(id: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersIdPut(id, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Validate Session User
     * @param [excludeVaultMembership] Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
     * @param [excludeAppLicensing] Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMeGetWithHttpInfo(excludeVaultMembership?: string, excludeAppLicensing?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMeGetWithHttpInfo(excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Validate Session User
     * @param [excludeVaultMembership] Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
     * @param [excludeAppLicensing] Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMeGet(excludeVaultMembership?: string, excludeAppLicensing?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMeGet(excludeVaultMembership, excludeAppLicensing, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Change My Password
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMePasswordPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMePasswordPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Change My Password
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMePasswordPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMePasswordPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve My User Permissions
     * @param [filter] Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMePermissionsGetWithHttpInfo(filter?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMePermissionsGetWithHttpInfo(filter, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve My User Permissions
     * @param [filter] Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMePermissionsGet(filter?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMePermissionsGet(filter, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update My User
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMePutWithHttpInfo(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMePutWithHttpInfo(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update My User
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersMePut(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersMePut(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single User
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Single User
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Users
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersPutWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersPutWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Users
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersPut(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersPut(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable User
     * @param userId The user id field value. 
     * @param [domain] When true, this disables the user account in all vaults in the domain.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersUserIdDeleteWithHttpInfo(userId: string, domain?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersUserIdDeleteWithHttpInfo(userId, domain, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable User
     * @param userId The user id field value. 
     * @param [domain] When true, this disables the user account in all vaults in the domain.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersUserIdDelete(userId: string, domain?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersUserIdDelete(userId, domain, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Vault Membership
     * @param userId The user id field value.
     * @param vaultId The system-managed id field value assigned to each vault in the domain.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersUserIdVaultMembershipVaultIdPutWithHttpInfo(userId: string, vaultId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersUserIdVaultMembershipVaultIdPutWithHttpInfo(userId, vaultId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Vault Membership
     * @param userId The user id field value.
     * @param vaultId The system-managed id field value assigned to each vault in the domain.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsUsersUserIdVaultMembershipVaultIdPut(userId: string, vaultId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsUsersUserIdVaultMembershipVaultIdPut(userId, vaultId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Vault Compare
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsVaultActionsComparePostWithHttpInfo(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsVaultActionsComparePostWithHttpInfo(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Vault Compare
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsVaultActionsComparePost(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsVaultActionsComparePost(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Vault Configuration Report
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsVaultActionsConfigreportPostWithHttpInfo(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsVaultActionsConfigreportPostWithHttpInfo(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Vault Configuration Report
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public objectsVaultActionsConfigreportPost(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.objectsVaultActionsConfigreportPost(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Component Definition Query
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryComponentsPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryComponentsPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Component Definition Query
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryComponentsPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryComponentsPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Next Page URL
     * @param nextPage
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIDescribeQuery]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryNextPagePostWithHttpInfo(nextPage: string, authorization?: string, accept?: string, xVaultAPIDescribeQuery?: boolean, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryNextPagePostWithHttpInfo(nextPage, authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Next Page URL
     * @param nextPage
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIDescribeQuery]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryNextPagePost(nextPage: string, authorization?: string, accept?: string, xVaultAPIDescribeQuery?: boolean, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryNextPagePost(nextPage, authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Submitting a Query
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIDescribeQuery]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryPostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIDescribeQuery?: boolean, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryPostWithHttpInfo(authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Submitting a Query
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIDescribeQuery]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryPost(authorization?: string, accept?: string, xVaultAPIDescribeQuery?: boolean, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryPost(authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Previous Page URL
     * @param previousPage
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIDescribeQuery]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryPreviousPagePostWithHttpInfo(previousPage: string, authorization?: string, accept?: string, xVaultAPIDescribeQuery?: boolean, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryPreviousPagePostWithHttpInfo(previousPage, authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Previous Page URL
     * @param previousPage
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIDescribeQuery]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public queryPreviousPagePost(previousPage: string, authorization?: string, accept?: string, xVaultAPIDescribeQuery?: boolean, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.queryPreviousPagePost(previousPage, authorization, accept, xVaultAPIDescribeQuery, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Current User with SCIM
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2MeGetWithHttpInfo(attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2MeGetWithHttpInfo(attributes, excludedAttributes, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Current User with SCIM
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2MeGet(attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2MeGet(attributes, excludedAttributes, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Current User with SCIM
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2MePutWithHttpInfo(attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2MePutWithHttpInfo(attributes, excludedAttributes, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Current User with SCIM
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2MePut(attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2MePut(attributes, excludedAttributes, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All SCIM Resource Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2ResourceTypesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2ResourceTypesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All SCIM Resource Types
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2ResourceTypesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2ResourceTypesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single SCIM Resource Type
     * @param type A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2ResourceTypesTypeGetWithHttpInfo(type: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2ResourceTypesTypeGetWithHttpInfo(type, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single SCIM Resource Type
     * @param type A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2ResourceTypesTypeGet(type: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2ResourceTypesTypeGet(type, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All SCIM Schema Information
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2SchemasGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2SchemasGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All SCIM Schema Information
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2SchemasGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2SchemasGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single SCIM Schema Information
     * @param id The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2SchemasIdGetWithHttpInfo(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2SchemasIdGetWithHttpInfo(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single SCIM Schema Information
     * @param id The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2SchemasIdGet(id: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2SchemasIdGet(id, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve SCIM Provider
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2ServiceProviderConfigGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2ServiceProviderConfigGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve SCIM Provider
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2ServiceProviderConfigGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2ServiceProviderConfigGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve SCIM Resources
     * @param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
     * @param [filter] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [sortBy] Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
     * @param [sortOrder] Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
     * @param [startIndex] Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2TypeGetWithHttpInfo(type: string, filter?: string, attributes?: string, excludedAttributes?: string, sortBy?: string, sortOrder?: string, startIndex?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2TypeGetWithHttpInfo(type, filter, attributes, excludedAttributes, sortBy, sortOrder, startIndex, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve SCIM Resources
     * @param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
     * @param [filter] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [sortBy] Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
     * @param [sortOrder] Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
     * @param [startIndex] Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2TypeGet(type: string, filter?: string, attributes?: string, excludedAttributes?: string, sortBy?: string, sortOrder?: string, startIndex?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2TypeGet(type, filter, attributes, excludedAttributes, sortBy, sortOrder, startIndex, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single SCIM Resource
     * @param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
     * @param id The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2TypeIdGetWithHttpInfo(type: string, id: string, attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2TypeIdGetWithHttpInfo(type, id, attributes, excludedAttributes, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single SCIM Resource
     * @param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value.
     * @param id The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2TypeIdGet(type: string, id: string, attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2TypeIdGet(type, id, attributes, excludedAttributes, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Users with SCIM
     * @param [filter] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [sortBy] Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
     * @param [sortOrder] Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending.
     * @param [count] Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
     * @param [startIndex] Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersGetWithHttpInfo(filter?: string, attributes?: string, excludedAttributes?: string, sortBy?: string, sortOrder?: string, count?: string, startIndex?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersGetWithHttpInfo(filter, attributes, excludedAttributes, sortBy, sortOrder, count, startIndex, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Users with SCIM
     * @param [filter] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [sortBy] Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage
     * @param [sortOrder] Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending.
     * @param [count] Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000.
     * @param [startIndex] Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersGet(filter?: string, attributes?: string, excludedAttributes?: string, sortBy?: string, sortOrder?: string, count?: string, startIndex?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersGet(filter, attributes, excludedAttributes, sortBy, sortOrder, count, startIndex, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single User with SCIM
     * @param id The id of the user you wish to update.
     * @param [filter] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersIdGetWithHttpInfo(id: string, filter?: string, attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersIdGetWithHttpInfo(id, filter, attributes, excludedAttributes, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single User with SCIM
     * @param id The id of the user you wish to update.
     * @param [filter] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator.
     * @param [attributes] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned.
     * @param [excludedAttributes] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersIdGet(id: string, filter?: string, attributes?: string, excludedAttributes?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersIdGet(id, filter, attributes, excludedAttributes, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update User with SCIM
     * @param id The id of the user you wish to update.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersIdPutWithHttpInfo(id: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersIdPutWithHttpInfo(id, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update User with SCIM
     * @param id The id of the user you wish to update.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersIdPut(id: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersIdPut(id, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create User with SCIM
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create User with SCIM
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public scimV2UsersPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.scimV2UsersPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Signing Certificate
     * @param certId The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesCertificateCertIdGetWithHttpInfo(certId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesCertificateCertIdGetWithHttpInfo(certId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Signing Certificate
     * @param certId The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesCertificateCertIdGet(certId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesCertificateCertIdGet(certId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable Configuration Mode
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesConfigurationModeActionsDisablePostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesConfigurationModeActionsDisablePostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable Configuration Mode
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesConfigurationModeActionsDisablePost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesConfigurationModeActionsDisablePost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Enable Configuration Mode
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesConfigurationModeActionsEnablePostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesConfigurationModeActionsEnablePostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Enable Configuration Mode
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesConfigurationModeActionsEnablePost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesConfigurationModeActionsEnablePost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Available Direct Data Files
     * @param [extractType] The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
     * @param [startTime] Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
     * @param [stopTime] Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesDirectdataFilesGetWithHttpInfo(extractType?: string, startTime?: number, stopTime?: number, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesDirectdataFilesGetWithHttpInfo(extractType, startTime, stopTime, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Available Direct Data Files
     * @param [extractType] The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
     * @param [startTime] Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
     * @param [stopTime] Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesDirectdataFilesGet(extractType?: string, startTime?: number, stopTime?: number, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesDirectdataFilesGet(extractType, startTime, stopTime, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Direct Data File
     * @param name The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesDirectdataFilesNameGetWithHttpInfo(name: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesDirectdataFilesNameGetWithHttpInfo(name, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Direct Data File
     * @param name The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesDirectdataFilesNameGet(name: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesDirectdataFilesNameGet(name, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Item Content
     * @param item The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [authorization]
     * @param [accept]
     * @param [range] Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsContentItemGetWithHttpInfo(item: string, authorization?: string, accept?: string, range?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsContentItemGetWithHttpInfo(item, authorization, accept, range, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Item Content
     * @param item The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [authorization]
     * @param [accept]
     * @param [range] Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsContentItemGet(item: string, authorization?: string, accept?: string, range?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsContentItemGet(item, authorization, accept, range, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete File or Folder
     * @param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [recursive] Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsItemDeleteWithHttpInfo(item: string, recursive?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsItemDeleteWithHttpInfo(item, recursive, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete File or Folder
     * @param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [recursive] Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsItemDelete(item: string, recursive?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsItemDelete(item, recursive, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * List Items at a Path
     * @param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [recursive] If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
     * @param [limit] Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
     * @param [formatResult] If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsItemGetWithHttpInfo(item: string, recursive?: string, limit?: string, formatResult?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsItemGetWithHttpInfo(item, recursive, limit, formatResult, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * List Items at a Path
     * @param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [recursive] If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
     * @param [limit] Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
     * @param [formatResult] If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsItemGet(item: string, recursive?: string, limit?: string, formatResult?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsItemGet(item, recursive, limit, formatResult, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Folder or File
     * @param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsItemPutWithHttpInfo(item: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsItemPutWithHttpInfo(item, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Folder or File
     * @param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsItemPut(item: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsItemPut(item, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Folder or File
     * @param [authorization]
     * @param [accept]
     * @param [contentMD5] Optional: The MD5 checksum of the file being uploaded.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsPostWithHttpInfo(authorization?: string, accept?: string, contentMD5?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsPostWithHttpInfo(authorization, accept, contentMD5, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Folder or File
     * @param [authorization]
     * @param [accept]
     * @param [contentMD5] Optional: The MD5 checksum of the file being uploaded.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingItemsPost(authorization?: string, accept?: string, contentMD5?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingItemsPost(authorization, accept, contentMD5, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * List Upload Sessions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * List Upload Sessions
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Resumable Upload Session
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadPostWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadPostWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Resumable Upload Session
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadPost(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadPost(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Abort Upload Session
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdDeleteWithHttpInfo(uploadSessionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdDeleteWithHttpInfo(uploadSessionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Abort Upload Session
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Get Upload Session Details
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdGetWithHttpInfo(uploadSessionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdGetWithHttpInfo(uploadSessionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Get Upload Session Details
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdGet(uploadSessionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdGet(uploadSessionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * List File Parts Uploaded to Session
     * @param uploadSessionId
     * @param [limit] Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdPartsGetWithHttpInfo(uploadSessionId: string, limit?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdPartsGetWithHttpInfo(uploadSessionId, limit, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * List File Parts Uploaded to Session
     * @param uploadSessionId
     * @param [limit] Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId: string, limit?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId, limit, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Commit Upload Session
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdPostWithHttpInfo(uploadSessionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdPostWithHttpInfo(uploadSessionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Commit Upload Session
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdPost(uploadSessionId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdPost(uploadSessionId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upload to a Session
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIFilePartNumber] The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
     * @param [contentMD5] Optional: The MD5 checksum of the file part being uploaded.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdPutWithHttpInfo(uploadSessionId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIFilePartNumber?: string, contentMD5?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdPutWithHttpInfo(uploadSessionId, authorization, accept, contentType, xVaultAPIFilePartNumber, contentMD5, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Upload to a Session
     * @param uploadSessionId
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIFilePartNumber] The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
     * @param [contentMD5] Optional: The MD5 checksum of the file part being uploaded.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesFileStagingUploadUploadSessionIdPut(uploadSessionId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIFilePartNumber?: string, contentMD5?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesFileStagingUploadUploadSessionIdPut(uploadSessionId, authorization, accept, contentType, xVaultAPIFilePartNumber, contentMD5, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Job Histories
     * @param [startDate] Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
     * @param [endDate] Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
     * @param [status] Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses.
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsHistoriesGetWithHttpInfo(startDate?: string, endDate?: string, status?: string, limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsHistoriesGetWithHttpInfo(startDate, endDate, status, limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Job Histories
     * @param [startDate] Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
     * @param [endDate] Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
     * @param [status] Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses.
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsHistoriesGet(startDate?: string, endDate?: string, status?: string, limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsHistoriesGet(startDate, endDate, status, limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdErrorsGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdErrorsGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     * @param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdErrorsGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdErrorsGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Job Status
     * @param jobId The ID of the job, returned from the original job request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Job Status
     * @param jobId The ID of the job, returned from the original job request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdSummaryGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdSummaryGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     * @param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdSummaryGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdSummaryGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve SDK Job Tasks
     * @param jobId The ID of the SDK job, returned from the original job request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdTasksGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdTasksGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve SDK Job Tasks
     * @param jobId The ID of the SDK job, returned from the original job request.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsJobIdTasksGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsJobIdTasksGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Job Monitors
     * @param [startDate] Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
     * @param [endDate] Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
     * @param [status] Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses.
     * @param [limit] Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsMonitorsGetWithHttpInfo(startDate?: string, endDate?: string, status?: string, limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsMonitorsGetWithHttpInfo(startDate, endDate, status, limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Job Monitors
     * @param [startDate] Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job.
     * @param [endDate] Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time.
     * @param [status] Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses.
     * @param [limit] Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsMonitorsGet(startDate?: string, endDate?: string, status?: string, limit?: string, offset?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsMonitorsGet(startDate, endDate, status, limit, offset, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Start Job
     * @param jobId The ID of the scheduled job instance to start.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsStartNowJobIdPostWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsStartNowJobIdPostWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Start Job
     * @param jobId The ID of the scheduled job instance to start.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesJobsStartNowJobIdPost(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesJobsStartNowJobIdPost(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Extract Data Files
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderExtractPostWithHttpInfo(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderExtractPostWithHttpInfo(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Extract Data Files
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderExtractPost(authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderExtractPost(authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Load Failure Log Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdFailurelogGetWithHttpInfo(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdFailurelogGetWithHttpInfo(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Load Failure Log Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Loader Extract Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdResultsGetWithHttpInfo(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdResultsGetWithHttpInfo(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Loader Extract Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdResultsGet(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdResultsGet(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Loader Extract Renditions Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdResultsRenditionsGetWithHttpInfo(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdResultsRenditionsGetWithHttpInfo(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Loader Extract Renditions Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Load Success Log Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdSuccesslogGetWithHttpInfo(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdSuccesslogGetWithHttpInfo(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Load Success Log Results
     * @param jobId The id value of the requested extract job.
     * @param taskId The id value of the requested extract task.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId: string, taskId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId, taskId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Load Data Objects
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderLoadPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderLoadPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Load Data Objects
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesLoaderLoadPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesLoaderLoadPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Validate Package
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesPackageActionsValidatePostWithHttpInfo(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesPackageActionsValidatePostWithHttpInfo(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Validate Package
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesPackageActionsValidatePost(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesPackageActionsValidatePost(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Package
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesPackagePostWithHttpInfo(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesPackagePostWithHttpInfo(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Export Package
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesPackagePost(authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesPackagePost(authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Package
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesPackagePutWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesPackagePutWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Import Package
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesPackagePut(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesPackagePut(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Queues
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesGetWithHttpInfo(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesGetWithHttpInfo(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Queues
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesGet(authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesGet(authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable Delivery
     * @param queueName The name of a specific Queue.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameActionsDisableDeliveryPutWithHttpInfo(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameActionsDisableDeliveryPutWithHttpInfo(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Disable Delivery
     * @param queueName The name of a specific Queue.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameActionsDisableDeliveryPut(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameActionsDisableDeliveryPut(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Enable Delivery
     * @param queueName The name of a specific Queue.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameActionsEnableDeliveryPutWithHttpInfo(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameActionsEnableDeliveryPutWithHttpInfo(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Enable Delivery
     * @param queueName The name of a specific Queue.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameActionsEnableDeliveryPut(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameActionsEnableDeliveryPut(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reset Queue
     * @param queueName The name of a specific Queue.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameActionsResetPutWithHttpInfo(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameActionsResetPutWithHttpInfo(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Reset Queue
     * @param queueName The name of a specific Queue.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameActionsResetPut(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameActionsResetPut(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Queue Status
     * @param queueName The name of a specific queue. For example, queue__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameGetWithHttpInfo(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameGetWithHttpInfo(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Queue Status
     * @param queueName The name of a specific queue. For example, queue__c.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesQueuesQueueNameGet(queueName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesQueuesQueueNameGet(queueName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Validate Imported Package
     * @param packageId The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesVobjectVaultPackageVPackageIdActionsValidatePostWithHttpInfo(packageId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesVobjectVaultPackageVPackageIdActionsValidatePostWithHttpInfo(packageId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Validate Imported Package
     * @param packageId The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * End Session
     * @param [accept]
     * @param [authorization] The Vault sessionId to end.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public sessionDeleteWithHttpInfo(accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.sessionDeleteWithHttpInfo(accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * End Session
     * @param [accept]
     * @param [authorization] The Vault sessionId to end.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public sessionDelete(accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.sessionDelete(accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Single Client Code Distribution
     * @param distributionName The name attribute of the client code distribution to download.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsDistributionNameCodeGetWithHttpInfo(distributionName: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsDistributionNameCodeGetWithHttpInfo(distributionName, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Single Client Code Distribution
     * @param distributionName The name attribute of the client code distribution to download.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsDistributionNameCodeGet(distributionName: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsDistributionNameCodeGet(distributionName, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Client Code Distribution
     * @param distributionName The name attribute of the client code distribution to delete.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsDistributionNameDeleteWithHttpInfo(distributionName: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsDistributionNameDeleteWithHttpInfo(distributionName, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Single Client Code Distribution
     * @param distributionName The name attribute of the client code distribution to delete.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsDistributionNameDelete(distributionName: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsDistributionNameDelete(distributionName, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param distributionName The name attribute of the client code distribution to delete.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsDistributionNameGetWithHttpInfo(distributionName: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsDistributionNameGetWithHttpInfo(distributionName, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     * @param distributionName The name attribute of the client code distribution to delete.
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsDistributionNameGet(distributionName: string, accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsDistributionNameGet(distributionName, accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsGetWithHttpInfo(accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsGetWithHttpInfo(accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     * @param [accept]
     * @param [authorization]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsGet(accept?: string, authorization?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsGet(accept, authorization, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add or Replace Single Client Code Distribution
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsPostWithHttpInfo(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsPostWithHttpInfo(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Add or Replace Single Client Code Distribution
     * @param [accept]
     * @param [authorization]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public uicodeDistributionsPost(accept?: string, authorization?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.uicodeDistributionsPost(accept, authorization, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Deploy Package
     * @param packageId The id field value of the vault_package__v object record used for deployment. See Import Package.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectVaultPackageVPackageIdActionsDeployPostWithHttpInfo(packageId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectVaultPackageVPackageIdActionsDeployPostWithHttpInfo(packageId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Deploy Package
     * @param packageId The id field value of the vault_package__v object record used for deployment. See Import Package.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectVaultPackageVPackageIdActionsDeployPost(packageId: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectVaultPackageVPackageIdActionsDeployPost(packageId, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Package Deploy Results
     * @param packageId The id field value of the vault_package__v object record used for deployment. See Deploy Package.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectVaultPackageVPackageIdActionsDeployResultsGetWithHttpInfo(packageId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectVaultPackageVPackageIdActionsDeployResultsGetWithHttpInfo(packageId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Package Deploy Results
     * @param packageId The id field value of the vault_package__v object record used for deployment. See Deploy Package.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Results of Cascade Delete Job
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param jobStatus
     * @param jobId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetWithHttpInfo(objectName: string, jobStatus: string, jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetWithHttpInfo(objectName, jobStatus, jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Results of Cascade Delete Job
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param jobStatus
     * @param jobId
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName: string, jobStatus: string, jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Results of Deep Copy Job
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param jobStatus The ID of the job, retrieved from the response of the job request.
     * @param jobId Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetWithHttpInfo(objectName: string, jobStatus: string, jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetWithHttpInfo(objectName, jobStatus, jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Results of Deep Copy Job
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param jobStatus The ID of the job, retrieved from the response of the job request.
     * @param jobId Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName: string, jobStatus: string, jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName, jobStatus, jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create a Placeholder from an EDL Item
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsEdlItemVActionsCreateplaceholderPostWithHttpInfo(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsEdlItemVActionsCreateplaceholderPostWithHttpInfo(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create a Placeholder from an EDL Item
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsEdlItemVActionsCreateplaceholderPost(authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsEdlItemVActionsCreateplaceholderPost(authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Merge Records Job Log
     * @param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsMergesJobIdLogGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsMergesJobIdLogGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Merge Records Job Log
     * @param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsMergesJobIdLogGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsMergesJobIdLogGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Record Merge Results
     * @param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsMergesJobIdResultsGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsMergesJobIdResultsGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Record Merge Results
     * @param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsMergesJobIdResultsGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsMergesJobIdResultsGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Record Merge Status
     * @param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsMergesJobIdStatusGetWithHttpInfo(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsMergesJobIdStatusGetWithHttpInfo(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Record Merge Status
     * @param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsMergesJobIdStatusGet(jobId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsMergesJobIdStatusGet(jobId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Object Action on Multiple Records
     * @param objectName The object name__v field value.
     * @param actionName Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsActionNamePostWithHttpInfo(objectName: string, actionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsActionNamePostWithHttpInfo(objectName, actionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Object Action on Multiple Records
     * @param objectName The object name__v field value.
     * @param actionName Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsActionNamePost(objectName: string, actionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsActionNamePost(objectName, actionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Change Object Type
     * @param objectName The name of the object.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsChangetypePostWithHttpInfo(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsChangetypePostWithHttpInfo(objectName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Change Object Type
     * @param objectName The name of the object.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsChangetypePost(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsChangetypePost(objectName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Record Merge
     * @param objectName The object name__v field value. For example, account__v. This object must have Enable Merges configured.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @param [vobjectsObjectNameActionsMergePostRequestInner]
     */
    public vobjectsObjectNameActionsMergePostWithHttpInfo(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, vobjectsObjectNameActionsMergePostRequestInner?: Array<VobjectsObjectNameActionsMergePostRequestInner>, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsMergePostWithHttpInfo(objectName, authorization, contentType, accept, xVaultAPIClientID, vobjectsObjectNameActionsMergePostRequestInner, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Record Merge
     * @param objectName The object name__v field value. For example, account__v. This object must have Enable Merges configured.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @param [vobjectsObjectNameActionsMergePostRequestInner]
     */
    public vobjectsObjectNameActionsMergePost(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, vobjectsObjectNameActionsMergePostRequestInner?: Array<VobjectsObjectNameActionsMergePostRequestInner>, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsMergePost(objectName, authorization, contentType, accept, xVaultAPIClientID, vobjectsObjectNameActionsMergePostRequestInner, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param objectName The name of the object for which to check the status of a Roll-up field recalculation.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsRecalculaterollupsGetWithHttpInfo(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsRecalculaterollupsGetWithHttpInfo(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     * @param objectName The name of the object for which to check the status of a Roll-up field recalculation.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsRecalculaterollupsGet(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsRecalculaterollupsGet(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Recalculate Roll-up Fields
     * @param objectName The name of the object for which to check the status of a Roll-up field recalculation.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsRecalculaterollupsPostWithHttpInfo(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsRecalculaterollupsPostWithHttpInfo(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Recalculate Roll-up Fields
     * @param objectName The name of the object for which to check the status of a Roll-up field recalculation.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsRecalculaterollupsPost(objectName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsRecalculaterollupsPost(objectName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Corporate Currency Fields
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsUpdatecorporatecurrencyPutWithHttpInfo(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsUpdatecorporatecurrencyPutWithHttpInfo(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Corporate Currency Fields
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Object Record Attachments
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [idParam]
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameAttachmentsBatchDeleteWithHttpInfo(objectName: string, idParam?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameAttachmentsBatchDeleteWithHttpInfo(objectName, idParam, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Multiple Object Record Attachments
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [idParam]
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameAttachmentsBatchDelete(objectName: string, idParam?: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameAttachmentsBatchDelete(objectName, idParam, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Object Record Attachments
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameAttachmentsBatchPostWithHttpInfo(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameAttachmentsBatchPostWithHttpInfo(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Multiple Object Record Attachments
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameAttachmentsBatchPost(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameAttachmentsBatchPost(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameAttachmentsBatchPutWithHttpInfo(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameAttachmentsBatchPutWithHttpInfo(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameAttachmentsBatchPut(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameAttachmentsBatchPut(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Object Records
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [contentType] Can be text/csv or application/json
     * @param [accept] Can be text/csv or application/json
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameDeleteWithHttpInfo(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameDeleteWithHttpInfo(objectName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Object Records
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [contentType] Can be text/csv or application/json
     * @param [accept] Can be text/csv or application/json
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameDelete(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameDelete(objectName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Roles
     * @param objectName The object name.
     * @param id The id of the document, binder, or object record.
     * @param roleName Optional: Include a role name to filter for a specific role. For example, owner__v.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameIdRolesRoleNameGetWithHttpInfo(objectName: string, id: string, roleName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameIdRolesRoleNameGetWithHttpInfo(objectName, id, roleName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Roles
     * @param objectName The object name.
     * @param id The id of the document, binder, or object record.
     * @param roleName Optional: Include a role name to filter for a specific role. For example, owner__v.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameIdRolesRoleNameGet(objectName: string, id: string, roleName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameIdRolesRoleNameGet(objectName, id, roleName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object User Actions Details
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value from which to retrieve user actions.
     * @param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNameGetWithHttpInfo(objectName: string, objectRecordId: string, actionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsActionNameGetWithHttpInfo(objectName, objectRecordId, actionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object User Actions Details
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value from which to retrieve user actions.
     * @param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName: string, objectRecordId: string, actionName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName, objectRecordId, actionName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Object Action on a Single Record
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value from which to retrieve user actions.
     * @param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNamePostWithHttpInfo(objectName: string, objectRecordId: string, actionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsActionNamePostWithHttpInfo(objectName, objectRecordId, actionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Initiate Object Action on a Single Record
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value from which to retrieve user actions.
     * @param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action.
     * @param [authorization]
     * @param [contentType]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName: string, objectRecordId: string, actionName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName, objectRecordId, actionName, authorization, contentType, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cascade Delete Object Record
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsCascadedeletePostWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsCascadedeletePostWithHttpInfo(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Cascade Delete Object Record
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Deep Copy Object Record
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsDeepcopyPostWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsDeepcopyPostWithHttpInfo(objectName, objectRecordId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Deep Copy Object Record
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName: string, objectRecordId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName, objectRecordId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record User Actions
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value.
     * @param [loc] Optional: When true, retrieves localized (translated) strings for the label. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsGetWithHttpInfo(objectName: string, objectRecordId: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsGetWithHttpInfo(objectName, objectRecordId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record User Actions
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value.
     * @param [loc] Optional: When true, retrieves localized (translated) strings for the label. 
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdActionsGet(objectName: string, objectRecordId: string, loc?: boolean, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdActionsGet(objectName, objectRecordId, loc, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Attachment Field File
     * @param objectName The object name__v field value. For example, product__v.
     * @param objectRecordId The object record id field value.
     * @param attachmentFieldName The name of the Attachment field to update.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetWithHttpInfo(objectName: string, objectRecordId: string, attachmentFieldName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetWithHttpInfo(objectName, objectRecordId, attachmentFieldName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Attachment Field File
     * @param objectName The object name__v field value. For example, product__v.
     * @param objectRecordId The object record id field value.
     * @param attachmentFieldName The name of the Attachment field to update.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName: string, objectRecordId: string, attachmentFieldName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName, objectRecordId, attachmentFieldName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Attachment Field File
     * @param objectName The object name__v field value. For example, product__v.
     * @param objectRecordId The object record id field value.
     * @param attachmentFieldName The name of the Attachment field to update.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostWithHttpInfo(objectName: string, objectRecordId: string, attachmentFieldName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostWithHttpInfo(objectName, objectRecordId, attachmentFieldName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Attachment Field File
     * @param objectName The object name__v field value. For example, product__v.
     * @param objectRecordId The object record id field value.
     * @param attachmentFieldName The name of the Attachment field to update.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName: string, objectRecordId: string, attachmentFieldName: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName, objectRecordId, attachmentFieldName, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Attachment Field Files
     * @param objectName The object name__v field value. For example, product__v.
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetWithHttpInfo(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Attachment Field Files
     * @param objectName The object name__v field value. For example, product__v.
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Object Record Attachment
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteWithHttpInfo(objectName, objectRecordId, attachmentId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Object Record Attachment
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName, objectRecordId, attachmentId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachment Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetWithHttpInfo(objectName, objectRecordId, attachmentId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachment Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName, objectRecordId, attachmentId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Object Record Attachment Description
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutWithHttpInfo(objectName, objectRecordId, attachmentId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Object Record Attachment Description
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName, objectRecordId, attachmentId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Object Record Attachment Version
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteWithHttpInfo(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Delete Object Record Attachment Version
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Object Record Attachment File
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetWithHttpInfo(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download Object Record Attachment File
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetWithHttpInfo(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName, objectRecordId, attachmentId, attachmentVersion, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Restore Object Record Attachment Version
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [restore]
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, restore?: boolean, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostWithHttpInfo(objectName, objectRecordId, attachmentId, attachmentVersion, restore, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Restore Object Record Attachment Version
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param attachmentVersion The attachment version__v field value.
     * @param [restore]
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName: string, objectRecordId: string, attachmentId: string, attachmentVersion: string, restore?: boolean, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName, objectRecordId, attachmentId, attachmentVersion, restore, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachment Versions
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetWithHttpInfo(objectName, objectRecordId, attachmentId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachment Versions
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param attachmentId The attachment id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName: string, objectRecordId: string, attachmentId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName, objectRecordId, attachmentId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Object Record Attachment Files
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsFileGetWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsFileGetWithHttpInfo(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Download All Object Record Attachment Files
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachments
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsGetWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsGetWithHttpInfo(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record Attachments
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Object Record Attachment
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsPostWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsPostWithHttpInfo(objectName, objectRecordId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create Object Record Attachment
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName: string, objectRecordId: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName, objectRecordId, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value from which to retrieve user actions.
     * @param [startDate] Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. 
     * @param [endDate] Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
     * @param [formatResult] To request a CSV file of your audit history, use csv. 
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [events] Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAudittrailGetWithHttpInfo(objectName: string, objectRecordId: string, startDate?: string, endDate?: string, formatResult?: string, limit?: string, offset?: string, events?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAudittrailGetWithHttpInfo(objectName, objectRecordId, startDate, endDate, formatResult, limit, offset, events, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     * @param objectName The object name__v field value.
     * @param objectRecordId The object record id field value from which to retrieve user actions.
     * @param [startDate] Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date. 
     * @param [endDate] Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date. 
     * @param [formatResult] To request a CSV file of your audit history, use csv. 
     * @param [limit] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @param [offset] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
     * @param [events] Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdAudittrailGet(objectName: string, objectRecordId: string, startDate?: string, endDate?: string, formatResult?: string, limit?: string, offset?: string, events?: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdAudittrailGet(objectName, objectRecordId, startDate, endDate, formatResult, limit, offset, events, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdGetWithHttpInfo(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdGetWithHttpInfo(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Object Record
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param objectRecordId The object record id field value.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameObjectRecordIdGet(objectName: string, objectRecordId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameObjectRecordIdGet(objectName, objectRecordId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create & Upsert Object Records
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [idParam] To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;.
     * @param [authorization]
     * @param [contentType] Can be text/csv or application/json
     * @param [accept] Can be text/csv or application/json
     * @param [xVaultAPIMigrationMode] If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * @param [xVaultAPINoTriggers] If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNamePostWithHttpInfo(objectName: string, idParam?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPINoTriggers?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNamePostWithHttpInfo(objectName, idParam, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Create & Upsert Object Records
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [idParam] To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;.
     * @param [authorization]
     * @param [contentType] Can be text/csv or application/json
     * @param [accept] Can be text/csv or application/json
     * @param [xVaultAPIMigrationMode] If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * @param [xVaultAPINoTriggers] If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNamePost(objectName: string, idParam?: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPINoTriggers?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNamePost(objectName, idParam, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Object Records
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [contentType] Can be text/csv or application/json
     * @param [accept] Can be text/csv or application/json
     * @param [xVaultAPIMigrationMode] If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * @param [xVaultAPINoTriggers] If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNamePutWithHttpInfo(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPINoTriggers?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNamePutWithHttpInfo(objectName, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Update Object Records
     * @param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @param [authorization]
     * @param [contentType] Can be text/csv or application/json
     * @param [accept] Can be text/csv or application/json
     * @param [xVaultAPIMigrationMode] If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * @param [xVaultAPINoTriggers] If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNamePut(objectName: string, authorization?: string, contentType?: string, accept?: string, xVaultAPIMigrationMode?: boolean, xVaultAPINoTriggers?: boolean, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNamePut(objectName, authorization, contentType, accept, xVaultAPIMigrationMode, xVaultAPINoTriggers, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users & Groups from Roles on Object Records
     * @param objectName The name of the object where you want to remove roles.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameRolesDeleteWithHttpInfo(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameRolesDeleteWithHttpInfo(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Remove Users & Groups from Roles on Object Records
     * @param objectName The name of the object where you want to remove roles.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameRolesDelete(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameRolesDelete(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Object Records
     * @param objectName The name of the object where you want to remove roles.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameRolesPostWithHttpInfo(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameRolesPostWithHttpInfo(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Assign Users & Groups to Roles on Object Records
     * @param objectName The name of the object where you want to remove roles.
     * @param [authorization]
     * @param [accept]
     * @param [contentType]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsObjectNameRolesPost(objectName: string, authorization?: string, accept?: string, contentType?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsObjectNameRolesPost(objectName, authorization, accept, contentType, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Outbound Package Dependencies
     * @param packageId The ID of the outbound_package__v record from which to retrieve dependencies.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsOutboundPackageVPackageIdDependenciesGetWithHttpInfo(packageId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<void>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsOutboundPackageVPackageIdDependenciesGetWithHttpInfo(packageId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve Outbound Package Dependencies
     * @param packageId The ID of the outbound_package__v record from which to retrieve dependencies.
     * @param [authorization]
     * @param [accept]
     * @param [xVaultAPIClientID] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     */
    public vobjectsOutboundPackageVPackageIdDependenciesGet(packageId: string, authorization?: string, accept?: string, xVaultAPIClientID?: string, _options?: PromiseConfigurationOptions): Promise<void> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.vobjectsOutboundPackageVPackageIdDependenciesGet(packageId, authorization, accept, xVaultAPIClientID, observableOptions);
        return result.toPromise();
    }


}



