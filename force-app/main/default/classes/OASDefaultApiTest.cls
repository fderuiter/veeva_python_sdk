@isTest
private class OASDefaultApiTest {
    /**
     * Retrieve API Versions
     *
     * 
     */
    @isTest
    private static void apiGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiGet(params);
    }

    /**
     * Retrieve Content File
     *
     * 
     */
    @isTest
    private static void apiMdlComponentsComponentTypeAndRecordNameFilesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'componentTypeAndRecordName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiMdlComponentsComponentTypeAndRecordNameFilesGet(params);
    }

    /**
     * Retrieve Component Record (MDL)
     *
     * 
     */
    @isTest
    private static void apiMdlComponentsComponentTypeAndRecordNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'componentTypeAndRecordName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiMdlComponentsComponentTypeAndRecordNameGet(params);
    }

    /**
     * Retrieve Asynchronous MDL Script Results
     *
     * 
     */
    @isTest
    private static void apiMdlExecuteAsyncJobIdResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiMdlExecuteAsyncJobIdResultsGet(params);
    }

    /**
     * Execute MDL Script Asynchronously
     *
     * 
     */
    @isTest
    private static void apiMdlExecuteAsyncPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiMdlExecuteAsyncPost(params);
    }

    /**
     * Execute MDL Script
     *
     * 
     */
    @isTest
    private static void apiMdlExecutePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiMdlExecutePost(params);
    }

    /**
     * Upload Content File
     *
     * 
     */
    @isTest
    private static void apiMdlFilesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.apiMdlFilesPost(params);
    }

    /**
     * Retrieve Audit Details
     *
     * 
     */
    @isTest
    private static void audittrailAuditTrailTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'auditTrailType' => 'null',
            'startDate' => 'null',
            'endDate' => 'null',
            'allDates' => 'null',
            'formatResult' => 'null',
            'r_limit' => 'null',
            'offset' => 'null',
            'objects' => 'null',
            'events' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.audittrailAuditTrailTypeGet(params);
    }

    /**
     * Authentication Type Discovery
     *
     * 
     */
    @isTest
    private static void authDiscoveryPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.authDiscoveryPost(params);
    }

    /**
     * OAuth 2.0 / OpenID Connect
     *
     * 
     */
    @isTest
    private static void authOauthSessionOathOidcProfileIdPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oathOidcProfileId' => {{oath_oidc_profile_id}},
            'authorization' => Bearer {{access_token}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.authOauthSessionOathOidcProfileIdPost(params);
    }

    /**
     * User Name and Password
     *
     * 
     */
    @isTest
    private static void authPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.authPost(params);
    }

    /**
     * Delete Single Source Code File
     *
     * 
     */
    @isTest
    private static void codeClassNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'className' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeClassNameDelete(params);
    }

    /**
     * Disable Vault Extension
     *
     * 
     */
    @isTest
    private static void codeClassNameDisablePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'className' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeClassNameDisablePut(params);
    }

    /**
     * Enable Vault Extension
     *
     * 
     */
    @isTest
    private static void codeClassNameEnablePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'className' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeClassNameEnablePut(params);
    }

    /**
     * Retrieve Single Source Code File
     *
     * 
     */
    @isTest
    private static void codeClassNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'className' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeClassNameGet(params);
    }

    /**
     * Retrieve All Profiling Sessions
     *
     * 
     */
    @isTest
    private static void codeProfilerGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeProfilerGet(params);
    }

    /**
     * Create Profiling Session
     *
     * 
     */
    @isTest
    private static void codeProfilerPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeProfilerPost(params);
    }

    /**
     * End Profiling Session
     *
     * 
     */
    @isTest
    private static void codeProfilerSessionNameActionsEndPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'sessionName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeProfilerSessionNameActionsEndPost(params);
    }

    /**
     * Delete Profiling Session
     *
     * 
     */
    @isTest
    private static void codeProfilerSessionNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'sessionName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeProfilerSessionNameDelete(params);
    }

    /**
     * Retrieve Profiling Session
     *
     * 
     */
    @isTest
    private static void codeProfilerSessionNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'sessionName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeProfilerSessionNameGet(params);
    }

    /**
     * Download Profiling Session Results
     *
     * 
     */
    @isTest
    private static void codeProfilerSessionNameResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'sessionName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codeProfilerSessionNameResultsGet(params);
    }

    /**
     * Add or Replace Single Source Code File
     *
     * 
     */
    @isTest
    private static void codePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.codePut(params);
    }

    /**
     * Retrieve Specific Root Nodes
     *
     * 
     */
    @isTest
    private static void compositesTreesEdlHierarchyOrTemplateActionsListnodesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'edlHierarchyOrTemplate' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(params);
    }

    /**
     * Retrieve All Root Nodes
     *
     * 
     */
    @isTest
    private static void compositesTreesEdlHierarchyOrTemplateGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'edlHierarchyOrTemplate' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.compositesTreesEdlHierarchyOrTemplateGet(params);
    }

    /**
     * Retrieve a Node\&#39;s Children
     *
     * 
     */
    @isTest
    private static void compositesTreesEdlHierarchyVParentNodeIdChildrenGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'parentNodeId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.compositesTreesEdlHierarchyVParentNodeIdChildrenGet(params);
    }

    /**
     * Update Node Order
     *
     * 
     */
    @isTest
    private static void compositesTreesEdlHierarchyVParentNodeIdChildrenPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'parentNodeId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.compositesTreesEdlHierarchyVParentNodeIdChildrenPut(params);
    }

    /**
     * Retrieve Component Record (XML/JSON)
     *
     * 
     */
    @isTest
    private static void configurationComponentTypeAndRecordNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'componentTypeAndRecordName' => 'null',
            'loc' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationComponentTypeAndRecordNameGet(params);
    }

    /**
     * Retrieve Component Record Collection
     *
     * 
     */
    @isTest
    private static void configurationComponentTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'componentType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationComponentTypeGet(params);
    }

    /**
     * Retrieve Details from a Specific Object
     *
     * 
     */
    @isTest
    private static void configurationObjectNameAndObjectTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectNameAndObjectType' => 'null',
            'loc' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationObjectNameAndObjectTypeGet(params);
    }

    /**
     * Retrieve Details from All Object Types
     *
     * 
     */
    @isTest
    private static void configurationObjecttypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationObjecttypeGet(params);
    }

    /**
     * Delete Lifecycle Role Assignment Override Rules
     *
     * 
     */
    @isTest
    private static void configurationRoleAssignmentRuleDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationRoleAssignmentRuleDelete(params);
    }

    /**
     * Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
     *
     * 
     */
    @isTest
    private static void configurationRoleAssignmentRuleGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'lifecycleV' => 'null',
            'roleV' => 'null',
            'productV' => 'null',
            'countryV' => 'null',
            'studyV' => 'null',
            'studyCountryV' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationRoleAssignmentRuleGet(params);
    }

    /**
     * Create Lifecycle Role Assignment Override Rules
     *
     * 
     */
    @isTest
    private static void configurationRoleAssignmentRulePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationRoleAssignmentRulePost(params);
    }

    /**
     * Update Lifecycle Role Assignment Rules (Default &amp; Override)
     *
     * 
     */
    @isTest
    private static void configurationRoleAssignmentRulePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.configurationRoleAssignmentRulePut(params);
    }

    /**
     * Initiate Delegated Session
     *
     * 
     */
    @isTest
    private static void delegationLoginPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.delegationLoginPost(params);
    }

    /**
     * Retrieve Delegations
     *
     * 
     */
    @isTest
    private static void delegationVaultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.delegationVaultsGet(params);
    }

    /**
     * Session Keep Alive
     *
     * 
     */
    @isTest
    private static void keepAlivePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.keepAlivePost(params);
    }

    /**
     * Retrieve Limits on Objects
     *
     * 
     */
    @isTest
    private static void limitsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.limitsGet(params);
    }

    /**
     * Download Daily API Usage
     *
     * 
     */
    @isTest
    private static void logsApiUsageGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_date' => 'null',
            'logFormat' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsApiUsageGet(params);
    }

    /**
     * Retrieve All Debug Logs
     *
     * 
     */
    @isTest
    private static void logsCodeDebugGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 'null',
            'includeInactive' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeDebugGet(params);
    }

    /**
     * Delete Debug Log
     *
     * 
     */
    @isTest
    private static void logsCodeDebugIdActionsResetDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeDebugIdActionsResetDelete(params);
    }

    /**
     * Reset Debug Log
     *
     * 
     */
    @isTest
    private static void logsCodeDebugIdActionsResetPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeDebugIdActionsResetPost(params);
    }

    /**
     * Download Debug Log Files
     *
     * 
     */
    @isTest
    private static void logsCodeDebugIdFilesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeDebugIdFilesGet(params);
    }

    /**
     * Retrieve Single Debug Log
     *
     * 
     */
    @isTest
    private static void logsCodeDebugIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeDebugIdGet(params);
    }

    /**
     * Create Debug Log
     *
     * 
     */
    @isTest
    private static void logsCodeDebugPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeDebugPost(params);
    }

    /**
     * Download SDK Runtime Log
     *
     * 
     */
    @isTest
    private static void logsCodeRuntimeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_date' => YYYY-MM-DD,
            'logFormat' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.logsCodeRuntimeGet(params);
    }

    /**
     * Import Bulk Translation File
     *
     * 
     */
    @isTest
    private static void messagesMessageTypeActionsImportPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.messagesMessageTypeActionsImportPost(params);
    }

    /**
     * Export Bulk Translation File
     *
     * 
     */
    @isTest
    private static void messagesMessageTypeLanguageLangActionsExportPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'messageType' => 'null',
            'lang' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.messagesMessageTypeLanguageLangActionsExportPost(params);
    }

    /**
     * Retrieve Audit Metadata
     *
     * 
     */
    @isTest
    private static void metadataAudittrailAuditTrailTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'auditTrailType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataAudittrailAuditTrailTypeGet(params);
    }

    /**
     * Retrieve Audit Types
     *
     * 
     */
    @isTest
    private static void metadataAudittrailGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataAudittrailGet(params);
    }

    /**
     * Retrieve Component Type Metadata
     *
     * 
     */
    @isTest
    private static void metadataComponentsComponentTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'componentType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataComponentsComponentTypeGet(params);
    }

    /**
     * Retrieve All Component Metadata
     *
     * 
     */
    @isTest
    private static void metadataComponentsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataComponentsGet(params);
    }

    /**
     * Retrieve Binder Template Node Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsBindersTemplatesBindernodesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsBindersTemplatesBindernodesGet(params);
    }

    /**
     * Retrieve Binder Template Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsBindersTemplatesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsBindersTemplatesGet(params);
    }

    /**
     * Retrieve Annotation Placemark Type Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'placemarkType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(params);
    }

    /**
     * Retrieve Annotation Reference Type Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'referenceType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(params);
    }

    /**
     * Retrieve Annotation Type Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'annotationType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(params);
    }

    /**
     * Retrieve Document Event SubType Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'eventType' => 'null',
            'eventSubtype' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(params);
    }

    /**
     * Retrieve Document Event Types and Subtypes
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsEventsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsEventsGet(params);
    }

    /**
     * Retrieve Document Lock Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsLockGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsLockGet(params);
    }

    /**
     * Retrieve Common Document Fields
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsPropertiesFindCommonPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsPropertiesFindCommonPost(params);
    }

    /**
     * Retrieve All Document Fields
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsPropertiesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsPropertiesGet(params);
    }

    /**
     * Retrieve Document Template Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsTemplatesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsTemplatesGet(params);
    }

    /**
     * Retrieve All Document Types
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsTypesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsTypesGet(params);
    }

    /**
     * Retrieve Document Type
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsTypesTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsTypesTypeGet(params);
    }

    /**
     * Retrieve Document Type Relationships
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsTypesTypeRelationshipsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsTypesTypeRelationshipsGet(params);
    }

    /**
     * Retrieve Document Classification
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'subtype' => 'null',
            'classification' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(params);
    }

    /**
     * Retrieve Document Subtype
     *
     * 
     */
    @isTest
    private static void metadataObjectsDocumentsTypesTypeSubtypesSubtypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'subtype' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(params);
    }

    /**
     * Retrieve Group Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsGroupsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsGroupsGet(params);
    }

    /**
     * Retrieve Security Policy Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsSecuritypoliciesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsSecuritypoliciesGet(params);
    }

    /**
     * Retrieve User Metadata
     *
     * 
     */
    @isTest
    private static void metadataObjectsUsersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataObjectsUsersGet(params);
    }

    /**
     * Retrieve Archived Document Signature Metadata
     *
     * 
     */
    @isTest
    private static void metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(params);
    }

    /**
     * Retrieve Document Signature Metadata
     *
     * 
     */
    @isTest
    private static void metadataQueryDocumentsRelationshipsDocumentSignatureSysrGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(params);
    }

    /**
     * Retrieve Object Collection
     *
     * 
     */
    @isTest
    private static void metadataVobjectsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataVobjectsGet(params);
    }

    /**
     * Cancel Raw Object Deployment
     *
     * 
     */
    @isTest
    private static void metadataVobjectsObjectNameActionsCanceldeploymentPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataVobjectsObjectNameActionsCanceldeploymentPost(params);
    }

    /**
     * Retrieve Object Field Metadata
     *
     * 
     */
    @isTest
    private static void metadataVobjectsObjectNameFieldsObjectFieldNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectFieldName' => 'null',
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataVobjectsObjectNameFieldsObjectFieldNameGet(params);
    }

    /**
     * Retrieve Object Metadata
     *
     * 
     */
    @isTest
    private static void metadataVobjectsObjectNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataVobjectsObjectNameGet(params);
    }

    /**
     * Retrieve Page Layouts
     *
     * 
     */
    @isTest
    private static void metadataVobjectsObjectNamePageLayoutsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataVobjectsObjectNamePageLayoutsGet(params);
    }

    /**
     * Retrieve Page Layout Metadata
     *
     * 
     */
    @isTest
    private static void metadataVobjectsObjectNamePageLayoutsLayoutNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'layoutName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.metadataVobjectsObjectNamePageLayoutsLayoutNameGet(params);
    }

    /**
     * Retrieve Email Notification Histories
     *
     * 
     */
    @isTest
    private static void notificationsHistoriesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => YYYY-MM-DD,
            'endDate' => YYYY-MM-DD,
            'allDates' => true,
            'formatResult' => csv,
            'r_limit' => 'null',
            'offset' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.notificationsHistoriesGet(params);
    }

    /**
     * Retrieve Bulk Workflow Action Details
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsActionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'action' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsActionGet(params);
    }

    /**
     * Initiate Workflow Actions on Multiple Workflows
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsActionPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'action' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsActionPost(params);
    }

    /**
     * Cancel Workflow Tasks
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsCanceltasksPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsCanceltasksPost(params);
    }

    /**
     * Cancel Workflows
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsCancelworkflowsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsCancelworkflowsPost(params);
    }

    /**
     * Retrieve Bulk Workflow Actions
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsGet(params);
    }

    /**
     * Reassign Workflow Tasks
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsReassigntasksPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsReassigntasksPost(params);
    }

    /**
     * Replace Workflow Owner
     *
     * 
     */
    @isTest
    private static void objectWorkflowActionsReplaceworkflowownerPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectWorkflowActionsReplaceworkflowownerPost(params);
    }

    /**
     * Retrieve Binder Export Results
     *
     * 
     */
    @isTest
    private static void objectsBindersActionsExportJobIdResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersActionsExportJobIdResultsGet(params);
    }

    /**
     * Export Binder (Latest Version)
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdActionsExportPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'source' => true,
            'renditiontype' => viewable_rendition__v,
            'docversion' => major,
            'attachments' => all,
            'r_export' => name__v,title__v,document_number__v,
            'docfield' => false,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdActionsExportPost(params);
    }

    /**
     * Refresh Binder Auto-Filing
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdActionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdActionsPost(params);
    }

    /**
     * Update Binding Rule
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdBindingRulePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdBindingRulePut(params);
    }

    /**
     * Delete Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdDelete(params);
    }

    /**
     * Update Binder Document Binding Rule
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdDocumentsNodeIdBindingRulePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'nodeId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdDocumentsNodeIdBindingRulePut(params);
    }

    /**
     * Add Document to Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdDocumentsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdDocumentsPost(params);
    }

    /**
     * Remove Document from Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdDocumentsSectionIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'sectionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdDocumentsSectionIdDelete(params);
    }

    /**
     * Move Document in Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdDocumentsSectionIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'sectionId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdDocumentsSectionIdPut(params);
    }

    /**
     * Retrieve Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'depth' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdGet(params);
    }

    /**
     * Create Binder Version
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdPost(params);
    }

    /**
     * Update Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdPut(params);
    }

    /**
     * Remove Users &amp; Groups from Roles on a Single Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'roleNameAndUserOrGroup' => 'null',
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(params);
    }

    /**
     * Update Binder Section Binding Rule
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdSectionsNodeIdBindingRulePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'nodeId' => 'null',
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdSectionsNodeIdBindingRulePut(params);
    }

    /**
     * Update Binder Section
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdSectionsNodeIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'nodeId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdSectionsNodeIdPut(params);
    }

    /**
     * Create Binder Section
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdSectionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdSectionsPost(params);
    }

    /**
     * Delete Binder Section
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdSectionsSectionIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'sectionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdSectionsSectionIdDelete(params);
    }

    /**
     * Retrieve Binder Sections
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdSectionsSectionIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'sectionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdSectionsSectionIdGet(params);
    }

    /**
     * Retrieve All Binder Versions
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsGet(params);
    }

    /**
     * Export Binder (Specific Version)
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'source' => true,
            'renditiontype' => viewable_rendition__v,
            'docversion' => major,
            'attachments' => all,
            'r_export' => name__v,title__v,document_number__v,
            'docfield' => false,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(params);
    }

    /**
     * Delete Binder Version
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(params);
    }

    /**
     * Retrieve Binder Version
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(params);
    }

    /**
     * Update Binder Version
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(params);
    }

    /**
     * Create Binder Relationship
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(params);
    }

    /**
     * Delete Binder Relationship
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'relationshipId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(params);
    }

    /**
     * Retrieve Binder Relationship
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'relationshipId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(params);
    }

    /**
     * Retrieve Binder Version Section
     *
     * 
     */
    @isTest
    private static void objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'binderId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'sectionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(params);
    }

    /**
     * Retrieve All Binder Roles
     *
     * 
     */
    @isTest
    private static void objectsBindersIdRolesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersIdRolesGet(params);
    }

    /**
     * Assign Users &amp; Groups to Roles on a Single Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersIdRolesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersIdRolesPost(params);
    }

    /**
     * Retrieve Document Role
     *
     * 
     */
    @isTest
    private static void objectsBindersIdRolesRoleNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'roleName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersIdRolesRoleNameGet(params);
    }

    /**
     * Retrieve Binder User Actions
     *
     * 
     */
    @isTest
    private static void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(params);
    }

    /**
     * Retrieve Binder Entry Criteria
     *
     * 
     */
    @isTest
    private static void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'nameV' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(params);
    }

    /**
     * Initiate Binder User Action
     *
     * 
     */
    @isTest
    private static void objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'nameV' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(params);
    }

    /**
     * Retrieve User Actions on Multiple Binders
     *
     * 
     */
    @isTest
    private static void objectsBindersLifecycleActionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersLifecycleActionsPost(params);
    }

    /**
     * Initiate Bulk Binder User Actions
     *
     * 
     */
    @isTest
    private static void objectsBindersLifecycleActionsUserActionNamePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userActionName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersLifecycleActionsUserActionNamePut(params);
    }

    /**
     * Create Binder
     *
     * 
     */
    @isTest
    private static void objectsBindersPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'async' => true,
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersPost(params);
    }

    /**
     * Retrieve Binder Template Collection
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesGet(params);
    }

    /**
     * Create Binder Template
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesPost(params);
    }

    /**
     * Update Binder Template
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesPut(params);
    }

    /**
     * Retrieve Binder Template Node Attributes
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesTemplateNameBindernodesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesTemplateNameBindernodesGet(params);
    }

    /**
     * Create Binder Template Node
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesTemplateNameBindernodesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesTemplateNameBindernodesPost(params);
    }

    /**
     * Replace Binder Template Nodes
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesTemplateNameBindernodesPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesTemplateNameBindernodesPut(params);
    }

    /**
     * Delete Binder Template
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesTemplateNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesTemplateNameDelete(params);
    }

    /**
     * Retrieve Binder Template Attributes
     *
     * 
     */
    @isTest
    private static void objectsBindersTemplatesTemplateNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsBindersTemplatesTemplateNameGet(params);
    }

    /**
     * Retrieve Deleted Document IDs
     *
     * 
     */
    @isTest
    private static void objectsDeletionsDocumentsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => 'null',
            'endDate' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDeletionsDocumentsGet(params);
    }

    /**
     * Retrieve Deleted Object Record ID
     *
     * 
     */
    @isTest
    private static void objectsDeletionsVobjectsObjectNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDeletionsVobjectsObjectNameGet(params);
    }

    /**
     * Retrieve All Document Workflows
     *
     * 
     */
    @isTest
    private static void objectsDocumentsActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsActionsGet(params);
    }

    /**
     * Download Controlled Copy Job Results
     *
     * 
     */
    @isTest
    private static void objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'lifecycleAndStateAndAction' => 'null',
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(params);
    }

    /**
     * Retrieve Document Workflow Details
     *
     * 
     */
    @isTest
    private static void objectsDocumentsActionsWorkflowNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowName' => 'null',
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsActionsWorkflowNameGet(params);
    }

    /**
     * Initiate Document Workflow
     *
     * 
     */
    @isTest
    private static void objectsDocumentsActionsWorkflowNamePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsActionsWorkflowNamePost(params);
    }

    /**
     * Delete Annotations
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAnnotationsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAnnotationsBatchDelete(params);
    }

    /**
     * Create Multiple Annotations
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAnnotationsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAnnotationsBatchPost(params);
    }

    /**
     * Update Annotations
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAnnotationsBatchPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAnnotationsBatchPut(params);
    }

    /**
     * Add Annotation Replies
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAnnotationsRepliesBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAnnotationsRepliesBatchPost(params);
    }

    /**
     * Delete Multiple Document Attachments
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAttachmentsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAttachmentsBatchDelete(params);
    }

    /**
     * Create Multiple Document Attachments
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAttachmentsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAttachmentsBatchPost(params);
    }

    /**
     * Update Multiple Document Attachment Descriptions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsAttachmentsBatchPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsAttachmentsBatchPut(params);
    }

    /**
     * Retrieve Document Export Results
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchActionsFileextractJobIdResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchActionsFileextractJobIdResultsGet(params);
    }

    /**
     * Export Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchActionsFileextractPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'source' => true,
            'renditions' => false,
            'allversions' => true,
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchActionsFileextractPost(params);
    }

    /**
     * Reclassify Multiple Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchActionsReclassifyPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => text/csv,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchActionsReclassifyPut(params);
    }

    /**
     * Update Multiple Document Renditions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchActionsRerenderPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchActionsRerenderPost(params);
    }

    /**
     * Delete Multiple Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'idParam' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchDelete(params);
    }

    /**
     * Undo Collaborative Authoring Checkout
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchLockDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchLockDelete(params);
    }

    /**
     * Create Multiple Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchPost(params);
    }

    /**
     * Update Multiple Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsBatchPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsBatchPut(params);
    }

    /**
     * Retrieve Anchor IDs
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAnchorsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAnchorsGet(params);
    }

    /**
     * Export Document Annotations to PDF
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAnnotationsFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAnnotationsFileGet(params);
    }

    /**
     * Import Document Annotations from PDF
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAnnotationsFilePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAnnotationsFilePost(params);
    }

    /**
     * Delete Single Document Attachment
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdDelete(params);
    }

    /**
     * Download Document Attachment
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(params);
    }

    /**
     * Retrieve Document Attachment Metadata
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdGet(params);
    }

    /**
     * Update Document Attachment Description
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdPut(params);
    }

    /**
     * Delete Single Document Attachment Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(params);
    }

    /**
     * Download Document Attachment Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(params);
    }

    /**
     * Retrieve Document Attachment Version Metadata
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(params);
    }

    /**
     * Restore Document Attachment Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'restore' => true,
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(params);
    }

    /**
     * Retrieve Document Attachment Versions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'attachmentId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(params);
    }

    /**
     * Download All Document Attachments
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsFileGet(params);
    }

    /**
     * Retrieve Document Attachments
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsGet(params);
    }

    /**
     * Create Document Attachment
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAttachmentsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAttachmentsPost(params);
    }

    /**
     * Retrieve Complete Audit History for a Single Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdAudittrailGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'startDate' => 'null',
            'endDate' => 'null',
            'formatResult' => 'null',
            'r_limit' => 'null',
            'offset' => 'null',
            'events' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdAudittrailGet(params);
    }

    /**
     * Delete Single Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdDelete(params);
    }

    /**
     * Retrieve Document Events
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdEventsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdEventsGet(params);
    }

    /**
     * Download Document File
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'lockDocument' => false,
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdFileGet(params);
    }

    /**
     * Retrieve Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdGet(params);
    }

    /**
     * Delete Document Lock
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdLockDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdLockDelete(params);
    }

    /**
     * Retrieve Document Lock
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdLockGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdLockGet(params);
    }

    /**
     * Create Document Lock
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdLockPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdLockPost(params);
    }

    /**
     * Download All Document Version Attachments
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(params);
    }

    /**
     * Create Single Document Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'suppressRendition' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => multipart/form-data,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdPost(params);
    }

    /**
     * Update Single Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdPut(params);
    }

    /**
     * Retrieve Document Renditions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdRenditionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdRenditionsGet(params);
    }

    /**
     * Delete Single Document Rendition
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdRenditionsRenditionTypeDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdRenditionsRenditionTypeDelete(params);
    }

    /**
     * Download Document Rendition File
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdRenditionsRenditionTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'renditionType' => 'null',
            'steadyState' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdRenditionsRenditionTypeGet(params);
    }

    /**
     * Add Single Document Rendition
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdRenditionsRenditionTypePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdRenditionsRenditionTypePost(params);
    }

    /**
     * Replace Document Rendition
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdRenditionsRenditionTypePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdRenditionsRenditionTypePut(params);
    }

    /**
     * Remove Users &amp; Groups from Roles on a Single Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'roleNameAndUserOrGroup' => 'null',
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(params);
    }

    /**
     * Retrieve Document Version Attachments
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(params);
    }

    /**
     * Retrieve Document Versions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsGet(params);
    }

    /**
     * Read Annotations by ID
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'annotationId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(params);
    }

    /**
     * Read Replies of Parent Annotation
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'annotationId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(params);
    }

    /**
     * Export Document Version Annotations to PDF
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(params);
    }

    /**
     * Import Document Version Annotations from PDF
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(params);
    }

    /**
     * Read Annotations by Document Version and Type
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'r_limit' => 'null',
            'offset' => 'null',
            'annotationTypes' => 'null',
            'paginationId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(params);
    }

    /**
     * Download Document Version Attachment Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(params);
    }

    /**
     * Retrieve Document Version Attachment Versions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(params);
    }

    /**
     * Delete Single Document Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(params);
    }

    /**
     * Retrieve Document Version Notes as CSV
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(params);
    }

    /**
     * Create Document Event
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(params);
    }

    /**
     * Retrieve Video Annotations
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(params);
    }

    /**
     * Download Document Version File
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(params);
    }

    /**
     * Retrieve Document Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(params);
    }

    /**
     * Update Document Version
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(params);
    }

    /**
     * Retrieve Document Relationships
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(params);
    }

    /**
     * Create Single Document Relationship
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(params);
    }

    /**
     * Delete Single Document Relationship
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'relationshipId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(params);
    }

    /**
     * Retrieve Document Relationship
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'relationshipId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(params);
    }

    /**
     * Retrieve Document Version Renditions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(params);
    }

    /**
     * Delete Document Version Rendition
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(params);
    }

    /**
     * Download Document Version Rendition File
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(params);
    }

    /**
     * Upload Document Version Rendition
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(params);
    }

    /**
     * Replace Document Version Rendition
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'renditionType' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(params);
    }

    /**
     * Download Document Version Thumbnail File
     *
     * 
     */
    @isTest
    private static void objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'docId' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(params);
    }

    /**
     * Retrieve All Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'namedFilter' => My Documents,
            'scope' => contents,
            'versionscope' => all,
            'search' => {keyword},
            'r_limit' => 'null',
            'r_sort' => 'null',
            'start' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsGet(params);
    }

    /**
     * Retrieve All Document Roles
     *
     * 
     */
    @isTest
    private static void objectsDocumentsIdRolesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsIdRolesGet(params);
    }

    /**
     * Assign Users &amp; Groups to Roles on a Single Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsIdRolesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsIdRolesPost(params);
    }

    /**
     * Retrieve Document Role
     *
     * 
     */
    @isTest
    private static void objectsDocumentsIdRolesRoleNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'roleName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsIdRolesRoleNameGet(params);
    }

    /**
     * Retrieve Document User Actions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(params);
    }

    /**
     * Retrieve Document Entry Criteria
     *
     * 
     */
    @isTest
    private static void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'nameV' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(params);
    }

    /**
     * Initiate Document User Action
     *
     * 
     */
    @isTest
    private static void objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'majorVersion' => 'null',
            'minorVersion' => 'null',
            'nameV' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(params);
    }

    /**
     * Retrieve User Actions on Multiple Documents
     *
     * 
     */
    @isTest
    private static void objectsDocumentsLifecycleActionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsLifecycleActionsPost(params);
    }

    /**
     * Initiate Bulk Document User Actions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsLifecycleActionsUserActionNamePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userActionName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsLifecycleActionsUserActionNamePut(params);
    }

    /**
     * Create Single Document
     *
     * 
     */
    @isTest
    private static void objectsDocumentsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsPost(params);
    }

    /**
     * Delete Multiple Document Relationships
     *
     * 
     */
    @isTest
    private static void objectsDocumentsRelationshipsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsRelationshipsBatchDelete(params);
    }

    /**
     * Create Multiple Document Relationships
     *
     * 
     */
    @isTest
    private static void objectsDocumentsRelationshipsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsRelationshipsBatchPost(params);
    }

    /**
     * Delete Multiple Document Renditions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsRenditionsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsRenditionsBatchDelete(params);
    }

    /**
     * Add Multiple Document Renditions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsRenditionsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'idParam' => 'null',
            'largeSizeAsset' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsRenditionsBatchPost(params);
    }

    /**
     * Remove Users and Groups from Roles on Multiple Documents &amp; Binders
     *
     * 
     */
    @isTest
    private static void objectsDocumentsRolesBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsRolesBatchDelete(params);
    }

    /**
     * Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
     *
     * 
     */
    @isTest
    private static void objectsDocumentsRolesBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsRolesBatchPost(params);
    }

    /**
     * Retrieve Document Template Collection
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesGet(params);
    }

    /**
     * Create Single Document Template
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => multipart/form-data,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesPost(params);
    }

    /**
     * Update Multiple Document Templates
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesPut(params);
    }

    /**
     * Delete Basic Document Template
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesTemplateNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesTemplateNameDelete(params);
    }

    /**
     * Download Document Template File
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesTemplateNameFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesTemplateNameFileGet(params);
    }

    /**
     * Retrieve Document Template Attributes
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesTemplateNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesTemplateNameGet(params);
    }

    /**
     * Update Single Document Template
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTemplatesTemplateNamePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'templateName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTemplatesTemplateNamePut(params);
    }

    /**
     * Document Tokens
     *
     * 
     */
    @isTest
    private static void objectsDocumentsTokensPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsTokensPost(params);
    }

    /**
     * Export Document Versions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsVersionsBatchActionsFileextractPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'source' => true,
            'renditions' => false,
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsVersionsBatchActionsFileextractPost(params);
    }

    /**
     * Delete Multiple Document Versions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsVersionsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'idParam' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsVersionsBatchDelete(params);
    }

    /**
     * Create Multiple Document Versions
     *
     * 
     */
    @isTest
    private static void objectsDocumentsVersionsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'idParam' => external_id__v,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIMigrationMode' => 'null',
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDocumentsVersionsBatchPost(params);
    }

    /**
     * Retrieve Domain Information
     *
     * 
     */
    @isTest
    private static void objectsDomainGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'includeApplication' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDomainGet(params);
    }

    /**
     * Retrieve Domains
     *
     * 
     */
    @isTest
    private static void objectsDomainsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsDomainsGet(params);
    }

    /**
     * Add EDL Matched Documents
     *
     * 
     */
    @isTest
    private static void objectsEdlMatchedDocumentsBatchActionsAddPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsEdlMatchedDocumentsBatchActionsAddPost(params);
    }

    /**
     * Remove EDL Matched Documents
     *
     * 
     */
    @isTest
    private static void objectsEdlMatchedDocumentsBatchActionsRemovePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsEdlMatchedDocumentsBatchActionsRemovePost(params);
    }

    /**
     * Retrieve Auto Managed Groups
     *
     * 
     */
    @isTest
    private static void objectsGroupsAutoGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => 'null',
            'offset' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsGroupsAutoGet(params);
    }

    /**
     * Retrieve All Groups
     *
     * 
     */
    @isTest
    private static void objectsGroupsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'includeImplied' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsGroupsGet(params);
    }

    /**
     * Delete Group
     *
     * 
     */
    @isTest
    private static void objectsGroupsGroupIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'groupId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsGroupsGroupIdDelete(params);
    }

    /**
     * Retrieve Group
     *
     * 
     */
    @isTest
    private static void objectsGroupsGroupIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'groupId' => 'null',
            'includeImplied' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsGroupsGroupIdGet(params);
    }

    /**
     * Update Group
     *
     * 
     */
    @isTest
    private static void objectsGroupsGroupIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'groupId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsGroupsGroupIdPut(params);
    }

    /**
     * Create Group 
     *
     * 
     */
    @isTest
    private static void objectsGroupsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsGroupsPost(params);
    }

    /**
     * Retrieve Application License Usage
     *
     * 
     */
    @isTest
    private static void objectsLicensesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsLicensesGet(params);
    }

    /**
     * Retrieve All Multi-Record Workflows
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsActionsGet(params);
    }

    /**
     * Retrieve Multi-Record Workflow Details
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsActionsWorkflowNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowName' => 'null',
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsActionsWorkflowNameGet(params);
    }

    /**
     * Initiate Multi-Record Workflow
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsActionsWorkflowNamePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsActionsWorkflowNamePost(params);
    }

    /**
     * Retrieve Workflows
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectV' => 'null',
            'recordIdV' => 'null',
            'participant' => 'null',
            'statusV' => 'null',
            'offset' => 'null',
            'pageSize' => 'null',
            'loc' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsGet(params);
    }

    /**
     * Retrieve Workflow Tasks
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectV' => 'null',
            'recordIdV' => 'null',
            'assigneeV' => 'null',
            'statusV' => 'null',
            'offset' => 'null',
            'pageSize' => 'null',
            'loc' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksGet(params);
    }

    /**
     * Accept Single Record Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsAcceptPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsAcceptPost(params);
    }

    /**
     * Cancel Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsCancelPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsCancelPost(params);
    }

    /**
     * Complete Single Record Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsCompletePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsCompletePost(params);
    }

    /**
     * Retrieve Workflow Task Actions
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsGet(params);
    }

    /**
     * Accept Multi-item Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsMdwacceptPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(params);
    }

    /**
     * Complete Multi-item Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsMdwcompletePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(params);
    }

    /**
     * Manage Multi-Item Workflow Content
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(params);
    }

    /**
     * Reassign Multi-item Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsMdwreassignPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(params);
    }

    /**
     * Reassign Single Record Workflow Task
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsReassignPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsReassignPost(params);
    }

    /**
     * Retrieve Workflow Task Action Details
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsTaskActionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'taskAction' => 'null',
            'loc' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(params);
    }

    /**
     * Undo Workflow Task Acceptance
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsUndoacceptPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(params);
    }

    /**
     * Update Workflow Task Due Date
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(params);
    }

    /**
     * Retrieve Workflow Task Details
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsTasksTaskIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'taskId' => 'null',
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsTasksTaskIdGet(params);
    }

    /**
     * Retrieve Workflow Actions
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsWorkflowIdActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowId' => 'null',
            'loc' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsWorkflowIdActionsGet(params);
    }

    /**
     * Retrieve Workflow Action Details
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsWorkflowIdActionsWorkflowActionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowId' => 'null',
            'workflowAction' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(params);
    }

    /**
     * Initiate Workflow Action
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsWorkflowIdActionsWorkflowActionPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowId' => 'null',
            'workflowAction' => 'null',
            'documentsSys' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(params);
    }

    /**
     * Retrieve Workflow Details
     *
     * 
     */
    @isTest
    private static void objectsObjectworkflowsWorkflowIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'workflowId' => 'null',
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsObjectworkflowsWorkflowIdGet(params);
    }

    /**
     * Retrieve All Picklists
     *
     * 
     */
    @isTest
    private static void objectsPicklistsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsPicklistsGet(params);
    }

    /**
     * Retrieve Picklist Values
     *
     * 
     */
    @isTest
    private static void objectsPicklistsPicklistNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'picklistName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsPicklistsPicklistNameGet(params);
    }

    /**
     * Inactivate Picklist Value
     *
     * 
     */
    @isTest
    private static void objectsPicklistsPicklistNamePicklistValueNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'picklistName' => 'null',
            'picklistValueName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsPicklistsPicklistNamePicklistValueNameDelete(params);
    }

    /**
     * Update Picklist Value
     *
     * 
     */
    @isTest
    private static void objectsPicklistsPicklistNamePicklistValueNamePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'picklistName' => 'null',
            'picklistValueName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsPicklistsPicklistNamePicklistValueNamePut(params);
    }

    /**
     * Create Picklist Values
     *
     * 
     */
    @isTest
    private static void objectsPicklistsPicklistNamePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'picklistName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsPicklistsPicklistNamePost(params);
    }

    /**
     * Update Picklist Value Label
     *
     * 
     */
    @isTest
    private static void objectsPicklistsPicklistNamePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'picklistName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsPicklistsPicklistNamePut(params);
    }

    /**
     * Build Production Vault
     *
     * 
     */
    @isTest
    private static void objectsSandboxActionsBuildproductionPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxActionsBuildproductionPost(params);
    }

    /**
     * Promote to Production
     *
     * 
     */
    @isTest
    private static void objectsSandboxActionsPromoteproductionPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxActionsPromoteproductionPost(params);
    }

    /**
     * Recheck Sandbox Usage Limit
     *
     * 
     */
    @isTest
    private static void objectsSandboxActionsRecheckusagePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxActionsRecheckusagePost(params);
    }

    /**
     * Change Sandbox Size
     *
     * 
     */
    @isTest
    private static void objectsSandboxBatchChangesizePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxBatchChangesizePost(params);
    }

    /**
     * Set Sandbox Entitlements
     *
     * 
     */
    @isTest
    private static void objectsSandboxEntitlementsSetPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxEntitlementsSetPost(params);
    }

    /**
     * Retrieve Sandboxes
     *
     * 
     */
    @isTest
    private static void objectsSandboxGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxGet(params);
    }

    /**
     * Delete Sandbox
     *
     * 
     */
    @isTest
    private static void objectsSandboxNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'name' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxNameDelete(params);
    }

    /**
     * Create or Refresh Sandbox
     *
     * 
     */
    @isTest
    private static void objectsSandboxPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxPost(params);
    }

    /**
     * Update Sandbox Snapshot
     *
     * 
     */
    @isTest
    private static void objectsSandboxSnapshotApiNameActionsUpdatePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'apiName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxSnapshotApiNameActionsUpdatePost(params);
    }

    /**
     * Upgrade Sandbox Snapshot
     *
     * 
     */
    @isTest
    private static void objectsSandboxSnapshotApiNameActionsUpgradePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'apiName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxSnapshotApiNameActionsUpgradePost(params);
    }

    /**
     * Delete Sandbox Snapshot
     *
     * 
     */
    @isTest
    private static void objectsSandboxSnapshotApiNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'apiName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxSnapshotApiNameDelete(params);
    }

    /**
     * Retrieve Sandbox Snapshots
     *
     * 
     */
    @isTest
    private static void objectsSandboxSnapshotGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxSnapshotGet(params);
    }

    /**
     * Create Sandbox Snapshot
     *
     * 
     */
    @isTest
    private static void objectsSandboxSnapshotPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxSnapshotPost(params);
    }

    /**
     * Refresh Sandbox from Snapshot
     *
     * 
     */
    @isTest
    private static void objectsSandboxVaultIdActionsRefreshPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vaultId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxVaultIdActionsRefreshPost(params);
    }

    /**
     * Retrieve Sandbox Details by ID
     *
     * 
     */
    @isTest
    private static void objectsSandboxVaultIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vaultId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSandboxVaultIdGet(params);
    }

    /**
     * Retrieve All Security Policies
     *
     * 
     */
    @isTest
    private static void objectsSecuritypoliciesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSecuritypoliciesGet(params);
    }

    /**
     * Retrieve Security Policy
     *
     * 
     */
    @isTest
    private static void objectsSecuritypoliciesSecurityPolicyNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'securityPolicyName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsSecuritypoliciesSecurityPolicyNameGet(params);
    }

    /**
     * Retrieve All Users
     *
     * 
     */
    @isTest
    private static void objectsUsersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vaults' => all,
            'excludeVaultMembership' => 'null',
            'excludeAppLicensing' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersGet(params);
    }

    /**
     * Retrieve User
     *
     * 
     */
    @isTest
    private static void objectsUsersIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'excludeVaultMembership' => 'null',
            'excludeAppLicensing' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersIdGet(params);
    }

    /**
     * Retrieve User Permissions
     *
     * 
     */
    @isTest
    private static void objectsUsersIdPermissionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'filter' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersIdPermissionsGet(params);
    }

    /**
     * Update Single User
     *
     * 
     */
    @isTest
    private static void objectsUsersIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersIdPut(params);
    }

    /**
     * Validate Session User
     *
     * 
     */
    @isTest
    private static void objectsUsersMeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'excludeVaultMembership' => 'null',
            'excludeAppLicensing' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersMeGet(params);
    }

    /**
     * Change My Password
     *
     * 
     */
    @isTest
    private static void objectsUsersMePasswordPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersMePasswordPost(params);
    }

    /**
     * Retrieve My User Permissions
     *
     * 
     */
    @isTest
    private static void objectsUsersMePermissionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'filter' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersMePermissionsGet(params);
    }

    /**
     * Update My User
     *
     * 
     */
    @isTest
    private static void objectsUsersMePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersMePut(params);
    }

    /**
     * Create Single User
     *
     * 
     */
    @isTest
    private static void objectsUsersPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersPost(params);
    }

    /**
     * Update Multiple Users
     *
     * 
     */
    @isTest
    private static void objectsUsersPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersPut(params);
    }

    /**
     * Disable User
     *
     * 
     */
    @isTest
    private static void objectsUsersUserIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 'null',
            'domain' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersUserIdDelete(params);
    }

    /**
     * Update Vault Membership
     *
     * 
     */
    @isTest
    private static void objectsUsersUserIdVaultMembershipVaultIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 'null',
            'vaultId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsUsersUserIdVaultMembershipVaultIdPut(params);
    }

    /**
     * Vault Compare
     *
     * 
     */
    @isTest
    private static void objectsVaultActionsComparePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsVaultActionsComparePost(params);
    }

    /**
     * Vault Configuration Report
     *
     * 
     */
    @isTest
    private static void objectsVaultActionsConfigreportPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.objectsVaultActionsConfigreportPost(params);
    }

    /**
     * Component Definition Query
     *
     * 
     */
    @isTest
    private static void queryComponentsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.queryComponentsPost(params);
    }

    /**
     * Next Page URL
     *
     * 
     */
    @isTest
    private static void queryNextPagePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'nextPage' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIDescribeQuery' => true,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.queryNextPagePost(params);
    }

    /**
     * Submitting a Query
     *
     * 
     */
    @isTest
    private static void queryPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIDescribeQuery' => true,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.queryPost(params);
    }

    /**
     * Previous Page URL
     *
     * 
     */
    @isTest
    private static void queryPreviousPagePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'previousPage' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIDescribeQuery' => true,
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.queryPreviousPagePost(params);
    }

    /**
     * Retrieve Current User with SCIM
     *
     * 
     */
    @isTest
    private static void scimV2MeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'attributes' => 'null',
            'excludedAttributes' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2MeGet(params);
    }

    /**
     * Update Current User with SCIM
     *
     * 
     */
    @isTest
    private static void scimV2MePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'attributes' => 'null',
            'excludedAttributes' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'contentType' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2MePut(params);
    }

    /**
     * Retrieve All SCIM Resource Types
     *
     * 
     */
    @isTest
    private static void scimV2ResourceTypesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2ResourceTypesGet(params);
    }

    /**
     * Retrieve Single SCIM Resource Type
     *
     * 
     */
    @isTest
    private static void scimV2ResourceTypesTypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2ResourceTypesTypeGet(params);
    }

    /**
     * Retrieve All SCIM Schema Information
     *
     * 
     */
    @isTest
    private static void scimV2SchemasGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2SchemasGet(params);
    }

    /**
     * Retrieve Single SCIM Schema Information
     *
     * 
     */
    @isTest
    private static void scimV2SchemasIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2SchemasIdGet(params);
    }

    /**
     * Retrieve SCIM Provider
     *
     * 
     */
    @isTest
    private static void scimV2ServiceProviderConfigGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2ServiceProviderConfigGet(params);
    }

    /**
     * Retrieve SCIM Resources
     *
     * 
     */
    @isTest
    private static void scimV2TypeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'filter' => 'null',
            'attributes' => 'null',
            'excludedAttributes' => 'null',
            'sortBy' => 'null',
            'sortOrder' => 'null',
            'startIndex' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2TypeGet(params);
    }

    /**
     * Retrieve Single SCIM Resource
     *
     * 
     */
    @isTest
    private static void scimV2TypeIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'type' => 'null',
            'id' => 'null',
            'attributes' => 'null',
            'excludedAttributes' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2TypeIdGet(params);
    }

    /**
     * Retrieve All Users with SCIM
     *
     * 
     */
    @isTest
    private static void scimV2UsersGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'filter' => 'null',
            'attributes' => 'null',
            'excludedAttributes' => 'null',
            'sortBy' => 'null',
            'sortOrder' => 'null',
            'count' => 'null',
            'startIndex' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2UsersGet(params);
    }

    /**
     * Retrieve Single User with SCIM
     *
     * 
     */
    @isTest
    private static void scimV2UsersIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'filter' => 'null',
            'attributes' => 'null',
            'excludedAttributes' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2UsersIdGet(params);
    }

    /**
     * Update User with SCIM
     *
     * 
     */
    @isTest
    private static void scimV2UsersIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'contentType' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2UsersIdPut(params);
    }

    /**
     * Create User with SCIM
     *
     * 
     */
    @isTest
    private static void scimV2UsersPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/scim+json,
            'contentType' => application/scim+json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.scimV2UsersPost(params);
    }

    /**
     * Retrieve Signing Certificate
     *
     * 
     */
    @isTest
    private static void servicesCertificateCertIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'certId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesCertificateCertIdGet(params);
    }

    /**
     * Disable Configuration Mode
     *
     * 
     */
    @isTest
    private static void servicesConfigurationModeActionsDisablePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => 'null',
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesConfigurationModeActionsDisablePost(params);
    }

    /**
     * Enable Configuration Mode
     *
     * 
     */
    @isTest
    private static void servicesConfigurationModeActionsEnablePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => 'null',
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesConfigurationModeActionsEnablePost(params);
    }

    /**
     * Retrieve Available Direct Data Files
     *
     * 
     */
    @isTest
    private static void servicesDirectdataFilesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'extractType' => incremental_directdata,
            'startTime' => 2023-12-07T00:00Z,
            'stopTime' => 2023-12-08T00:00Z,
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesDirectdataFilesGet(params);
    }

    /**
     * Download Direct Data File
     *
     * 
     */
    @isTest
    private static void servicesDirectdataFilesNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'name' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesDirectdataFilesNameGet(params);
    }

    /**
     * Download Item Content
     *
     * 
     */
    @isTest
    private static void servicesFileStagingItemsContentItemGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'item' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'range' => 'null',
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingItemsContentItemGet(params);
    }

    /**
     * Delete File or Folder
     *
     * 
     */
    @isTest
    private static void servicesFileStagingItemsItemDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'item' => 'null',
            'recursive' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingItemsItemDelete(params);
    }

    /**
     * List Items at a Path
     *
     * 
     */
    @isTest
    private static void servicesFileStagingItemsItemGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'item' => 'null',
            'recursive' => 'null',
            'r_limit' => 'null',
            'formatResult' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingItemsItemGet(params);
    }

    /**
     * Update Folder or File
     *
     * 
     */
    @isTest
    private static void servicesFileStagingItemsItemPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'item' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingItemsItemPut(params);
    }

    /**
     * Create Folder or File
     *
     * 
     */
    @isTest
    private static void servicesFileStagingItemsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentMD5' => 'null',
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingItemsPost(params);
    }

    /**
     * List Upload Sessions
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadGet(params);
    }

    /**
     * Create Resumable Upload Session
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadPost(params);
    }

    /**
     * Abort Upload Session
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadUploadSessionIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadSessionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadUploadSessionIdDelete(params);
    }

    /**
     * Get Upload Session Details
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadUploadSessionIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadSessionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadUploadSessionIdGet(params);
    }

    /**
     * List File Parts Uploaded to Session
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadUploadSessionIdPartsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadSessionId' => 'null',
            'r_limit' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadUploadSessionIdPartsGet(params);
    }

    /**
     * Commit Upload Session
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadUploadSessionIdPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadSessionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadUploadSessionIdPost(params);
    }

    /**
     * Upload to a Session
     *
     * 
     */
    @isTest
    private static void servicesFileStagingUploadUploadSessionIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadSessionId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/octet-stream,
            'xVaultAPIFilePartNumber' => 'null',
            'contentMD5' => 'null',
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesFileStagingUploadUploadSessionIdPut(params);
    }

    /**
     * Retrieve Job Histories
     *
     * 
     */
    @isTest
    private static void servicesJobsHistoriesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => 'null',
            'endDate' => 'null',
            'status' => 'null',
            'r_limit' => 'null',
            'offset' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsHistoriesGet(params);
    }

    /**
     * Retrieve Import Bulk Translation File Job Errors
     *
     * 
     */
    @isTest
    private static void servicesJobsJobIdErrorsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsJobIdErrorsGet(params);
    }

    /**
     * Retrieve Job Status
     *
     * 
     */
    @isTest
    private static void servicesJobsJobIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsJobIdGet(params);
    }

    /**
     * Retrieve Import Bulk Translation File Job Summary
     *
     * 
     */
    @isTest
    private static void servicesJobsJobIdSummaryGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsJobIdSummaryGet(params);
    }

    /**
     * Retrieve SDK Job Tasks
     *
     * 
     */
    @isTest
    private static void servicesJobsJobIdTasksGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsJobIdTasksGet(params);
    }

    /**
     * Retrieve Job Monitors
     *
     * 
     */
    @isTest
    private static void servicesJobsMonitorsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startDate' => 'null',
            'endDate' => 'null',
            'status' => 'null',
            'r_limit' => 'null',
            'offset' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsMonitorsGet(params);
    }

    /**
     * Start Job
     *
     * 
     */
    @isTest
    private static void servicesJobsStartNowJobIdPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesJobsStartNowJobIdPost(params);
    }

    /**
     * Extract Data Files
     *
     * 
     */
    @isTest
    private static void servicesLoaderExtractPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesLoaderExtractPost(params);
    }

    /**
     * Retrieve Load Failure Log Results
     *
     * 
     */
    @isTest
    private static void servicesLoaderJobIdTasksTaskIdFailurelogGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesLoaderJobIdTasksTaskIdFailurelogGet(params);
    }

    /**
     * Retrieve Loader Extract Results
     *
     * 
     */
    @isTest
    private static void servicesLoaderJobIdTasksTaskIdResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesLoaderJobIdTasksTaskIdResultsGet(params);
    }

    /**
     * Retrieve Loader Extract Renditions Results
     *
     * 
     */
    @isTest
    private static void servicesLoaderJobIdTasksTaskIdResultsRenditionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(params);
    }

    /**
     * Retrieve Load Success Log Results
     *
     * 
     */
    @isTest
    private static void servicesLoaderJobIdTasksTaskIdSuccesslogGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'taskId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesLoaderJobIdTasksTaskIdSuccesslogGet(params);
    }

    /**
     * Load Data Objects
     *
     * 
     */
    @isTest
    private static void servicesLoaderLoadPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesLoaderLoadPost(params);
    }

    /**
     * Validate Package
     *
     * 
     */
    @isTest
    private static void servicesPackageActionsValidatePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesPackageActionsValidatePost(params);
    }

    /**
     * Export Package
     *
     * 
     */
    @isTest
    private static void servicesPackagePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesPackagePost(params);
    }

    /**
     * Import Package
     *
     * 
     */
    @isTest
    private static void servicesPackagePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => multipart/form-data,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesPackagePut(params);
    }

    /**
     * Retrieve All Queues
     *
     * 
     */
    @isTest
    private static void servicesQueuesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesQueuesGet(params);
    }

    /**
     * Disable Delivery
     *
     * 
     */
    @isTest
    private static void servicesQueuesQueueNameActionsDisableDeliveryPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'queueName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesQueuesQueueNameActionsDisableDeliveryPut(params);
    }

    /**
     * Enable Delivery
     *
     * 
     */
    @isTest
    private static void servicesQueuesQueueNameActionsEnableDeliveryPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'queueName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesQueuesQueueNameActionsEnableDeliveryPut(params);
    }

    /**
     * Reset Queue
     *
     * 
     */
    @isTest
    private static void servicesQueuesQueueNameActionsResetPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'queueName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesQueuesQueueNameActionsResetPut(params);
    }

    /**
     * Retrieve Queue Status
     *
     * 
     */
    @isTest
    private static void servicesQueuesQueueNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'queueName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesQueuesQueueNameGet(params);
    }

    /**
     * Validate Imported Package
     *
     * 
     */
    @isTest
    private static void servicesVobjectVaultPackageVPackageIdActionsValidatePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'packageId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.servicesVobjectVaultPackageVPackageIdActionsValidatePost(params);
    }

    /**
     * End Session
     *
     * 
     */
    @isTest
    private static void sessionDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.sessionDelete(params);
    }

    /**
     * Download Single Client Code Distribution
     *
     * 
     */
    @isTest
    private static void uicodeDistributionsDistributionNameCodeGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'distributionName' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.uicodeDistributionsDistributionNameCodeGet(params);
    }

    /**
     * Delete Single Client Code Distribution
     *
     * 
     */
    @isTest
    private static void uicodeDistributionsDistributionNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'distributionName' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.uicodeDistributionsDistributionNameDelete(params);
    }

    /**
     * Retrieve Single Client Code Distribution Metadata
     *
     * 
     */
    @isTest
    private static void uicodeDistributionsDistributionNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'distributionName' => 'null',
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.uicodeDistributionsDistributionNameGet(params);
    }

    /**
     * Retrieve All Client Code Distribution Metadata
     *
     * 
     */
    @isTest
    private static void uicodeDistributionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.uicodeDistributionsGet(params);
    }

    /**
     * Add or Replace Single Client Code Distribution
     *
     * 
     */
    @isTest
    private static void uicodeDistributionsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'accept' => application/json,
            'authorization' => {{sessionId}},
            'contentType' => multipart/form-data,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.uicodeDistributionsPost(params);
    }

    /**
     * Deploy Package
     *
     * 
     */
    @isTest
    private static void vobjectVaultPackageVPackageIdActionsDeployPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'packageId' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectVaultPackageVPackageIdActionsDeployPost(params);
    }

    /**
     * Retrieve Package Deploy Results
     *
     * 
     */
    @isTest
    private static void vobjectVaultPackageVPackageIdActionsDeployResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'packageId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectVaultPackageVPackageIdActionsDeployResultsGet(params);
    }

    /**
     * Retrieve Results of Cascade Delete Job
     *
     * 
     */
    @isTest
    private static void vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'jobStatus' => 'null',
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(params);
    }

    /**
     * Retrieve Results of Deep Copy Job
     *
     * 
     */
    @isTest
    private static void vobjectsDeepcopyResultsObjectNameJobStatusJobIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'jobStatus' => 'null',
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(params);
    }

    /**
     * Create a Placeholder from an EDL Item
     *
     * 
     */
    @isTest
    private static void vobjectsEdlItemVActionsCreateplaceholderPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsEdlItemVActionsCreateplaceholderPost(params);
    }

    /**
     * Download Merge Records Job Log
     *
     * 
     */
    @isTest
    private static void vobjectsMergesJobIdLogGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsMergesJobIdLogGet(params);
    }

    /**
     * Retrieve Record Merge Results
     *
     * 
     */
    @isTest
    private static void vobjectsMergesJobIdResultsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsMergesJobIdResultsGet(params);
    }

    /**
     * Retrieve Record Merge Status
     *
     * 
     */
    @isTest
    private static void vobjectsMergesJobIdStatusGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'jobId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsMergesJobIdStatusGet(params);
    }

    /**
     * Initiate Object Action on Multiple Records
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameActionsActionNamePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'actionName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameActionsActionNamePost(params);
    }

    /**
     * Change Object Type
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameActionsChangetypePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameActionsChangetypePost(params);
    }

    /**
     * Initiate Record Merge
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameActionsMergePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/json,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}},
            'oaSVobjectsObjectNameActionsMergePos' => new List<OASVobjectsObjectNameActionsMergePos>{OASVobjectsObjectNameActionsMergePos.getExample()}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameActionsMergePost(params);
    }

    /**
     * Retrieve Roll-up Field Recalculation Status
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameActionsRecalculaterollupsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameActionsRecalculaterollupsGet(params);
    }

    /**
     * Recalculate Roll-up Fields
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameActionsRecalculaterollupsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameActionsRecalculaterollupsPost(params);
    }

    /**
     * Update Corporate Currency Fields
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameActionsUpdatecorporatecurrencyPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameActionsUpdatecorporatecurrencyPut(params);
    }

    /**
     * Delete Multiple Object Record Attachments
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameAttachmentsBatchDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'idParam' => If you’re identifying attachments in your input by external id, add idParam=external_id__v to the request endpoint.,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameAttachmentsBatchDelete(params);
    }

    /**
     * Create Multiple Object Record Attachments
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameAttachmentsBatchPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameAttachmentsBatchPost(params);
    }

    /**
     * Update Multiple Object Record Attachment Descriptions
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameAttachmentsBatchPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameAttachmentsBatchPut(params);
    }

    /**
     * Delete Object Records
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameDelete(params);
    }

    /**
     * Retrieve Object Record Roles
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameIdRolesRoleNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'id' => 'null',
            'roleName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameIdRolesRoleNameGet(params);
    }

    /**
     * Retrieve Object User Actions Details
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdActionsActionNameGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'actionName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdActionsActionNameGet(params);
    }

    /**
     * Initiate Object Action on a Single Record
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdActionsActionNamePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'actionName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => application/x-www-form-urlencoded,
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdActionsActionNamePost(params);
    }

    /**
     * Cascade Delete Object Record
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdActionsCascadedeletePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(params);
    }

    /**
     * Deep Copy Object Record
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdActionsDeepcopyPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(params);
    }

    /**
     * Retrieve Object Record User Actions
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdActionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'loc' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdActionsGet(params);
    }

    /**
     * Download Attachment Field File
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentFieldName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(params);
    }

    /**
     * Update Attachment Field File
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentFieldName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(params);
    }

    /**
     * Download All Attachment Field Files
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(params);
    }

    /**
     * Delete Object Record Attachment
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(params);
    }

    /**
     * Retrieve Object Record Attachment Metadata
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(params);
    }

    /**
     * Update Object Record Attachment Description
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(params);
    }

    /**
     * Delete Object Record Attachment Version
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(params);
    }

    /**
     * Download Object Record Attachment File
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(params);
    }

    /**
     * Retrieve Object Record Attachment Version Metadata
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(params);
    }

    /**
     * Restore Object Record Attachment Version
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'attachmentVersion' => 'null',
            'restore' => true,
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(params);
    }

    /**
     * Retrieve Object Record Attachment Versions
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'attachmentId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(params);
    }

    /**
     * Download All Object Record Attachment Files
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsFileGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsFileGet(params);
    }

    /**
     * Retrieve Object Record Attachments
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsGet(params);
    }

    /**
     * Create Object Record Attachment
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAttachmentsPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAttachmentsPost(params);
    }

    /**
     * Retrieve Complete Audit History for a Single Object Record
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdAudittrailGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'startDate' => 'null',
            'endDate' => 'null',
            'formatResult' => 'null',
            'r_limit' => 'null',
            'offset' => 'null',
            'events' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdAudittrailGet(params);
    }

    /**
     * Retrieve Object Record
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameObjectRecordIdGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'objectRecordId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameObjectRecordIdGet(params);
    }

    /**
     * Create &amp; Upsert Object Records
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNamePostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'idParam' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => application/json,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPINoTriggers' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNamePost(params);
    }

    /**
     * Update Object Records
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNamePutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'contentType' => text/csv,
            'accept' => application/json,
            'xVaultAPIMigrationMode' => true,
            'xVaultAPINoTriggers' => true,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNamePut(params);
    }

    /**
     * Remove Users &amp; Groups from Roles on Object Records
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameRolesDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameRolesDelete(params);
    }

    /**
     * Assign Users &amp; Groups to Roles on Object Records
     *
     * 
     */
    @isTest
    private static void vobjectsObjectNameRolesPostTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'objectName' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'contentType' => text/csv,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsObjectNameRolesPost(params);
    }

    /**
     * Retrieve Outbound Package Dependencies
     *
     * 
     */
    @isTest
    private static void vobjectsOutboundPackageVPackageIdDependenciesGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'packageId' => 'null',
            'authorization' => {{sessionId}},
            'accept' => application/json,
            'xVaultAPIClientID' => {{clientId}}
        };

        OASClient client;
        OASDefaultApi api;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.vobjectsOutboundPackageVPackageIdDependenciesGet(params);
    }
}