package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.VobjectsObjectNameActionsMergePostRequestInner

class DefaultApi {
    String basePath = "http://}/api/v25.1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def apiGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def apiMdlComponentsComponentTypeAndRecordNameFilesGet ( String componentTypeAndRecordName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/mdl/components/${component_type_and_record_name}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (componentTypeAndRecordName == null) {
            throw new RuntimeException("missing required params componentTypeAndRecordName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def apiMdlComponentsComponentTypeAndRecordNameGet ( String componentTypeAndRecordName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/mdl/components/${component_type_and_record_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (componentTypeAndRecordName == null) {
            throw new RuntimeException("missing required params componentTypeAndRecordName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def apiMdlExecuteAsyncJobIdResultsGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/mdl/execute_async/${job_id}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def apiMdlExecuteAsyncPost ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/mdl/execute_async"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def apiMdlExecutePost ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/mdl/execute"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def apiMdlFilesPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/mdl/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def audittrailAuditTrailTypeGet ( String auditTrailType, String startDate, String endDate, String allDates, String formatResult, String limit, String offset, String objects, String events, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audittrail/${audit_trail_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (auditTrailType == null) {
            throw new RuntimeException("missing required params auditTrailType")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (allDates != null) {
            queryParams.put("all_dates", allDates)
        }
        if (formatResult != null) {
            queryParams.put("format_result", formatResult)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (objects != null) {
            queryParams.put("objects", objects)
        }
        if (events != null) {
            queryParams.put("events", events)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def authDiscoveryPost ( String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/discovery"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def authOauthSessionOathOidcProfileIdPost ( String oathOidcProfileId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/oauth/session/${oath_oidc_profile_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (oathOidcProfileId == null) {
            throw new RuntimeException("missing required params oathOidcProfileId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def authPost ( String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def codeClassNameDelete ( String className, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/${class_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (className == null) {
            throw new RuntimeException("missing required params className")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def codeClassNameDisablePut ( String className, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/${class_name}/disable"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (className == null) {
            throw new RuntimeException("missing required params className")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def codeClassNameEnablePut ( String className, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/${class_name}/enable"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (className == null) {
            throw new RuntimeException("missing required params className")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def codeClassNameGet ( String className, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/${class_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (className == null) {
            throw new RuntimeException("missing required params className")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def codeProfilerGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/profiler"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def codeProfilerPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/profiler"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def codeProfilerSessionNameActionsEndPost ( String sessionName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/profiler/${session_name}/actions/end"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (sessionName == null) {
            throw new RuntimeException("missing required params sessionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def codeProfilerSessionNameDelete ( String sessionName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/profiler/${session_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (sessionName == null) {
            throw new RuntimeException("missing required params sessionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def codeProfilerSessionNameGet ( String sessionName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/profiler/${session_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (sessionName == null) {
            throw new RuntimeException("missing required params sessionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def codeProfilerSessionNameResultsGet ( String sessionName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code/profiler/${session_name}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (sessionName == null) {
            throw new RuntimeException("missing required params sessionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def codePut ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/code"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def compositesTreesEdlHierarchyOrTemplateActionsListnodesPost ( String edlHierarchyOrTemplate, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/composites/trees/${edl_hierarchy_or_template}/actions/listnodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (edlHierarchyOrTemplate == null) {
            throw new RuntimeException("missing required params edlHierarchyOrTemplate")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def compositesTreesEdlHierarchyOrTemplateGet ( String edlHierarchyOrTemplate, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/composites/trees/${edl_hierarchy_or_template}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (edlHierarchyOrTemplate == null) {
            throw new RuntimeException("missing required params edlHierarchyOrTemplate")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def compositesTreesEdlHierarchyVParentNodeIdChildrenGet ( String parentNodeId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/composites/trees/edl_hierarchy__v/${parent_node_id}/children"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (parentNodeId == null) {
            throw new RuntimeException("missing required params parentNodeId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def compositesTreesEdlHierarchyVParentNodeIdChildrenPut ( String parentNodeId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/composites/trees/edl_hierarchy__v/${parent_node_id}/children"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (parentNodeId == null) {
            throw new RuntimeException("missing required params parentNodeId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def configurationComponentTypeAndRecordNameGet ( String componentTypeAndRecordName, String loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/${component_type_and_record_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (componentTypeAndRecordName == null) {
            throw new RuntimeException("missing required params componentTypeAndRecordName")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def configurationComponentTypeGet ( String componentType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/${component_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (componentType == null) {
            throw new RuntimeException("missing required params componentType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def configurationObjectNameAndObjectTypeGet ( String objectNameAndObjectType, String loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/${object_name_and_object_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectNameAndObjectType == null) {
            throw new RuntimeException("missing required params objectNameAndObjectType")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def configurationObjecttypeGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/Objecttype"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def configurationRoleAssignmentRuleDelete ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/role_assignment_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def configurationRoleAssignmentRuleGet ( String lifecycleV, String roleV, String productV, String countryV, String studyV, String studyCountryV, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/role_assignment_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (lifecycleV != null) {
            queryParams.put("lifecycle__v", lifecycleV)
        }
        if (roleV != null) {
            queryParams.put("role__v", roleV)
        }
        if (productV != null) {
            queryParams.put("product__v", productV)
        }
        if (countryV != null) {
            queryParams.put("country__v", countryV)
        }
        if (studyV != null) {
            queryParams.put("study__v", studyV)
        }
        if (studyCountryV != null) {
            queryParams.put("study_country__v", studyCountryV)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def configurationRoleAssignmentRulePost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/role_assignment_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def configurationRoleAssignmentRulePut ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/configuration/role_assignment_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def delegationLoginPost ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/delegation/login"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def delegationVaultsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/delegation/vaults"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def keepAlivePost ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/keep-alive"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def limitsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/limits"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def logsApiUsageGet ( String date, String logFormat, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/api_usage"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (date != null) {
            queryParams.put("date", date)
        }
        if (logFormat != null) {
            queryParams.put("log_format", logFormat)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def logsCodeDebugGet ( String userId, Boolean includeInactive, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/debug"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (userId != null) {
            queryParams.put("user_id", userId)
        }
        if (includeInactive != null) {
            queryParams.put("include_inactive", includeInactive)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def logsCodeDebugIdActionsResetDelete ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/debug/${id}/actions/reset"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def logsCodeDebugIdActionsResetPost ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/debug/${id}/actions/reset"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def logsCodeDebugIdFilesGet ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/debug/${id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def logsCodeDebugIdGet ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/debug/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def logsCodeDebugPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/debug"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def logsCodeRuntimeGet ( String date, String logFormat, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/logs/code/runtime"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (date != null) {
            queryParams.put("date", date)
        }
        if (logFormat != null) {
            queryParams.put("log_format", logFormat)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def messagesMessageTypeActionsImportPost ( String messageType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_type}/actions/import"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageType == null) {
            throw new RuntimeException("missing required params messageType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def messagesMessageTypeLanguageLangActionsExportPost ( String messageType, String lang, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/messages/${message_type}/language/${lang}/actions/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (messageType == null) {
            throw new RuntimeException("missing required params messageType")
        }
        // verify required params are set
        if (lang == null) {
            throw new RuntimeException("missing required params lang")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def metadataAudittrailAuditTrailTypeGet ( String auditTrailType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/audittrail/${audit_trail_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (auditTrailType == null) {
            throw new RuntimeException("missing required params auditTrailType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataAudittrailGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/audittrail"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataComponentsComponentTypeGet ( String componentType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/components/${component_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (componentType == null) {
            throw new RuntimeException("missing required params componentType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataComponentsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/components"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsBindersTemplatesBindernodesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/binders/templates/bindernodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsBindersTemplatesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/binders/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet ( String placemarkType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/annotations/placemarks/types/${placemark_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (placemarkType == null) {
            throw new RuntimeException("missing required params placemarkType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet ( String referenceType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/annotations/references/types/${reference_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (referenceType == null) {
            throw new RuntimeException("missing required params referenceType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet ( String annotationType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/annotations/types/${annotation_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (annotationType == null) {
            throw new RuntimeException("missing required params annotationType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet ( String eventType, String eventSubtype, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/events/${event_type}/types/${event_subtype}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (eventType == null) {
            throw new RuntimeException("missing required params eventType")
        }
        // verify required params are set
        if (eventSubtype == null) {
            throw new RuntimeException("missing required params eventSubtype")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsEventsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsLockGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/lock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsPropertiesFindCommonPost ( String contentType, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/properties/find_common"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def metadataObjectsDocumentsPropertiesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/properties"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsTemplatesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsTypesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/types"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsTypesTypeGet ( String type, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/types/${type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsTypesTypeRelationshipsGet ( String type, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/types/${type}/relationships"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet ( String type, String subtype, String classification, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/types/${type}/subtypes/${subtype}/classifications/${classification}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (subtype == null) {
            throw new RuntimeException("missing required params subtype")
        }
        // verify required params are set
        if (classification == null) {
            throw new RuntimeException("missing required params classification")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet ( String type, String subtype, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/documents/types/${type}/subtypes/${subtype}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (subtype == null) {
            throw new RuntimeException("missing required params subtype")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsGroupsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsSecuritypoliciesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/securitypolicies"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataObjectsUsersGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/objects/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/query/archived_documents/relationships/document_signature__sysr"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/query/documents/relationships/document_signature__sysr"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataVobjectsGet ( Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/vobjects"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataVobjectsObjectNameActionsCanceldeploymentPost ( String objectName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/vobjects/${object_name}/actions/canceldeployment"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def metadataVobjectsObjectNameFieldsObjectFieldNameGet ( String objectName, String objectFieldName, Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/vobjects/${object_name}/fields/${object_field_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectFieldName == null) {
            throw new RuntimeException("missing required params objectFieldName")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataVobjectsObjectNameGet ( String objectName, Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/vobjects/${object_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataVobjectsObjectNamePageLayoutsGet ( String objectName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/vobjects/${object_name}/page_layouts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metadataVobjectsObjectNamePageLayoutsLayoutNameGet ( String objectName, String layoutName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/metadata/vobjects/${object_name}/page_layouts/${layout_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (layoutName == null) {
            throw new RuntimeException("missing required params layoutName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def notificationsHistoriesGet ( String startDate, String endDate, Boolean allDates, String formatResult, String limit, String offset, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/notifications/histories"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (allDates != null) {
            queryParams.put("all_dates", allDates)
        }
        if (formatResult != null) {
            queryParams.put("format_result", formatResult)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectWorkflowActionsActionGet ( String action, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions/${action}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (action == null) {
            throw new RuntimeException("missing required params action")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectWorkflowActionsActionPost ( String action, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions/${action}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (action == null) {
            throw new RuntimeException("missing required params action")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectWorkflowActionsCanceltasksPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions/canceltasks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectWorkflowActionsCancelworkflowsPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions/cancelworkflows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectWorkflowActionsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectWorkflowActionsReassigntasksPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions/reassigntasks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectWorkflowActionsReplaceworkflowownerPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/object/workflow/actions/replaceworkflowowner"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersActionsExportJobIdResultsGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/actions/export/${job_id}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersBinderIdActionsExportPost ( String binderId, Boolean source, String renditiontype, String docversion, String attachments, String export, Boolean docfield, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/actions/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }

        if (source != null) {
            queryParams.put("source", source)
        }
        if (renditiontype != null) {
            queryParams.put("renditiontype", renditiontype)
        }
        if (docversion != null) {
            queryParams.put("docversion", docversion)
        }
        if (attachments != null) {
            queryParams.put("attachments", attachments)
        }
        if (export != null) {
            queryParams.put("export", export)
        }
        if (docfield != null) {
            queryParams.put("docfield", docfield)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdActionsPost ( String binderId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdBindingRulePut ( String binderId, String contentType, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/binding_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdDelete ( String binderId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersBinderIdDocumentsNodeIdBindingRulePut ( String binderId, String nodeId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/documents/${node_id}/binding_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (nodeId == null) {
            throw new RuntimeException("missing required params nodeId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdDocumentsPost ( String binderId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdDocumentsSectionIdDelete ( String binderId, String sectionId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/documents/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersBinderIdDocumentsSectionIdPut ( String binderId, String sectionId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/documents/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdGet ( String binderId, String depth, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }

        if (depth != null) {
            queryParams.put("depth", depth)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersBinderIdPost ( String binderId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdPut ( String binderId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete ( String binderId, String roleNameAndUserOrGroup, String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/roles/${role_name_and_user_or_group}/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (roleNameAndUserOrGroup == null) {
            throw new RuntimeException("missing required params roleNameAndUserOrGroup")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersBinderIdSectionsNodeIdBindingRulePut ( String binderId, String nodeId, String contentType, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/sections/${node_id}/binding_rule"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (nodeId == null) {
            throw new RuntimeException("missing required params nodeId")
        }


        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdSectionsNodeIdPut ( String binderId, String nodeId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/sections/${node_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (nodeId == null) {
            throw new RuntimeException("missing required params nodeId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdSectionsPost ( String binderId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/sections"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdSectionsSectionIdDelete ( String binderId, String sectionId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/sections/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersBinderIdSectionsSectionIdGet ( String binderId, String sectionId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/sections/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersBinderIdVersionsGet ( String binderId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost ( String binderId, String majorVersion, String minorVersion, Boolean source, String renditiontype, String docversion, String attachments, String export, Boolean docfield, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/actions/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }

        if (source != null) {
            queryParams.put("source", source)
        }
        if (renditiontype != null) {
            queryParams.put("renditiontype", renditiontype)
        }
        if (docversion != null) {
            queryParams.put("docversion", docversion)
        }
        if (attachments != null) {
            queryParams.put("attachments", attachments)
        }
        if (export != null) {
            queryParams.put("export", export)
        }
        if (docfield != null) {
            queryParams.put("docfield", docfield)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete ( String binderId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionGet ( String binderId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionPut ( String binderId, String majorVersion, String minorVersion, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost ( String binderId, String majorVersion, String minorVersion, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/relationships"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete ( String binderId, String majorVersion, String minorVersion, String relationshipId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (relationshipId == null) {
            throw new RuntimeException("missing required params relationshipId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet ( String binderId, String majorVersion, String minorVersion, String relationshipId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (relationshipId == null) {
            throw new RuntimeException("missing required params relationshipId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet ( String binderId, String majorVersion, String minorVersion, String sectionId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${binder_id}/versions/${major_version}/${minor_version}/sections/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (binderId == null) {
            throw new RuntimeException("missing required params binderId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersIdRolesGet ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${id}/roles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersIdRolesPost ( String id, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${id}/roles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersIdRolesRoleNameGet ( String id, String roleName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${id}/roles/${role_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (roleName == null) {
            throw new RuntimeException("missing required params roleName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet ( String id, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${id}/versions/${major_version}/${minor_version}/lifecycle_actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet ( String id, String majorVersion, String minorVersion, String nameV, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}/entry_requirements"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (nameV == null) {
            throw new RuntimeException("missing required params nameV")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut ( String id, String majorVersion, String minorVersion, String nameV, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (nameV == null) {
            throw new RuntimeException("missing required params nameV")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersLifecycleActionsPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/lifecycle_actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersLifecycleActionsUserActionNamePut ( String userActionName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/lifecycle_actions/${user_action_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userActionName == null) {
            throw new RuntimeException("missing required params userActionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersPost ( Boolean async, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (async != null) {
            queryParams.put("async", async)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersTemplatesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersTemplatesPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersTemplatesPut ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersTemplatesTemplateNameBindernodesGet ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates/${template_name}/bindernodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsBindersTemplatesTemplateNameBindernodesPost ( String templateName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates/${template_name}/bindernodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsBindersTemplatesTemplateNameBindernodesPut ( String templateName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates/${template_name}/bindernodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsBindersTemplatesTemplateNameDelete ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates/${template_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsBindersTemplatesTemplateNameGet ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/binders/templates/${template_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDeletionsDocumentsGet ( String startDate, String endDate, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/deletions/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDeletionsVobjectsObjectNameGet ( String objectName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/deletions/vobjects/${object_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsActionsGet ( Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet ( String lifecycleAndStateAndAction, String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/actions/${lifecycle_and_state_and_action}/${job_id}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (lifecycleAndStateAndAction == null) {
            throw new RuntimeException("missing required params lifecycleAndStateAndAction")
        }
        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsActionsWorkflowNameGet ( String workflowName, Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/actions/${workflow_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowName == null) {
            throw new RuntimeException("missing required params workflowName")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsActionsWorkflowNamePost ( String workflowName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/actions/${workflow_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowName == null) {
            throw new RuntimeException("missing required params workflowName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsAnnotationsBatchDelete ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/annotations/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsAnnotationsBatchPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/annotations/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (contentType == null) {
            throw new RuntimeException("missing required params contentType")
        }
        // verify required params are set
        if (accept == null) {
            throw new RuntimeException("missing required params accept")
        }
        // verify required params are set
        if (xVaultAPIClientID == null) {
            throw new RuntimeException("missing required params xVaultAPIClientID")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsAnnotationsBatchPut ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/annotations/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsAnnotationsRepliesBatchPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/annotations/replies/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsAttachmentsBatchDelete ( String accept, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/attachments/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsAttachmentsBatchPost ( String accept, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/attachments/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsAttachmentsBatchPut ( String accept, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/attachments/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsBatchActionsFileextractJobIdResultsGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch/actions/fileextract/${job_id}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsBatchActionsFileextractPost ( Boolean source, Boolean renditions, Boolean allversions, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch/actions/fileextract"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (source != null) {
            queryParams.put("source", source)
        }
        if (renditions != null) {
            queryParams.put("renditions", renditions)
        }
        if (allversions != null) {
            queryParams.put("allversions", allversions)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsBatchActionsReclassifyPut ( String authorization, String contentType, String accept, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch/actions/reclassify"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsBatchActionsRerenderPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch/actions/rerender"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsBatchDelete ( String idParam, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (idParam != null) {
            queryParams.put("idParam", idParam)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsBatchLockDelete ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch/lock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsBatchPost ( String authorization, String accept, String contentType, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsBatchPut ( String authorization, String accept, String contentType, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsDocIdAnchorsGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/anchors"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAnnotationsFileGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/annotations/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAnnotationsFilePost ( String docId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/annotations/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdDelete ( String docId, String attachmentId, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdFileGet ( String docId, String attachmentId, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdGet ( String docId, String attachmentId, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdPut ( String docId, String attachmentId, String accept, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete ( String docId, String attachmentId, String attachmentVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet ( String docId, String attachmentId, String attachmentVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet ( String docId, String attachmentId, String attachmentVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost ( String docId, String attachmentId, String attachmentVersion, Boolean restore, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }

        if (restore != null) {
            queryParams.put("restore", restore)
        }

        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet ( String docId, String attachmentId, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/${attachment_id}/versions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsFileGet ( String docId, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsGet ( String docId, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdAttachmentsPost ( String docId, String accept, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdAudittrailGet ( String docId, String startDate, String endDate, String formatResult, String limit, String offset, String events, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/audittrail"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (formatResult != null) {
            queryParams.put("format_result", formatResult)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (events != null) {
            queryParams.put("events", events)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdDelete ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdEventsGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdFileGet ( String docId, Boolean lockDocument, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }

        if (lockDocument != null) {
            queryParams.put("lockDocument", lockDocument)
        }

        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdLockDelete ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/lock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdLockGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/lock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdLockPost ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/lock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet ( String docId, String majorVersion, String minorVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/${major_version}/${minor_version}/attachments/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdPost ( String docId, String suppressRendition, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }

        if (suppressRendition != null) {
            queryParams.put("suppressRendition", suppressRendition)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdPut ( String docId, String authorization, String contentType, String accept, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsDocIdRenditionsGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/renditions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdRenditionsRenditionTypeDelete ( String docId, String renditionType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdRenditionsRenditionTypeGet ( String docId, String renditionType, String steadyState, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }

        if (steadyState != null) {
            queryParams.put("steadyState", steadyState)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdRenditionsRenditionTypePost ( String docId, String renditionType, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdRenditionsRenditionTypePut ( String docId, String renditionType, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete ( String docId, String roleNameAndUserOrGroup, String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/roles/${role_name_and_user_or_group}/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (roleNameAndUserOrGroup == null) {
            throw new RuntimeException("missing required params roleNameAndUserOrGroup")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet ( String docId, String majorVersion, String minorVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/version/${major_version}/${minor_version}/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsGet ( String docId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet ( String docId, String majorVersion, String minorVersion, String annotationId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/${annotation_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (annotationId == null) {
            throw new RuntimeException("missing required params annotationId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet ( String docId, String majorVersion, String minorVersion, String annotationId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/${annotation_id}/replies"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (annotationId == null) {
            throw new RuntimeException("missing required params annotationId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet ( String docId, String majorVersion, String minorVersion, String limit, String offset, String annotationTypes, String paginationId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/annotations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (annotationTypes != null) {
            queryParams.put("annotation_types", annotationTypes)
        }
        if (paginationId != null) {
            queryParams.put("pagination_id", paginationId)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet ( String docId, String majorVersion, String minorVersion, String attachmentId, String attachmentVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/attachments/${attachment_id}/versions/${attachment_version}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet ( String docId, String majorVersion, String minorVersion, String attachmentId, String attachmentVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/doc-export-annotations-to-csv"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/export-video-annotations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet ( String docId, String majorVersion, String minorVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut ( String docId, String majorVersion, String minorVersion, String authorization, String contentType, String accept, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete ( String docId, String majorVersion, String minorVersion, String relationshipId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (relationshipId == null) {
            throw new RuntimeException("missing required params relationshipId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet ( String docId, String majorVersion, String minorVersion, String relationshipId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/relationships/${relationship_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (relationshipId == null) {
            throw new RuntimeException("missing required params relationshipId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet ( String docId, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete ( String docId, String majorVersion, String minorVersion, String renditionType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet ( String docId, String majorVersion, String minorVersion, String renditionType, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost ( String docId, String majorVersion, String minorVersion, String renditionType, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut ( String docId, String majorVersion, String minorVersion, String renditionType, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/renditions/${rendition_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (renditionType == null) {
            throw new RuntimeException("missing required params renditionType")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet ( String docId, String majorVersion, String minorVersion, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${doc_id}/versions/${major_version}/${minor_version}/thumbnail"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (docId == null) {
            throw new RuntimeException("missing required params docId")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsGet ( String namedFilter, String scope, String versionscope, String search, String limit, String sort, String start, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (namedFilter != null) {
            queryParams.put("named_filter", namedFilter)
        }
        if (scope != null) {
            queryParams.put("scope", scope)
        }
        if (versionscope != null) {
            queryParams.put("versionscope", versionscope)
        }
        if (search != null) {
            queryParams.put("search", search)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (sort != null) {
            queryParams.put("sort", sort)
        }
        if (start != null) {
            queryParams.put("start", start)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsIdRolesGet ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${id}/roles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsIdRolesPost ( String id, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${id}/roles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsIdRolesRoleNameGet ( String id, String roleName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${id}/roles/${role_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (roleName == null) {
            throw new RuntimeException("missing required params roleName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet ( String id, String majorVersion, String minorVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${id}/versions/${major_version}/${minor_version}/lifecycle_actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet ( String id, String majorVersion, String minorVersion, String nameV, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}/entry_requirements"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (nameV == null) {
            throw new RuntimeException("missing required params nameV")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut ( String id, String majorVersion, String minorVersion, String nameV, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/${id}/versions/${major_version}/${minor_version}/lifecycle_actions/${name__v}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (majorVersion == null) {
            throw new RuntimeException("missing required params majorVersion")
        }
        // verify required params are set
        if (minorVersion == null) {
            throw new RuntimeException("missing required params minorVersion")
        }
        // verify required params are set
        if (nameV == null) {
            throw new RuntimeException("missing required params nameV")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsLifecycleActionsPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/lifecycle_actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsLifecycleActionsUserActionNamePut ( String userActionName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/lifecycle_actions/${user_action_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userActionName == null) {
            throw new RuntimeException("missing required params userActionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsPost ( String authorization, String accept, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsRelationshipsBatchDelete ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/relationships/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsRelationshipsBatchPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/relationships/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsRenditionsBatchDelete ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/renditions/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsRenditionsBatchPost ( String idParam, String largeSizeAsset, String authorization, String accept, String contentType, Boolean xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/renditions/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (idParam != null) {
            queryParams.put("idParam", idParam)
        }
        if (largeSizeAsset != null) {
            queryParams.put("largeSizeAsset", largeSizeAsset)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsRolesBatchDelete ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/roles/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsRolesBatchPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/roles/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsTemplatesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsTemplatesPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsTemplatesPut ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsTemplatesTemplateNameDelete ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates/${template_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsTemplatesTemplateNameFileGet ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates/${template_name}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsTemplatesTemplateNameGet ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates/${template_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDocumentsTemplatesTemplateNamePut ( String templateName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/templates/${template_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (templateName == null) {
            throw new RuntimeException("missing required params templateName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsDocumentsTokensPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/tokens"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsVersionsBatchActionsFileextractPost ( Boolean source, Boolean renditions, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/versions/batch/actions/fileextract"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (source != null) {
            queryParams.put("source", source)
        }
        if (renditions != null) {
            queryParams.put("renditions", renditions)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDocumentsVersionsBatchDelete ( String idParam, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/versions/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (idParam != null) {
            queryParams.put("idParam", idParam)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsDocumentsVersionsBatchPost ( String idParam, String authorization, String accept, String contentType, String xVaultAPIMigrationMode, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/documents/versions/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (idParam != null) {
            queryParams.put("idParam", idParam)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsDomainGet ( Boolean includeApplication, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/domain"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (includeApplication != null) {
            queryParams.put("include_application", includeApplication)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsDomainsGet ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/domains"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsEdlMatchedDocumentsBatchActionsAddPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/edl_matched_documents/batch/actions/add"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsEdlMatchedDocumentsBatchActionsRemovePost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/edl_matched_documents/batch/actions/remove"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsGroupsAutoGet ( String limit, String offset, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/groups/auto"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsGroupsGet ( String includeImplied, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (includeImplied != null) {
            queryParams.put("includeImplied", includeImplied)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsGroupsGroupIdDelete ( String groupId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/groups/${group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (groupId == null) {
            throw new RuntimeException("missing required params groupId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsGroupsGroupIdGet ( String groupId, Boolean includeImplied, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/groups/${group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (groupId == null) {
            throw new RuntimeException("missing required params groupId")
        }

        if (includeImplied != null) {
            queryParams.put("includeImplied", includeImplied)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsGroupsGroupIdPut ( String groupId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/groups/${group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (groupId == null) {
            throw new RuntimeException("missing required params groupId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsGroupsPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsLicensesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/licenses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsActionsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsActionsWorkflowNameGet ( String workflowName, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/actions/${workflow_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowName == null) {
            throw new RuntimeException("missing required params workflowName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsActionsWorkflowNamePost ( String workflowName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/actions/${workflow_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowName == null) {
            throw new RuntimeException("missing required params workflowName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsGet ( String objectV, String recordIdV, String participant, String statusV, String offset, String pageSize, String loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (objectV != null) {
            queryParams.put("object__v", objectV)
        }
        if (recordIdV != null) {
            queryParams.put("record_id__v", recordIdV)
        }
        if (participant != null) {
            queryParams.put("participant", participant)
        }
        if (statusV != null) {
            queryParams.put("status__v", statusV)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsTasksGet ( String objectV, String recordIdV, String assigneeV, String statusV, String offset, String pageSize, String loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (objectV != null) {
            queryParams.put("object__v", objectV)
        }
        if (recordIdV != null) {
            queryParams.put("record_id__v", recordIdV)
        }
        if (assigneeV != null) {
            queryParams.put("assignee__v", assigneeV)
        }
        if (statusV != null) {
            queryParams.put("status__v", statusV)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsAcceptPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/accept"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsCancelPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsCompletePost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/complete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsGet ( String taskId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/mdwaccept"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/mdwcomplete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/mdwmanagecontent"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/mdwreassign"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsReassignPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/reassign"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsTaskActionGet ( String taskId, String taskAction, String loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/${task_action}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }
        // verify required params are set
        if (taskAction == null) {
            throw new RuntimeException("missing required params taskAction")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/undoaccept"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost ( String taskId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}/actions/updateduedate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsTasksTaskIdGet ( String taskId, Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/tasks/${task_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsWorkflowIdActionsGet ( String workflowId, String loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/${workflow_id}/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowId == null) {
            throw new RuntimeException("missing required params workflowId")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet ( String workflowId, String workflowAction, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/${workflow_id}/actions/${workflow_action}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowId == null) {
            throw new RuntimeException("missing required params workflowId")
        }
        // verify required params are set
        if (workflowAction == null) {
            throw new RuntimeException("missing required params workflowAction")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost ( String workflowId, String workflowAction, String documentsSys, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/${workflow_id}/actions/${workflow_action}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowId == null) {
            throw new RuntimeException("missing required params workflowId")
        }
        // verify required params are set
        if (workflowAction == null) {
            throw new RuntimeException("missing required params workflowAction")
        }

        if (documentsSys != null) {
            queryParams.put("documents__sys", documentsSys)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsObjectworkflowsWorkflowIdGet ( String workflowId, Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/objectworkflows/${workflow_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (workflowId == null) {
            throw new RuntimeException("missing required params workflowId")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsPicklistsGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/picklists"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsPicklistsPicklistNameGet ( String picklistName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/picklists/${picklist_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (picklistName == null) {
            throw new RuntimeException("missing required params picklistName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsPicklistsPicklistNamePicklistValueNameDelete ( String picklistName, String picklistValueName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/picklists/${picklist_name}/${picklist_value_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (picklistName == null) {
            throw new RuntimeException("missing required params picklistName")
        }
        // verify required params are set
        if (picklistValueName == null) {
            throw new RuntimeException("missing required params picklistValueName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsPicklistsPicklistNamePicklistValueNamePut ( String picklistName, String picklistValueName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/picklists/${picklist_name}/${picklist_value_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (picklistName == null) {
            throw new RuntimeException("missing required params picklistName")
        }
        // verify required params are set
        if (picklistValueName == null) {
            throw new RuntimeException("missing required params picklistValueName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsPicklistsPicklistNamePost ( String picklistName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/picklists/${picklist_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (picklistName == null) {
            throw new RuntimeException("missing required params picklistName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsPicklistsPicklistNamePut ( String picklistName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/picklists/${picklist_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (picklistName == null) {
            throw new RuntimeException("missing required params picklistName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsSandboxActionsBuildproductionPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/actions/buildproduction"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxActionsPromoteproductionPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/actions/promoteproduction"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxActionsRecheckusagePost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/actions/recheckusage"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxBatchChangesizePost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/batch/changesize"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxEntitlementsSetPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/entitlements/set"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsSandboxNameDelete ( String name, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsSandboxPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxSnapshotApiNameActionsUpdatePost ( String apiName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/snapshot/${api_name}/actions/update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (apiName == null) {
            throw new RuntimeException("missing required params apiName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxSnapshotApiNameActionsUpgradePost ( String apiName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/snapshot/${api_name}/actions/upgrade"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (apiName == null) {
            throw new RuntimeException("missing required params apiName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxSnapshotApiNameDelete ( String apiName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/snapshot/${api_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (apiName == null) {
            throw new RuntimeException("missing required params apiName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsSandboxSnapshotGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/snapshot"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsSandboxSnapshotPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/snapshot"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxVaultIdActionsRefreshPost ( String vaultId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/${vault_id}/actions/refresh"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vaultId == null) {
            throw new RuntimeException("missing required params vaultId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsSandboxVaultIdGet ( String vaultId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/sandbox/${vault_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vaultId == null) {
            throw new RuntimeException("missing required params vaultId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsSecuritypoliciesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/securitypolicies"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsSecuritypoliciesSecurityPolicyNameGet ( String securityPolicyName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/securitypolicies/${security_policy_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (securityPolicyName == null) {
            throw new RuntimeException("missing required params securityPolicyName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsUsersGet ( String vaults, String excludeVaultMembership, String excludeAppLicensing, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (vaults != null) {
            queryParams.put("vaults", vaults)
        }
        if (excludeVaultMembership != null) {
            queryParams.put("exclude_vault_membership", excludeVaultMembership)
        }
        if (excludeAppLicensing != null) {
            queryParams.put("exclude_app_licensing", excludeAppLicensing)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsUsersIdGet ( String id, String excludeVaultMembership, String excludeAppLicensing, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (excludeVaultMembership != null) {
            queryParams.put("exclude_vault_membership", excludeVaultMembership)
        }
        if (excludeAppLicensing != null) {
            queryParams.put("exclude_app_licensing", excludeAppLicensing)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsUsersIdPermissionsGet ( String id, String filter, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/${id}/permissions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (filter != null) {
            queryParams.put("filter", filter)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsUsersIdPut ( String id, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsUsersMeGet ( String excludeVaultMembership, String excludeAppLicensing, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (excludeVaultMembership != null) {
            queryParams.put("exclude_vault_membership", excludeVaultMembership)
        }
        if (excludeAppLicensing != null) {
            queryParams.put("exclude_app_licensing", excludeAppLicensing)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsUsersMePasswordPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/me/password"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsUsersMePermissionsGet ( String filter, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/me/permissions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (filter != null) {
            queryParams.put("filter", filter)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def objectsUsersMePut ( String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsUsersPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsUsersPut ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsUsersUserIdDelete ( String userId, Boolean domain, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (domain != null) {
            queryParams.put("domain", domain)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def objectsUsersUserIdVaultMembershipVaultIdPut ( String userId, String vaultId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/users/${user_id}/vault_membership/${vault_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (vaultId == null) {
            throw new RuntimeException("missing required params vaultId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def objectsVaultActionsComparePost ( String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/vault/actions/compare"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def objectsVaultActionsConfigreportPost ( String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/objects/vault/actions/configreport"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def queryComponentsPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/query/components"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def queryNextPagePost ( String nextPage, String authorization, String accept, Boolean xVaultAPIDescribeQuery, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/query/${next_page}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (nextPage == null) {
            throw new RuntimeException("missing required params nextPage")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIDescribeQuery != null) {
            headerParams.put("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def queryPost ( String authorization, String accept, Boolean xVaultAPIDescribeQuery, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/query"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIDescribeQuery != null) {
            headerParams.put("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def queryPreviousPagePost ( String previousPage, String authorization, String accept, Boolean xVaultAPIDescribeQuery, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/query/${previous_page}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (previousPage == null) {
            throw new RuntimeException("missing required params previousPage")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIDescribeQuery != null) {
            headerParams.put("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def scimV2MeGet ( String attributes, String excludedAttributes, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (attributes != null) {
            queryParams.put("attributes", attributes)
        }
        if (excludedAttributes != null) {
            queryParams.put("excludedAttributes", excludedAttributes)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2MePut ( String attributes, String excludedAttributes, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (attributes != null) {
            queryParams.put("attributes", attributes)
        }
        if (excludedAttributes != null) {
            queryParams.put("excludedAttributes", excludedAttributes)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def scimV2ResourceTypesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/ResourceTypes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2ResourceTypesTypeGet ( String type, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/ResourceTypes/${type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2SchemasGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Schemas"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2SchemasIdGet ( String id, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Schemas/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2ServiceProviderConfigGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/ServiceProviderConfig"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2TypeGet ( String type, String filter, String attributes, String excludedAttributes, String sortBy, String sortOrder, String startIndex, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/${type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        if (filter != null) {
            queryParams.put("filter", filter)
        }
        if (attributes != null) {
            queryParams.put("attributes", attributes)
        }
        if (excludedAttributes != null) {
            queryParams.put("excludedAttributes", excludedAttributes)
        }
        if (sortBy != null) {
            queryParams.put("sortBy", sortBy)
        }
        if (sortOrder != null) {
            queryParams.put("sortOrder", sortOrder)
        }
        if (startIndex != null) {
            queryParams.put("startIndex", startIndex)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2TypeIdGet ( String type, String id, String attributes, String excludedAttributes, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/${type}/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (attributes != null) {
            queryParams.put("attributes", attributes)
        }
        if (excludedAttributes != null) {
            queryParams.put("excludedAttributes", excludedAttributes)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2UsersGet ( String filter, String attributes, String excludedAttributes, String sortBy, String sortOrder, String count, String startIndex, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (filter != null) {
            queryParams.put("filter", filter)
        }
        if (attributes != null) {
            queryParams.put("attributes", attributes)
        }
        if (excludedAttributes != null) {
            queryParams.put("excludedAttributes", excludedAttributes)
        }
        if (sortBy != null) {
            queryParams.put("sortBy", sortBy)
        }
        if (sortOrder != null) {
            queryParams.put("sortOrder", sortOrder)
        }
        if (count != null) {
            queryParams.put("count", count)
        }
        if (startIndex != null) {
            queryParams.put("startIndex", startIndex)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2UsersIdGet ( String id, String filter, String attributes, String excludedAttributes, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Users/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (filter != null) {
            queryParams.put("filter", filter)
        }
        if (attributes != null) {
            queryParams.put("attributes", attributes)
        }
        if (excludedAttributes != null) {
            queryParams.put("excludedAttributes", excludedAttributes)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def scimV2UsersIdPut ( String id, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Users/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def scimV2UsersPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/scim/v2/Users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesCertificateCertIdGet ( String certId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/certificate/${cert_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (certId == null) {
            throw new RuntimeException("missing required params certId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesConfigurationModeActionsDisablePost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/configuration_mode/actions/disable"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesConfigurationModeActionsEnablePost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/configuration_mode/actions/enable"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesDirectdataFilesGet ( String extractType, Integer startTime, Integer stopTime, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/directdata/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (extractType != null) {
            queryParams.put("extract_type", extractType)
        }
        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (stopTime != null) {
            queryParams.put("stop_time", stopTime)
        }

        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesDirectdataFilesNameGet ( String name, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/directdata/files/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesFileStagingItemsContentItemGet ( String item, String authorization, String accept, String range, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/items/content/${item}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (item == null) {
            throw new RuntimeException("missing required params item")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (range != null) {
            headerParams.put("Range", range)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesFileStagingItemsItemDelete ( String item, String recursive, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/items/${item}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (item == null) {
            throw new RuntimeException("missing required params item")
        }

        if (recursive != null) {
            queryParams.put("recursive", recursive)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def servicesFileStagingItemsItemGet ( String item, String recursive, String limit, String formatResult, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/items/${item}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (item == null) {
            throw new RuntimeException("missing required params item")
        }

        if (recursive != null) {
            queryParams.put("recursive", recursive)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (formatResult != null) {
            queryParams.put("format_result", formatResult)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesFileStagingItemsItemPut ( String item, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/items/${item}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (item == null) {
            throw new RuntimeException("missing required params item")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def servicesFileStagingItemsPost ( String authorization, String accept, String contentMD5, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/items"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentMD5 != null) {
            headerParams.put("Content-MD5", contentMD5)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesFileStagingUploadGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesFileStagingUploadPost ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesFileStagingUploadUploadSessionIdDelete ( String uploadSessionId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload/${upload_session_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadSessionId == null) {
            throw new RuntimeException("missing required params uploadSessionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def servicesFileStagingUploadUploadSessionIdGet ( String uploadSessionId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload/${upload_session_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadSessionId == null) {
            throw new RuntimeException("missing required params uploadSessionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesFileStagingUploadUploadSessionIdPartsGet ( String uploadSessionId, String limit, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload/${upload_session_id}/parts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadSessionId == null) {
            throw new RuntimeException("missing required params uploadSessionId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesFileStagingUploadUploadSessionIdPost ( String uploadSessionId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload/${upload_session_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadSessionId == null) {
            throw new RuntimeException("missing required params uploadSessionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesFileStagingUploadUploadSessionIdPut ( String uploadSessionId, String authorization, String accept, String contentType, String xVaultAPIFilePartNumber, String contentMD5, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/file_staging/upload/${upload_session_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadSessionId == null) {
            throw new RuntimeException("missing required params uploadSessionId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIFilePartNumber != null) {
            headerParams.put("X-VaultAPI-FilePartNumber", xVaultAPIFilePartNumber)
        }
        if (contentMD5 != null) {
            headerParams.put("Content-MD5", contentMD5)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def servicesJobsHistoriesGet ( String startDate, String endDate, String status, String limit, String offset, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/histories"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesJobsJobIdErrorsGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/${job_id}/errors"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesJobsJobIdGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/${job_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesJobsJobIdSummaryGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/${job_id}/summary"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesJobsJobIdTasksGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/${job_id}/tasks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesJobsMonitorsGet ( String startDate, String endDate, String status, String limit, String offset, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/monitors"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesJobsStartNowJobIdPost ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/jobs/start_now/${job_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesLoaderExtractPost ( String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/loader/extract"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesLoaderJobIdTasksTaskIdFailurelogGet ( String jobId, String taskId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/loader/${job_id}/tasks/${task_id}/failurelog"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }
        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesLoaderJobIdTasksTaskIdResultsGet ( String jobId, String taskId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/loader/${job_id}/tasks/${task_id}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }
        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesLoaderJobIdTasksTaskIdResultsRenditionsGet ( String jobId, String taskId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/loader/${job_id}/tasks/${task_id}/results/renditions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }
        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesLoaderJobIdTasksTaskIdSuccesslogGet ( String jobId, String taskId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/loader/${job_id}/tasks/${task_id}/successlog"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }
        // verify required params are set
        if (taskId == null) {
            throw new RuntimeException("missing required params taskId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesLoaderLoadPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/loader/load"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesPackageActionsValidatePost ( String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/package/actions/validate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesPackagePost ( String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/package"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def servicesPackagePut ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/package"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def servicesQueuesGet ( String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/queues"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesQueuesQueueNameActionsDisableDeliveryPut ( String queueName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/queues/${queue_name}/actions/disable_delivery"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (queueName == null) {
            throw new RuntimeException("missing required params queueName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def servicesQueuesQueueNameActionsEnableDeliveryPut ( String queueName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/queues/${queue_name}/actions/enable_delivery"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (queueName == null) {
            throw new RuntimeException("missing required params queueName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def servicesQueuesQueueNameActionsResetPut ( String queueName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/queues/${queue_name}/actions/reset"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (queueName == null) {
            throw new RuntimeException("missing required params queueName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def servicesQueuesQueueNameGet ( String queueName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/queues/${queue_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (queueName == null) {
            throw new RuntimeException("missing required params queueName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def servicesVobjectVaultPackageVPackageIdActionsValidatePost ( String packageId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/services/vobject/vault_package__v/${package_id}/actions/validate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (packageId == null) {
            throw new RuntimeException("missing required params packageId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def sessionDelete ( String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/session"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def uicodeDistributionsDistributionNameCodeGet ( String distributionName, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uicode/distributions/${distribution_name}/code"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (distributionName == null) {
            throw new RuntimeException("missing required params distributionName")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def uicodeDistributionsDistributionNameDelete ( String distributionName, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uicode/distributions/${distribution_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (distributionName == null) {
            throw new RuntimeException("missing required params distributionName")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def uicodeDistributionsDistributionNameGet ( String distributionName, String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uicode/distributions/${distribution_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (distributionName == null) {
            throw new RuntimeException("missing required params distributionName")
        }


        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def uicodeDistributionsGet ( String accept, String authorization, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uicode/distributions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def uicodeDistributionsPost ( String accept, String authorization, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uicode/distributions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectVaultPackageVPackageIdActionsDeployPost ( String packageId, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobject/vault_package__v/${package_id}/actions/deploy"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (packageId == null) {
            throw new RuntimeException("missing required params packageId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectVaultPackageVPackageIdActionsDeployResultsGet ( String packageId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobject/vault_package__v/${package_id}/actions/deploy/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (packageId == null) {
            throw new RuntimeException("missing required params packageId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet ( String objectName, String jobStatus, String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/cascadedelete/results/${object_name}/${job_status}/${job_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (jobStatus == null) {
            throw new RuntimeException("missing required params jobStatus")
        }
        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet ( String objectName, String jobStatus, String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/deepcopy/results/${object_name}/${job_status}/${job_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (jobStatus == null) {
            throw new RuntimeException("missing required params jobStatus")
        }
        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsEdlItemVActionsCreateplaceholderPost ( String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/edl_item__v/actions/createplaceholder"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType



        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsMergesJobIdLogGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/merges/${job_id}/log"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsMergesJobIdResultsGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/merges/${job_id}/results"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsMergesJobIdStatusGet ( String jobId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/merges/${job_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameActionsActionNamePost ( String objectName, String actionName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/actions/${action_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (actionName == null) {
            throw new RuntimeException("missing required params actionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameActionsChangetypePost ( String objectName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/actions/changetype"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameActionsMergePost ( String objectName, String authorization, String contentType, String accept, String xVaultAPIClientID, List<VobjectsObjectNameActionsMergePostRequestInner> vobjectsObjectNameActionsMergePostRequestInner, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/actions/merge"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }

        contentType = 'application/json';
        bodyParams = vobjectsObjectNameActionsMergePostRequestInner


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameActionsRecalculaterollupsGet ( String objectName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/actions/recalculaterollups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameActionsRecalculaterollupsPost ( String objectName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/actions/recalculaterollups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameActionsUpdatecorporatecurrencyPut ( String objectName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/actions/updatecorporatecurrency"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def vobjectsObjectNameAttachmentsBatchDelete ( String objectName, String idParam, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/attachments/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }

        if (idParam != null) {
            queryParams.put("idParam", idParam)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def vobjectsObjectNameAttachmentsBatchPost ( String objectName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/attachments/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameAttachmentsBatchPut ( String objectName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/attachments/batch"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def vobjectsObjectNameDelete ( String objectName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def vobjectsObjectNameIdRolesRoleNameGet ( String objectName, String id, String roleName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${id}/roles/${role_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (roleName == null) {
            throw new RuntimeException("missing required params roleName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdActionsActionNameGet ( String objectName, String objectRecordId, String actionName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/actions/${action_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (actionName == null) {
            throw new RuntimeException("missing required params actionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdActionsActionNamePost ( String objectName, String objectRecordId, String actionName, String authorization, String contentType, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/actions/${action_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (actionName == null) {
            throw new RuntimeException("missing required params actionName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdActionsCascadedeletePost ( String objectName, String objectRecordId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/actions/cascadedelete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdActionsDeepcopyPost ( String objectName, String objectRecordId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/actions/deepcopy"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdActionsGet ( String objectName, String objectRecordId, Boolean loc, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/actions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }

        if (loc != null) {
            queryParams.put("loc", loc)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet ( String objectName, String objectRecordId, String attachmentFieldName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachment_fields/${attachment_field_name}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentFieldName == null) {
            throw new RuntimeException("missing required params attachmentFieldName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost ( String objectName, String objectRecordId, String attachmentFieldName, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachment_fields/${attachment_field_name}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentFieldName == null) {
            throw new RuntimeException("missing required params attachmentFieldName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet ( String objectName, String objectRecordId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachment_fields/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete ( String objectName, String objectRecordId, String attachmentId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet ( String objectName, String objectRecordId, String attachmentId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut ( String objectName, String objectRecordId, String attachmentId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete ( String objectName, String objectRecordId, String attachmentId, String attachmentVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet ( String objectName, String objectRecordId, String attachmentId, String attachmentVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet ( String objectName, String objectRecordId, String attachmentId, String attachmentVersion, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost ( String objectName, String objectRecordId, String attachmentId, String attachmentVersion, Boolean restore, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions/${attachment_version}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (attachmentVersion == null) {
            throw new RuntimeException("missing required params attachmentVersion")
        }

        if (restore != null) {
            queryParams.put("restore", restore)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet ( String objectName, String objectRecordId, String attachmentId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/${attachment_id}/versions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }
        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsFileGet ( String objectName, String objectRecordId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments/file"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsGet ( String objectName, String objectRecordId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAttachmentsPost ( String objectName, String objectRecordId, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdAudittrailGet ( String objectName, String objectRecordId, String startDate, String endDate, String formatResult, String limit, String offset, String events, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}/audittrail"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (formatResult != null) {
            queryParams.put("format_result", formatResult)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (events != null) {
            queryParams.put("events", events)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNameObjectRecordIdGet ( String objectName, String objectRecordId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/${object_record_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }
        // verify required params are set
        if (objectRecordId == null) {
            throw new RuntimeException("missing required params objectRecordId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def vobjectsObjectNamePost ( String objectName, String idParam, String authorization, String contentType, String accept, Boolean xVaultAPIMigrationMode, Boolean xVaultAPINoTriggers, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }

        if (idParam != null) {
            queryParams.put("idParam", idParam)
        }

        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPINoTriggers != null) {
            headerParams.put("X-VaultAPI-NoTriggers", xVaultAPINoTriggers)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsObjectNamePut ( String objectName, String authorization, String contentType, String accept, Boolean xVaultAPIMigrationMode, Boolean xVaultAPINoTriggers, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIMigrationMode != null) {
            headerParams.put("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode)
        }
        if (xVaultAPINoTriggers != null) {
            headerParams.put("X-VaultAPI-NoTriggers", xVaultAPINoTriggers)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def vobjectsObjectNameRolesDelete ( String objectName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/roles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def vobjectsObjectNameRolesPost ( String objectName, String authorization, String accept, String contentType, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/${object_name}/roles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (objectName == null) {
            throw new RuntimeException("missing required params objectName")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def vobjectsOutboundPackageVPackageIdDependenciesGet ( String packageId, String authorization, String accept, String xVaultAPIClientID, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vobjects/outbound_package__v/${package_id}/dependencies"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (packageId == null) {
            throw new RuntimeException("missing required params packageId")
        }


        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (accept != null) {
            headerParams.put("Accept", accept)
        }
        if (xVaultAPIClientID != null) {
            headerParams.put("X-VaultAPI-ClientID", xVaultAPIClientID)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

}
