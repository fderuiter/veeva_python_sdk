#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "_vobjects__object_name__actions_merge_post_request_inner.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Retrieve API Versions. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve API Versions. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Content File. *Synchronous*
 *
 * 
 * \param componentTypeAndRecordName The component type of the record followed by the name of the record from which to retrieve the content file. The format is `{Componenttype}.{record_name}`. For example, `Formattedoutput.my_formatted_output__c`. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlComponentsComponentTypeAndRecordNameFilesGetSync(char * accessToken,
	std::string componentTypeAndRecordName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Content File. *Asynchronous*
 *
 * 
 * \param componentTypeAndRecordName The component type of the record followed by the name of the record from which to retrieve the content file. The format is `{Componenttype}.{record_name}`. For example, `Formattedoutput.my_formatted_output__c`. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlComponentsComponentTypeAndRecordNameFilesGetAsync(char * accessToken,
	std::string componentTypeAndRecordName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Component Record (MDL). *Synchronous*
 *
 * 
 * \param componentTypeAndRecordName The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlComponentsComponentTypeAndRecordNameGetSync(char * accessToken,
	std::string componentTypeAndRecordName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Component Record (MDL). *Asynchronous*
 *
 * 
 * \param componentTypeAndRecordName The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlComponentsComponentTypeAndRecordNameGetAsync(char * accessToken,
	std::string componentTypeAndRecordName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Asynchronous MDL Script Results. *Synchronous*
 *
 * 
 * \param jobId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlExecuteAsyncJobIdResultsGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Asynchronous MDL Script Results. *Asynchronous*
 *
 * 
 * \param jobId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlExecuteAsyncJobIdResultsGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Execute MDL Script Asynchronously. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlExecuteAsyncPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Execute MDL Script Asynchronously. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlExecuteAsyncPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Execute MDL Script. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlExecutePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Execute MDL Script. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlExecutePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Upload Content File. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlFilesPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Upload Content File. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool apiMdlFilesPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Audit Details. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audittrailAuditTrailTypeGetSync(char * accessToken,
	std::string auditTrailType, std::string startDate, std::string endDate, std::string allDates, std::string formatResult, std::string limit, std::string offset, std::string objects, std::string events, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Audit Details. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audittrailAuditTrailTypeGetAsync(char * accessToken,
	std::string auditTrailType, std::string startDate, std::string endDate, std::string allDates, std::string formatResult, std::string limit, std::string offset, std::string objects, std::string events, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Authentication Type Discovery. *Synchronous*
 *
 * 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authDiscoveryPostSync(char * accessToken,
	std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Authentication Type Discovery. *Asynchronous*
 *
 * 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authDiscoveryPostAsync(char * accessToken,
	std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief OAuth 2.0 / OpenID Connect. *Synchronous*
 *
 * 
 * \param oathOidcProfileId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authOauthSessionOathOidcProfileIdPostSync(char * accessToken,
	std::string oathOidcProfileId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief OAuth 2.0 / OpenID Connect. *Asynchronous*
 *
 * 
 * \param oathOidcProfileId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authOauthSessionOathOidcProfileIdPostAsync(char * accessToken,
	std::string oathOidcProfileId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief User Name and Password. *Synchronous*
 *
 * 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authPostSync(char * accessToken,
	std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief User Name and Password. *Asynchronous*
 *
 * 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authPostAsync(char * accessToken,
	std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Source Code File. *Synchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameDeleteSync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Source Code File. *Asynchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameDeleteAsync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Disable Vault Extension. *Synchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameDisablePutSync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Disable Vault Extension. *Asynchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameDisablePutAsync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Enable Vault Extension. *Synchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameEnablePutSync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Enable Vault Extension. *Asynchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameEnablePutAsync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single Source Code File. *Synchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameGetSync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single Source Code File. *Asynchronous*
 *
 * 
 * \param className The fully qualified class name of your file. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeClassNameGetAsync(char * accessToken,
	std::string className, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Profiling Sessions. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Profiling Sessions. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Profiling Session. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Profiling Session. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief End Profiling Session. *Synchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameActionsEndPostSync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief End Profiling Session. *Asynchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameActionsEndPostAsync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Profiling Session. *Synchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameDeleteSync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Profiling Session. *Asynchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameDeleteAsync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Profiling Session. *Synchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameGetSync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Profiling Session. *Asynchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameGetAsync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Profiling Session Results. *Synchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameResultsGetSync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Profiling Session Results. *Asynchronous*
 *
 * 
 * \param sessionName The name of the session, for example,  baseline__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codeProfilerSessionNameResultsGetAsync(char * accessToken,
	std::string sessionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add or Replace Single Source Code File. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codePutSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add or Replace Single Source Code File. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool codePutAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Specific Root Nodes. *Synchronous*
 *
 * 
 * \param edlHierarchyOrTemplate Choose to retrieve either edl_hierarchy__v or edl_template__v *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyOrTemplateActionsListnodesPostSync(char * accessToken,
	std::string edlHierarchyOrTemplate, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Specific Root Nodes. *Asynchronous*
 *
 * 
 * \param edlHierarchyOrTemplate Choose to retrieve either edl_hierarchy__v or edl_template__v *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyOrTemplateActionsListnodesPostAsync(char * accessToken,
	std::string edlHierarchyOrTemplate, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Root Nodes. *Synchronous*
 *
 * 
 * \param edlHierarchyOrTemplate  *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyOrTemplateGetSync(char * accessToken,
	std::string edlHierarchyOrTemplate, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Root Nodes. *Asynchronous*
 *
 * 
 * \param edlHierarchyOrTemplate  *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyOrTemplateGetAsync(char * accessToken,
	std::string edlHierarchyOrTemplate, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve a Node's Children. *Synchronous*
 *
 * 
 * \param parentNodeId The ID of a parent node in the hierarchy. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyVParentNodeIdChildrenGetSync(char * accessToken,
	std::string parentNodeId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve a Node's Children. *Asynchronous*
 *
 * 
 * \param parentNodeId The ID of a parent node in the hierarchy. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyVParentNodeIdChildrenGetAsync(char * accessToken,
	std::string parentNodeId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Node Order. *Synchronous*
 *
 * 
 * \param parentNodeId The ID of a parent node in the hierarchy. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyVParentNodeIdChildrenPutSync(char * accessToken,
	std::string parentNodeId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Node Order. *Asynchronous*
 *
 * 
 * \param parentNodeId The ID of a parent node in the hierarchy. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool compositesTreesEdlHierarchyVParentNodeIdChildrenPutAsync(char * accessToken,
	std::string parentNodeId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Component Record (XML/JSON). *Synchronous*
 *
 * 
 * \param componentTypeAndRecordName The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationComponentTypeAndRecordNameGetSync(char * accessToken,
	std::string componentTypeAndRecordName, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Component Record (XML/JSON). *Asynchronous*
 *
 * 
 * \param componentTypeAndRecordName The component type name (`Picklist`, `Docfield`, `Doctype`, etc.) followed by the name of the record from which to retrieve metadata. The format is `{Componenttype}.{record_name}`. For example, `Picklist.color__c`. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationComponentTypeAndRecordNameGetAsync(char * accessToken,
	std::string componentTypeAndRecordName, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Component Record Collection. *Synchronous*
 *
 * 
 * \param componentType  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationComponentTypeGetSync(char * accessToken,
	std::string componentType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Component Record Collection. *Asynchronous*
 *
 * 
 * \param componentType  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationComponentTypeGetAsync(char * accessToken,
	std::string componentType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Details from a Specific Object. *Synchronous*
 *
 * 
 * \param objectNameAndObjectType The object name followed by the object type in the format `Objecttype.{object_name}.{object_type}`. For example, `Objecttype.product__v.base__v`. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationObjectNameAndObjectTypeGetSync(char * accessToken,
	std::string objectNameAndObjectType, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Details from a Specific Object. *Asynchronous*
 *
 * 
 * \param objectNameAndObjectType The object name followed by the object type in the format `Objecttype.{object_name}.{object_type}`. For example, `Objecttype.product__v.base__v`. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationObjectNameAndObjectTypeGetAsync(char * accessToken,
	std::string objectNameAndObjectType, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Details from All Object Types. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationObjecttypeGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Details from All Object Types. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationObjecttypeGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Lifecycle Role Assignment Override Rules. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRuleDeleteSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Lifecycle Role Assignment Override Rules. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRuleDeleteAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Lifecycle Role Assignment Rules (Default & Override). *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRuleGetSync(char * accessToken,
	std::string lifecycleV, std::string roleV, std::string productV, std::string countryV, std::string studyV, std::string studyCountryV, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Lifecycle Role Assignment Rules (Default & Override). *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRuleGetAsync(char * accessToken,
	std::string lifecycleV, std::string roleV, std::string productV, std::string countryV, std::string studyV, std::string studyCountryV, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Lifecycle Role Assignment Override Rules. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRulePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Lifecycle Role Assignment Override Rules. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRulePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Lifecycle Role Assignment Rules (Default & Override). *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRulePutSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Lifecycle Role Assignment Rules (Default & Override). *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool configurationRoleAssignmentRulePutAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Delegated Session. *Synchronous*
 *
 * 
 * \param authorization The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool delegationLoginPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Delegated Session. *Asynchronous*
 *
 * 
 * \param authorization The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid.
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool delegationLoginPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Delegations. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool delegationVaultsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Delegations. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool delegationVaultsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Session Keep Alive. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keepAlivePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Session Keep Alive. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool keepAlivePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Limits on Objects. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool limitsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Limits on Objects. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool limitsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Daily API Usage. *Synchronous*
 *
 * 
 * \param date The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
 * \param logFormat Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsApiUsageGetSync(char * accessToken,
	std::string date, std::string logFormat, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Daily API Usage. *Asynchronous*
 *
 * 
 * \param date The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past.
 * \param logFormat Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsApiUsageGetAsync(char * accessToken,
	std::string date, std::string logFormat, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Debug Logs. *Synchronous*
 *
 * 
 * \param userId Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
 * \param includeInactive Set to `true` to include debug log sessions with a status of `inactive__sys` in the response. If omitted, defaults to `false` and inactive sessions are not included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugGetSync(char * accessToken,
	std::string userId, bool includeInactive, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Debug Logs. *Asynchronous*
 *
 * 
 * \param userId Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault.
 * \param includeInactive Set to `true` to include debug log sessions with a status of `inactive__sys` in the response. If omitted, defaults to `false` and inactive sessions are not included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugGetAsync(char * accessToken,
	std::string userId, bool includeInactive, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Debug Log. *Synchronous*
 *
 * 
 * \param id The ID of the debug log to delete. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdActionsResetDeleteSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Debug Log. *Asynchronous*
 *
 * 
 * \param id The ID of the debug log to delete. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdActionsResetDeleteAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Reset Debug Log. *Synchronous*
 *
 * 
 * \param id The ID of the debug log to delete. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdActionsResetPostSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Reset Debug Log. *Asynchronous*
 *
 * 
 * \param id The ID of the debug log to delete. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdActionsResetPostAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Debug Log Files. *Synchronous*
 *
 * 
 * \param id The ID of the debug log to download. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdFilesGetSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Debug Log Files. *Asynchronous*
 *
 * 
 * \param id The ID of the debug log to download. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdFilesGetAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single Debug Log. *Synchronous*
 *
 * 
 * \param id The ID of the debug log to retrieve. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdGetSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single Debug Log. *Asynchronous*
 *
 * 
 * \param id The ID of the debug log to retrieve. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugIdGetAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Debug Log. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Debug Log. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeDebugPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download SDK Runtime Log. *Synchronous*
 *
 * 
 * \param date 
 * \param logFormat Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeRuntimeGetSync(char * accessToken,
	std::string date, std::string logFormat, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download SDK Runtime Log. *Asynchronous*
 *
 * 
 * \param date 
 * \param logFormat Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool logsCodeRuntimeGetAsync(char * accessToken,
	std::string date, std::string logFormat, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Import Bulk Translation File. *Synchronous*
 *
 * 
 * \param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool messagesMessageTypeActionsImportPostSync(char * accessToken,
	std::string messageType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Import Bulk Translation File. *Asynchronous*
 *
 * 
 * \param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool messagesMessageTypeActionsImportPostAsync(char * accessToken,
	std::string messageType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Bulk Translation File. *Synchronous*
 *
 * 
 * \param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. *Required*
 * \param lang A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool messagesMessageTypeLanguageLangActionsExportPostSync(char * accessToken,
	std::string messageType, std::string lang, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Bulk Translation File. *Asynchronous*
 *
 * 
 * \param messageType The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. *Required*
 * \param lang A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool messagesMessageTypeLanguageLangActionsExportPostAsync(char * accessToken,
	std::string messageType, std::string lang, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Audit Metadata. *Synchronous*
 *
 * 
 * \param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc). *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataAudittrailAuditTrailTypeGetSync(char * accessToken,
	std::string auditTrailType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Audit Metadata. *Asynchronous*
 *
 * 
 * \param auditTrailType The name of the specified audit type (document_audit_trail, object_audit_trail, etc). *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataAudittrailAuditTrailTypeGetAsync(char * accessToken,
	std::string auditTrailType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Audit Types. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataAudittrailGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Audit Types. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataAudittrailGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Component Type Metadata. *Synchronous*
 *
 * 
 * \param componentType The component type name (Picklist, Docfield, Doctype, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataComponentsComponentTypeGetSync(char * accessToken,
	std::string componentType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Component Type Metadata. *Asynchronous*
 *
 * 
 * \param componentType The component type name (Picklist, Docfield, Doctype, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataComponentsComponentTypeGetAsync(char * accessToken,
	std::string componentType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Component Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataComponentsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Component Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataComponentsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Template Node Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsBindersTemplatesBindernodesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Template Node Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsBindersTemplatesBindernodesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Template Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsBindersTemplatesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Template Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsBindersTemplatesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Annotation Placemark Type Metadata. *Synchronous*
 *
 * 
 * \param placemarkType The name of the placemark type. For example, sticky__sys. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetSync(char * accessToken,
	std::string placemarkType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Annotation Placemark Type Metadata. *Asynchronous*
 *
 * 
 * \param placemarkType The name of the placemark type. For example, sticky__sys. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetAsync(char * accessToken,
	std::string placemarkType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Annotation Reference Type Metadata. *Synchronous*
 *
 * 
 * \param referenceType  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetSync(char * accessToken,
	std::string referenceType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Annotation Reference Type Metadata. *Asynchronous*
 *
 * 
 * \param referenceType  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetAsync(char * accessToken,
	std::string referenceType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Annotation Type Metadata. *Synchronous*
 *
 * 
 * \param annotationType The name of the annotation type. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in Medical and PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetSync(char * accessToken,
	std::string annotationType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Annotation Type Metadata. *Asynchronous*
 *
 * 
 * \param annotationType The name of the annotation type. Valid annotation types include: `note__sys` `line__sys` `document_link__sys` `permalink_link__sys` `anchor__sys` `reply__sys` `external_link__sys`  The following annotation types are only valid in Medical and PromoMats Vaults:  `suggested_link__sys` `approved_link__sys` `auto_link__sys` `keyword_link__sys` *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetAsync(char * accessToken,
	std::string annotationType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Event SubType Metadata. *Synchronous*
 *
 * 
 * \param eventType The event type. For example, distribution__v. *Required*
 * \param eventSubtype The event subtype. For example, approved_email__v. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetSync(char * accessToken,
	std::string eventType, std::string eventSubtype, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Event SubType Metadata. *Asynchronous*
 *
 * 
 * \param eventType The event type. For example, distribution__v. *Required*
 * \param eventSubtype The event subtype. For example, approved_email__v. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetAsync(char * accessToken,
	std::string eventType, std::string eventSubtype, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Event Types and Subtypes. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsEventsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Event Types and Subtypes. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsEventsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Lock Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsLockGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Lock Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsLockGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Common Document Fields. *Synchronous*
 *
 * 
 * \param contentType 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsPropertiesFindCommonPostSync(char * accessToken,
	std::string contentType, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Common Document Fields. *Asynchronous*
 *
 * 
 * \param contentType 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsPropertiesFindCommonPostAsync(char * accessToken,
	std::string contentType, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Document Fields. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsPropertiesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Document Fields. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsPropertiesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Template Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTemplatesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Template Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTemplatesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Document Types. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Document Types. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Type. *Synchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeGetSync(char * accessToken,
	std::string type, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Type. *Asynchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeGetAsync(char * accessToken,
	std::string type, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Type Relationships. *Synchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeRelationshipsGetSync(char * accessToken,
	std::string type, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Type Relationships. *Asynchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeRelationshipsGetAsync(char * accessToken,
	std::string type, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Classification. *Synchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param subtype The document subtype. See Retrieve Document Types. *Required*
 * \param classification The document classification. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetSync(char * accessToken,
	std::string type, std::string subtype, std::string classification, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Classification. *Asynchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param subtype The document subtype. See Retrieve Document Types. *Required*
 * \param classification The document classification. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetAsync(char * accessToken,
	std::string type, std::string subtype, std::string classification, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Subtype. *Synchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param subtype The document subtype. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetSync(char * accessToken,
	std::string type, std::string subtype, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Subtype. *Asynchronous*
 *
 * 
 * \param type The document type. See Retrieve Document Types. *Required*
 * \param subtype The document subtype. See Retrieve Document Types. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetAsync(char * accessToken,
	std::string type, std::string subtype, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Group Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsGroupsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Group Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsGroupsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Security Policy Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsSecuritypoliciesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Security Policy Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsSecuritypoliciesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve User Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsUsersGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve User Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataObjectsUsersGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Archived Document Signature Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Archived Document Signature Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Signature Metadata. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Signature Metadata. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Collection. *Synchronous*
 *
 * 
 * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsGetSync(char * accessToken,
	bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Collection. *Asynchronous*
 *
 * 
 * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsGetAsync(char * accessToken,
	bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Cancel Raw Object Deployment. *Synchronous*
 *
 * 
 * \param objectName  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNameActionsCanceldeploymentPostSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Cancel Raw Object Deployment. *Asynchronous*
 *
 * 
 * \param objectName  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNameActionsCanceldeploymentPostAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Field Metadata. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectFieldName The object field name value (id, name__v, external_id__v, etc.). *Required*
 * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNameFieldsObjectFieldNameGetSync(char * accessToken,
	std::string objectName, std::string objectFieldName, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Field Metadata. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectFieldName The object field name value (id, name__v, external_id__v, etc.). *Required*
 * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNameFieldsObjectFieldNameGetAsync(char * accessToken,
	std::string objectName, std::string objectFieldName, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Metadata. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNameGetSync(char * accessToken,
	std::string objectName, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Metadata. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param loc To retrieve localized (translated) strings, include the parameter loc=true. See the next request below for details.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNameGetAsync(char * accessToken,
	std::string objectName, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Page Layouts. *Synchronous*
 *
 * 
 * \param objectName  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNamePageLayoutsGetSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Page Layouts. *Asynchronous*
 *
 * 
 * \param objectName  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNamePageLayoutsGetAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Page Layout Metadata. *Synchronous*
 *
 * 
 * \param objectName The name of the object from which to retrieve page layout metadata. *Required*
 * \param layoutName The name of the page layout from which to retrieve metadata. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNamePageLayoutsLayoutNameGetSync(char * accessToken,
	std::string objectName, std::string layoutName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Page Layout Metadata. *Asynchronous*
 *
 * 
 * \param objectName The name of the object from which to retrieve page layout metadata. *Required*
 * \param layoutName The name of the page layout from which to retrieve metadata. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metadataVobjectsObjectNamePageLayoutsLayoutNameGetAsync(char * accessToken,
	std::string objectName, std::string layoutName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Email Notification Histories. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool notificationsHistoriesGetSync(char * accessToken,
	std::string startDate, std::string endDate, bool allDates, std::string formatResult, std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Email Notification Histories. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool notificationsHistoriesGetAsync(char * accessToken,
	std::string startDate, std::string endDate, bool allDates, std::string formatResult, std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Bulk Workflow Action Details. *Synchronous*
 *
 * 
 * \param action  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsActionGetSync(char * accessToken,
	std::string action, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Bulk Workflow Action Details. *Asynchronous*
 *
 * 
 * \param action  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsActionGetAsync(char * accessToken,
	std::string action, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Workflow Actions on Multiple Workflows. *Synchronous*
 *
 * 
 * \param action  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsActionPostSync(char * accessToken,
	std::string action, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Workflow Actions on Multiple Workflows. *Asynchronous*
 *
 * 
 * \param action  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsActionPostAsync(char * accessToken,
	std::string action, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Cancel Workflow Tasks. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsCanceltasksPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Cancel Workflow Tasks. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsCanceltasksPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Cancel Workflows. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsCancelworkflowsPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Cancel Workflows. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsCancelworkflowsPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Bulk Workflow Actions. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Bulk Workflow Actions. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Reassign Workflow Tasks. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsReassigntasksPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Reassign Workflow Tasks. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsReassigntasksPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Replace Workflow Owner. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsReplaceworkflowownerPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Replace Workflow Owner. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectWorkflowActionsReplaceworkflowownerPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Export Results. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested export job. This is returned with the export binder requests above. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersActionsExportJobIdResultsGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Export Results. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested export job. This is returned with the export binder requests above. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersActionsExportJobIdResultsGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Binder (Latest Version). *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdActionsExportPostSync(char * accessToken,
	std::string binderId, bool source, std::string renditiontype, std::string docversion, std::string attachments, std::string r_export, bool docfield, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Binder (Latest Version). *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdActionsExportPostAsync(char * accessToken,
	std::string binderId, bool source, std::string renditiontype, std::string docversion, std::string attachments, std::string r_export, bool docfield, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Refresh Binder Auto-Filing. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdActionsPostSync(char * accessToken,
	std::string binderId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Refresh Binder Auto-Filing. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdActionsPostAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binding Rule. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param contentType 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdBindingRulePutSync(char * accessToken,
	std::string binderId, std::string contentType, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binding Rule. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param contentType 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdBindingRulePutAsync(char * accessToken,
	std::string binderId, std::string contentType, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Binder. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDeleteSync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Binder. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDeleteAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binder Document Binding Rule. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param nodeId The binder node id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsNodeIdBindingRulePutSync(char * accessToken,
	std::string binderId, std::string nodeId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binder Document Binding Rule. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param nodeId The binder node id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsNodeIdBindingRulePutAsync(char * accessToken,
	std::string binderId, std::string nodeId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add Document to Binder. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsPostSync(char * accessToken,
	std::string binderId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add Document to Binder. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsPostAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Remove Document from Binder. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsSectionIdDeleteSync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove Document from Binder. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsSectionIdDeleteAsync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Move Document in Binder. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsSectionIdPutSync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Move Document in Binder. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdDocumentsSectionIdPutAsync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param depth To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdGetSync(char * accessToken,
	std::string binderId, std::string depth, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param depth To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdGetAsync(char * accessToken,
	std::string binderId, std::string depth, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Binder Version. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdPostSync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Binder Version. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdPostAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binder. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdPutSync(char * accessToken,
	std::string binderId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binder. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdPutAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Remove Users & Groups from Roles on a Single Binder. *Synchronous*
 *
 * 
 * \param binderId The id value of the binder from which to remove roles. *Required*
 * \param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. *Required*
 * \param id The id value of the user or group to remove from the role. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteSync(char * accessToken,
	std::string binderId, std::string roleNameAndUserOrGroup, std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove Users & Groups from Roles on a Single Binder. *Asynchronous*
 *
 * 
 * \param binderId The id value of the binder from which to remove roles. *Required*
 * \param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. *Required*
 * \param id The id value of the user or group to remove from the role. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteAsync(char * accessToken,
	std::string binderId, std::string roleNameAndUserOrGroup, std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binder Section Binding Rule. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param nodeId The binder node id field value. *Required*
 * \param contentType 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsNodeIdBindingRulePutSync(char * accessToken,
	std::string binderId, std::string nodeId, std::string contentType, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binder Section Binding Rule. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param nodeId The binder node id field value. *Required*
 * \param contentType 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsNodeIdBindingRulePutAsync(char * accessToken,
	std::string binderId, std::string nodeId, std::string contentType, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binder Section. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param nodeId The binder node id of the section. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsNodeIdPutSync(char * accessToken,
	std::string binderId, std::string nodeId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binder Section. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param nodeId The binder node id of the section. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsNodeIdPutAsync(char * accessToken,
	std::string binderId, std::string nodeId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Binder Section. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsPostSync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Binder Section. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsPostAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Binder Section. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsSectionIdDeleteSync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Binder Section. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsSectionIdDeleteAsync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Sections. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsSectionIdGetSync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Sections. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param sectionId The binder node id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdSectionsSectionIdGetAsync(char * accessToken,
	std::string binderId, std::string sectionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Binder Versions. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsGetSync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Binder Versions. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsGetAsync(char * accessToken,
	std::string binderId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Binder (Specific Version). *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, bool source, std::string renditiontype, std::string docversion, std::string attachments, std::string r_export, bool docfield, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Binder (Specific Version). *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, bool source, std::string renditiontype, std::string docversion, std::string attachments, std::string r_export, bool docfield, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Binder Version. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Binder Version. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Version. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionGetSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Version. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionGetAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binder Version. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionPutSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binder Version. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionPutAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Binder Relationship. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Binder Relationship. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Binder Relationship. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param relationshipId The binder relationship id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Binder Relationship. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param relationshipId The binder relationship id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Relationship. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param relationshipId The binder relationship id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Relationship. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param relationshipId The binder relationship id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Version Section. *Synchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param sectionId Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetSync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string sectionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Version Section. *Asynchronous*
 *
 * 
 * \param binderId The binder id field value. *Required*
 * \param majorVersion The binder major_version_number__v field value. *Required*
 * \param minorVersion The binder minor_version_number__v field value. *Required*
 * \param sectionId Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetAsync(char * accessToken,
	std::string binderId, std::string majorVersion, std::string minorVersion, std::string sectionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Binder Roles. *Synchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdRolesGetSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Binder Roles. *Asynchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdRolesGetAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Assign Users & Groups to Roles on a Single Binder. *Synchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdRolesPostSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Assign Users & Groups to Roles on a Single Binder. *Asynchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdRolesPostAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Role. *Synchronous*
 *
 * 
 * \param id The binder `id`. *Required*
 * \param roleName The name of the role to retrieve. For example, `owner__v`. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdRolesRoleNameGetSync(char * accessToken,
	std::string id, std::string roleName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Role. *Asynchronous*
 *
 * 
 * \param id The binder `id`. *Required*
 * \param roleName The name of the role to retrieve. For example, `owner__v`. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdRolesRoleNameGetAsync(char * accessToken,
	std::string id, std::string roleName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder User Actions. *Synchronous*
 *
 * 
 * \param id The binder id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the binder. *Required*
 * \param minorVersion The minor version number of the binder. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetSync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder User Actions. *Asynchronous*
 *
 * 
 * \param id The binder id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the binder. *Required*
 * \param minorVersion The minor version number of the binder. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetAsync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Entry Criteria. *Synchronous*
 *
 * 
 * \param id The binder id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the binder. *Required*
 * \param minorVersion The minor version number of the binder. *Required*
 * \param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetSync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Entry Criteria. *Asynchronous*
 *
 * 
 * \param id The binder id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the binder. *Required*
 * \param minorVersion The minor version number of the binder. *Required*
 * \param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetAsync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Binder User Action. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutSync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Binder User Action. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutAsync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve User Actions on Multiple Binders. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersLifecycleActionsPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve User Actions on Multiple Binders. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersLifecycleActionsPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Bulk Binder User Actions. *Synchronous*
 *
 * 
 * \param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersLifecycleActionsUserActionNamePutSync(char * accessToken,
	std::string userActionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Bulk Binder User Actions. *Asynchronous*
 *
 * 
 * \param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersLifecycleActionsUserActionNamePutAsync(char * accessToken,
	std::string userActionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Binder. *Synchronous*
 *
 * 
 * \param async When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data. 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersPostSync(char * accessToken,
	bool async, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Binder. *Asynchronous*
 *
 * 
 * \param async When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async=true). This helps speed up the response time from Vault when processing large amounts of data. 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersPostAsync(char * accessToken,
	bool async, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Template Collection. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Template Collection. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Binder Template. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Binder Template. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Binder Template. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesPutSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Binder Template. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesPutAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Template Node Attributes. *Synchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameBindernodesGetSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Template Node Attributes. *Asynchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameBindernodesGetAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Binder Template Node. *Synchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameBindernodesPostSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Binder Template Node. *Asynchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameBindernodesPostAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Replace Binder Template Nodes. *Synchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameBindernodesPutSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Replace Binder Template Nodes. *Asynchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameBindernodesPutAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Binder Template. *Synchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameDeleteSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Binder Template. *Asynchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameDeleteAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Binder Template Attributes. *Synchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameGetSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Binder Template Attributes. *Asynchronous*
 *
 * 
 * \param templateName The binder template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsBindersTemplatesTemplateNameGetAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Deleted Document IDs. *Synchronous*
 *
 * 
 * \param startDate Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
 * \param endDate Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDeletionsDocumentsGetSync(char * accessToken,
	std::string startDate, std::string endDate, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Deleted Document IDs. *Asynchronous*
 *
 * 
 * \param startDate Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z
 * \param endDate Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDeletionsDocumentsGetAsync(char * accessToken,
	std::string startDate, std::string endDate, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Deleted Object Record ID. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDeletionsVobjectsObjectNameGetSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Deleted Object Record ID. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDeletionsVobjectsObjectNameGetAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Document Workflows. *Synchronous*
 *
 * 
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsGetSync(char * accessToken,
	bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Document Workflows. *Asynchronous*
 *
 * 
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsGetAsync(char * accessToken,
	bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Controlled Copy Job Results. *Synchronous*
 *
 * 
 * \param lifecycleAndStateAndAction The `name__v` values for the lifecycle, state, and action in the format `{lifecycle_name}.{state_name}.{action_name}`. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the `href` under the `artifacts` link. *Required*
 * \param jobId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetSync(char * accessToken,
	std::string lifecycleAndStateAndAction, std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Controlled Copy Job Results. *Asynchronous*
 *
 * 
 * \param lifecycleAndStateAndAction The `name__v` values for the lifecycle, state, and action in the format `{lifecycle_name}.{state_name}.{action_name}`. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the `href` under the `artifacts` link. *Required*
 * \param jobId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetAsync(char * accessToken,
	std::string lifecycleAndStateAndAction, std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Workflow Details. *Synchronous*
 *
 * 
 * \param workflowName The document workflow name value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsWorkflowNameGetSync(char * accessToken,
	std::string workflowName, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Workflow Details. *Asynchronous*
 *
 * 
 * \param workflowName The document workflow name value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by setting loc to true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsWorkflowNameGetAsync(char * accessToken,
	std::string workflowName, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Document Workflow. *Synchronous*
 *
 * 
 * \param workflowName The document workflow name value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsWorkflowNamePostSync(char * accessToken,
	std::string workflowName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Document Workflow. *Asynchronous*
 *
 * 
 * \param workflowName The document workflow name value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsActionsWorkflowNamePostAsync(char * accessToken,
	std::string workflowName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Annotations. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsBatchDeleteSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Annotations. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsBatchDeleteAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Multiple Annotations. *Synchronous*
 *
 * 
 * \param authorization  *Required*
 * \param contentType  *Required*
 * \param accept  *Required*
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsBatchPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Multiple Annotations. *Asynchronous*
 *
 * 
 * \param authorization  *Required*
 * \param contentType  *Required*
 * \param accept  *Required*
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsBatchPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Annotations. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsBatchPutSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Annotations. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsBatchPutAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add Annotation Replies. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsRepliesBatchPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add Annotation Replies. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAnnotationsRepliesBatchPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Multiple Document Attachments. *Synchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAttachmentsBatchDeleteSync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Multiple Document Attachments. *Asynchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAttachmentsBatchDeleteAsync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Multiple Document Attachments. *Synchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAttachmentsBatchPostSync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Multiple Document Attachments. *Asynchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAttachmentsBatchPostAsync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Multiple Document Attachment Descriptions. *Synchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAttachmentsBatchPutSync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Multiple Document Attachment Descriptions. *Asynchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsAttachmentsBatchPutAsync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Export Results. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested export job. This is returned with the export document requests. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsFileextractJobIdResultsGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Export Results. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested export job. This is returned with the export document requests. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsFileextractJobIdResultsGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Documents. *Synchronous*
 *
 * 
 * \param source Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
 * \param renditions Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
 * \param allversions Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false.
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsFileextractPostSync(char * accessToken,
	bool source, bool renditions, bool allversions, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Documents. *Asynchronous*
 *
 * 
 * \param source Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
 * \param renditions Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
 * \param allversions Optional: To include all versions or latest version, include a query parameter allversions=true. If omitted, defaults to false.
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsFileextractPostAsync(char * accessToken,
	bool source, bool renditions, bool allversions, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Reclassify Multiple Documents. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsReclassifyPutSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Reclassify Multiple Documents. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsReclassifyPutAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Multiple Document Renditions. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsRerenderPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Multiple Document Renditions. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchActionsRerenderPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Multiple Documents. *Synchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchDeleteSync(char * accessToken,
	std::string idParam, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Multiple Documents. *Asynchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchDeleteAsync(char * accessToken,
	std::string idParam, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Undo Collaborative Authoring Checkout. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchLockDeleteSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Undo Collaborative Authoring Checkout. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchLockDeleteAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Multiple Documents. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Multiple Documents. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Multiple Documents. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchPutSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Multiple Documents. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsBatchPutAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Anchor IDs. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAnchorsGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Anchor IDs. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAnchorsGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Document Annotations to PDF. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAnnotationsFileGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Document Annotations to PDF. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAnnotationsFileGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Import Document Annotations from PDF. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAnnotationsFilePostSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Import Document Annotations from PDF. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAnnotationsFilePostAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Document Attachment. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdDeleteSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Document Attachment. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdDeleteAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Attachment. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdFileGetSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Attachment. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdFileGetAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Attachment Metadata. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdGetSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Attachment Metadata. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdGetAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Document Attachment Description. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdPutSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Document Attachment Description. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdPutAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Document Attachment Version. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Document Attachment Version. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Attachment Version. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Attachment Version. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Attachment Version Metadata. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Attachment Version Metadata. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Restore Document Attachment Version. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param restore The parameter restore must be set to true. 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, bool restore, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Restore Document Attachment Version. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param restore The parameter restore must be set to true. 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string attachmentVersion, bool restore, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Attachment Versions. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetSync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Attachment Versions. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetAsync(char * accessToken,
	std::string docId, std::string attachmentId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download All Document Attachments. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsFileGetSync(char * accessToken,
	std::string docId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download All Document Attachments. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsFileGetAsync(char * accessToken,
	std::string docId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Attachments. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsGetSync(char * accessToken,
	std::string docId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Attachments. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsGetAsync(char * accessToken,
	std::string docId, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Document Attachment. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsPostSync(char * accessToken,
	std::string docId, std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Document Attachment. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAttachmentsPostAsync(char * accessToken,
	std::string docId, std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Complete Audit History for a Single Document. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAudittrailGetSync(char * accessToken,
	std::string docId, std::string startDate, std::string endDate, std::string formatResult, std::string limit, std::string offset, std::string events, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Complete Audit History for a Single Document. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdAudittrailGetAsync(char * accessToken,
	std::string docId, std::string startDate, std::string endDate, std::string formatResult, std::string limit, std::string offset, std::string events, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Document. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdDeleteSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Document. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdDeleteAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Events. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdEventsGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Events. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdEventsGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document File. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param lockDocument Set to true to Check Out this document before retrieval. If omitted, defaults to false.
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdFileGetSync(char * accessToken,
	std::string docId, bool lockDocument, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document File. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param lockDocument Set to true to Check Out this document before retrieval. If omitted, defaults to false.
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdFileGetAsync(char * accessToken,
	std::string docId, bool lockDocument, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Document Lock. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdLockDeleteSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Document Lock. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdLockDeleteAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Lock. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdLockGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Lock. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdLockGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Document Lock. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdLockPostSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Document Lock. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdLockPostAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download All Document Version Attachments. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download All Document Version Attachments. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Single Document Version. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param suppressRendition Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdPostSync(char * accessToken,
	std::string docId, std::string suppressRendition, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Single Document Version. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param suppressRendition Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdPostAsync(char * accessToken,
	std::string docId, std::string suppressRendition, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Single Document. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdPutSync(char * accessToken,
	std::string docId, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Single Document. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIMigrationMode When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdPutAsync(char * accessToken,
	std::string docId, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Renditions. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Renditions. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Document Rendition. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypeDeleteSync(char * accessToken,
	std::string docId, std::string renditionType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Document Rendition. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypeDeleteAsync(char * accessToken,
	std::string docId, std::string renditionType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Rendition File. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param steadyState Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypeGetSync(char * accessToken,
	std::string docId, std::string renditionType, std::string steadyState, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Rendition File. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param steadyState Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypeGetAsync(char * accessToken,
	std::string docId, std::string renditionType, std::string steadyState, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add Single Document Rendition. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param content_Type 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypePostSync(char * accessToken,
	std::string docId, std::string renditionType, std::string authorization, std::string accept, std::string content_Type, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add Single Document Rendition. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param content_Type 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypePostAsync(char * accessToken,
	std::string docId, std::string renditionType, std::string authorization, std::string accept, std::string content_Type, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Replace Document Rendition. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypePutSync(char * accessToken,
	std::string docId, std::string renditionType, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Replace Document Rendition. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRenditionsRenditionTypePutAsync(char * accessToken,
	std::string docId, std::string renditionType, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Remove Users & Groups from Roles on a Single Document. *Synchronous*
 *
 * 
 * \param docId The id value of the document from which to remove roles. *Required*
 * \param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. *Required*
 * \param id The id value of the user or group to remove from the role. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteSync(char * accessToken,
	std::string docId, std::string roleNameAndUserOrGroup, std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove Users & Groups from Roles on a Single Document. *Asynchronous*
 *
 * 
 * \param docId The id value of the document from which to remove roles. *Required*
 * \param roleNameAndUserOrGroup The name of the role from which to remove the user or group followed by either `user` or `group`. The format is `{role_name}.{user_or_group}`. For example, `consumer__v.user`. *Required*
 * \param id The id value of the user or group to remove from the role. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteAsync(char * accessToken,
	std::string docId, std::string roleNameAndUserOrGroup, std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Version Attachments. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Version Attachments. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Versions. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsGetSync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Versions. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsGetAsync(char * accessToken,
	std::string docId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Read Annotations by ID. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param annotationId The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string annotationId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Read Annotations by ID. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param annotationId The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string annotationId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Read Replies of Parent Annotation. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param annotationId The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string annotationId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Read Replies of Parent Annotation. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param annotationId The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string annotationId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Document Version Annotations to PDF. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Document Version Annotations to PDF. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Import Document Version Annotations from PDF. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Import Document Version Annotations from PDF. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Read Annotations by Document Version and Type. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string limit, std::string offset, std::string annotationTypes, std::string paginationId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Read Annotations by Document Version and Type. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string limit, std::string offset, std::string annotationTypes, std::string paginationId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Version Attachment Version. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Version Attachment Version. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Version Attachment Versions. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Version Attachment Versions. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string attachmentId, std::string attachmentVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Document Version. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Document Version. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Version Notes as CSV. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Version Notes as CSV. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Document Event. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Document Event. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Video Annotations. *Synchronous*
 *
 * 
 * \param docId The video document id field value. *Required*
 * \param majorVersion The video document major_version_number__v field value. *Required*
 * \param minorVersion The video document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept This `Accept` header only changes the format of the response in the case of an error. On `SUCCESS`, the HTTP Response Header `Content-Type` is set to `text/plain;charset=UnicodeLittle`.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Video Annotations. *Asynchronous*
 *
 * 
 * \param docId The video document id field value. *Required*
 * \param majorVersion The video document major_version_number__v field value. *Required*
 * \param minorVersion The video document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept This `Accept` header only changes the format of the response in the case of an error. On `SUCCESS`, the HTTP Response Header `Content-Type` is set to `text/plain;charset=UnicodeLittle`.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Version File. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Version File. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Version. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Version. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Document Version. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Document Version. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Relationships. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Relationships. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Single Document Relationship. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Single Document Relationship. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Document Relationship. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param relationshipId The relationship id field value. See Retrieve Document Relationships. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Document Relationship. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param relationshipId The relationship id field value. See Retrieve Document Relationships. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Relationship. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param relationshipId The relationship id field value. See Retrieve Document Relationships. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Relationship. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param relationshipId The relationship id field value. See Retrieve Document Relationships. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string relationshipId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Version Renditions. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Version Renditions. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Document Version Rendition. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Document Version Rendition. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Version Rendition File. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Version Rendition File. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param renditionType The document rendition type. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Upload Document Version Rendition. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Upload Document Version Rendition. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Replace Document Version Rendition. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Replace Document Version Rendition. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string renditionType, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Version Thumbnail File. *Synchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetSync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Version Thumbnail File. *Asynchronous*
 *
 * 
 * \param docId The document id field value. *Required*
 * \param majorVersion The document major_version_number__v field value. *Required*
 * \param minorVersion The document minor_version_number__v field value. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetAsync(char * accessToken,
	std::string docId, std::string majorVersion, std::string minorVersion, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Documents. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsGetSync(char * accessToken,
	std::string namedFilter, std::string scope, std::string versionscope, std::string search, std::string limit, std::string sort, std::string start, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Documents. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsGetAsync(char * accessToken,
	std::string namedFilter, std::string scope, std::string versionscope, std::string search, std::string limit, std::string sort, std::string start, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Document Roles. *Synchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdRolesGetSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Document Roles. *Asynchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdRolesGetAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Assign Users & Groups to Roles on a Single Document. *Synchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdRolesPostSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Assign Users & Groups to Roles on a Single Document. *Asynchronous*
 *
 * 
 * \param id  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdRolesPostAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Role. *Synchronous*
 *
 * 
 * \param id The document `id`. *Required*
 * \param roleName The name of the role to retrieve. For example, `owner__v`. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdRolesRoleNameGetSync(char * accessToken,
	std::string id, std::string roleName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Role. *Asynchronous*
 *
 * 
 * \param id The document `id`. *Required*
 * \param roleName The name of the role to retrieve. For example, `owner__v`. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdRolesRoleNameGetAsync(char * accessToken,
	std::string id, std::string roleName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document User Actions. *Synchronous*
 *
 * 
 * \param id The document id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the document. *Required*
 * \param minorVersion The minor version number of the document. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetSync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document User Actions. *Asynchronous*
 *
 * 
 * \param id The document id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the document. *Required*
 * \param minorVersion The minor version number of the document. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetAsync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Entry Criteria. *Synchronous*
 *
 * 
 * \param id The document id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the document. *Required*
 * \param minorVersion The minor version number of the document. *Required*
 * \param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetSync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Entry Criteria. *Asynchronous*
 *
 * 
 * \param id The document id field value from which to retrieve available user actions. *Required*
 * \param majorVersion The major version number of the document. *Required*
 * \param minorVersion The minor version number of the document. *Required*
 * \param nameV The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetAsync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Document User Action. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutSync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Document User Action. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutAsync(char * accessToken,
	std::string id, std::string majorVersion, std::string minorVersion, std::string nameV, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve User Actions on Multiple Documents. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsLifecycleActionsPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve User Actions on Multiple Documents. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsLifecycleActionsPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Bulk Document User Actions. *Synchronous*
 *
 * 
 * \param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsLifecycleActionsUserActionNamePutSync(char * accessToken,
	std::string userActionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Bulk Document User Actions. *Asynchronous*
 *
 * 
 * \param userActionName The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsLifecycleActionsUserActionNamePutAsync(char * accessToken,
	std::string userActionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Single Document. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIMigrationMode When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsPostSync(char * accessToken,
	std::string authorization, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Single Document. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIMigrationMode When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsPostAsync(char * accessToken,
	std::string authorization, std::string accept, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Multiple Document Relationships. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRelationshipsBatchDeleteSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Multiple Document Relationships. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRelationshipsBatchDeleteAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Multiple Document Relationships. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRelationshipsBatchPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Multiple Document Relationships. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRelationshipsBatchPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Multiple Document Renditions. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRenditionsBatchDeleteSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Multiple Document Renditions. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRenditionsBatchDeleteAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add Multiple Document Renditions. *Synchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param largeSizeAsset If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRenditionsBatchPostSync(char * accessToken,
	std::string idParam, std::string largeSizeAsset, std::string authorization, std::string accept, std::string contentType, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add Multiple Document Renditions. *Asynchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param largeSizeAsset If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRenditionsBatchPostAsync(char * accessToken,
	std::string idParam, std::string largeSizeAsset, std::string authorization, std::string accept, std::string contentType, bool xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Remove Users and Groups from Roles on Multiple Documents & Binders. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRolesBatchDeleteSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove Users and Groups from Roles on Multiple Documents & Binders. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRolesBatchDeleteAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Assign Users & Groups to Roles on Multiple Documents & Binders. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRolesBatchPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Assign Users & Groups to Roles on Multiple Documents & Binders. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsRolesBatchPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Template Collection. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Template Collection. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Single Document Template. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Single Document Template. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Multiple Document Templates. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesPutSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Multiple Document Templates. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesPutAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Basic Document Template. *Synchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNameDeleteSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Basic Document Template. *Asynchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNameDeleteAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Document Template File. *Synchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNameFileGetSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Document Template File. *Asynchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNameFileGetAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Document Template Attributes. *Synchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNameGetSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Document Template Attributes. *Asynchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNameGetAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Single Document Template. *Synchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNamePutSync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Single Document Template. *Asynchronous*
 *
 * 
 * \param templateName The document template name__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTemplatesTemplateNamePutAsync(char * accessToken,
	std::string templateName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Document Tokens. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTokensPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Document Tokens. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsTokensPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Document Versions. *Synchronous*
 *
 * 
 * \param source Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
 * \param renditions Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsVersionsBatchActionsFileextractPostSync(char * accessToken,
	bool source, bool renditions, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Document Versions. *Asynchronous*
 *
 * 
 * \param source Optional: To exclude source files, include a query parameter source=false. If omitted, defaults to true.
 * \param renditions Optional: To include renditions, include a query parameter renditions=true. If omitted, defaults to false.
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsVersionsBatchActionsFileextractPostAsync(char * accessToken,
	bool source, bool renditions, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Multiple Document Versions. *Synchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsVersionsBatchDeleteSync(char * accessToken,
	std::string idParam, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Multiple Document Versions. *Asynchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsVersionsBatchDeleteAsync(char * accessToken,
	std::string idParam, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Multiple Document Versions. *Synchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the `status__v` field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsVersionsBatchPostSync(char * accessToken,
	std::string idParam, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Multiple Document Versions. *Asynchronous*
 *
 * 
 * \param idParam If you’re identifying documents in your input by their external ID
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIMigrationMode Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the `status__v` field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about <a href=\"https://platform.veevavault.help/en/gr/54028\">Document Migration Mode in Vault Help.</a>
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDocumentsVersionsBatchPostAsync(char * accessToken,
	std::string idParam, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIMigrationMode, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Domain Information. *Synchronous*
 *
 * 
 * \param includeApplication To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDomainGetSync(char * accessToken,
	bool includeApplication, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Domain Information. *Asynchronous*
 *
 * 
 * \param includeApplication To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included.
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDomainGetAsync(char * accessToken,
	bool includeApplication, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Domains. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDomainsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Domains. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsDomainsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add EDL Matched Documents. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsEdlMatchedDocumentsBatchActionsAddPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add EDL Matched Documents. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsEdlMatchedDocumentsBatchActionsAddPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Remove EDL Matched Documents. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsEdlMatchedDocumentsBatchActionsRemovePostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove EDL Matched Documents. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsEdlMatchedDocumentsBatchActionsRemovePostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Auto Managed Groups. *Synchronous*
 *
 * 
 * \param limit Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
 * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsAutoGetSync(char * accessToken,
	std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Auto Managed Groups. *Asynchronous*
 *
 * 
 * \param limit Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000. 
 * \param offset Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset=51. If omitted, defaults to 0.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsAutoGetAsync(char * accessToken,
	std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Groups. *Synchronous*
 *
 * 
 * \param includeImplied When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGetSync(char * accessToken,
	std::string includeImplied, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Groups. *Asynchronous*
 *
 * 
 * \param includeImplied When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGetAsync(char * accessToken,
	std::string includeImplied, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Group. *Synchronous*
 *
 * 
 * \param groupId The group id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGroupIdDeleteSync(char * accessToken,
	std::string groupId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Group. *Asynchronous*
 *
 * 
 * \param groupId The group id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGroupIdDeleteAsync(char * accessToken,
	std::string groupId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Group. *Synchronous*
 *
 * 
 * \param groupId The group id field value. *Required*
 * \param includeImplied When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGroupIdGetSync(char * accessToken,
	std::string groupId, bool includeImplied, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Group. *Asynchronous*
 *
 * 
 * \param groupId The group id field value. *Required*
 * \param includeImplied When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGroupIdGetAsync(char * accessToken,
	std::string groupId, bool includeImplied, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Group. *Synchronous*
 *
 * 
 * \param groupId The group id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGroupIdPutSync(char * accessToken,
	std::string groupId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Group. *Asynchronous*
 *
 * 
 * \param groupId The group id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsGroupIdPutAsync(char * accessToken,
	std::string groupId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Group . *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Group . *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsGroupsPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Application License Usage. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsLicensesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Application License Usage. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsLicensesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Multi-Record Workflows. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsActionsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Multi-Record Workflows. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsActionsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Multi-Record Workflow Details. *Synchronous*
 *
 * 
 * \param workflowName  *Required*
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsActionsWorkflowNameGetSync(char * accessToken,
	std::string workflowName, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Multi-Record Workflow Details. *Asynchronous*
 *
 * 
 * \param workflowName  *Required*
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsActionsWorkflowNameGetAsync(char * accessToken,
	std::string workflowName, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Multi-Record Workflow. *Synchronous*
 *
 * 
 * \param workflowName  *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsActionsWorkflowNamePostSync(char * accessToken,
	std::string workflowName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Multi-Record Workflow. *Asynchronous*
 *
 * 
 * \param workflowName  *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsActionsWorkflowNamePostAsync(char * accessToken,
	std::string workflowName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflows. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsGetSync(char * accessToken,
	std::string objectV, std::string recordIdV, std::string participant, std::string statusV, std::string offset, std::string pageSize, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflows. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsGetAsync(char * accessToken,
	std::string objectV, std::string recordIdV, std::string participant, std::string statusV, std::string offset, std::string pageSize, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Tasks. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksGetSync(char * accessToken,
	std::string objectV, std::string recordIdV, std::string assigneeV, std::string statusV, std::string offset, std::string pageSize, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Tasks. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksGetAsync(char * accessToken,
	std::string objectV, std::string recordIdV, std::string assigneeV, std::string statusV, std::string offset, std::string pageSize, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Accept Single Record Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsAcceptPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Accept Single Record Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsAcceptPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Cancel Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsCancelPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Cancel Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsCancelPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Complete Single Record Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsCompletePostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Complete Single Record Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsCompletePostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Task Actions. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsGetSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Task Actions. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsGetAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Accept Multi-item Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Accept Multi-item Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Complete Multi-item Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Complete Multi-item Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Manage Multi-Item Workflow Content. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Manage Multi-Item Workflow Content. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Reassign Multi-item Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The id of the task to reassign. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Reassign Multi-item Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The id of the task to reassign. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Reassign Single Record Workflow Task. *Synchronous*
 *
 * 
 * \param taskId The id of the task to reassign. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsReassignPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Reassign Single Record Workflow Task. *Asynchronous*
 *
 * 
 * \param taskId The id of the task to reassign. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsReassignPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Task Action Details. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param taskAction The name of the task action retrieved from Retrieve Workflow Task Actions. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsTaskActionGetSync(char * accessToken,
	std::string taskId, std::string taskAction, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Task Action Details. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param taskAction The name of the task action retrieved from Retrieve Workflow Task Actions. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsTaskActionGetAsync(char * accessToken,
	std::string taskId, std::string taskAction, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Undo Workflow Task Acceptance. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Undo Workflow Task Acceptance. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Workflow Task Due Date. *Synchronous*
 *
 * 
 * \param taskId The id of the task. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostSync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Workflow Task Due Date. *Asynchronous*
 *
 * 
 * \param taskId The id of the task. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostAsync(char * accessToken,
	std::string taskId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Task Details. *Synchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdGetSync(char * accessToken,
	std::string taskId, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Task Details. *Asynchronous*
 *
 * 
 * \param taskId The task id field value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsTasksTaskIdGetAsync(char * accessToken,
	std::string taskId, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Actions. *Synchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdActionsGetSync(char * accessToken,
	std::string workflowId, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Actions. *Asynchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdActionsGetAsync(char * accessToken,
	std::string workflowId, std::string loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Action Details. *Synchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param workflowAction The workflow action name retrieved from Retrieve Workflow Actions. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetSync(char * accessToken,
	std::string workflowId, std::string workflowAction, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Action Details. *Asynchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param workflowAction The workflow action name retrieved from Retrieve Workflow Actions. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetAsync(char * accessToken,
	std::string workflowId, std::string workflowAction, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Workflow Action. *Synchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param workflowAction The workflow action name retrieved from Retrieve Workflow Actions. *Required*
 * \param documentsSys Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostSync(char * accessToken,
	std::string workflowId, std::string workflowAction, std::string documentsSys, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Workflow Action. *Asynchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param workflowAction The workflow action name retrieved from Retrieve Workflow Actions. *Required*
 * \param documentsSys Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids.
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostAsync(char * accessToken,
	std::string workflowId, std::string workflowAction, std::string documentsSys, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Workflow Details. *Synchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdGetSync(char * accessToken,
	std::string workflowId, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Workflow Details. *Asynchronous*
 *
 * 
 * \param workflowId The workflow id field value. *Required*
 * \param loc When localized (translated) strings are available, retrieve them by including loc=true.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsObjectworkflowsWorkflowIdGetAsync(char * accessToken,
	std::string workflowId, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Picklists. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Picklists. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Picklist Values. *Synchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNameGetSync(char * accessToken,
	std::string picklistName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Picklist Values. *Asynchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNameGetAsync(char * accessToken,
	std::string picklistName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Inactivate Picklist Value. *Synchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePicklistValueNameDeleteSync(char * accessToken,
	std::string picklistName, std::string picklistValueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Inactivate Picklist Value. *Asynchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePicklistValueNameDeleteAsync(char * accessToken,
	std::string picklistName, std::string picklistValueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Picklist Value. *Synchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePicklistValueNamePutSync(char * accessToken,
	std::string picklistName, std::string picklistValueName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Picklist Value. *Asynchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param picklistValueName The picklist value name field value (north_america__c, south_america__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePicklistValueNamePutAsync(char * accessToken,
	std::string picklistName, std::string picklistValueName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Picklist Values. *Synchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePostSync(char * accessToken,
	std::string picklistName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Picklist Values. *Asynchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePostAsync(char * accessToken,
	std::string picklistName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Picklist Value Label. *Synchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePutSync(char * accessToken,
	std::string picklistName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Picklist Value Label. *Asynchronous*
 *
 * 
 * \param picklistName The picklist name field value (license_type__v, product_family__c, region__c, etc.) *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsPicklistsPicklistNamePutAsync(char * accessToken,
	std::string picklistName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Build Production Vault. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxActionsBuildproductionPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Build Production Vault. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxActionsBuildproductionPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Promote to Production. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxActionsPromoteproductionPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Promote to Production. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxActionsPromoteproductionPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Recheck Sandbox Usage Limit. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxActionsRecheckusagePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Recheck Sandbox Usage Limit. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxActionsRecheckusagePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Change Sandbox Size. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxBatchChangesizePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Change Sandbox Size. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxBatchChangesizePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Set Sandbox Entitlements. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxEntitlementsSetPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Set Sandbox Entitlements. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxEntitlementsSetPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Sandboxes. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Sandboxes. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Sandbox. *Synchronous*
 *
 * 
 * \param name The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxNameDeleteSync(char * accessToken,
	std::string name, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Sandbox. *Asynchronous*
 *
 * 
 * \param name The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxNameDeleteAsync(char * accessToken,
	std::string name, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create or Refresh Sandbox. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create or Refresh Sandbox. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Sandbox Snapshot. *Synchronous*
 *
 * 
 * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotApiNameActionsUpdatePostSync(char * accessToken,
	std::string apiName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Sandbox Snapshot. *Asynchronous*
 *
 * 
 * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotApiNameActionsUpdatePostAsync(char * accessToken,
	std::string apiName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Upgrade Sandbox Snapshot. *Synchronous*
 *
 * 
 * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotApiNameActionsUpgradePostSync(char * accessToken,
	std::string apiName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Upgrade Sandbox Snapshot. *Asynchronous*
 *
 * 
 * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotApiNameActionsUpgradePostAsync(char * accessToken,
	std::string apiName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Sandbox Snapshot. *Synchronous*
 *
 * 
 * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotApiNameDeleteSync(char * accessToken,
	std::string apiName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Sandbox Snapshot. *Asynchronous*
 *
 * 
 * \param apiName The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotApiNameDeleteAsync(char * accessToken,
	std::string apiName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Sandbox Snapshots. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Sandbox Snapshots. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Sandbox Snapshot. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Sandbox Snapshot. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxSnapshotPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Refresh Sandbox from Snapshot. *Synchronous*
 *
 * 
 * \param vaultId The Vault ID of the sandbox to be refreshed. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxVaultIdActionsRefreshPostSync(char * accessToken,
	std::string vaultId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Refresh Sandbox from Snapshot. *Asynchronous*
 *
 * 
 * \param vaultId The Vault ID of the sandbox to be refreshed. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxVaultIdActionsRefreshPostAsync(char * accessToken,
	std::string vaultId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Sandbox Details by ID. *Synchronous*
 *
 * 
 * \param vaultId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxVaultIdGetSync(char * accessToken,
	std::string vaultId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Sandbox Details by ID. *Asynchronous*
 *
 * 
 * \param vaultId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSandboxVaultIdGetAsync(char * accessToken,
	std::string vaultId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Security Policies. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSecuritypoliciesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Security Policies. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSecuritypoliciesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Security Policy. *Synchronous*
 *
 * 
 * \param securityPolicyName Security policy name__v field value (retrieved from previous request). This is typically a numeric value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSecuritypoliciesSecurityPolicyNameGetSync(char * accessToken,
	std::string securityPolicyName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Security Policy. *Asynchronous*
 *
 * 
 * \param securityPolicyName Security policy name__v field value (retrieved from previous request). This is typically a numeric value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsSecuritypoliciesSecurityPolicyNameGetAsync(char * accessToken,
	std::string securityPolicyName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Users. *Synchronous*
 *
 * 
 * \param vaults Retrieve all users assigned to all Vaults in your domain.
 * \param excludeVaultMembership Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
 * \param excludeAppLicensing Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersGetSync(char * accessToken,
	std::string vaults, std::string excludeVaultMembership, std::string excludeAppLicensing, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Users. *Asynchronous*
 *
 * 
 * \param vaults Retrieve all users assigned to all Vaults in your domain.
 * \param excludeVaultMembership Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response.
 * \param excludeAppLicensing Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersGetAsync(char * accessToken,
	std::string vaults, std::string excludeVaultMembership, std::string excludeAppLicensing, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve User. *Synchronous*
 *
 * 
 * \param id The user id field value. Use the value me to get information for the currently authenticated user. *Required*
 * \param excludeVaultMembership Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
 * \param excludeAppLicensing Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersIdGetSync(char * accessToken,
	std::string id, std::string excludeVaultMembership, std::string excludeAppLicensing, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve User. *Asynchronous*
 *
 * 
 * \param id The user id field value. Use the value me to get information for the currently authenticated user. *Required*
 * \param excludeVaultMembership Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
 * \param excludeAppLicensing Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersIdGetAsync(char * accessToken,
	std::string id, std::string excludeVaultMembership, std::string excludeAppLicensing, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve User Permissions. *Synchronous*
 *
 * 
 * \param id The ID of the user. Use the value me to retrieve information for the currently authenticated user. *Required*
 * \param filter Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersIdPermissionsGetSync(char * accessToken,
	std::string id, std::string filter, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve User Permissions. *Asynchronous*
 *
 * 
 * \param id The ID of the user. Use the value me to retrieve information for the currently authenticated user. *Required*
 * \param filter Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersIdPermissionsGetAsync(char * accessToken,
	std::string id, std::string filter, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Single User. *Synchronous*
 *
 * 
 * \param id The user id field value. Use the value me to get information for the currently authenticated user. *Required*
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersIdPutSync(char * accessToken,
	std::string id, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Single User. *Asynchronous*
 *
 * 
 * \param id The user id field value. Use the value me to get information for the currently authenticated user. *Required*
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersIdPutAsync(char * accessToken,
	std::string id, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Validate Session User. *Synchronous*
 *
 * 
 * \param excludeVaultMembership Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
 * \param excludeAppLicensing Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMeGetSync(char * accessToken,
	std::string excludeVaultMembership, std::string excludeAppLicensing, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Validate Session User. *Asynchronous*
 *
 * 
 * \param excludeVaultMembership Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response.
 * \param excludeAppLicensing Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMeGetAsync(char * accessToken,
	std::string excludeVaultMembership, std::string excludeAppLicensing, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Change My Password. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMePasswordPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Change My Password. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMePasswordPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve My User Permissions. *Synchronous*
 *
 * 
 * \param filter Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMePermissionsGetSync(char * accessToken,
	std::string filter, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve My User Permissions. *Asynchronous*
 *
 * 
 * \param filter Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMePermissionsGetAsync(char * accessToken,
	std::string filter, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update My User. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMePutSync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update My User. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersMePutAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Single User. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Single User. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Multiple Users. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersPutSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Multiple Users. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersPutAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Disable User. *Synchronous*
 *
 * 
 * \param userId The user id field value.  *Required*
 * \param domain When true, this disables the user account in all vaults in the domain.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersUserIdDeleteSync(char * accessToken,
	std::string userId, bool domain, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Disable User. *Asynchronous*
 *
 * 
 * \param userId The user id field value.  *Required*
 * \param domain When true, this disables the user account in all vaults in the domain.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersUserIdDeleteAsync(char * accessToken,
	std::string userId, bool domain, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Vault Membership. *Synchronous*
 *
 * 
 * \param userId The user id field value. *Required*
 * \param vaultId The system-managed id field value assigned to each vault in the domain. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersUserIdVaultMembershipVaultIdPutSync(char * accessToken,
	std::string userId, std::string vaultId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Vault Membership. *Asynchronous*
 *
 * 
 * \param userId The user id field value. *Required*
 * \param vaultId The system-managed id field value assigned to each vault in the domain. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsUsersUserIdVaultMembershipVaultIdPutAsync(char * accessToken,
	std::string userId, std::string vaultId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Vault Compare. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsVaultActionsComparePostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Vault Compare. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsVaultActionsComparePostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Vault Configuration Report. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsVaultActionsConfigreportPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Vault Configuration Report. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool objectsVaultActionsConfigreportPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Component Definition Query. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryComponentsPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Component Definition Query. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryComponentsPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Next Page URL. *Synchronous*
 *
 * 
 * \param nextPage  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIDescribeQuery 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryNextPagePostSync(char * accessToken,
	std::string nextPage, std::string authorization, std::string accept, bool xVaultAPIDescribeQuery, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Next Page URL. *Asynchronous*
 *
 * 
 * \param nextPage  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIDescribeQuery 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryNextPagePostAsync(char * accessToken,
	std::string nextPage, std::string authorization, std::string accept, bool xVaultAPIDescribeQuery, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Submitting a Query. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIDescribeQuery 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryPostSync(char * accessToken,
	std::string authorization, std::string accept, bool xVaultAPIDescribeQuery, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Submitting a Query. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIDescribeQuery 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryPostAsync(char * accessToken,
	std::string authorization, std::string accept, bool xVaultAPIDescribeQuery, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Previous Page URL. *Synchronous*
 *
 * 
 * \param previousPage  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIDescribeQuery 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryPreviousPagePostSync(char * accessToken,
	std::string previousPage, std::string authorization, std::string accept, bool xVaultAPIDescribeQuery, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Previous Page URL. *Asynchronous*
 *
 * 
 * \param previousPage  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIDescribeQuery 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool queryPreviousPagePostAsync(char * accessToken,
	std::string previousPage, std::string authorization, std::string accept, bool xVaultAPIDescribeQuery, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Current User with SCIM. *Synchronous*
 *
 * 
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2MeGetSync(char * accessToken,
	std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Current User with SCIM. *Asynchronous*
 *
 * 
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2MeGetAsync(char * accessToken,
	std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Current User with SCIM. *Synchronous*
 *
 * 
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2MePutSync(char * accessToken,
	std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Current User with SCIM. *Asynchronous*
 *
 * 
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2MePutAsync(char * accessToken,
	std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All SCIM Resource Types. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2ResourceTypesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All SCIM Resource Types. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2ResourceTypesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single SCIM Resource Type. *Synchronous*
 *
 * 
 * \param type A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2ResourceTypesTypeGetSync(char * accessToken,
	std::string type, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single SCIM Resource Type. *Asynchronous*
 *
 * 
 * \param type A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2ResourceTypesTypeGetAsync(char * accessToken,
	std::string type, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All SCIM Schema Information. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2SchemasGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All SCIM Schema Information. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2SchemasGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single SCIM Schema Information. *Synchronous*
 *
 * 
 * \param id The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2SchemasIdGetSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single SCIM Schema Information. *Asynchronous*
 *
 * 
 * \param id The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2SchemasIdGetAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve SCIM Provider. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2ServiceProviderConfigGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve SCIM Provider. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2ServiceProviderConfigGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve SCIM Resources. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2TypeGetSync(char * accessToken,
	std::string type, std::string filter, std::string attributes, std::string excludedAttributes, std::string sortBy, std::string sortOrder, std::string startIndex, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve SCIM Resources. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2TypeGetAsync(char * accessToken,
	std::string type, std::string filter, std::string attributes, std::string excludedAttributes, std::string sortBy, std::string sortOrder, std::string startIndex, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single SCIM Resource. *Synchronous*
 *
 * 
 * \param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. *Required*
 * \param id The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. *Required*
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2TypeIdGetSync(char * accessToken,
	std::string type, std::string id, std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single SCIM Resource. *Asynchronous*
 *
 * 
 * \param type The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. *Required*
 * \param id The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. *Required*
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2TypeIdGetAsync(char * accessToken,
	std::string type, std::string id, std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Users with SCIM. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersGetSync(char * accessToken,
	std::string filter, std::string attributes, std::string excludedAttributes, std::string sortBy, std::string sortOrder, std::string count, std::string startIndex, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Users with SCIM. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersGetAsync(char * accessToken,
	std::string filter, std::string attributes, std::string excludedAttributes, std::string sortBy, std::string sortOrder, std::string count, std::string startIndex, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single User with SCIM. *Synchronous*
 *
 * 
 * \param id The id of the user you wish to update. *Required*
 * \param filter Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersIdGetSync(char * accessToken,
	std::string id, std::string filter, std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single User with SCIM. *Asynchronous*
 *
 * 
 * \param id The id of the user you wish to update. *Required*
 * \param filter Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \"{value}\". For example, to filter for a particular user name, userName eq \"john\". Complex expressions are not supported, and eq is the only supported operator.
 * \param attributes Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes=userName,emails. Note that the schemas and id attributes are always returned.
 * \param excludedAttributes Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes=userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersIdGetAsync(char * accessToken,
	std::string id, std::string filter, std::string attributes, std::string excludedAttributes, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update User with SCIM. *Synchronous*
 *
 * 
 * \param id The id of the user you wish to update. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersIdPutSync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update User with SCIM. *Asynchronous*
 *
 * 
 * \param id The id of the user you wish to update. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersIdPutAsync(char * accessToken,
	std::string id, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create User with SCIM. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create User with SCIM. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool scimV2UsersPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Signing Certificate. *Synchronous*
 *
 * 
 * \param certId The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesCertificateCertIdGetSync(char * accessToken,
	std::string certId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Signing Certificate. *Asynchronous*
 *
 * 
 * \param certId The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesCertificateCertIdGetAsync(char * accessToken,
	std::string certId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Disable Configuration Mode. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesConfigurationModeActionsDisablePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Disable Configuration Mode. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesConfigurationModeActionsDisablePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Enable Configuration Mode. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesConfigurationModeActionsEnablePostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Enable Configuration Mode. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesConfigurationModeActionsEnablePostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Available Direct Data Files. *Synchronous*
 *
 * 
 * \param extractType The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
 * \param startTime Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
 * \param stopTime Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesDirectdataFilesGetSync(char * accessToken,
	std::string extractType, int startTime, int stopTime, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Available Direct Data Files. *Asynchronous*
 *
 * 
 * \param extractType The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files.
 * \param startTime Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time.
 * \param stopTime Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time.
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesDirectdataFilesGetAsync(char * accessToken,
	std::string extractType, int startTime, int stopTime, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Direct Data File. *Synchronous*
 *
 * 
 * \param name The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesDirectdataFilesNameGetSync(char * accessToken,
	std::string name, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Direct Data File. *Asynchronous*
 *
 * 
 * \param name The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesDirectdataFilesNameGetAsync(char * accessToken,
	std::string name, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Item Content. *Synchronous*
 *
 * 
 * \param item The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param authorization 
 * \param accept 
 * \param range Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format `bytes={min}-{max}`. For example, `bytes=0-1000`.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsContentItemGetSync(char * accessToken,
	std::string item, std::string authorization, std::string accept, std::string range, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Item Content. *Asynchronous*
 *
 * 
 * \param item The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param authorization 
 * \param accept 
 * \param range Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format `bytes={min}-{max}`. For example, `bytes=0-1000`.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsContentItemGetAsync(char * accessToken,
	std::string item, std::string authorization, std::string accept, std::string range, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete File or Folder. *Synchronous*
 *
 * 
 * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param recursive Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsItemDeleteSync(char * accessToken,
	std::string item, std::string recursive, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete File or Folder. *Asynchronous*
 *
 * 
 * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param recursive Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsItemDeleteAsync(char * accessToken,
	std::string item, std::string recursive, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief List Items at a Path. *Synchronous*
 *
 * 
 * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param recursive If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
 * \param limit Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
 * \param formatResult If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsItemGetSync(char * accessToken,
	std::string item, std::string recursive, std::string limit, std::string formatResult, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief List Items at a Path. *Asynchronous*
 *
 * 
 * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param recursive If true, the response will contain the contents of all subfolders. If not specified, the default value is false.
 * \param limit Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
 * \param formatResult If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsItemGetAsync(char * accessToken,
	std::string item, std::string recursive, std::string limit, std::string formatResult, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Folder or File. *Synchronous*
 *
 * 
 * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsItemPutSync(char * accessToken,
	std::string item, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Folder or File. *Asynchronous*
 *
 * 
 * \param item The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsItemPutAsync(char * accessToken,
	std::string item, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Folder or File. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentMD5 Optional: The MD5 checksum of the file being uploaded.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentMD5, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Folder or File. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentMD5 Optional: The MD5 checksum of the file being uploaded.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingItemsPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentMD5, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief List Upload Sessions. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief List Upload Sessions. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Resumable Upload Session. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Resumable Upload Session. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Abort Upload Session. *Synchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdDeleteSync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Abort Upload Session. *Asynchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdDeleteAsync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get Upload Session Details. *Synchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdGetSync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Get Upload Session Details. *Asynchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdGetAsync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief List File Parts Uploaded to Session. *Synchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param limit Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdPartsGetSync(char * accessToken,
	std::string uploadSessionId, std::string limit, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief List File Parts Uploaded to Session. *Asynchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param limit Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000.
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdPartsGetAsync(char * accessToken,
	std::string uploadSessionId, std::string limit, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Commit Upload Session. *Synchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdPostSync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Commit Upload Session. *Asynchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdPostAsync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Upload to a Session. *Synchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIFilePartNumber The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
 * \param contentMD5 Optional: The MD5 checksum of the file part being uploaded.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdPutSync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIFilePartNumber, std::string contentMD5, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Upload to a Session. *Asynchronous*
 *
 * 
 * \param uploadSessionId  *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIFilePartNumber The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2.
 * \param contentMD5 Optional: The MD5 checksum of the file part being uploaded.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesFileStagingUploadUploadSessionIdPutAsync(char * accessToken,
	std::string uploadSessionId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIFilePartNumber, std::string contentMD5, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Job Histories. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsHistoriesGetSync(char * accessToken,
	std::string startDate, std::string endDate, std::string status, std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Job Histories. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsHistoriesGetAsync(char * accessToken,
	std::string startDate, std::string endDate, std::string status, std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Import Bulk Translation File Job Errors. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdErrorsGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Import Bulk Translation File Job Errors. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdErrorsGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Job Status. *Synchronous*
 *
 * 
 * \param jobId The ID of the job, returned from the original job request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Job Status. *Asynchronous*
 *
 * 
 * \param jobId The ID of the job, returned from the original job request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Import Bulk Translation File Job Summary. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdSummaryGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Import Bulk Translation File Job Summary. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested import job. This was returned from the Import Bulk Translation File request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdSummaryGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve SDK Job Tasks. *Synchronous*
 *
 * 
 * \param jobId The ID of the SDK job, returned from the original job request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdTasksGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve SDK Job Tasks. *Asynchronous*
 *
 * 
 * \param jobId The ID of the SDK job, returned from the original job request. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsJobIdTasksGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Job Monitors. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsMonitorsGetSync(char * accessToken,
	std::string startDate, std::string endDate, std::string status, std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Job Monitors. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsMonitorsGetAsync(char * accessToken,
	std::string startDate, std::string endDate, std::string status, std::string limit, std::string offset, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Start Job. *Synchronous*
 *
 * 
 * \param jobId The ID of the scheduled job instance to start. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsStartNowJobIdPostSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Start Job. *Asynchronous*
 *
 * 
 * \param jobId The ID of the scheduled job instance to start. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesJobsStartNowJobIdPostAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Extract Data Files. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderExtractPostSync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Extract Data Files. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderExtractPostAsync(char * accessToken,
	std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Load Failure Log Results. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdFailurelogGetSync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Load Failure Log Results. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdFailurelogGetAsync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Loader Extract Results. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdResultsGetSync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Loader Extract Results. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdResultsGetAsync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Loader Extract Renditions Results. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdResultsRenditionsGetSync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Loader Extract Renditions Results. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdResultsRenditionsGetAsync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Load Success Log Results. *Synchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdSuccesslogGetSync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Load Success Log Results. *Asynchronous*
 *
 * 
 * \param jobId The id value of the requested extract job. *Required*
 * \param taskId The id value of the requested extract task. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderJobIdTasksTaskIdSuccesslogGetAsync(char * accessToken,
	std::string jobId, std::string taskId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Load Data Objects. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderLoadPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Load Data Objects. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesLoaderLoadPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Validate Package. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesPackageActionsValidatePostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Validate Package. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesPackageActionsValidatePostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Export Package. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesPackagePostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Export Package. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesPackagePostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Import Package. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesPackagePutSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Import Package. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesPackagePutAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Queues. *Synchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesGetSync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Queues. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesGetAsync(char * accessToken,
	std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Disable Delivery. *Synchronous*
 *
 * 
 * \param queueName The name of a specific Queue. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameActionsDisableDeliveryPutSync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Disable Delivery. *Asynchronous*
 *
 * 
 * \param queueName The name of a specific Queue. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameActionsDisableDeliveryPutAsync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Enable Delivery. *Synchronous*
 *
 * 
 * \param queueName The name of a specific Queue. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameActionsEnableDeliveryPutSync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Enable Delivery. *Asynchronous*
 *
 * 
 * \param queueName The name of a specific Queue. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameActionsEnableDeliveryPutAsync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Reset Queue. *Synchronous*
 *
 * 
 * \param queueName The name of a specific Queue. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameActionsResetPutSync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Reset Queue. *Asynchronous*
 *
 * 
 * \param queueName The name of a specific Queue. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameActionsResetPutAsync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Queue Status. *Synchronous*
 *
 * 
 * \param queueName The name of a specific queue. For example, queue__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameGetSync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Queue Status. *Asynchronous*
 *
 * 
 * \param queueName The name of a specific queue. For example, queue__c. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesQueuesQueueNameGetAsync(char * accessToken,
	std::string queueName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Validate Imported Package. *Synchronous*
 *
 * 
 * \param packageId The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesVobjectVaultPackageVPackageIdActionsValidatePostSync(char * accessToken,
	std::string packageId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Validate Imported Package. *Asynchronous*
 *
 * 
 * \param packageId The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool servicesVobjectVaultPackageVPackageIdActionsValidatePostAsync(char * accessToken,
	std::string packageId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief End Session. *Synchronous*
 *
 * 
 * \param accept 
 * \param authorization The Vault sessionId to end.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sessionDeleteSync(char * accessToken,
	std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief End Session. *Asynchronous*
 *
 * 
 * \param accept 
 * \param authorization The Vault sessionId to end.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sessionDeleteAsync(char * accessToken,
	std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Single Client Code Distribution. *Synchronous*
 *
 * 
 * \param distributionName The name attribute of the client code distribution to download. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsDistributionNameCodeGetSync(char * accessToken,
	std::string distributionName, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Single Client Code Distribution. *Asynchronous*
 *
 * 
 * \param distributionName The name attribute of the client code distribution to download. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsDistributionNameCodeGetAsync(char * accessToken,
	std::string distributionName, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Single Client Code Distribution. *Synchronous*
 *
 * 
 * \param distributionName The name attribute of the client code distribution to delete. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsDistributionNameDeleteSync(char * accessToken,
	std::string distributionName, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Single Client Code Distribution. *Asynchronous*
 *
 * 
 * \param distributionName The name attribute of the client code distribution to delete. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsDistributionNameDeleteAsync(char * accessToken,
	std::string distributionName, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Single Client Code Distribution Metadata. *Synchronous*
 *
 * 
 * \param distributionName The name attribute of the client code distribution to delete. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsDistributionNameGetSync(char * accessToken,
	std::string distributionName, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Single Client Code Distribution Metadata. *Asynchronous*
 *
 * 
 * \param distributionName The name attribute of the client code distribution to delete. *Required*
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsDistributionNameGetAsync(char * accessToken,
	std::string distributionName, std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve All Client Code Distribution Metadata. *Synchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsGetSync(char * accessToken,
	std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve All Client Code Distribution Metadata. *Asynchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsGetAsync(char * accessToken,
	std::string accept, std::string authorization, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Add or Replace Single Client Code Distribution. *Synchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsPostSync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Add or Replace Single Client Code Distribution. *Asynchronous*
 *
 * 
 * \param accept 
 * \param authorization 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uicodeDistributionsPostAsync(char * accessToken,
	std::string accept, std::string authorization, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Deploy Package. *Synchronous*
 *
 * 
 * \param packageId The id field value of the vault_package__v object record used for deployment. See Import Package. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectVaultPackageVPackageIdActionsDeployPostSync(char * accessToken,
	std::string packageId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Deploy Package. *Asynchronous*
 *
 * 
 * \param packageId The id field value of the vault_package__v object record used for deployment. See Import Package. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectVaultPackageVPackageIdActionsDeployPostAsync(char * accessToken,
	std::string packageId, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Package Deploy Results. *Synchronous*
 *
 * 
 * \param packageId The id field value of the vault_package__v object record used for deployment. See Deploy Package. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectVaultPackageVPackageIdActionsDeployResultsGetSync(char * accessToken,
	std::string packageId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Package Deploy Results. *Asynchronous*
 *
 * 
 * \param packageId The id field value of the vault_package__v object record used for deployment. See Deploy Package. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectVaultPackageVPackageIdActionsDeployResultsGetAsync(char * accessToken,
	std::string packageId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Results of Cascade Delete Job. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param jobStatus  *Required*
 * \param jobId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetSync(char * accessToken,
	std::string objectName, std::string jobStatus, std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Results of Cascade Delete Job. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param jobStatus  *Required*
 * \param jobId  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetAsync(char * accessToken,
	std::string objectName, std::string jobStatus, std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Results of Deep Copy Job. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param jobStatus The ID of the job, retrieved from the response of the job request. *Required*
 * \param jobId Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetSync(char * accessToken,
	std::string objectName, std::string jobStatus, std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Results of Deep Copy Job. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param jobStatus The ID of the job, retrieved from the response of the job request. *Required*
 * \param jobId Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetAsync(char * accessToken,
	std::string objectName, std::string jobStatus, std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create a Placeholder from an EDL Item. *Synchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsEdlItemVActionsCreateplaceholderPostSync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create a Placeholder from an EDL Item. *Asynchronous*
 *
 * 
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsEdlItemVActionsCreateplaceholderPostAsync(char * accessToken,
	std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Merge Records Job Log. *Synchronous*
 *
 * 
 * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsMergesJobIdLogGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Merge Records Job Log. *Asynchronous*
 *
 * 
 * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsMergesJobIdLogGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Record Merge Results. *Synchronous*
 *
 * 
 * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsMergesJobIdResultsGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Record Merge Results. *Asynchronous*
 *
 * 
 * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsMergesJobIdResultsGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Record Merge Status. *Synchronous*
 *
 * 
 * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsMergesJobIdStatusGetSync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Record Merge Status. *Asynchronous*
 *
 * 
 * \param jobId The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsMergesJobIdStatusGetAsync(char * accessToken,
	std::string jobId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Object Action on Multiple Records. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param actionName Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsActionNamePostSync(char * accessToken,
	std::string objectName, std::string actionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Object Action on Multiple Records. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param actionName Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsActionNamePostAsync(char * accessToken,
	std::string objectName, std::string actionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Change Object Type. *Synchronous*
 *
 * 
 * \param objectName The name of the object. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsChangetypePostSync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Change Object Type. *Asynchronous*
 *
 * 
 * \param objectName The name of the object. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsChangetypePostAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Record Merge. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, account__v. This object must have Enable Merges configured. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param vobjectsObjectNameActionsMergePostRequestInner 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsMergePostSync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, std::list<_vobjects__object_name__actions_merge_post_request_inner> vobjectsObjectNameActionsMergePostRequestInner, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Record Merge. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, account__v. This object must have Enable Merges configured. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param vobjectsObjectNameActionsMergePostRequestInner 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsMergePostAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, std::list<_vobjects__object_name__actions_merge_post_request_inner> vobjectsObjectNameActionsMergePostRequestInner, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Roll-up Field Recalculation Status. *Synchronous*
 *
 * 
 * \param objectName The name of the object for which to check the status of a Roll-up field recalculation. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsRecalculaterollupsGetSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Roll-up Field Recalculation Status. *Asynchronous*
 *
 * 
 * \param objectName The name of the object for which to check the status of a Roll-up field recalculation. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsRecalculaterollupsGetAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Recalculate Roll-up Fields. *Synchronous*
 *
 * 
 * \param objectName The name of the object for which to check the status of a Roll-up field recalculation. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsRecalculaterollupsPostSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Recalculate Roll-up Fields. *Asynchronous*
 *
 * 
 * \param objectName The name of the object for which to check the status of a Roll-up field recalculation. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsRecalculaterollupsPostAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Corporate Currency Fields. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsUpdatecorporatecurrencyPutSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Corporate Currency Fields. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameActionsUpdatecorporatecurrencyPutAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Multiple Object Record Attachments. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param idParam 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameAttachmentsBatchDeleteSync(char * accessToken,
	std::string objectName, std::string idParam, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Multiple Object Record Attachments. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param idParam 
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameAttachmentsBatchDeleteAsync(char * accessToken,
	std::string objectName, std::string idParam, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Multiple Object Record Attachments. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameAttachmentsBatchPostSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Multiple Object Record Attachments. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameAttachmentsBatchPostAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Multiple Object Record Attachment Descriptions. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameAttachmentsBatchPutSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Multiple Object Record Attachment Descriptions. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameAttachmentsBatchPutAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Object Records. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param contentType Can be text/csv or application/json
 * \param accept Can be text/csv or application/json
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameDeleteSync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Object Records. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param contentType Can be text/csv or application/json
 * \param accept Can be text/csv or application/json
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameDeleteAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record Roles. *Synchronous*
 *
 * 
 * \param objectName The object name. *Required*
 * \param id The id of the document, binder, or object record. *Required*
 * \param roleName Optional: Include a role name to filter for a specific role. For example, owner__v. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameIdRolesRoleNameGetSync(char * accessToken,
	std::string objectName, std::string id, std::string roleName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record Roles. *Asynchronous*
 *
 * 
 * \param objectName The object name. *Required*
 * \param id The id of the document, binder, or object record. *Required*
 * \param roleName Optional: Include a role name to filter for a specific role. For example, owner__v. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameIdRolesRoleNameGetAsync(char * accessToken,
	std::string objectName, std::string id, std::string roleName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object User Actions Details. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
 * \param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsActionNameGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string actionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object User Actions Details. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
 * \param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsActionNameGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string actionName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Initiate Object Action on a Single Record. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
 * \param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsActionNamePostSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string actionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Initiate Object Action on a Single Record. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param objectRecordId The object record id field value from which to retrieve user actions. *Required*
 * \param actionName The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. *Required*
 * \param authorization 
 * \param contentType 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsActionNamePostAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string actionName, std::string authorization, std::string contentType, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Cascade Delete Object Record. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsCascadedeletePostSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Cascade Delete Object Record. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsCascadedeletePostAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Deep Copy Object Record. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsDeepcopyPostSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Deep Copy Object Record. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsDeepcopyPostAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record User Actions. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param loc Optional: When true, retrieves localized (translated) strings for the label. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record User Actions. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param loc Optional: When true, retrieves localized (translated) strings for the label. 
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdActionsGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, bool loc, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Attachment Field File. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, product__v. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentFieldName The name of the Attachment field to update. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentFieldName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Attachment Field File. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, product__v. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentFieldName The name of the Attachment field to update. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentFieldName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Attachment Field File. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, product__v. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentFieldName The name of the Attachment field to update. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentFieldName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Attachment Field File. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, product__v. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentFieldName The name of the Attachment field to update. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentFieldName, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download All Attachment Field Files. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, product__v. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download All Attachment Field Files. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value. For example, product__v. *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Object Record Attachment. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Object Record Attachment. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record Attachment Metadata. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record Attachment Metadata. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Object Record Attachment Description. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Object Record Attachment Description. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Delete Object Record Attachment Version. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete Object Record Attachment Version. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download Object Record Attachment File. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Object Record Attachment File. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion  *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record Attachment Version Metadata. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record Attachment Version Metadata. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param attachmentVersion The attachment version__v field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Restore Object Record Attachment Version. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, bool restore, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Restore Object Record Attachment Version. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string attachmentVersion, bool restore, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record Attachment Versions. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record Attachment Versions. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param attachmentId The attachment id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string attachmentId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Download All Object Record Attachment Files. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsFileGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download All Object Record Attachment Files. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsFileGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record Attachments. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record Attachments. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create Object Record Attachment. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsPostSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create Object Record Attachment. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAttachmentsPostAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Complete Audit History for a Single Object Record. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAudittrailGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string startDate, std::string endDate, std::string formatResult, std::string limit, std::string offset, std::string events, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Complete Audit History for a Single Object Record. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdAudittrailGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string startDate, std::string endDate, std::string formatResult, std::string limit, std::string offset, std::string events, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Object Record. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdGetSync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Object Record. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param objectRecordId The object record id field value. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameObjectRecordIdGetAsync(char * accessToken,
	std::string objectName, std::string objectRecordId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Create & Upsert Object Records. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNamePostSync(char * accessToken,
	std::string objectName, std::string idParam, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, bool xVaultAPINoTriggers, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Create & Upsert Object Records. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNamePostAsync(char * accessToken,
	std::string objectName, std::string idParam, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, bool xVaultAPINoTriggers, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update Object Records. *Synchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param contentType Can be text/csv or application/json
 * \param accept Can be text/csv or application/json
 * \param xVaultAPIMigrationMode If set to `true`, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
 * \param xVaultAPINoTriggers If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNamePutSync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, bool xVaultAPINoTriggers, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update Object Records. *Asynchronous*
 *
 * 
 * \param objectName The object name__v field value (product__v, country__v, custom_object__c, etc.). *Required*
 * \param authorization 
 * \param contentType Can be text/csv or application/json
 * \param accept Can be text/csv or application/json
 * \param xVaultAPIMigrationMode If set to `true`, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as `created_by__v`. Does not bypass record triggers. Use the `X-VaultAPI-NoTriggers` header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
 * \param xVaultAPINoTriggers If set to `true` and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNamePutAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string contentType, std::string accept, bool xVaultAPIMigrationMode, bool xVaultAPINoTriggers, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Remove Users & Groups from Roles on Object Records. *Synchronous*
 *
 * 
 * \param objectName The name of the object where you want to remove roles. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameRolesDeleteSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Remove Users & Groups from Roles on Object Records. *Asynchronous*
 *
 * 
 * \param objectName The name of the object where you want to remove roles. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameRolesDeleteAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Assign Users & Groups to Roles on Object Records. *Synchronous*
 *
 * 
 * \param objectName The name of the object where you want to remove roles. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameRolesPostSync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Assign Users & Groups to Roles on Object Records. *Asynchronous*
 *
 * 
 * \param objectName The name of the object where you want to remove roles. *Required*
 * \param authorization 
 * \param accept 
 * \param contentType 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsObjectNameRolesPostAsync(char * accessToken,
	std::string objectName, std::string authorization, std::string accept, std::string contentType, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Retrieve Outbound Package Dependencies. *Synchronous*
 *
 * 
 * \param packageId The ID of the outbound_package__v record from which to retrieve dependencies. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsOutboundPackageVPackageIdDependenciesGetSync(char * accessToken,
	std::string packageId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Retrieve Outbound Package Dependencies. *Asynchronous*
 *
 * 
 * \param packageId The ID of the outbound_package__v record from which to retrieve dependencies. *Required*
 * \param authorization 
 * \param accept 
 * \param xVaultAPIClientID Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin > Logs > API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as `unknown` in the API Usage Log.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool vobjectsOutboundPackageVPackageIdDependenciesGetAsync(char * accessToken,
	std::string packageId, std::string authorization, std::string accept, std::string xVaultAPIClientID, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "http://}/api/v25.1";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
