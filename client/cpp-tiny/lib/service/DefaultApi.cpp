#include "DefaultApi.h"

using namespace Tiny;



        Response<
            String
        >
        DefaultApi::
        apiGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        apiMdlComponentsComponentTypeAndRecordNameFilesGet(
            
            std::string componentTypeAndRecordName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/mdl/components/{component_type_and_record_name}/files"; //componentTypeAndRecordName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_componentTypeAndRecordName("{");
                s_componentTypeAndRecordName.append("component_type_and_record_name");
                s_componentTypeAndRecordName.append("}");

                int pos = url.find(s_componentTypeAndRecordName);

                url.erase(pos, s_componentTypeAndRecordName.length());
                url.insert(pos, stringify(componentTypeAndRecordName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        apiMdlComponentsComponentTypeAndRecordNameGet(
            
            std::string componentTypeAndRecordName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/mdl/components/{component_type_and_record_name}"; //componentTypeAndRecordName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_componentTypeAndRecordName("{");
                s_componentTypeAndRecordName.append("component_type_and_record_name");
                s_componentTypeAndRecordName.append("}");

                int pos = url.find(s_componentTypeAndRecordName);

                url.erase(pos, s_componentTypeAndRecordName.length());
                url.insert(pos, stringify(componentTypeAndRecordName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        apiMdlExecuteAsyncJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/mdl/execute_async/{job_id}/results"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        apiMdlExecuteAsyncPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/mdl/execute_async"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        apiMdlExecutePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/mdl/execute"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        apiMdlFilesPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/api/mdl/files"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/audittrail/{audit_trail_type}"; //auditTrailType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate allDates formatResult limit offset objects events 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("all_dates",allDates);
            addQueryParam("format_result",formatResult);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("objects",objects);
            addQueryParam("events",events);

            // Form     | 



                std::string s_auditTrailType("{");
                s_auditTrailType.append("audit_trail_type");
                s_auditTrailType.append("}");

                int pos = url.find(s_auditTrailType);

                url.erase(pos, s_auditTrailType.length());
                url.insert(pos, stringify(auditTrailType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        authDiscoveryPost(
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/auth/discovery"; //


            // Headers  |  accept  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        authOauthSessionOathOidcProfileIdPost(
            
            std::string oathOidcProfileId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/auth/oauth/session/{oath_oidc_profile_id}"; //oathOidcProfileId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_oathOidcProfileId("{");
                s_oathOidcProfileId.append("oath_oidc_profile_id");
                s_oathOidcProfileId.append("}");

                int pos = url.find(s_oathOidcProfileId);

                url.erase(pos, s_oathOidcProfileId.length());
                url.insert(pos, stringify(oathOidcProfileId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        authPost(
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/auth"; //


            // Headers  |  contentType  accept  xVaultAPIClientID 
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeClassNameDelete(
            
            std::string className
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/{class_name}"; //className 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_className("{");
                s_className.append("class_name");
                s_className.append("}");

                int pos = url.find(s_className);

                url.erase(pos, s_className.length());
                url.insert(pos, stringify(className));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/code/{class_name}/disable"; //className 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_className("{");
                s_className.append("class_name");
                s_className.append("}");

                int pos = url.find(s_className);

                url.erase(pos, s_className.length());
                url.insert(pos, stringify(className));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/code/{class_name}/enable"; //className 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_className("{");
                s_className.append("class_name");
                s_className.append("}");

                int pos = url.find(s_className);

                url.erase(pos, s_className.length());
                url.insert(pos, stringify(className));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeClassNameGet(
            
            std::string className
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/{class_name}"; //className 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_className("{");
                s_className.append("class_name");
                s_className.append("}");

                int pos = url.find(s_className);

                url.erase(pos, s_className.length());
                url.insert(pos, stringify(className));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeProfilerGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/profiler"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeProfilerPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/profiler"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeProfilerSessionNameActionsEndPost(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/profiler/{session_name}/actions/end"; //sessionName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_sessionName("{");
                s_sessionName.append("session_name");
                s_sessionName.append("}");

                int pos = url.find(s_sessionName);

                url.erase(pos, s_sessionName.length());
                url.insert(pos, stringify(sessionName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeProfilerSessionNameDelete(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/profiler/{session_name}"; //sessionName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_sessionName("{");
                s_sessionName.append("session_name");
                s_sessionName.append("}");

                int pos = url.find(s_sessionName);

                url.erase(pos, s_sessionName.length());
                url.insert(pos, stringify(sessionName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeProfilerSessionNameGet(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/profiler/{session_name}"; //sessionName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_sessionName("{");
                s_sessionName.append("session_name");
                s_sessionName.append("}");

                int pos = url.find(s_sessionName);

                url.erase(pos, s_sessionName.length());
                url.insert(pos, stringify(sessionName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codeProfilerSessionNameResultsGet(
            
            std::string sessionName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code/profiler/{session_name}/results"; //sessionName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_sessionName("{");
                s_sessionName.append("session_name");
                s_sessionName.append("}");

                int pos = url.find(s_sessionName);

                url.erase(pos, s_sessionName.length());
                url.insert(pos, stringify(sessionName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        codePut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/code"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/composites/trees/{edl_hierarchy_or_template}/actions/listnodes"; //edlHierarchyOrTemplate 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_edlHierarchyOrTemplate("{");
                s_edlHierarchyOrTemplate.append("edl_hierarchy_or_template");
                s_edlHierarchyOrTemplate.append("}");

                int pos = url.find(s_edlHierarchyOrTemplate);

                url.erase(pos, s_edlHierarchyOrTemplate.length());
                url.insert(pos, stringify(edlHierarchyOrTemplate));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/composites/trees/{edl_hierarchy_or_template}"; //edlHierarchyOrTemplate 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_edlHierarchyOrTemplate("{");
                s_edlHierarchyOrTemplate.append("edl_hierarchy_or_template");
                s_edlHierarchyOrTemplate.append("}");

                int pos = url.find(s_edlHierarchyOrTemplate);

                url.erase(pos, s_edlHierarchyOrTemplate.length());
                url.insert(pos, stringify(edlHierarchyOrTemplate));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/composites/trees/edl_hierarchy__v/{parent_node_id}/children"; //parentNodeId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_parentNodeId("{");
                s_parentNodeId.append("parent_node_id");
                s_parentNodeId.append("}");

                int pos = url.find(s_parentNodeId);

                url.erase(pos, s_parentNodeId.length());
                url.insert(pos, stringify(parentNodeId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/composites/trees/edl_hierarchy__v/{parent_node_id}/children"; //parentNodeId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_parentNodeId("{");
                s_parentNodeId.append("parent_node_id");
                s_parentNodeId.append("}");

                int pos = url.find(s_parentNodeId);

                url.erase(pos, s_parentNodeId.length());
                url.insert(pos, stringify(parentNodeId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/configuration/{component_type_and_record_name}"; //componentTypeAndRecordName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_componentTypeAndRecordName("{");
                s_componentTypeAndRecordName.append("component_type_and_record_name");
                s_componentTypeAndRecordName.append("}");

                int pos = url.find(s_componentTypeAndRecordName);

                url.erase(pos, s_componentTypeAndRecordName.length());
                url.insert(pos, stringify(componentTypeAndRecordName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        configurationComponentTypeGet(
            
            std::string componentType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/configuration/{component_type}"; //componentType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_componentType("{");
                s_componentType.append("component_type");
                s_componentType.append("}");

                int pos = url.find(s_componentType);

                url.erase(pos, s_componentType.length());
                url.insert(pos, stringify(componentType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/configuration/{object_name_and_object_type}"; //objectNameAndObjectType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_objectNameAndObjectType("{");
                s_objectNameAndObjectType.append("object_name_and_object_type");
                s_objectNameAndObjectType.append("}");

                int pos = url.find(s_objectNameAndObjectType);

                url.erase(pos, s_objectNameAndObjectType.length());
                url.insert(pos, stringify(objectNameAndObjectType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        configurationObjecttypeGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/configuration/Objecttype"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        configurationRoleAssignmentRuleDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/configuration/role_assignment_rule"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/configuration/role_assignment_rule"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | lifecycleV roleV productV countryV studyV studyCountryV 
            addQueryParam("lifecycle__v",lifecycleV);
            addQueryParam("role__v",roleV);
            addQueryParam("product__v",productV);
            addQueryParam("country__v",countryV);
            addQueryParam("study__v",studyV);
            addQueryParam("study_country__v",studyCountryV);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        configurationRoleAssignmentRulePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/configuration/role_assignment_rule"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        configurationRoleAssignmentRulePut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/configuration/role_assignment_rule"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        delegationLoginPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/delegation/login"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        delegationVaultsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/delegation/vaults"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        keepAlivePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/keep-alive"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        limitsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/limits"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/logs/api_usage"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | date logFormat 
            addQueryParam("date",date);
            addQueryParam("log_format",logFormat);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/logs/code/debug"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | userId includeInactive 
            addQueryParam("user_id",userId);
            addQueryParam("include_inactive",includeInactive);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        logsCodeDebugIdActionsResetDelete(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/logs/code/debug/{id}/actions/reset"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        logsCodeDebugIdActionsResetPost(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/logs/code/debug/{id}/actions/reset"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        logsCodeDebugIdFilesGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/logs/code/debug/{id}/files"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        logsCodeDebugIdGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/logs/code/debug/{id}"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        logsCodeDebugPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/logs/code/debug"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/logs/code/runtime"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | date logFormat 
            addQueryParam("date",date);
            addQueryParam("log_format",logFormat);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        messagesMessageTypeActionsImportPost(
            
            std::string messageType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/messages/{message_type}/actions/import"; //messageType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_messageType("{");
                s_messageType.append("message_type");
                s_messageType.append("}");

                int pos = url.find(s_messageType);

                url.erase(pos, s_messageType.length());
                url.insert(pos, stringify(messageType));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/messages/{message_type}/language/{lang}/actions/export"; //messageType lang 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_messageType("{");
                s_messageType.append("message_type");
                s_messageType.append("}");

                int pos = url.find(s_messageType);

                url.erase(pos, s_messageType.length());
                url.insert(pos, stringify(messageType));
                std::string s_lang("{");
                s_lang.append("lang");
                s_lang.append("}");

                int pos = url.find(s_lang);

                url.erase(pos, s_lang.length());
                url.insert(pos, stringify(lang));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataAudittrailAuditTrailTypeGet(
            
            std::string auditTrailType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/audittrail/{audit_trail_type}"; //auditTrailType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_auditTrailType("{");
                s_auditTrailType.append("audit_trail_type");
                s_auditTrailType.append("}");

                int pos = url.find(s_auditTrailType);

                url.erase(pos, s_auditTrailType.length());
                url.insert(pos, stringify(auditTrailType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataAudittrailGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/audittrail"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataComponentsComponentTypeGet(
            
            std::string componentType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/components/{component_type}"; //componentType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_componentType("{");
                s_componentType.append("component_type");
                s_componentType.append("}");

                int pos = url.find(s_componentType);

                url.erase(pos, s_componentType.length());
                url.insert(pos, stringify(componentType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataComponentsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/components"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsBindersTemplatesBindernodesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/binders/templates/bindernodes"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsBindersTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/binders/templates"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(
            
            std::string placemarkType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/annotations/placemarks/types/{placemark_type}"; //placemarkType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_placemarkType("{");
                s_placemarkType.append("placemark_type");
                s_placemarkType.append("}");

                int pos = url.find(s_placemarkType);

                url.erase(pos, s_placemarkType.length());
                url.insert(pos, stringify(placemarkType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(
            
            std::string referenceType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/annotations/references/types/{reference_type}"; //referenceType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_referenceType("{");
                s_referenceType.append("reference_type");
                s_referenceType.append("}");

                int pos = url.find(s_referenceType);

                url.erase(pos, s_referenceType.length());
                url.insert(pos, stringify(referenceType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(
            
            std::string annotationType
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/annotations/types/{annotation_type}"; //annotationType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_annotationType("{");
                s_annotationType.append("annotation_type");
                s_annotationType.append("}");

                int pos = url.find(s_annotationType);

                url.erase(pos, s_annotationType.length());
                url.insert(pos, stringify(annotationType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/events/{event_type}/types/{event_subtype}"; //eventType eventSubtype 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_eventType("{");
                s_eventType.append("event_type");
                s_eventType.append("}");

                int pos = url.find(s_eventType);

                url.erase(pos, s_eventType.length());
                url.insert(pos, stringify(eventType));
                std::string s_eventSubtype("{");
                s_eventSubtype.append("event_subtype");
                s_eventSubtype.append("}");

                int pos = url.find(s_eventSubtype);

                url.erase(pos, s_eventSubtype.length());
                url.insert(pos, stringify(eventSubtype));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsEventsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/events"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsLockGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/lock"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsPropertiesFindCommonPost(
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/properties/find_common"; //


            // Headers  |  contentType  accept  authorization  xVaultAPIClientID 
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsPropertiesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/properties"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/templates"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsTypesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/types"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsTypesTypeGet(
            
            std::string type
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/types/{type}"; //type 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsDocumentsTypesTypeRelationshipsGet(
            
            std::string type
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/types/{type}/relationships"; //type 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}"; //type subtype classification 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));
                std::string s_subtype("{");
                s_subtype.append("subtype");
                s_subtype.append("}");

                int pos = url.find(s_subtype);

                url.erase(pos, s_subtype.length());
                url.insert(pos, stringify(subtype));
                std::string s_classification("{");
                s_classification.append("classification");
                s_classification.append("}");

                int pos = url.find(s_classification);

                url.erase(pos, s_classification.length());
                url.insert(pos, stringify(classification));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/metadata/objects/documents/types/{type}/subtypes/{subtype}"; //type subtype 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));
                std::string s_subtype("{");
                s_subtype.append("subtype");
                s_subtype.append("}");

                int pos = url.find(s_subtype);

                url.erase(pos, s_subtype.length());
                url.insert(pos, stringify(subtype));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsGroupsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/groups"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsSecuritypoliciesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/securitypolicies"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataObjectsUsersGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/objects/users"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/query/archived_documents/relationships/document_signature__sysr"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/query/documents/relationships/document_signature__sysr"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataVobjectsGet(
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/vobjects"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataVobjectsObjectNameActionsCanceldeploymentPost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/vobjects/{object_name}/actions/canceldeployment"; //objectName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/metadata/vobjects/{object_name}/fields/{object_field_name}"; //objectName objectFieldName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectFieldName("{");
                s_objectFieldName.append("object_field_name");
                s_objectFieldName.append("}");

                int pos = url.find(s_objectFieldName);

                url.erase(pos, s_objectFieldName.length());
                url.insert(pos, stringify(objectFieldName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/metadata/vobjects/{object_name}"; //objectName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        metadataVobjectsObjectNamePageLayoutsGet(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/metadata/vobjects/{object_name}/page_layouts"; //objectName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/metadata/vobjects/{object_name}/page_layouts/{layout_name}"; //objectName layoutName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_layoutName("{");
                s_layoutName.append("layout_name");
                s_layoutName.append("}");

                int pos = url.find(s_layoutName);

                url.erase(pos, s_layoutName.length());
                url.insert(pos, stringify(layoutName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/notifications/histories"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate allDates formatResult limit offset 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("all_dates",allDates);
            addQueryParam("format_result",formatResult);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectWorkflowActionsActionGet(
            
            std::string action
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/object/workflow/actions/{action}"; //action 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_action("{");
                s_action.append("action");
                s_action.append("}");

                int pos = url.find(s_action);

                url.erase(pos, s_action.length());
                url.insert(pos, stringify(action));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/object/workflow/actions/{action}"; //action 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_action("{");
                s_action.append("action");
                s_action.append("}");

                int pos = url.find(s_action);

                url.erase(pos, s_action.length());
                url.insert(pos, stringify(action));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectWorkflowActionsCanceltasksPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/object/workflow/actions/canceltasks"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectWorkflowActionsCancelworkflowsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/object/workflow/actions/cancelworkflows"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectWorkflowActionsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/object/workflow/actions"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectWorkflowActionsReassigntasksPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/object/workflow/actions/reassigntasks"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectWorkflowActionsReplaceworkflowownerPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/object/workflow/actions/replaceworkflowowner"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersActionsExportJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/actions/export/{job_id}/results"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/actions/export"; //binderId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | source renditiontype docversion attachments r_export docfield 
            addQueryParam("source",source);
            addQueryParam("renditiontype",renditiontype);
            addQueryParam("docversion",docversion);
            addQueryParam("attachments",attachments);
            addQueryParam("export",r_export);
            addQueryParam("docfield",docfield);

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/actions"; //binderId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/binding_rule"; //binderId 


            // Headers  |  contentType  accept  authorization  xVaultAPIClientID 
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersBinderIdDelete(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}"; //binderId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/documents/{node_id}/binding_rule"; //binderId nodeId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_nodeId("{");
                s_nodeId.append("node_id");
                s_nodeId.append("}");

                int pos = url.find(s_nodeId);

                url.erase(pos, s_nodeId.length());
                url.insert(pos, stringify(nodeId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/documents"; //binderId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/documents/{section_id}"; //binderId sectionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/documents/{section_id}"; //binderId sectionId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}"; //binderId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | depth 
            addQueryParam("depth",depth);

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersBinderIdPost(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}"; //binderId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}"; //binderId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}"; //binderId roleNameAndUserOrGroup id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_roleNameAndUserOrGroup("{");
                s_roleNameAndUserOrGroup.append("role_name_and_user_or_group");
                s_roleNameAndUserOrGroup.append("}");

                int pos = url.find(s_roleNameAndUserOrGroup);

                url.erase(pos, s_roleNameAndUserOrGroup.length());
                url.insert(pos, stringify(roleNameAndUserOrGroup));
                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/sections/{node_id}/binding_rule"; //binderId nodeId 


            // Headers  |  contentType  accept  authorization  xVaultAPIClientID 
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_nodeId("{");
                s_nodeId.append("node_id");
                s_nodeId.append("}");

                int pos = url.find(s_nodeId);

                url.erase(pos, s_nodeId.length());
                url.insert(pos, stringify(nodeId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/sections/{node_id}"; //binderId nodeId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_nodeId("{");
                s_nodeId.append("node_id");
                s_nodeId.append("}");

                int pos = url.find(s_nodeId);

                url.erase(pos, s_nodeId.length());
                url.insert(pos, stringify(nodeId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/sections"; //binderId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/sections/{section_id}"; //binderId sectionId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/sections/{section_id}"; //binderId sectionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersBinderIdVersionsGet(
            
            std::string binderId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions"; //binderId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export"; //binderId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | source renditiontype docversion attachments r_export docfield 
            addQueryParam("source",source);
            addQueryParam("renditiontype",renditiontype);
            addQueryParam("docversion",docversion);
            addQueryParam("attachments",attachments);
            addQueryParam("export",r_export);
            addQueryParam("docfield",docfield);

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}"; //binderId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}"; //binderId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}"; //binderId majorVersion minorVersion 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships"; //binderId majorVersion minorVersion 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}"; //binderId majorVersion minorVersion relationshipId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_relationshipId("{");
                s_relationshipId.append("relationship_id");
                s_relationshipId.append("}");

                int pos = url.find(s_relationshipId);

                url.erase(pos, s_relationshipId.length());
                url.insert(pos, stringify(relationshipId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}"; //binderId majorVersion minorVersion relationshipId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_relationshipId("{");
                s_relationshipId.append("relationship_id");
                s_relationshipId.append("}");

                int pos = url.find(s_relationshipId);

                url.erase(pos, s_relationshipId.length());
                url.insert(pos, stringify(relationshipId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}"; //binderId majorVersion minorVersion sectionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_binderId("{");
                s_binderId.append("binder_id");
                s_binderId.append("}");

                int pos = url.find(s_binderId);

                url.erase(pos, s_binderId.length());
                url.insert(pos, stringify(binderId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersIdRolesGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/{id}/roles"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{id}/roles"; //id 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{id}/roles/{role_name}"; //id roleName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_roleName("{");
                s_roleName.append("role_name");
                s_roleName.append("}");

                int pos = url.find(s_roleName);

                url.erase(pos, s_roleName.length());
                url.insert(pos, stringify(roleName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions"; //id majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements"; //id majorVersion minorVersion nameV 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_nameV("{");
                s_nameV.append("name__v");
                s_nameV.append("}");

                int pos = url.find(s_nameV);

                url.erase(pos, s_nameV.length());
                url.insert(pos, stringify(nameV));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}"; //id majorVersion minorVersion nameV 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_nameV("{");
                s_nameV.append("name__v");
                s_nameV.append("}");

                int pos = url.find(s_nameV);

                url.erase(pos, s_nameV.length());
                url.insert(pos, stringify(nameV));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersLifecycleActionsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/lifecycle_actions"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/lifecycle_actions/{user_action_name}"; //userActionName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_userActionName("{");
                s_userActionName.append("user_action_name");
                s_userActionName.append("}");

                int pos = url.find(s_userActionName);

                url.erase(pos, s_userActionName.length());
                url.insert(pos, stringify(userActionName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | async 
            addQueryParam("async",async);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/templates"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersTemplatesPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/templates"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersTemplatesPut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/templates"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersTemplatesTemplateNameBindernodesGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/templates/{template_name}/bindernodes"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/templates/{template_name}/bindernodes"; //templateName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/binders/templates/{template_name}/bindernodes"; //templateName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersTemplatesTemplateNameDelete(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/templates/{template_name}"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsBindersTemplatesTemplateNameGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/binders/templates/{template_name}"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/deletions/documents"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDeletionsVobjectsObjectNameGet(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/deletions/vobjects/{object_name}"; //objectName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsActionsGet(
            
            bool loc
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/actions"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results"; //lifecycleAndStateAndAction jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_lifecycleAndStateAndAction("{");
                s_lifecycleAndStateAndAction.append("lifecycle_and_state_and_action");
                s_lifecycleAndStateAndAction.append("}");

                int pos = url.find(s_lifecycleAndStateAndAction);

                url.erase(pos, s_lifecycleAndStateAndAction.length());
                url.insert(pos, stringify(lifecycleAndStateAndAction));
                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/actions/{workflow_name}"; //workflowName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_workflowName("{");
                s_workflowName.append("workflow_name");
                s_workflowName.append("}");

                int pos = url.find(s_workflowName);

                url.erase(pos, s_workflowName.length());
                url.insert(pos, stringify(workflowName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/actions/{workflow_name}"; //workflowName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_workflowName("{");
                s_workflowName.append("workflow_name");
                s_workflowName.append("}");

                int pos = url.find(s_workflowName);

                url.erase(pos, s_workflowName.length());
                url.insert(pos, stringify(workflowName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAnnotationsBatchDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/annotations/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAnnotationsBatchPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/annotations/batch"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAnnotationsBatchPut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/annotations/batch"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAnnotationsRepliesBatchPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/annotations/replies/batch"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAttachmentsBatchDelete(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/attachments/batch"; //


            // Headers  |  accept  authorization  contentType  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAttachmentsBatchPost(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/attachments/batch"; //


            // Headers  |  accept  authorization  contentType  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsAttachmentsBatchPut(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/attachments/batch"; //


            // Headers  |  accept  authorization  contentType  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsBatchActionsFileextractJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/batch/actions/fileextract/{job_id}/results"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/batch/actions/fileextract"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | source renditions allversions 
            addQueryParam("source",source);
            addQueryParam("renditions",renditions);
            addQueryParam("allversions",allversions);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/batch/actions/reclassify"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsBatchActionsRerenderPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/batch/actions/rerender"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | idParam 
            addQueryParam("idParam",idParam);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsBatchLockDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/batch/lock"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdAnchorsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/anchors"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdAnnotationsFileGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/annotations/file"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/annotations/file"; //docId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}"; //docId attachmentId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}/file"; //docId attachmentId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}"; //docId attachmentId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}"; //docId attachmentId 


            // Headers  |  accept  authorization  contentType  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}"; //docId attachmentId attachmentVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file"; //docId attachmentId attachmentVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}"; //docId attachmentId attachmentVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}"; //docId attachmentId attachmentVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | restore 
            addQueryParam("restore",restore);

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/{attachment_id}/versions"; //docId attachmentId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdAttachmentsFileGet(
            
            std::string docId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments/file"; //docId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdAttachmentsGet(
            
            std::string docId
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments"; //docId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/attachments"; //docId 


            // Headers  |  accept  authorization  contentType  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/audittrail"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate formatResult limit offset events 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("format_result",formatResult);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("events",events);

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdDelete(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdEventsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/events"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/file"; //docId 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | lockDocument 
            addQueryParam("lockDocument",lockDocument);

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdLockDelete(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/lock"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdLockGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/lock"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdLockPost(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/lock"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file"; //docId majorVersion minorVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}"; //docId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | suppressRendition 
            addQueryParam("suppressRendition",suppressRendition);

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}"; //docId 


            // Headers  |  authorization  contentType  accept  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdRenditionsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/renditions"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/renditions/{rendition_type}"; //docId renditionType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/renditions/{rendition_type}"; //docId renditionType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | steadyState 
            addQueryParam("steadyState",steadyState);

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/renditions/{rendition_type}"; //docId renditionType 


            // Headers  |  authorization  accept  content_Type  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content Type",content_Type);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/renditions/{rendition_type}"; //docId renditionType 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}"; //docId roleNameAndUserOrGroup id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_roleNameAndUserOrGroup("{");
                s_roleNameAndUserOrGroup.append("role_name_and_user_or_group");
                s_roleNameAndUserOrGroup.append("}");

                int pos = url.find(s_roleNameAndUserOrGroup);

                url.erase(pos, s_roleNameAndUserOrGroup.length());
                url.insert(pos, stringify(roleNameAndUserOrGroup));
                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments"; //docId majorVersion minorVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsDocIdVersionsGet(
            
            std::string docId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions"; //docId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}"; //docId majorVersion minorVersion annotationId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_annotationId("{");
                s_annotationId.append("annotation_id");
                s_annotationId.append("}");

                int pos = url.find(s_annotationId);

                url.erase(pos, s_annotationId.length());
                url.insert(pos, stringify(annotationId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies"; //docId majorVersion minorVersion annotationId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_annotationId("{");
                s_annotationId.append("annotation_id");
                s_annotationId.append("}");

                int pos = url.find(s_annotationId);

                url.erase(pos, s_annotationId.length());
                url.insert(pos, stringify(annotationId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | limit offset annotationTypes paginationId 
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("annotation_types",annotationTypes);
            addQueryParam("pagination_id",paginationId);

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file"; //docId majorVersion minorVersion attachmentId attachmentVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}"; //docId majorVersion minorVersion attachmentId attachmentVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file"; //docId majorVersion minorVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}"; //docId majorVersion minorVersion 


            // Headers  |  authorization  contentType  accept  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}"; //docId majorVersion minorVersion relationshipId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_relationshipId("{");
                s_relationshipId.append("relationship_id");
                s_relationshipId.append("}");

                int pos = url.find(s_relationshipId);

                url.erase(pos, s_relationshipId.length());
                url.insert(pos, stringify(relationshipId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}"; //docId majorVersion minorVersion relationshipId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_relationshipId("{");
                s_relationshipId.append("relationship_id");
                s_relationshipId.append("}");

                int pos = url.find(s_relationshipId);

                url.erase(pos, s_relationshipId.length());
                url.insert(pos, stringify(relationshipId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions"; //docId majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}"; //docId majorVersion minorVersion renditionType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}"; //docId majorVersion minorVersion renditionType 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}"; //docId majorVersion minorVersion renditionType 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}"; //docId majorVersion minorVersion renditionType 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_renditionType("{");
                s_renditionType.append("rendition_type");
                s_renditionType.append("}");

                int pos = url.find(s_renditionType);

                url.erase(pos, s_renditionType.length());
                url.insert(pos, stringify(renditionType));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail"; //docId majorVersion minorVersion 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_docId("{");
                s_docId.append("doc_id");
                s_docId.append("}");

                int pos = url.find(s_docId);

                url.erase(pos, s_docId.length());
                url.insert(pos, stringify(docId));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | namedFilter scope versionscope search limit sort start 
            addQueryParam("named_filter",namedFilter);
            addQueryParam("scope",scope);
            addQueryParam("versionscope",versionscope);
            addQueryParam("search",search);
            addQueryParam("limit",limit);
            addQueryParam("sort",sort);
            addQueryParam("start",start);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsIdRolesGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/{id}/roles"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{id}/roles"; //id 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{id}/roles/{role_name}"; //id roleName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_roleName("{");
                s_roleName.append("role_name");
                s_roleName.append("}");

                int pos = url.find(s_roleName);

                url.erase(pos, s_roleName.length());
                url.insert(pos, stringify(roleName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions"; //id majorVersion minorVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements"; //id majorVersion minorVersion nameV 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_nameV("{");
                s_nameV.append("name__v");
                s_nameV.append("}");

                int pos = url.find(s_nameV);

                url.erase(pos, s_nameV.length());
                url.insert(pos, stringify(nameV));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}"; //id majorVersion minorVersion nameV 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_majorVersion("{");
                s_majorVersion.append("major_version");
                s_majorVersion.append("}");

                int pos = url.find(s_majorVersion);

                url.erase(pos, s_majorVersion.length());
                url.insert(pos, stringify(majorVersion));
                std::string s_minorVersion("{");
                s_minorVersion.append("minor_version");
                s_minorVersion.append("}");

                int pos = url.find(s_minorVersion);

                url.erase(pos, s_minorVersion.length());
                url.insert(pos, stringify(minorVersion));
                std::string s_nameV("{");
                s_nameV.append("name__v");
                s_nameV.append("}");

                int pos = url.find(s_nameV);

                url.erase(pos, s_nameV.length());
                url.insert(pos, stringify(nameV));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsLifecycleActionsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/lifecycle_actions"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/lifecycle_actions/{user_action_name}"; //userActionName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_userActionName("{");
                s_userActionName.append("user_action_name");
                s_userActionName.append("}");

                int pos = url.find(s_userActionName);

                url.erase(pos, s_userActionName.length());
                url.insert(pos, stringify(userActionName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            bool xVaultAPIMigrationMode
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents"; //


            // Headers  |  authorization  accept  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsRelationshipsBatchDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/relationships/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsRelationshipsBatchPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/relationships/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsRenditionsBatchDelete(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/renditions/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/renditions/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | idParam largeSizeAsset 
            addQueryParam("idParam",idParam);
            addQueryParam("largeSizeAsset",largeSizeAsset);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsRolesBatchDelete(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/roles/batch"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsRolesBatchPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/roles/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesPut(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesTemplateNameDelete(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates/{template_name}"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesTemplateNameFileGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates/{template_name}/file"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesTemplateNameGet(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates/{template_name}"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTemplatesTemplateNamePut(
            
            std::string templateName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/templates/{template_name}"; //templateName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_templateName("{");
                s_templateName.append("template_name");
                s_templateName.append("}");

                int pos = url.find(s_templateName);

                url.erase(pos, s_templateName.length());
                url.insert(pos, stringify(templateName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDocumentsTokensPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/documents/tokens"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/versions/batch/actions/fileextract"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | source renditions 
            addQueryParam("source",source);
            addQueryParam("renditions",renditions);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/versions/batch"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | idParam 
            addQueryParam("idParam",idParam);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/documents/versions/batch"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIMigrationMode  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | idParam 
            addQueryParam("idParam",idParam);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/domain"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | includeApplication 
            addQueryParam("include_application",includeApplication);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsDomainsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/domains"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsEdlMatchedDocumentsBatchActionsAddPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/edl_matched_documents/batch/actions/add"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsEdlMatchedDocumentsBatchActionsRemovePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/edl_matched_documents/batch/actions/remove"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/groups/auto"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | limit offset 
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsGroupsGet(
            
            std::string includeImplied
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/groups"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | includeImplied 
            addQueryParam("includeImplied",includeImplied);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsGroupsGroupIdDelete(
            
            std::string groupId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/groups/{group_id}"; //groupId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_groupId("{");
                s_groupId.append("group_id");
                s_groupId.append("}");

                int pos = url.find(s_groupId);

                url.erase(pos, s_groupId.length());
                url.insert(pos, stringify(groupId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/groups/{group_id}"; //groupId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | includeImplied 
            addQueryParam("includeImplied",includeImplied);

            // Form     | 



                std::string s_groupId("{");
                s_groupId.append("group_id");
                s_groupId.append("}");

                int pos = url.find(s_groupId);

                url.erase(pos, s_groupId.length());
                url.insert(pos, stringify(groupId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/groups/{group_id}"; //groupId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_groupId("{");
                s_groupId.append("group_id");
                s_groupId.append("}");

                int pos = url.find(s_groupId);

                url.erase(pos, s_groupId.length());
                url.insert(pos, stringify(groupId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsGroupsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/groups"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsLicensesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/licenses"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsObjectworkflowsActionsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/actions"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsObjectworkflowsActionsWorkflowNameGet(
            
            std::string workflowName
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/actions/{workflow_name}"; //workflowName 


            // Headers  |  authorization  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_workflowName("{");
                s_workflowName.append("workflow_name");
                s_workflowName.append("}");

                int pos = url.find(s_workflowName);

                url.erase(pos, s_workflowName.length());
                url.insert(pos, stringify(workflowName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/actions/{workflow_name}"; //workflowName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_workflowName("{");
                s_workflowName.append("workflow_name");
                s_workflowName.append("}");

                int pos = url.find(s_workflowName);

                url.erase(pos, s_workflowName.length());
                url.insert(pos, stringify(workflowName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | objectV recordIdV participant statusV offset pageSize loc 
            addQueryParam("object__v",objectV);
            addQueryParam("record_id__v",recordIdV);
            addQueryParam("participant",participant);
            addQueryParam("status__v",statusV);
            addQueryParam("offset",offset);
            addQueryParam("page_size",pageSize);
            addQueryParam("loc",loc);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | objectV recordIdV assigneeV statusV offset pageSize loc 
            addQueryParam("object__v",objectV);
            addQueryParam("record_id__v",recordIdV);
            addQueryParam("assignee__v",assigneeV);
            addQueryParam("status__v",statusV);
            addQueryParam("offset",offset);
            addQueryParam("page_size",pageSize);
            addQueryParam("loc",loc);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/accept"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/cancel"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/complete"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsObjectworkflowsTasksTaskIdActionsGet(
            
            std::string taskId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions"; //taskId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/reassign"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/{task_action}"; //taskId taskAction 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));
                std::string s_taskAction("{");
                s_taskAction.append("task_action");
                s_taskAction.append("}");

                int pos = url.find(s_taskAction);

                url.erase(pos, s_taskAction.length());
                url.insert(pos, stringify(taskAction));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/undoaccept"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}/actions/updateduedate"; //taskId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/tasks/{task_id}"; //taskId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/{workflow_id}/actions"; //workflowId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_workflowId("{");
                s_workflowId.append("workflow_id");
                s_workflowId.append("}");

                int pos = url.find(s_workflowId);

                url.erase(pos, s_workflowId.length());
                url.insert(pos, stringify(workflowId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}"; //workflowId workflowAction 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_workflowId("{");
                s_workflowId.append("workflow_id");
                s_workflowId.append("}");

                int pos = url.find(s_workflowId);

                url.erase(pos, s_workflowId.length());
                url.insert(pos, stringify(workflowId));
                std::string s_workflowAction("{");
                s_workflowAction.append("workflow_action");
                s_workflowAction.append("}");

                int pos = url.find(s_workflowAction);

                url.erase(pos, s_workflowAction.length());
                url.insert(pos, stringify(workflowAction));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}"; //workflowId workflowAction 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | documentsSys 
            addQueryParam("documents__sys",documentsSys);

            // Form     | 



                std::string s_workflowId("{");
                s_workflowId.append("workflow_id");
                s_workflowId.append("}");

                int pos = url.find(s_workflowId);

                url.erase(pos, s_workflowId.length());
                url.insert(pos, stringify(workflowId));
                std::string s_workflowAction("{");
                s_workflowAction.append("workflow_action");
                s_workflowAction.append("}");

                int pos = url.find(s_workflowAction);

                url.erase(pos, s_workflowAction.length());
                url.insert(pos, stringify(workflowAction));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/objectworkflows/{workflow_id}"; //workflowId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_workflowId("{");
                s_workflowId.append("workflow_id");
                s_workflowId.append("}");

                int pos = url.find(s_workflowId);

                url.erase(pos, s_workflowId.length());
                url.insert(pos, stringify(workflowId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsPicklistsGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/picklists"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsPicklistsPicklistNameGet(
            
            std::string picklistName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/picklists/{picklist_name}"; //picklistName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_picklistName("{");
                s_picklistName.append("picklist_name");
                s_picklistName.append("}");

                int pos = url.find(s_picklistName);

                url.erase(pos, s_picklistName.length());
                url.insert(pos, stringify(picklistName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/picklists/{picklist_name}/{picklist_value_name}"; //picklistName picklistValueName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_picklistName("{");
                s_picklistName.append("picklist_name");
                s_picklistName.append("}");

                int pos = url.find(s_picklistName);

                url.erase(pos, s_picklistName.length());
                url.insert(pos, stringify(picklistName));
                std::string s_picklistValueName("{");
                s_picklistValueName.append("picklist_value_name");
                s_picklistValueName.append("}");

                int pos = url.find(s_picklistValueName);

                url.erase(pos, s_picklistValueName.length());
                url.insert(pos, stringify(picklistValueName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/picklists/{picklist_name}/{picklist_value_name}"; //picklistName picklistValueName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_picklistName("{");
                s_picklistName.append("picklist_name");
                s_picklistName.append("}");

                int pos = url.find(s_picklistName);

                url.erase(pos, s_picklistName.length());
                url.insert(pos, stringify(picklistName));
                std::string s_picklistValueName("{");
                s_picklistValueName.append("picklist_value_name");
                s_picklistValueName.append("}");

                int pos = url.find(s_picklistValueName);

                url.erase(pos, s_picklistValueName.length());
                url.insert(pos, stringify(picklistValueName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/picklists/{picklist_name}"; //picklistName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_picklistName("{");
                s_picklistName.append("picklist_name");
                s_picklistName.append("}");

                int pos = url.find(s_picklistName);

                url.erase(pos, s_picklistName.length());
                url.insert(pos, stringify(picklistName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/picklists/{picklist_name}"; //picklistName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_picklistName("{");
                s_picklistName.append("picklist_name");
                s_picklistName.append("}");

                int pos = url.find(s_picklistName);

                url.erase(pos, s_picklistName.length());
                url.insert(pos, stringify(picklistName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxActionsBuildproductionPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/actions/buildproduction"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxActionsPromoteproductionPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/actions/promoteproduction"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxActionsRecheckusagePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/actions/recheckusage"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxBatchChangesizePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/batch/changesize"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxEntitlementsSetPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/entitlements/set"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxNameDelete(
            
            std::string name
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/{name}"; //name 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxSnapshotApiNameActionsUpdatePost(
            
            std::string apiName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/snapshot/{api_name}/actions/update"; //apiName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_apiName("{");
                s_apiName.append("api_name");
                s_apiName.append("}");

                int pos = url.find(s_apiName);

                url.erase(pos, s_apiName.length());
                url.insert(pos, stringify(apiName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxSnapshotApiNameActionsUpgradePost(
            
            std::string apiName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/snapshot/{api_name}/actions/upgrade"; //apiName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_apiName("{");
                s_apiName.append("api_name");
                s_apiName.append("}");

                int pos = url.find(s_apiName);

                url.erase(pos, s_apiName.length());
                url.insert(pos, stringify(apiName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxSnapshotApiNameDelete(
            
            std::string apiName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/snapshot/{api_name}"; //apiName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_apiName("{");
                s_apiName.append("api_name");
                s_apiName.append("}");

                int pos = url.find(s_apiName);

                url.erase(pos, s_apiName.length());
                url.insert(pos, stringify(apiName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxSnapshotGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/snapshot"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxSnapshotPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/snapshot"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/sandbox/{vault_id}/actions/refresh"; //vaultId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_vaultId("{");
                s_vaultId.append("vault_id");
                s_vaultId.append("}");

                int pos = url.find(s_vaultId);

                url.erase(pos, s_vaultId.length());
                url.insert(pos, stringify(vaultId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSandboxVaultIdGet(
            
            std::string vaultId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/sandbox/{vault_id}"; //vaultId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_vaultId("{");
                s_vaultId.append("vault_id");
                s_vaultId.append("}");

                int pos = url.find(s_vaultId);

                url.erase(pos, s_vaultId.length());
                url.insert(pos, stringify(vaultId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSecuritypoliciesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/securitypolicies"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsSecuritypoliciesSecurityPolicyNameGet(
            
            std::string securityPolicyName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/securitypolicies/{security_policy_name}"; //securityPolicyName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_securityPolicyName("{");
                s_securityPolicyName.append("security_policy_name");
                s_securityPolicyName.append("}");

                int pos = url.find(s_securityPolicyName);

                url.erase(pos, s_securityPolicyName.length());
                url.insert(pos, stringify(securityPolicyName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/users/"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | vaults excludeVaultMembership excludeAppLicensing 
            addQueryParam("vaults",vaults);
            addQueryParam("exclude_vault_membership",excludeVaultMembership);
            addQueryParam("exclude_app_licensing",excludeAppLicensing);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/users/{id}"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | excludeVaultMembership excludeAppLicensing 
            addQueryParam("exclude_vault_membership",excludeVaultMembership);
            addQueryParam("exclude_app_licensing",excludeAppLicensing);

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/users/{id}/permissions"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | filter 
            addQueryParam("filter",filter);

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsUsersIdPut(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/users/{id}"; //id 


            // Headers  |  authorization  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/users/me"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | excludeVaultMembership excludeAppLicensing 
            addQueryParam("exclude_vault_membership",excludeVaultMembership);
            addQueryParam("exclude_app_licensing",excludeAppLicensing);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsUsersMePasswordPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/users/me/password"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsUsersMePermissionsGet(
            
            std::string filter
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/users/me/permissions"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | filter 
            addQueryParam("filter",filter);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsUsersMePut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/users/me"; //


            // Headers  |  authorization  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsUsersPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/users"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsUsersPut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/users"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/users/{user_id}"; //userId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | domain 
            addQueryParam("domain",domain);

            // Form     | 



                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/objects/users/{user_id}/vault_membership/{vault_id}"; //userId vaultId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));
                std::string s_vaultId("{");
                s_vaultId.append("vault_id");
                s_vaultId.append("}");

                int pos = url.find(s_vaultId);

                url.erase(pos, s_vaultId.length());
                url.insert(pos, stringify(vaultId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsVaultActionsComparePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/vault/actions/compare"; //


            // Headers  |  authorization  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        objectsVaultActionsConfigreportPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/objects/vault/actions/configreport"; //


            // Headers  |  authorization  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        queryComponentsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/query/components"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/query/{next_page}"; //nextPage 


            // Headers  |  authorization  accept  xVaultAPIDescribeQuery  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-DescribeQuery",xVaultAPIDescribeQuery);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_nextPage("{");
                s_nextPage.append("next_page");
                s_nextPage.append("}");

                int pos = url.find(s_nextPage);

                url.erase(pos, s_nextPage.length());
                url.insert(pos, stringify(nextPage));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/query"; //


            // Headers  |  authorization  accept  xVaultAPIDescribeQuery  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-DescribeQuery",xVaultAPIDescribeQuery);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/query/{previous_page}"; //previousPage 


            // Headers  |  authorization  accept  xVaultAPIDescribeQuery  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-DescribeQuery",xVaultAPIDescribeQuery);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_previousPage("{");
                s_previousPage.append("previous_page");
                s_previousPage.append("}");

                int pos = url.find(s_previousPage);

                url.erase(pos, s_previousPage.length());
                url.insert(pos, stringify(previousPage));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/Me"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | attributes excludedAttributes 
            addQueryParam("attributes",attributes);
            addQueryParam("excludedAttributes",excludedAttributes);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/Me"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | attributes excludedAttributes 
            addQueryParam("attributes",attributes);
            addQueryParam("excludedAttributes",excludedAttributes);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        scimV2ResourceTypesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/scim/v2/ResourceTypes"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        scimV2ResourceTypesTypeGet(
            
            std::string type
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/scim/v2/ResourceTypes/{type}"; //type 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        scimV2SchemasGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/scim/v2/Schemas"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        scimV2SchemasIdGet(
            
            std::string id
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/scim/v2/Schemas/{id}"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        scimV2ServiceProviderConfigGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/scim/v2/ServiceProviderConfig"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/{type}"; //type 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | filter attributes excludedAttributes sortBy sortOrder startIndex 
            addQueryParam("filter",filter);
            addQueryParam("attributes",attributes);
            addQueryParam("excludedAttributes",excludedAttributes);
            addQueryParam("sortBy",sortBy);
            addQueryParam("sortOrder",sortOrder);
            addQueryParam("startIndex",startIndex);

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/{type}/{id}"; //type id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | attributes excludedAttributes 
            addQueryParam("attributes",attributes);
            addQueryParam("excludedAttributes",excludedAttributes);

            // Form     | 



                std::string s_type("{");
                s_type.append("type");
                s_type.append("}");

                int pos = url.find(s_type);

                url.erase(pos, s_type.length());
                url.insert(pos, stringify(type));
                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/Users"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | filter attributes excludedAttributes sortBy sortOrder count startIndex 
            addQueryParam("filter",filter);
            addQueryParam("attributes",attributes);
            addQueryParam("excludedAttributes",excludedAttributes);
            addQueryParam("sortBy",sortBy);
            addQueryParam("sortOrder",sortOrder);
            addQueryParam("count",count);
            addQueryParam("startIndex",startIndex);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/Users/{id}"; //id 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | filter attributes excludedAttributes 
            addQueryParam("filter",filter);
            addQueryParam("attributes",attributes);
            addQueryParam("excludedAttributes",excludedAttributes);

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/scim/v2/Users/{id}"; //id 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        scimV2UsersPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/scim/v2/Users"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesCertificateCertIdGet(
            
            std::string certId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/certificate/{cert_id}"; //certId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_certId("{");
                s_certId.append("cert_id");
                s_certId.append("}");

                int pos = url.find(s_certId);

                url.erase(pos, s_certId.length());
                url.insert(pos, stringify(certId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesConfigurationModeActionsDisablePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/configuration_mode/actions/disable"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesConfigurationModeActionsEnablePost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/configuration_mode/actions/enable"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/directdata/files"; //


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | extractType startTime stopTime 
            addQueryParam("extract_type",extractType);
            addQueryParam("start_time",startTime);
            addQueryParam("stop_time",stopTime);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesDirectdataFilesNameGet(
            
            std::string name
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/directdata/files/{name}"; //name 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/file_staging/items/content/{item}"; //item 


            // Headers  |  authorization  accept  range  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Range",range);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_item("{");
                s_item.append("item");
                s_item.append("}");

                int pos = url.find(s_item);

                url.erase(pos, s_item.length());
                url.insert(pos, stringify(item));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/file_staging/items/{item}"; //item 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | recursive 
            addQueryParam("recursive",recursive);

            // Form     | 



                std::string s_item("{");
                s_item.append("item");
                s_item.append("}");

                int pos = url.find(s_item);

                url.erase(pos, s_item.length());
                url.insert(pos, stringify(item));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/file_staging/items/{item}"; //item 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | recursive limit formatResult 
            addQueryParam("recursive",recursive);
            addQueryParam("limit",limit);
            addQueryParam("format_result",formatResult);

            // Form     | 



                std::string s_item("{");
                s_item.append("item");
                s_item.append("}");

                int pos = url.find(s_item);

                url.erase(pos, s_item.length());
                url.insert(pos, stringify(item));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingItemsItemPut(
            
            std::string item
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/items/{item}"; //item 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_item("{");
                s_item.append("item");
                s_item.append("}");

                int pos = url.find(s_item);

                url.erase(pos, s_item.length());
                url.insert(pos, stringify(item));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingItemsPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentMD5
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/items"; //


            // Headers  |  authorization  accept  contentMD5  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-MD5",contentMD5);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingUploadGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload/"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingUploadPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingUploadUploadSessionIdDelete(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload/{upload_session_id}"; //uploadSessionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_uploadSessionId("{");
                s_uploadSessionId.append("upload_session_id");
                s_uploadSessionId.append("}");

                int pos = url.find(s_uploadSessionId);

                url.erase(pos, s_uploadSessionId.length());
                url.insert(pos, stringify(uploadSessionId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingUploadUploadSessionIdGet(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload/{upload_session_id}"; //uploadSessionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_uploadSessionId("{");
                s_uploadSessionId.append("upload_session_id");
                s_uploadSessionId.append("}");

                int pos = url.find(s_uploadSessionId);

                url.erase(pos, s_uploadSessionId.length());
                url.insert(pos, stringify(uploadSessionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload/{upload_session_id}/parts"; //uploadSessionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | limit 
            addQueryParam("limit",limit);

            // Form     | 



                std::string s_uploadSessionId("{");
                s_uploadSessionId.append("upload_session_id");
                s_uploadSessionId.append("}");

                int pos = url.find(s_uploadSessionId);

                url.erase(pos, s_uploadSessionId.length());
                url.insert(pos, stringify(uploadSessionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesFileStagingUploadUploadSessionIdPost(
            
            std::string uploadSessionId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload/{upload_session_id}"; //uploadSessionId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_uploadSessionId("{");
                s_uploadSessionId.append("upload_session_id");
                s_uploadSessionId.append("}");

                int pos = url.find(s_uploadSessionId);

                url.erase(pos, s_uploadSessionId.length());
                url.insert(pos, stringify(uploadSessionId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/file_staging/upload/{upload_session_id}"; //uploadSessionId 


            // Headers  |  authorization  accept  contentType  xVaultAPIFilePartNumber  contentMD5  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-FilePartNumber",xVaultAPIFilePartNumber);
            addHeader("Content-MD5",contentMD5);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_uploadSessionId("{");
                s_uploadSessionId.append("upload_session_id");
                s_uploadSessionId.append("}");

                int pos = url.find(s_uploadSessionId);

                url.erase(pos, s_uploadSessionId.length());
                url.insert(pos, stringify(uploadSessionId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/jobs/histories"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate status limit offset 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("status",status);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesJobsJobIdErrorsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/jobs/{job_id}/errors"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesJobsJobIdGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/jobs/{job_id}"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesJobsJobIdSummaryGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/jobs/{job_id}/summary"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesJobsJobIdTasksGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/jobs/{job_id}/tasks"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/jobs/monitors"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate status limit offset 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("status",status);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesJobsStartNowJobIdPost(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/jobs/start_now/{job_id}"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesLoaderExtractPost(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/loader/extract"; //


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/loader/{job_id}/tasks/{task_id}/failurelog"; //jobId taskId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));
                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/loader/{job_id}/tasks/{task_id}/results"; //jobId taskId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));
                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/loader/{job_id}/tasks/{task_id}/results/renditions"; //jobId taskId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));
                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/services/loader/{job_id}/tasks/{task_id}/successlog"; //jobId taskId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));
                std::string s_taskId("{");
                s_taskId.append("task_id");
                s_taskId.append("}");

                int pos = url.find(s_taskId);

                url.erase(pos, s_taskId.length());
                url.insert(pos, stringify(taskId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesLoaderLoadPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/loader/load"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesPackageActionsValidatePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/package/actions/validate"; //


            // Headers  |  authorization  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesPackagePost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/package"; //


            // Headers  |  authorization  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesPackagePut(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/package"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesQueuesGet(
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/queues"; //


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesQueuesQueueNameActionsDisableDeliveryPut(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/queues/{queue_name}/actions/disable_delivery"; //queueName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_queueName("{");
                s_queueName.append("queue_name");
                s_queueName.append("}");

                int pos = url.find(s_queueName);

                url.erase(pos, s_queueName.length());
                url.insert(pos, stringify(queueName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesQueuesQueueNameActionsEnableDeliveryPut(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/queues/{queue_name}/actions/enable_delivery"; //queueName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_queueName("{");
                s_queueName.append("queue_name");
                s_queueName.append("}");

                int pos = url.find(s_queueName);

                url.erase(pos, s_queueName.length());
                url.insert(pos, stringify(queueName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesQueuesQueueNameActionsResetPut(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/queues/{queue_name}/actions/reset"; //queueName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_queueName("{");
                s_queueName.append("queue_name");
                s_queueName.append("}");

                int pos = url.find(s_queueName);

                url.erase(pos, s_queueName.length());
                url.insert(pos, stringify(queueName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesQueuesQueueNameGet(
            
            std::string queueName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/queues/{queue_name}"; //queueName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_queueName("{");
                s_queueName.append("queue_name");
                s_queueName.append("}");

                int pos = url.find(s_queueName);

                url.erase(pos, s_queueName.length());
                url.insert(pos, stringify(queueName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        servicesVobjectVaultPackageVPackageIdActionsValidatePost(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/services/vobject/vault_package__v/{package_id}/actions/validate"; //packageId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_packageId("{");
                s_packageId.append("package_id");
                s_packageId.append("}");

                int pos = url.find(s_packageId);

                url.erase(pos, s_packageId.length());
                url.insert(pos, stringify(packageId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        sessionDelete(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/session"; //


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        uicodeDistributionsDistributionNameCodeGet(
            
            std::string distributionName
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/uicode/distributions/{distribution_name}/code"; //distributionName 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_distributionName("{");
                s_distributionName.append("distribution_name");
                s_distributionName.append("}");

                int pos = url.find(s_distributionName);

                url.erase(pos, s_distributionName.length());
                url.insert(pos, stringify(distributionName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        uicodeDistributionsDistributionNameDelete(
            
            std::string distributionName
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/uicode/distributions/{distribution_name}"; //distributionName 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_distributionName("{");
                s_distributionName.append("distribution_name");
                s_distributionName.append("}");

                int pos = url.find(s_distributionName);

                url.erase(pos, s_distributionName.length());
                url.insert(pos, stringify(distributionName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        uicodeDistributionsDistributionNameGet(
            
            std::string distributionName
            , 
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/uicode/distributions/{distribution_name}"; //distributionName 


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_distributionName("{");
                s_distributionName.append("distribution_name");
                s_distributionName.append("}");

                int pos = url.find(s_distributionName);

                url.erase(pos, s_distributionName.length());
                url.insert(pos, stringify(distributionName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        uicodeDistributionsGet(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/uicode/distributions"; //


            // Headers  |  accept  authorization  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        uicodeDistributionsPost(
            
            std::string accept
            , 
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/uicode/distributions"; //


            // Headers  |  accept  authorization  contentType  xVaultAPIClientID 
            addHeader("Accept",accept);
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobject/vault_package__v/{package_id}/actions/deploy"; //packageId 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_packageId("{");
                s_packageId.append("package_id");
                s_packageId.append("}");

                int pos = url.find(s_packageId);

                url.erase(pos, s_packageId.length());
                url.insert(pos, stringify(packageId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectVaultPackageVPackageIdActionsDeployResultsGet(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobject/vault_package__v/{package_id}/actions/deploy/results"; //packageId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_packageId("{");
                s_packageId.append("package_id");
                s_packageId.append("}");

                int pos = url.find(s_packageId);

                url.erase(pos, s_packageId.length());
                url.insert(pos, stringify(packageId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}"; //objectName jobStatus jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_jobStatus("{");
                s_jobStatus.append("job_status");
                s_jobStatus.append("}");

                int pos = url.find(s_jobStatus);

                url.erase(pos, s_jobStatus.length());
                url.insert(pos, stringify(jobStatus));
                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}"; //objectName jobStatus jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_jobStatus("{");
                s_jobStatus.append("job_status");
                s_jobStatus.append("}");

                int pos = url.find(s_jobStatus);

                url.erase(pos, s_jobStatus.length());
                url.insert(pos, stringify(jobStatus));
                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsEdlItemVActionsCreateplaceholderPost(
            
            std::string authorization
            , 
            
            std::string contentType
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/edl_item__v/actions/createplaceholder"; //


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsMergesJobIdLogGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/merges/{job_id}/log"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsMergesJobIdResultsGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/merges/{job_id}/results"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsMergesJobIdStatusGet(
            
            std::string jobId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/merges/{job_id}/status"; //jobId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_jobId("{");
                s_jobId.append("job_id");
                s_jobId.append("}");

                int pos = url.find(s_jobId);

                url.erase(pos, s_jobId.length());
                url.insert(pos, stringify(jobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/actions/{action_name}"; //objectName actionName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_actionName("{");
                s_actionName.append("action_name");
                s_actionName.append("}");

                int pos = url.find(s_actionName);

                url.erase(pos, s_actionName.length());
                url.insert(pos, stringify(actionName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/actions/changetype"; //objectName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/actions/merge"; //objectName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | vobjectsObjectNameActionsMergePostRequestInner


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : vobjectsObjectNameActionsMergePostRequestInner)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsObjectNameActionsRecalculaterollupsGet(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/actions/recalculaterollups"; //objectName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsObjectNameActionsRecalculaterollupsPost(
            
            std::string objectName
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/actions/recalculaterollups"; //objectName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/actions/updatecorporatecurrency"; //objectName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/attachments/batch"; //objectName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | idParam 
            addQueryParam("idParam",idParam);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/attachments/batch"; //objectName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/attachments/batch"; //objectName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}"; //objectName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{id}/roles/{role_name}"; //objectName id roleName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));
                std::string s_roleName("{");
                s_roleName.append("role_name");
                s_roleName.append("}");

                int pos = url.find(s_roleName);

                url.erase(pos, s_roleName.length());
                url.insert(pos, stringify(roleName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/actions/{action_name}"; //objectName objectRecordId actionName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_actionName("{");
                s_actionName.append("action_name");
                s_actionName.append("}");

                int pos = url.find(s_actionName);

                url.erase(pos, s_actionName.length());
                url.insert(pos, stringify(actionName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/actions/{action_name}"; //objectName objectRecordId actionName 


            // Headers  |  authorization  contentType  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_actionName("{");
                s_actionName.append("action_name");
                s_actionName.append("}");

                int pos = url.find(s_actionName);

                url.erase(pos, s_actionName.length());
                url.insert(pos, stringify(actionName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/actions/cascadedelete"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/actions/deepcopy"; //objectName objectRecordId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/actions"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | loc 
            addQueryParam("loc",loc);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file"; //objectName objectRecordId attachmentFieldName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentFieldName("{");
                s_attachmentFieldName.append("attachment_field_name");
                s_attachmentFieldName.append("}");

                int pos = url.find(s_attachmentFieldName);

                url.erase(pos, s_attachmentFieldName.length());
                url.insert(pos, stringify(attachmentFieldName));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file"; //objectName objectRecordId attachmentFieldName 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentFieldName("{");
                s_attachmentFieldName.append("attachment_field_name");
                s_attachmentFieldName.append("}");

                int pos = url.find(s_attachmentFieldName);

                url.erase(pos, s_attachmentFieldName.length());
                url.insert(pos, stringify(attachmentFieldName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachment_fields/file"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}"; //objectName objectRecordId attachmentId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}"; //objectName objectRecordId attachmentId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}"; //objectName objectRecordId attachmentId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}"; //objectName objectRecordId attachmentId attachmentVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file"; //objectName objectRecordId attachmentId attachmentVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}"; //objectName objectRecordId attachmentId attachmentVersion 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}"; //objectName objectRecordId attachmentId attachmentVersion 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | restore 
            addQueryParam("restore",restore);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));
                std::string s_attachmentVersion("{");
                s_attachmentVersion.append("attachment_version");
                s_attachmentVersion.append("}");

                int pos = url.find(s_attachmentVersion);

                url.erase(pos, s_attachmentVersion.length());
                url.insert(pos, stringify(attachmentVersion));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions"; //objectName objectRecordId attachmentId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));
                std::string s_attachmentId("{");
                s_attachmentId.append("attachment_id");
                s_attachmentId.append("}");

                int pos = url.find(s_attachmentId);

                url.erase(pos, s_attachmentId.length());
                url.insert(pos, stringify(attachmentId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments/file"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/attachments"; //objectName objectRecordId 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}/audittrail"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | startDate endDate formatResult limit offset events 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("format_result",formatResult);
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("events",events);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/{object_record_id}"; //objectName objectRecordId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));
                std::string s_objectRecordId("{");
                s_objectRecordId.append("object_record_id");
                s_objectRecordId.append("}");

                int pos = url.find(s_objectRecordId);

                url.erase(pos, s_objectRecordId.length());
                url.insert(pos, stringify(objectRecordId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}"; //objectName 


            // Headers  |  authorization  contentType  accept  xVaultAPIMigrationMode  xVaultAPINoTriggers  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-NoTriggers",xVaultAPINoTriggers);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | idParam 
            addQueryParam("idParam",idParam);

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}"; //objectName 


            // Headers  |  authorization  contentType  accept  xVaultAPIMigrationMode  xVaultAPINoTriggers  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Content-Type",contentType);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-MigrationMode",xVaultAPIMigrationMode);
            addHeader("X-VaultAPI-NoTriggers",xVaultAPINoTriggers);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | PUT
            // Body     | 
            int httpCode = sendRequest(url, "PUT", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/roles"; //objectName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
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
            
        )
        {
            std::string url = basepath + "/vobjects/{object_name}/roles"; //objectName 


            // Headers  |  authorization  accept  contentType  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("Content-Type",contentType);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_objectName("{");
                s_objectName.append("object_name");
                s_objectName.append("}");

                int pos = url.find(s_objectName);

                url.erase(pos, s_objectName.length());
                url.insert(pos, stringify(objectName));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        DefaultApi::
        vobjectsOutboundPackageVPackageIdDependenciesGet(
            
            std::string packageId
            , 
            
            std::string authorization
            , 
            
            std::string accept
            , 
            
            std::string xVaultAPIClientID
            
        )
        {
            std::string url = basepath + "/vobjects/outbound_package__v/{package_id}/dependencies"; //packageId 


            // Headers  |  authorization  accept  xVaultAPIClientID 
            addHeader("Authorization",authorization);
            addHeader("Accept",accept);
            addHeader("X-VaultAPI-ClientID",xVaultAPIClientID);

            // Query    | 

            // Form     | 



                std::string s_packageId("{");
                s_packageId.append("package_id");
                s_packageId.append("}");

                int pos = url.find(s_packageId);

                url.erase(pos, s_packageId.length());
                url.insert(pos, stringify(packageId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }



